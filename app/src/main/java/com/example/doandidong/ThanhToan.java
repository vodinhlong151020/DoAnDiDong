package com.example.doandidong;

import android.app.Activity;

import android.content.Intent;
import android.os.Bundle;

import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class ThanhToan extends Activity {

    Button btnback;
    Button btnXuatBill;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        // TODO Auto-generated method stub
        super.onCreate(savedInstanceState);
        setContentView(R.layout.thanh_toan_layout);

        btnback = (Button) findViewById(R.id.btnBack);
        btnback.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent chontang = new Intent(ThanhToan.this, ChonTang.class);
                startActivity(chontang);
            }
        });

         btnXuatBill= (Button) findViewById(R.id.btnXuatHD);
        btnXuatBill.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent xuatbill = new Intent(ThanhToan.this, XuatBill.class);
                startActivity(xuatbill);
            }
        });
    }
}
