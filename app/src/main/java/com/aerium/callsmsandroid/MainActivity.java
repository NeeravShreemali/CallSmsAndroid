package com.aerium.callsmsandroid;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.telephony.SmsManager;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText phone;
    Button call,sms;
    Intent i;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    protected void click_call(View view){
        phone = findViewById(R.id.editTextPhone);
        String phonenumber = phone.getText().toString();
        i = new Intent(Intent.ACTION_CALL);
        i.setData(Uri.parse("tel:"+ phonenumber));
        startActivity(i);
        finish();
    }

    protected void click_sms(View view){
        phone = findViewById(R.id.editTextPhone);
        String phonenumebr = phone.getText().toString();
        SmsManager sms = SmsManager.getDefault();
        sms.sendTextMessage("phonenumber",null,"Wass up", null,null);
        finish();
    }
}