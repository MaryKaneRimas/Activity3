package com.example.telephony;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView name1,name2,name3,name4,name5;
    TextView num1,num2,num3,num4,num5;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        name1=findViewById(R.id.name1);
        num1=findViewById(R.id.num1);

        name2=findViewById(R.id.name2);
        num2=findViewById(R.id.num2);

        name3=findViewById(R.id.name3);
        num3=findViewById(R.id.num3);

        name4=findViewById(R.id.name4);
        num4=findViewById(R.id.num4);

        name5=findViewById(R.id.name5);
        num5=findViewById(R.id.num5);
    }

    public void btnC1(View view) {
        String Fname= name1.getText().toString();
        String Fnum= num1.getText().toString();

        Intent a = new Intent(MainActivity.this, Call.class);
        a.putExtra("keyname",Fname);
        a.putExtra("keynum",Fnum);
        startActivity(a);

    }

    public void btnC2(View view) {
        String Fname= name2.getText().toString();
        String Fnum= num2.getText().toString();

        Intent a = new Intent(MainActivity.this, Call.class);
        a.putExtra("keyname",Fname);
        a.putExtra("keynum",Fnum);
        startActivity(a);
    }

    public void btnC3(View view) {
        String Fname= name3.getText().toString();
        String Fnum= num3.getText().toString();

        Intent a = new Intent(MainActivity.this, Call.class);
        a.putExtra("keyname",Fname);
        a.putExtra("keynum",Fnum);
        startActivity(a);

    }

    public void btnC4(View view) {
        String Fname= name4.getText().toString();
        String Fnum= num4.getText().toString();

        Intent a = new Intent(MainActivity.this, Call.class);
        a.putExtra("keyname",Fname);
        a.putExtra("keynum",Fnum);
        startActivity(a);
    }

    public void btnC5(View view) {
        String Fname= name5.getText().toString();
        String Fnum= num5.getText().toString();

        Intent a = new Intent(MainActivity.this, Call.class);
        a.putExtra("keyname",Fname);
        a.putExtra("keynum",Fnum);
        startActivity(a);
    }

    public void btnM1(View view) {
        String Fname= name1.getText().toString();
        String Fnum= num1.getText().toString();

        Intent b = new Intent(MainActivity.this, Message.class);
        b.putExtra("keyname",Fname);
        b.putExtra("keynum",Fnum);
        startActivity(b);
    }

    public void btnM2(View view) {
        String Fname= name2.getText().toString();
        String Fnum= num2.getText().toString();

        Intent b = new Intent(MainActivity.this, Message.class);
        b.putExtra("keyname",Fname);
        b.putExtra("keynum",Fnum);
        startActivity(b);
    }

    public void btnM3(View view) {
        String Fname= name3.getText().toString();
        String Fnum= num3.getText().toString();

        Intent b = new Intent(MainActivity.this, Message.class);
        b.putExtra("keyname",Fname);
        b.putExtra("keynum",Fnum);
        startActivity(b);
    }

    public void btnM4(View view) {
        String Fname= name4.getText().toString();
        String Fnum= num4.getText().toString();

        Intent b = new Intent(MainActivity.this, Message.class);
        b.putExtra("keyname",Fname);
        b.putExtra("keynum",Fnum);
        startActivity(b);
    }

    public void btnM5(View view) {
        String Fname= name5.getText().toString();
        String Fnum= num5.getText().toString();


        Intent b = new Intent(MainActivity.this, Message.class);
        b.putExtra("keyname",Fname);
        b.putExtra("keynum",Fnum);


        startActivity(b);
    }
}
