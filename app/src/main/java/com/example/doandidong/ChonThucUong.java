package com.example.doandidong;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Calendar;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.app.ListActivity;
import android.content.ContentValues;
import android.content.Intent;

import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;

import android.graphics.Color;
import android.inputmethodservice.Keyboard.Key;
import android.os.Bundle;
import android.telephony.SmsManager;
import android.view.View;
import android.widget.Adapter;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemSelectedListener;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.SpinnerAdapter;
import android.widget.Toast;

import org.w3c.dom.Text;

public class ChonThucUong extends Activity implements OnItemSelectedListener {

    // Biến tạo và nhập cơ sở dữ liệu
    TextView textView;
    Boolean flag;
    Boolean c;

    TextView txtchonthucuong;

    Spinner spnlistcoffee;
    Spinner spnsoluongcoffee;

    Spinner spnlistsinhto;
    Spinner spnsoluongsinhto;

    Spinner spnlistthuoc;
    Spinner spnlistsoluongthuoc;

    Spinner spnlistkhac;
    Spinner spnlistsoluongkhac;

    Spinner spnlistnuocep;
    Spinner spnlistsoluongnuocep;

    Spinner spnlistnuocngot;
    Spinner spnlistsoluongnuocngot;

    Button btnquayvetang1;
    Button btnorder;

    String[] caphe = {"", "Ca Phe Da", "Cà Phê Sữa", "Cà Phê Chồn", "Cà Phê Rum", "Capuchino", "Expresso"};
    String[] soluongcaphe = {"", "1", "2", "3", "4", "5", "6", "7"};

    String[] sinhto = {"", "Sinh To Ot", "Sinh Tố Tỏi", "Sinh Tố Hành", "Sinh Tố Pơ", "Sinh Tố Dừa", "Sinh Tố Mãng Cầu"};
    String[] soluongsinhto = {"", "1", "2", "3", "4", "5", "6", "7"};

    String[] thuoc = {"", "555", "Marboro", "Caraven", "JET"};
    String[] soluongthuoc = {"", "1", "2", "3", "4"};

    String[] khac = {"", "Nước Suối", "La Hán Quả", "Lipton Đá", "Lipton Nóng", "Trái Cây Đĩa"};
    String[] soluongkhac = {"", "1", "2", "3", "4", "5"};

    String[] nuocep = {"", "Đá Chanh", "Cam Vắt", "Chanh Dây", "Rau Má", "Đá Me"};
    String[] soluongnuocep = {"", "1", "2", "3", "4", "5", "6"};

    String[] nuocngot = {"", "CoCa Cola", "PepSi", "Sting", "Xá Xị", "Twister"};
    String[] soluongnuocngot = {"", "1", "2", "3", "4", "5", "6"};

    String ordercaphe;
    String ordersoluongcaphe;

    String ordersinhto;
    String ordersoluongsinhto;

    String orderthuoc;
    String ordersoluongthuoc;

    String orderkhac;
    String ordersoluongkhac;

    String ordernuocep;
    String ordersoluongnuocep;

    String ordernuocngot;
    String ordersoluongnuocngot;

    String sodienthoai = "15555215556";
    String noidungorder;

    String soban1;

    String ban1;
    String ban2;
    String ban3;
    String ban4;
    String ban5;
    String ban6;
    String ban7;
    String ban8;
    String ban9;
    String ban10;
    String ban11;
    String ban12;

    String ban13;
    String ban14;
    String ban15;
    String ban16;
    String ban17;
    String ban18;
    String ban19;
    String ban20;
    String ban21;
    String ban22;
    String ban23;
    String ban24;

    Boolean cf = false;
    Boolean st = false;
    Boolean kh = false;
    Boolean tl = false;
    Boolean ne = false;
    Boolean nn = false;

    @SuppressLint("WrongConstant")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        // TODO Auto-generated method stub
        super.onCreate(savedInstanceState);
        setContentView(R.layout.chonthucuong);


