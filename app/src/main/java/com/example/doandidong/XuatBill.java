package com.example.doandidong;

import android.app.Activity;

import android.content.Intent;
import android.os.Bundle;

import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class XuatBill extends Activity {

        Button btnXuatBill;
        @Override
        protected void onCreate(Bundle savedInstanceState) {
            // TODO Auto-generated method stub
            super.onCreate(savedInstanceState);
            setContentView(R.layout.xuatbillthanhtoan);
            btnXuatBill = (Button) findViewById(R.id.btnbill);
            btnXuatBill.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent xuatbill = new Intent(XuatBill.this, ChonTang.class);
                    startActivity(xuatbill);
                }
            });

        }
 }

