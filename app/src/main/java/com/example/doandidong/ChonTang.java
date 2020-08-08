package com.example.doandidong;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class ChonTang extends Activity {

    TextView txtchontang;
    ImageView imgtang1;
    ImageView imgtang2;
    Button btnDangXuat;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        // TODO Auto-generated method stub
        super.onCreate(savedInstanceState);
        setContentView(R.layout.chontang);
        txtchontang = (TextView) findViewById(R.id.txtchontang);
        txtchontang.setTextColor(Color.RED);
        imgtang1=(ImageView)findViewById(R.id.imgtang1);
        imgtang2=(ImageView)findViewById(R.id.imgtang2);

        btnDangXuat= (Button) findViewById(R.id.btnDangxuat);
        btnDangXuat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent dangxuat = new Intent(ChonTang.this, DangNhap.class);
                startActivity(dangxuat);
            }
        });

        imgtang1.setOnClickListener(new View.OnClickListener() {
            
            public void onClick(View arg0) {
                // TODO Auto-generated method stub
                Intent tang11=new Intent(ChonTang.this,Tang1.class);
                startActivity(tang11);
            }
        });
        
        imgtang2.setOnClickListener(new View.OnClickListener() {
            
            public void onClick(View arg0) {
                // TODO Auto-generated method stub
                Intent tang22=new Intent(ChonTang.this,Tang2.class);
                startActivity(tang22);
                
            }
        });
        
        
        
        
        
    }

}
