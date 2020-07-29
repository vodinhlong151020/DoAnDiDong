package com.example.doandidong;
import android.app.Activity;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
public class DangNhap extends Activity {

    // Khai báo biến
    TextView txtdangnhap;
    TextView txttendangnhap;
    TextView txtmatkhau;
    Button btnlogin;
    EditText edmatkhau;
    EditText edtendangnhap;
    String user;
    String pass;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        // TODO Auto-generated method stub
        super.onCreate(savedInstanceState);
        setContentView(R.layout.dangnhap);
        txtdangnhap = (TextView) findViewById(R.id.txtdangnhap);
        txtdangnhap.setTextColor(Color.RED);
        
        txttendangnhap=(TextView)findViewById(R.id.txttendangnhap);
        txttendangnhap.setTextColor(Color.BLACK);
        txtmatkhau=(TextView)findViewById(R.id.txtmatkhau);
        txtmatkhau.setTextColor(Color.BLACK);

        edmatkhau = (EditText) findViewById(R.id.edmatkhau);
        edtendangnhap = (EditText) findViewById(R.id.edtendangnhap);
        
        edtendangnhap.setHint("Tên Đăng Nhập");
        edtendangnhap.setHintTextColor(Color.GRAY);
       // edtendangnhap.setCursorVisible(true);
        
        edmatkhau.setHint("Mật Khẩu");
        edmatkhau.setHintTextColor(Color.GRAY);

        btnlogin = (Button) findViewById(R.id.btnlogin);
        btnlogin.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                // TODO Auto-generated method stub

                user = edtendangnhap.getText().toString();
                pass = edmatkhau.getText().toString();
                // user=Double.parseDouble(edtendangnhap.getText().toString());
                // pass=Double.parseDouble(edmatkhau.getText().toString());
                Intent loginthanhcong = new Intent(DangNhap.this, dangnhapthanhcong.class);

                Bundle truyen_goi_data_login = new Bundle();
                // Gói truyền data gồm có tên đăng nhập và password

                truyen_goi_data_login.putString("user", user);
                truyen_goi_data_login.putString("pass", pass);

                loginthanhcong.putExtras(truyen_goi_data_login);

                startActivityForResult(loginthanhcong, 101);
                
                edmatkhau.setText("");
                edtendangnhap.setText("");
                // startActivity(loginthanhcong);
            }
        });

    }

    // Phương thức Nhận bundel từ activity dangnhapthanhcong trả về
    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        // TODO Auto-generated method stub
        super.onActivityResult(requestCode, resultCode, data);

        if ((requestCode == 101) && (resultCode == Activity.RESULT_OK)) {
            Bundle databack = data.getExtras();
            String ed1 = databack.getString("back1");
            String ed2 = databack.getString("back2");
            edmatkhau.setText(ed1);
            edtendangnhap.setText(ed2);
           // edtendangnhap.setCursorVisible(true);
            edtendangnhap.setHint("Tên Đăng Nhập");
            edtendangnhap.setHintTextColor(Color.GRAY);
            edmatkhau.setHint("Mật Khẩu");
            edmatkhau.setHintTextColor(Color.GRAY);
        }
    }

}
