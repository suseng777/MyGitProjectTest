package cn.com.sat.pk.unlockandkeepon;

import android.app.Activity;
import android.app.KeyguardManager;
import android.app.KeyguardManager.KeyguardLock;
import android.content.Context;
import android.os.Bundle;
import android.os.PowerManager;
import android.os.PowerManager.WakeLock;

public class UnlockAndKeepOn extends Activity {
	private static final String TAG = "UnlockAndKeepOn";
	private KeyguardManager km;
	@SuppressWarnings("deprecation")
	private KeyguardLock kl;
	private PowerManager pm;
	private WakeLock wl;

	@SuppressWarnings("deprecation")
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.main);
		// Log.e(TAG, "onCreate()");

		km = (KeyguardManager) getSystemService(Context.KEYGUARD_SERVICE);
		kl = km.newKeyguardLock(TAG);

		pm = (PowerManager) getSystemService(Context.POWER_SERVICE);
		// wl = pm.newWakeLock(PowerManager.FULL_WAKE_LOCK, TAG);
		wl = pm.newWakeLock(PowerManager.ACQUIRE_CAUSES_WAKEUP
				| PowerManager.SCREEN_DIM_WAKE_LOCK, TAG);

		kl.disableKeyguard();
		wl.acquire();
	}

	@Override
	protected void onDestroy() {
		// TODO Auto-generated method stub
		// Log.e(TAG, "onDestroy()");
		wl.release();
		kl.reenableKeyguard();
		super.onDestroy();
	}
}
