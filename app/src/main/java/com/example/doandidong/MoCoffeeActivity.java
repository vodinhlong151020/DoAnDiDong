package com.example.doandidong;

import android.R.color;
import android.app.Activity;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MoCoffeeActivity extends Activity {
    /** Called when the activity is first created. */
    TextView tv;
    Button btndangnhap;
    Button btnthoat;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        tv = (TextView) findViewById(R.id.tv);
        tv.setTextColor(Color.RED);

        btndangnhap = (Button) findViewById(R.id.btndangnhap);
        btndangnhap.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                // TODO Auto-generated method stub
                Intent dangnhap = new Intent(MoCoffeeActivity.this, DangNhap.class);
                startActivity(dangnhap);
            }
        });
        btnthoat = (Button) findViewById(R.id.btnthoat);
        btnthoat.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                // TODO Auto-generated method stub
                finish();
                System.exit(0);
            }
        });
    }

}