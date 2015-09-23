package cn.com.sat.pk.unlockandkeepon;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;
import android.widget.Toast;

public class Test extends BroadcastReceiver{

	private static final String TAG_STRING = "TEST_SUKAISHENG";
	@Override
	public void onReceive(Context context, Intent intent) {
		// TODO Auto-generated method stub
		Log.e(TAG_STRING, "I got a Message!!!");
		Log.e(TAG_STRING, "I got a Message!!!");
		Toast.makeText(context, "suseng777 modified", Toast.LENGTH_SHORT).show();
	}

}
