package com.summer.fsh.fshaapplication;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;
import android.widget.Toast;

/**
 * Created by fsh on 2016/12/12.
 */
public class BroadcastReceiverTest extends BroadcastReceiver {
    private static final String TAG = "BroadcastReceiverTest";
    @Override
    public void onReceive(Context context, Intent intent) {
        String name=intent.getStringExtra("name");
        int number=intent.getIntExtra("number", 0);
        Log.d(TAG, "onReceive: "+"接收到广播 name="+name+",number="+number);
        Toast.makeText(context,"onReceive: "+"接收到广播 name="+name+",number="+number,Toast.LENGTH_LONG).show();

    }


    public static void main(String[] args) {

    }

}
