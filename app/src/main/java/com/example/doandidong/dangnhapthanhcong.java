package com.example.doandidong;
import android.app.Activity;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;
public class dangnhapthanhcong extends Activity {

    TextView txtthanhcong;
    String null1;
    String null2;
    Button btnchontang;
    String kq;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        // TODO Auto-generated method stub
        super.onCreate(savedInstanceState);

        Intent info = getIntent();
        Bundle nhan_goi_data_login = info.getExtras();
        // Gói nhận data gồm tên đăng nhập và password nhận từ activity DangNhap thông qua intent info

        String nhanuser = nhan_goi_data_login.getString("user");
        String nhanpass = nhan_goi_data_login.getString("pass");

        nhanuser.trim(); // loại bỏ các ký tự thừa
        nhanpass.trim();

        if (nhanuser.equals("Thinh") && nhanpass.equals("123456")) {

            Toast.makeText(getApplicationContext(), "                 CHÚC MỪNG BẠN " +"\n"+ "                            "+nhanuser + "\n" + "        ĐÃ ĐĂNG NHẬP THÀNH CÔNG!",
                    Toast.LENGTH_SHORT).show();
            Intent chontang = new Intent(dangnhapthanhcong.this, ChonTang.class);
            startActivity(chontang);
        }
        else if(nhanuser.equals("Thinh") && nhanpass.equals("123")) {

            Toast.makeText(getApplicationContext(), "                 CHÚC MỪNG BẠN " +"\n"+ "                            "+nhanuser + "\n" + "        ĐÃ ĐĂNG NHẬP THÀNH CÔNG!",
                    Toast.LENGTH_SHORT).show();
            Intent quanlinhansu = new Intent(dangnhapthanhcong.this, MainActivity.class);
            startActivity(quanlinhansu);

        }
        else {

            // trả về kết quả nếu ko đúng tên đăng nhập và mật khẩu
            null1 = "";
            null2 = "";
            nhan_goi_data_login.putString("back1", null1);
            nhan_goi_data_login.putString("back2", null2);
            info.putExtras(nhan_goi_data_login);
            setResult(Activity.RESULT_OK, info);
            Toast.makeText(getApplicationContext(), "   BẠN ĐÃ ĐĂNG NHẬP SAI" + "\n" + " VUI LÒNG ĐĂNG NHẬP LẠI! ",
                    Toast.LENGTH_SHORT).show();
            finish();

        }



    }
}
