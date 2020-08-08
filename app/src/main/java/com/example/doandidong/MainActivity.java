package com.example.doandidong;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    final String DATABASE_NAME = "EmployeeDB.sqlite";
    SQLiteDatabase database;

    ListView listView;
    ArrayList<NhanVien> list;
    AdapterNhanVien adapter;
    Button btnAdd;
    Button btnDangXuat;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnDangXuat = (Button) findViewById(R.id.btnDangxuat);
        btnDangXuat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent dangxuat = new Intent(MainActivity.this, DangNhap.class);
                startActivity(dangxuat);
            }
        });

        addControls();
        readData();
    }

    private void addControls() {
        btnAdd = (Button) findViewById(R.id.btnAdd);
        btnAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, AddActivity.class);
                startActivity(intent);
            }
        });
        listView = (ListView) findViewById(R.id.listview);
        list = new ArrayList<>();
        adapter = new AdapterNhanVien(this, list);
        listView.setAdapter(adapter);
    }

    private void readData(){
        database = Database.initDatabase(this, DATABASE_NAME);
        Cursor cursor = database.rawQuery("SELECT * FROM NhanVien",null);
        list.clear();
        for(int i = 0; i < cursor.getCount(); i++){
            cursor.moveToPosition(i);
            int id = cursor.getInt(0);
            String ten = cursor.getString(1);
            String sdt = cursor.getString(2);
            byte[] anh = cursor.getBlob(3);
            list.add(new NhanVien(id, ten, sdt, anh));
        }
        adapter.notifyDataSetChanged();
    }
}