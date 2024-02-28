package com.example.pr_29;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.telephony.SmsMessage;
import android.util.Log;
import android.widget.Toast;

public class SmsReceiver {
    public void onReceive(Context context, Intent intent){
        Bundle bundle = intent.getExtras();
        Object[] smsObj = (Object[]) bundle.get("sms");
        for(Object obj : smsObj){
            SmsMessage message = SmsMessage.createFromPdu((byte[]) obj);
            String mobNo = message.getDisplayOriginatingAddress();
            String msg = message.getDisplayMessageBody();

            Toast.makeText(context, "Mobile no : " + mobNo + ", Msg : "+msg, Toast.LENGTH_SHORT).show();
        }
    }
}