        txtchonthucuong = (TextView) findViewById(R.id.txtchonthucuong);
        txtchonthucuong.setTextColor(Color.RED);

        spnlistcoffee = (Spinner) findViewById(R.id.spnlistcoffee);
        spnlistsinhto = (Spinner) findViewById(R.id.spnlistsinhto);

        btnorder = (Button) findViewById(R.id.btnorder);
        btnorder.setText("ORDER");
        btnorder.setOnClickListener(new View.OnClickListener() {

            public void onClick(View arg0) {
                // TODO Auto-generated method stub

                // xác nhận bàn đã được order
                Intent nhandulieuban = getIntent();
                Bundle nhanban = nhandulieuban.getExtras();
                String soban;
                String noidung;

                if (noidungorder != " ") {

                    if (ban1 != null) {
                        prepare(ban1);
                        nhanban.putString("hienthi1", "1");
                        nhandulieuban.putExtras(nhanban);
                        setResult(Activity.RESULT_OK, nhandulieuban);
                    }
                    if (ban2 != null) {
                        prepare(ban2);
                        nhanban.putString("hienthi2", "2");
                        nhandulieuban.putExtras(nhanban);
                        setResult(Activity.RESULT_OK, nhandulieuban);
                    }

                    if (ban3 != null) {
                        prepare(ban3);
                        nhanban.putString("hienthi3", "3");
                        nhandulieuban.putExtras(nhanban);
                        setResult(Activity.RESULT_OK, nhandulieuban);
                    }

                    if (ban4 != null) {
                        prepare(ban4);
                        nhanban.putString("hienthi4", "4");
                        nhandulieuban.putExtras(nhanban);
                        setResult(Activity.RESULT_OK, nhandulieuban);
                    }

                    if (ban5 != null) {
                        prepare(ban5);
                        nhanban.putString("hienthi5", "5");
                        nhandulieuban.putExtras(nhanban);
                        setResult(Activity.RESULT_OK, nhandulieuban);
                    }

                    if (ban6 != null) {
                        prepare(ban6);
                        nhanban.putString("hienthi6", "6");
                        nhandulieuban.putExtras(nhanban);
                        setResult(Activity.RESULT_OK, nhandulieuban);
                    }

                    if (ban7 != null) {
                        prepare(ban7);
                        nhanban.putString("hienthi7", "7");
                        nhandulieuban.putExtras(nhanban);
                        setResult(Activity.RESULT_OK, nhandulieuban);
                    }

                    if (ban8 != null) {
                        prepare(ban8);
                        nhanban.putString("hienthi8", "8");
                        nhandulieuban.putExtras(nhanban);
                        setResult(Activity.RESULT_OK, nhandulieuban);
                    }

                    if (ban9 != null) {
                        prepare(ban9);
                        nhanban.putString("hienthi9", "9");
                        nhandulieuban.putExtras(nhanban);
                        setResult(Activity.RESULT_OK, nhandulieuban);
                    }

                    if (ban10 != null) {
                        prepare(ban10);
                        nhanban.putString("hienthi10", "10");
                        nhandulieuban.putExtras(nhanban);
                        setResult(Activity.RESULT_OK, nhandulieuban);
                    }

                    if (ban11 != null) {
                        prepare(ban11);
                        nhanban.putString("hienthi11", "11");
                        nhandulieuban.putExtras(nhanban);
                        setResult(Activity.RESULT_OK, nhandulieuban);
                    }

                    if (ban12 != null) {
                        prepare(ban12);
                        nhanban.putString("hienthi12", "12");
                        nhandulieuban.putExtras(nhanban);
                        setResult(Activity.RESULT_OK, nhandulieuban);
                    }

                    if (ban13 != null) {
                        prepare(ban13);
                        nhanban.putString("hienthi13", "13");
                        nhandulieuban.putExtras(nhanban);
                        setResult(Activity.RESULT_OK, nhandulieuban);
                    }

                    if (ban14 != null) {
                        prepare(ban14);
                        nhanban.putString("hienthi14", "14");
                        nhandulieuban.putExtras(nhanban);
                        setResult(Activity.RESULT_OK, nhandulieuban);
                    }

                    if (ban15 != null) {
                        prepare(ban15);
                        nhanban.putString("hienthi15", "15");
                        nhandulieuban.putExtras(nhanban);
                        setResult(Activity.RESULT_OK, nhandulieuban);
                    }

                    if (ban16 != null) {
                        prepare(ban16);
                        nhanban.putString("hienthi16", "16");
                        nhandulieuban.putExtras(nhanban);
                        setResult(Activity.RESULT_OK, nhandulieuban);
                    }

                    if (ban17 != null) {
                        prepare(ban17);
                        nhanban.putString("hienthi17", "17");
                        nhandulieuban.putExtras(nhanban);
                        setResult(Activity.RESULT_OK, nhandulieuban);
                    }

                    if (ban18 != null) {
                        prepare(ban18);
                        nhanban.putString("hienthi18", "18");
                        nhandulieuban.putExtras(nhanban);
                        setResult(Activity.RESULT_OK, nhandulieuban);
                    }

                    if (ban19 != null) {
                        prepare(ban19);
                        nhanban.putString("hienthi19", "19");
                        nhandulieuban.putExtras(nhanban);
                        setResult(Activity.RESULT_OK, nhandulieuban);
                    }

                    if (ban20 != null) {
                        prepare(ban20);
                        nhanban.putString("hienthi20", "20");
                        nhandulieuban.putExtras(nhanban);
                        setResult(Activity.RESULT_OK, nhandulieuban);
                    }

                    if (ban21 != null) {
                        prepare(ban21);
                        nhanban.putString("hienthi21", "21");
                        nhandulieuban.putExtras(nhanban);
                        setResult(Activity.RESULT_OK, nhandulieuban);
                    }

                    if (ban22 != null) {
                        prepare(ban22);
                        nhanban.putString("hienthi22", "22");
                        nhandulieuban.putExtras(nhanban);
                        setResult(Activity.RESULT_OK, nhandulieuban);
                    }

                    if (ban23 != null) {
                        prepare(ban23);
                        nhanban.putString("hienthi23", "23");
                        nhandulieuban.putExtras(nhanban);
                        setResult(Activity.RESULT_OK, nhandulieuban);
                    }

                    if (ban24 != null) {
                        prepare(ban24);
                        nhanban.putString("hienthi24", "24");
                        nhandulieuban.putExtras(nhanban);
                        setResult(Activity.RESULT_OK, nhandulieuban);
                    }
                }

            }
        });

