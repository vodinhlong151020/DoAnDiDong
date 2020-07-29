package com.example.doandidong;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class Tang2 extends Activity {

    TextView txtdanhsachtang2;

    TextView lblban13;
    TextView lblban14;
    TextView lblban15;
    TextView lblban16;
    TextView lblban17;
    TextView lblban18;
    TextView lblban19;
    TextView lblban20;
    TextView lblban21;
    TextView lblban22;
    TextView lblban23;
    TextView lblban24;

    String key;
    String value;
    String nhanhienthi;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        // TODO Auto-generated method stub
        super.onCreate(savedInstanceState);
        setContentView(R.layout.tang2);

        txtdanhsachtang2 = (TextView) findViewById(R.id.txtdanhsachbantang2);
        txtdanhsachtang2.setTextColor(Color.RED);

        lblban13 = (TextView) findViewById(R.id.lblban13);
        lblban13.setTextColor(Color.GREEN);
        lblban14 = (TextView) findViewById(R.id.lblban14);
        lblban14.setTextColor(Color.GREEN);
        lblban15 = (TextView) findViewById(R.id.lblban15);
        lblban15.setTextColor(Color.GREEN);
        lblban16 = (TextView) findViewById(R.id.lblban16);
        lblban16.setTextColor(Color.GREEN);
        lblban17 = (TextView) findViewById(R.id.lblban17);
        lblban17.setTextColor(Color.GREEN);
        lblban18 = (TextView) findViewById(R.id.lblban18);
        lblban18.setTextColor(Color.GREEN);
        lblban19 = (TextView) findViewById(R.id.lblban19);
        lblban19.setTextColor(Color.GREEN);
        lblban20 = (TextView) findViewById(R.id.lblban20);
        lblban20.setTextColor(Color.GREEN);
        lblban21 = (TextView) findViewById(R.id.lblban21);
        lblban21.setTextColor(Color.GREEN);
        lblban22 = (TextView) findViewById(R.id.lblban22);
        lblban22.setTextColor(Color.GREEN);
        lblban23 = (TextView) findViewById(R.id.lblban23);
        lblban23.setTextColor(Color.GREEN);
        lblban24 = (TextView) findViewById(R.id.lblban24);
        lblban24.setTextColor(Color.GREEN);

        lblban13.setOnClickListener(new View.OnClickListener() {

            public void onClick(View arg0) {
                // TODO Auto-generated method stub
                Intent ban13 = new Intent(Tang2.this, ChonThucUong.class);
                key = "ban13";
                value = "BAN 13";
                truyenban(ban13, key, value);
                startActivityForResult(ban13, 113);

            }
        });
        lblban14.setOnClickListener(new View.OnClickListener() {

            public void onClick(View arg0) {
                // TODO Auto-generated method stub
                Intent ban14 = new Intent(Tang2.this, ChonThucUong.class);
                key = "ban14";
                value = "BAN 14";
                truyenban(ban14, key, value);
                startActivityForResult(ban14, 114);
            }
        });
        lblban15.setOnClickListener(new View.OnClickListener() {

            public void onClick(View arg0) {
                // TODO Auto-generated method stub
                Intent ban15 = new Intent(Tang2.this, ChonThucUong.class);
                key = "ban15";
                value = "BAN 15";
                truyenban(ban15, key, value);
                startActivityForResult(ban15, 115);
            }
        });
        lblban16.setOnClickListener(new View.OnClickListener() {

            public void onClick(View arg0) {
                // TODO Auto-generated method stub
                Intent ban16 = new Intent(Tang2.this, ChonThucUong.class);
                key = "ban16";
                value = "BAN 16";
                truyenban(ban16, key, value);
                startActivityForResult(ban16, 116);
            }
        });
        lblban17.setOnClickListener(new View.OnClickListener() {

            public void onClick(View arg0) {
                // TODO Auto-generated method stub
                Intent ban17 = new Intent(Tang2.this, ChonThucUong.class);
                key = "ban17";
                value = "BAN 17";
                truyenban(ban17, key, value);
                startActivityForResult(ban17, 117);
            }
        });
        lblban18.setOnClickListener(new View.OnClickListener() {

            public void onClick(View arg0) {
                // TODO Auto-generated method stub
                Intent ban18 = new Intent(Tang2.this, ChonThucUong.class);
                key = "ban18";
                value = "BAN 18";
                truyenban(ban18, key, value);
                startActivityForResult(ban18, 118);
            }
        });
        lblban19.setOnClickListener(new View.OnClickListener() {

            public void onClick(View arg0) {
                // TODO Auto-generated method stub
                Intent ban19 = new Intent(Tang2.this, ChonThucUong.class);
                key = "ban19";
                value = "BAN 19";
                truyenban(ban19, key, value);
                startActivityForResult(ban19, 119);
            }
        });
        lblban20.setOnClickListener(new View.OnClickListener() {

            public void onClick(View arg0) {
                // TODO Auto-generated method stub
                Intent ban20 = new Intent(Tang2.this, ChonThucUong.class);
                key = "ban20";
                value = "BAN 20";
                truyenban(ban20, key, value);
                startActivityForResult(ban20, 120);
            }
        });
        lblban21.setOnClickListener(new View.OnClickListener() {

            public void onClick(View arg0) {
                // TODO Auto-generated method stub
                Intent ban21 = new Intent(Tang2.this, ChonThucUong.class);
                key = "ban21";
                value = "BAN 21";
                truyenban(ban21, key, value);
                startActivityForResult(ban21, 121);
            }
        });
        lblban22.setOnClickListener(new View.OnClickListener() {

            public void onClick(View arg0) {
                // TODO Auto-generated method stub
                Intent ban22 = new Intent(Tang2.this, ChonThucUong.class);
                key = "ban22";
                value = "BAN 22";
                truyenban(ban22, key, value);
                startActivityForResult(ban22, 122);
            }
        });
        lblban23.setOnClickListener(new View.OnClickListener() {

            public void onClick(View arg0) {
                // TODO Auto-generated method stub
                Intent ban23 = new Intent(Tang2.this, ChonThucUong.class);
                key = "ban23";
                value = "BAN 23";
                truyenban(ban23, key, value);
                startActivityForResult(ban23, 123);
            }
        });
        lblban24.setOnClickListener(new View.OnClickListener() {

            public void onClick(View arg0) {
                // TODO Auto-generated method stub
                Intent ban24 = new Intent(Tang2.this, ChonThucUong.class);
                key = "ban24";
                value = "BAN 24";
                truyenban(ban24, key, value);
                startActivityForResult(ban24, 124);
            }
        });
    }

    // Hàm truyền số bàn sang activity Chonthucuong
    private void truyenban(Intent intent, String khoa, String giatri) {
        Bundle truyenban = new Bundle();
        truyenban.putString(key, value);
        intent.putExtras(truyenban);
    }
    
    
    // hàm nhận xác nhận bàn nào đã có khách
    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        // TODO Auto-generated method stub
        super.onActivityResult(requestCode, resultCode, data);
        if ((requestCode == 113) && (resultCode == Activity.RESULT_OK)) {
            Bundle nhan = data.getExtras();
            nhanhienthi = nhan.getString("hienthi13");

            if (nhanhienthi.equals("13")) {
                lblban13.setTextColor(Color.YELLOW);
                lblban13.setBackgroundResource(R.drawable.bando);
            }
        }
        
        
        
        if ((requestCode == 114) && (resultCode == Activity.RESULT_OK)) {
            Bundle nhan = data.getExtras();
            nhanhienthi = nhan.getString("hienthi14");

            if (nhanhienthi.equals("14")) {
                lblban14.setTextColor(Color.YELLOW);
                lblban14.setBackgroundResource(R.drawable.bando);
            }
        }
        
        
        if ((requestCode == 115) && (resultCode == Activity.RESULT_OK)) {
            Bundle nhan = data.getExtras();
            nhanhienthi = nhan.getString("hienthi15");

            if (nhanhienthi.equals("15")) {
                lblban15.setTextColor(Color.YELLOW);
                lblban15.setBackgroundResource(R.drawable.bando);
            }
        }
        
        if ((requestCode == 116) && (resultCode == Activity.RESULT_OK)) {
            Bundle nhan = data.getExtras();
            nhanhienthi = nhan.getString("hienthi16");

            if (nhanhienthi.equals("16")) {
                lblban16.setTextColor(Color.YELLOW);
                lblban16.setBackgroundResource(R.drawable.bando);
            }
        }
        
        if ((requestCode == 117) && (resultCode == Activity.RESULT_OK)) {
            Bundle nhan = data.getExtras();
            nhanhienthi = nhan.getString("hienthi17");

            if (nhanhienthi.equals("17")) {
                lblban17.setTextColor(Color.YELLOW);
                lblban17.setBackgroundResource(R.drawable.bando);
            }
        }
        
        if ((requestCode == 118) && (resultCode == Activity.RESULT_OK)) {
            Bundle nhan = data.getExtras();
            nhanhienthi = nhan.getString("hienthi18");

            if (nhanhienthi.equals("18")) {
                lblban18.setTextColor(Color.YELLOW);
                lblban18.setBackgroundResource(R.drawable.bando);
            }
        }
        
        if ((requestCode == 119) && (resultCode == Activity.RESULT_OK)) {
            Bundle nhan = data.getExtras();
            nhanhienthi = nhan.getString("hienthi19");

            if (nhanhienthi.equals("19")) {
                lblban19.setTextColor(Color.YELLOW);
                lblban19.setBackgroundResource(R.drawable.bando);
            }
        }
        
        if ((requestCode == 120) && (resultCode == Activity.RESULT_OK)) {
            Bundle nhan = data.getExtras();
            nhanhienthi = nhan.getString("hienthi20");

            if (nhanhienthi.equals("20")) {
                lblban20.setTextColor(Color.YELLOW);
                lblban20.setBackgroundResource(R.drawable.bando);
            }
        }

        if ((requestCode == 121) && (resultCode == Activity.RESULT_OK)) {
            Bundle nhan = data.getExtras();
            nhanhienthi = nhan.getString("hienthi21");

            if (nhanhienthi.equals("21")) {
                lblban21.setTextColor(Color.YELLOW);
                lblban21.setBackgroundResource(R.drawable.bando);
            }
        }
        
        if ((requestCode == 122) && (resultCode == Activity.RESULT_OK)) {
            Bundle nhan = data.getExtras();
            nhanhienthi = nhan.getString("hienthi22");

            if (nhanhienthi.equals("22")) {
                lblban22.setTextColor(Color.YELLOW);
                lblban22.setBackgroundResource(R.drawable.bando);
            }
        }
        
        if ((requestCode == 123) && (resultCode == Activity.RESULT_OK)) {
            Bundle nhan = data.getExtras();
            nhanhienthi = nhan.getString("hienthi23");

            if (nhanhienthi.equals("23")) {
                lblban23.setTextColor(Color.YELLOW);
                lblban23.setBackgroundResource(R.drawable.bando);
            }
        }
        
        if ((requestCode == 124) && (resultCode == Activity.RESULT_OK)) {
            Bundle nhan = data.getExtras();
            nhanhienthi = nhan.getString("hienthi24");

            if (nhanhienthi.equals("24")) {
                lblban24.setTextColor(Color.YELLOW);
                lblban24.setBackgroundResource(R.drawable.bando);
            }
        }
    }

}
