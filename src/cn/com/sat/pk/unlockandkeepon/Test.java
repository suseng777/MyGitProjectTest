package cn.com.sat.pk.unlockandkeepon;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;

public class Test extends BroadcastReceiver{

	private static final String TAG_STRING = "TEST_SUKAISHENG";
	@Override
	public void onReceive(Context context, Intent intent) {
		// TODO Auto-generated method stub
		Log.e(TAG_STRING, "I got a Message!!!");
		Log.e(TAG_STRING, "I got a Message!!!");
	}

}
