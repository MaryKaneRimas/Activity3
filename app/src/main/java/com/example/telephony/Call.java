package com.example.telephony;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;
import androidx.core.content.ContextCompat;

import android.Manifest;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Call extends AppCompatActivity {

    EditText editPhone;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_call);

        editPhone = findViewById(R.id.editPhone);

        String Fname = getIntent().getStringExtra("keyname");


        editPhone.setText(Fname);
    }

    public void btnCall(View view) {
        int permissionCheck = ContextCompat.checkSelfPermission(this, Manifest.permission.CALL_PHONE);
        if (permissionCheck == PackageManager.PERMISSION_GRANTED) {
            String phoneNum = editPhone.getText().toString().trim();
            Intent callIntent = new Intent(Intent.ACTION_CALL);

            String Fnum = getIntent().getStringExtra("keynum");

            editPhone.setText(Fnum);

            callIntent.setData(Uri.parse("tel:" + Fnum));
            startActivity(callIntent);
        } else {
            ActivityCompat.requestPermissions(this, new String[]{Manifest.permission.CALL_PHONE}, 0);

        }
    }
}