        btnquayvetang1 = (Button) findViewById(R.id.btnquayvetang1);
        btnquayvetang1.setOnClickListener(new View.OnClickListener() {

            public void onClick(View arg0) {
                // TODO Auto-generated method stub
                finish();
            }
        });

        spnlistcoffee = (Spinner) findViewById(R.id.spnlistcoffee);
        spnlistcoffee.setOnItemSelectedListener(this);
        ArrayAdapter<String> aadcoffee = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item,caphe);
        aadcoffee.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spnlistcoffee.setAdapter(aadcoffee);

        spnsoluongcoffee = (Spinner) findViewById(R.id.spnsoluongcoffee);
        spnsoluongcoffee.setOnItemSelectedListener(this);
        ArrayAdapter<String> aadsoluongcoffee = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item,
                soluongcaphe);
        aadsoluongcoffee.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spnsoluongcoffee.setAdapter(aadsoluongcoffee);

        spnlistsinhto = (Spinner) findViewById(R.id.spnlistsinhto);
        spnlistsinhto.setOnItemSelectedListener(this);
        ArrayAdapter<String> aadsinhto = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, sinhto);
        aadsinhto.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spnlistsinhto.setAdapter(aadsinhto);

        spnsoluongsinhto = (Spinner) findViewById(R.id.spnsoluongsinhto);
        spnsoluongsinhto.setOnItemSelectedListener(this);
        ArrayAdapter<String> aadsoluongsinhto = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item,
                soluongsinhto);
        aadsoluongsinhto.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spnsoluongsinhto.setAdapter(aadsoluongsinhto);

        spnlistthuoc = (Spinner) findViewById(R.id.spnlistthuoc);
        spnlistthuoc.setOnItemSelectedListener(this);
        ArrayAdapter<String> aadthuoc = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, thuoc);
        aadthuoc.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spnlistthuoc.setAdapter(aadthuoc);

        spnlistsoluongthuoc = (Spinner) findViewById(R.id.spnlistsoluongthuoc);
        spnlistsoluongthuoc.setOnItemSelectedListener(this);
        ArrayAdapter<String> aadsoluongthuoc = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item,
                soluongthuoc);
        aadsoluongthuoc.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spnlistsoluongthuoc.setAdapter(aadsoluongthuoc);

        spnlistkhac = (Spinner) findViewById(R.id.spnlistkhac);
        spnlistkhac.setOnItemSelectedListener(this);
        ArrayAdapter<String> aadkhac = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, khac);
        aadkhac.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spnlistkhac.setAdapter(aadkhac);

        spnlistsoluongkhac = (Spinner) findViewById(R.id.spnsoluongkhac);
        spnlistsoluongkhac.setOnItemSelectedListener(this);
        ArrayAdapter<String> aadsoluongkhac = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item,
                soluongkhac);
        aadsoluongkhac.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spnlistsoluongkhac.setAdapter(aadsoluongkhac);

        spnlistnuocep = (Spinner) findViewById(R.id.spnlistnuocep);
        spnlistnuocep.setOnItemSelectedListener(this);
        ArrayAdapter<String> aadnuocep = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, nuocep);
        aadnuocep.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spnlistnuocep.setAdapter(aadnuocep);

        spnlistsoluongnuocep = (Spinner) findViewById(R.id.spnsoluongnuocep);
        spnlistsoluongnuocep.setOnItemSelectedListener(this);
        ArrayAdapter<String> aadsoluongnuocep = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item,
                soluongnuocep);
        aadsoluongnuocep.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spnlistsoluongnuocep.setAdapter(aadsoluongnuocep);

        spnlistnuocngot = (Spinner) findViewById(R.id.spnlistnuocngot);
        spnlistnuocngot.setOnItemSelectedListener(this);
        ArrayAdapter<String> aadnuocngot = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item,
                nuocngot);
        aadnuocngot.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spnlistnuocngot.setAdapter(aadnuocngot);

        spnlistsoluongnuocngot = (Spinner) findViewById(R.id.spnlistsoluongnuocngot);
        spnlistsoluongnuocngot.setOnItemSelectedListener(this);
        ArrayAdapter<String> aadsoluongnuocngot = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item,
                soluongnuocngot);
        aadsoluongnuocngot.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spnlistsoluongnuocngot.setAdapter(aadsoluongnuocngot);

        Intent nhandulieuban = getIntent();
        Bundle nhanban = nhandulieuban.getExtras();
        nhanban(nhanban);

    }

    // Hàm xử lý sự kiện chọn thức uống
    public void onItemSelected(AdapterView<?> adapter, View view, int position, long id) {
        // TODO Auto-generated method stub

        switch (adapter.getId()) {
            case R.id.spnlistcoffee :
                ordercaphe = caphe[position];
                break;
            case R.id.spnsoluongcoffee :
                ordersoluongcaphe = soluongcaphe[position];
                if (ordercaphe !="" && ordersoluongcaphe !="") {
                    Toast.makeText(getApplicationContext(), ordersoluongcaphe + " " + ordercaphe, Toast.LENGTH_SHORT)
                            .show();
                    cf = true;

                }

                break;
            case R.id.spnlistsinhto :
                ordersinhto = sinhto[position];
                break;
            case R.id.spnsoluongsinhto :
                ordersoluongsinhto = soluongsinhto[position];
                if (ordersinhto !="" && ordersoluongsinhto !="") {
                    Toast.makeText(getApplicationContext(), ordersoluongsinhto + " " + ordersinhto, Toast.LENGTH_SHORT)
                            .show();
                    st = true;
                }
                break;
            case R.id.spnlistthuoc :
                orderthuoc = thuoc[position];
                break;
            case R.id.spnlistsoluongthuoc :
                ordersoluongthuoc = soluongthuoc[position];
                if (orderthuoc !="" && ordersoluongthuoc !="") {
                    Toast.makeText(getApplicationContext(), ordersoluongthuoc + " " + orderthuoc, Toast.LENGTH_SHORT)
                            .show();
                    tl = true;
                }
                break;
            case R.id.spnlistkhac :
                orderkhac = khac[position];
                break;
            case R.id.spnsoluongkhac :
                ordersoluongkhac = soluongkhac[position];
                if (orderkhac !="" && ordersoluongkhac !="") {
                    Toast.makeText(getApplicationContext(), ordersoluongkhac + " " + orderkhac, Toast.LENGTH_SHORT)
                            .show();
                    kh = true;
                }
                break;
            case R.id.spnlistnuocep :
                ordernuocep = nuocep[position];
                break;
            case R.id.spnsoluongnuocep :
                ordersoluongnuocep = soluongnuocep[position];
                if (ordernuocep !="" && ordersoluongnuocep !="") {
                    Toast.makeText(getApplicationContext(), ordersoluongnuocep + " " + ordernuocep, Toast.LENGTH_SHORT)
                            .show();
                    ne = true;
                }
                break;
            case R.id.spnlistnuocngot :
                ordernuocngot = nuocngot[position];
                break;
            case R.id.spnlistsoluongnuocngot :
                ordersoluongnuocngot = soluongnuocngot[position];
                if (ordernuocngot !="" && ordersoluongnuocngot !="") {
                    Toast.makeText(getApplicationContext(), ordersoluongnuocngot + " " + ordernuocngot,
                            Toast.LENGTH_SHORT).show();
                    nn = true;
                }
                break;

        }


          noidungorder = "\n" + ordercaphe + " " + ordersoluongcaphe + "\n" + ordersinhto + " " + ordersoluongsinhto
                + "\n" + orderkhac + " " + ordersoluongkhac + "\n" + orderthuoc + " " + ordersoluongthuoc + "\n"
                + ordernuocep + " " + ordersoluongnuocep + "\n" + ordernuocngot + " " + ordersoluongnuocngot;


        Intent nhandulieuban = getIntent();
        Bundle nhanban = nhandulieuban.getExtras();
        nhanban(nhanban);

    }

    public void onNothingSelected(AdapterView<?> arg0) {
        // TODO Auto-generated method stub
    }

    // hàm nhận số bàn từ activity Tang1 và xử lý thông tin order
    private void nhanban(Bundle nhanban) {

        ban1 = nhanban.getString("ban1");
        if (ban1 != null) {
            txtchonthucuong.setText("MỜI BẠN CHỌN THỨC UỐNG CHO " + ban1);
            if (noidungorder != null) {
                noidungorder =  ban1 + noidungorder;
            }
        }

        ban2 = nhanban.getString("ban2");
        if (ban2 != null) {
            txtchonthucuong.setText("MỜI BẠN CHỌN THỨC UỐNG CHO " + ban2);
            if (noidungorder != null) {
                noidungorder =  ban2 + noidungorder;
            }
        }

        ban3 = nhanban.getString("ban3");
        if (ban3 != null) {
            txtchonthucuong.setText("MỜI BẠN CHỌN THỨC UỐNG CHO " + ban3);
            if (noidungorder != null) {
                noidungorder = /* ban3 + */noidungorder;
            }
        }

        ban4 = nhanban.getString("ban4");
        if (ban4 != null) {
            txtchonthucuong.setText("MỜI BẠN CHỌN THỨC UỐNG CHO " + ban4);
            if (noidungorder != null) {
                noidungorder = /* ban4 + */noidungorder;
            }
        }

        ban5 = nhanban.getString("ban5");
        if (ban5 != null) {
            txtchonthucuong.setText("MỜI BẠN CHỌN THỨC UỐNG CHO " + ban5);
            if (noidungorder != null) {
                noidungorder = /* ban5 + */noidungorder;
            }
        }

        ban6 = nhanban.getString("ban6");
        if (ban6 != null) {
            txtchonthucuong.setText("MỜI BẠN CHỌN THỨC UỐNG CHO " + ban6);
            if (noidungorder != null) {
                noidungorder = /* ban6 + */noidungorder;
            }
        }

        ban7 = nhanban.getString("ban7");
        if (ban7 != null) {
            txtchonthucuong.setText("MỜI BẠN CHỌN THỨC UỐNG CHO " + ban7);
            if (noidungorder != null) {
                noidungorder = /* ban7 + */noidungorder;
            }
        }

        ban8 = nhanban.getString("ban8");
        if (ban8 != null) {
            txtchonthucuong.setText("MỜI BẠN CHỌN THỨC UỐNG CHO " + ban8);
            if (noidungorder != null) {
                noidungorder = /* ban8 + */noidungorder;
            }
        }

        ban9 = nhanban.getString("ban9");
        if (ban9 != null) {
            txtchonthucuong.setText("MỜI BẠN CHỌN THỨC UỐNG CHO " + ban9);
            if (noidungorder != null) {
                noidungorder = /* ban9 + */noidungorder;
            }
        }

        ban10 = nhanban.getString("ban10");
        if (ban10 != null) {
            txtchonthucuong.setText("MỜI BẠN CHỌN THỨC UỐNG CHO " + ban10);
            if (noidungorder != null) {
                noidungorder = /* ban10 + */noidungorder;
            }
        }

        ban11 = nhanban.getString("ban11");
        if (ban11 != null) {
            txtchonthucuong.setText("MỜI BẠN CHỌN THỨC UỐNG CHO " + ban11);
            if (noidungorder != null) {
                noidungorder = /* ban11 + */noidungorder;
            }
        }

        ban12 = nhanban.getString("ban12");
        if (ban12 != null) {
            txtchonthucuong.setText("MỜI BẠN CHỌN THỨC UỐNG CHO " + ban12);
            if (noidungorder != null) {
                noidungorder = /* ban12 + */noidungorder;
            }
        }

        ban13 = nhanban.getString("ban13");
        if (ban13 != null) {
            txtchonthucuong.setText("MỜI BẠN CHỌN THỨC UỐNG CHO " + ban13);
            if (noidungorder != null) {
                noidungorder = /* ban13 + */noidungorder;
            }
        }

        ban14 = nhanban.getString("ban14");
        if (ban14 != null) {
            txtchonthucuong.setText("MỜI BẠN CHỌN THỨC UỐNG CHO " + ban14);
            if (noidungorder != null) {
                noidungorder = /* ban14 + */noidungorder;
            }
        }

        ban15 = nhanban.getString("ban15");
        if (ban15 != null) {
            txtchonthucuong.setText("MỜI BẠN CHỌN THỨC UỐNG CHO " + ban15);
            if (noidungorder != null) {
                noidungorder = /* ban15 + */noidungorder;
            }
        }

        ban16 = nhanban.getString("ban16");
        if (ban16 != null) {
            txtchonthucuong.setText("MỜI BẠN CHỌN THỨC UỐNG CHO " + ban16);
            if (noidungorder != null) {
                noidungorder = /* ban16 + */noidungorder;
            }
        }

        ban17 = nhanban.getString("ban17");
        if (ban17 != null) {
            txtchonthucuong.setText("MỜI BẠN CHỌN THỨC UỐNG CHO " + ban17);
            if (noidungorder != null) {
                noidungorder = /* ban17 + */noidungorder;
            }
        }

        ban18 = nhanban.getString("ban18");
        if (ban18 != null) {
            txtchonthucuong.setText("MỜI BẠN CHỌN THỨC UỐNG CHO " + ban18);
            if (noidungorder != null) {
                noidungorder = /* ban18 + */noidungorder;
            }
        }

        ban19 = nhanban.getString("ban19");
        if (ban19 != null) {
            txtchonthucuong.setText("MỜI BẠN CHỌN THỨC UỐNG CHO " + ban19);
            if (noidungorder != null) {
                noidungorder = /* ban19 + */noidungorder;
            }
        }

        ban20 = nhanban.getString("ban20");
        if (ban20 != null) {
            txtchonthucuong.setText("MỜI BẠN CHỌN THỨC UỐNG CHO " + ban20);
            if (noidungorder != null) {
                noidungorder = /* ban20 + */noidungorder;
            }
        }

        ban21 = nhanban.getString("ban21");
        if (ban21 != null) {
            txtchonthucuong.setText("MỜI BẠN CHỌN THỨC UỐNG CHO " + ban21);
            if (noidungorder != null) {
                noidungorder = /* ban21 + */noidungorder;
            }
        }

        ban22 = nhanban.getString("ban22");
        if (ban22 != null) {
            txtchonthucuong.setText("MỜI BẠN CHỌN THỨC UỐNG CHO " + ban22);
            if (noidungorder != null) {
                noidungorder = /* ban22 + */noidungorder;
            }
        }

        ban23 = nhanban.getString("ban23");
        if (ban23 != null) {
            txtchonthucuong.setText("MỜI BẠN CHỌN THỨC UỐNG CHO " + ban23);
            if (noidungorder != null) {
                noidungorder = /* ban23 + */noidungorder;
            }
        }

        ban24 = nhanban.getString("ban24");
        if (ban24 != null) {
            txtchonthucuong.setText("MỜI BẠN CHỌN THỨC UỐNG CHO " + ban24);
            if (noidungorder != null) {
                noidungorder = /* ban24 + */noidungorder;
            }
        }

    }

     public long insert(String table, String sb, String nd, String sl) {
        Calendar cal = Calendar.getInstance();
        int intday = cal.get(Calendar.DAY_OF_MONTH);
        int intmounth = cal.get(Calendar.MONTH) + 1;
        int intyear = cal.get(Calendar.YEAR);
        int intgio = cal.get(Calendar.HOUR_OF_DAY);
        int intphut = cal.get(Calendar.MINUTE);

        String thoigian = String.valueOf(intgio) + ":" + String.valueOf(intphut);
        String ngaythang = String.valueOf(intday) + "/" + String.valueOf(intmounth);
        ContentValues chen = new ContentValues();
        chen.put("Ngay", ngaythang);
        chen.put("Gio", thoigian);
        textView = (TextView) findViewById(R.id.listHoadon);
        textView.setText("\n\n\n Hoa Don Thanh Toan"+ "\n "+ chen +"\n"+ noidungorder);
        Toast.makeText(this," "+ chen + " " + noidungorder, Toast.LENGTH_SHORT).show();
        return 0;
    }



    @SuppressLint("WrongConstant")
    public void prepare(String tb) {
        if (cf == true) {
            insert("danhsach", tb, ordercaphe, ordersoluongcaphe);
        }
        if (st == true) {
            insert("danhsach", tb, ordersinhto, ordersoluongsinhto);
        }
        if (tl == true) {
            insert("danhsach", tb, orderthuoc, ordersoluongthuoc);
        }
        if (kh == true) {
            insert("danhsach", tb, orderkhac, ordersoluongkhac);
        }
        if (ne = true) {
            insert("danhsach", tb, ordernuocep, ordersoluongnuocep);
        }
        if (nn = true) {
            insert("danhsach", tb, ordernuocngot, ordersoluongnuocngot);
        }
        Toast.makeText(getApplicationContext(), tb + " order thành công", 1).show();
    }

}
