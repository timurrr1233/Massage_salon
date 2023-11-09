package com.example.massage_salon;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.Button;

import com.example.massage_salon.R;
import com.example.massage_salon.data.Services;
import com.example.massage_salon.data.Users;
import com.example.massage_salon.database.DataBaseManager;

import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                startActivity(new Intent(MainActivity.this, AutorizatonActivity.class));
                finish();
            }
        }, 1500);
//        DataBaseManager dataBaseManager = new DataBaseManager(this);
//        dataBaseManager.openDb();
//        dataBaseManager.addService(new Services("Массаж лица", 2500, "описание"));
//        dataBaseManager.addService(new Services("Массаж ног", 4000, "описание"));
//        dataBaseManager.addService(new Services("Массаж рук", 3000, "описание"));
//        dataBaseManager.addService(new Services("Антицеллюлитный массаж", 6700, "описание"));
//        dataBaseManager.addService(new Services("Массаж спины", 6500, "описание"));
//        dataBaseManager.addService(new Services("Ультразвуковая чистка лица", 2500, "описание"));
//        dataBaseManager.addService(new Services("SMAS лифтинг", 2500, "описание"));
//        dataBaseManager.addService(new Services("Микроигольчатый RF лифтинг", 2500, "описание"));
//        dataBaseManager.addService(new Services("Тайский массаж", 2500, "описание"));
//        dataBaseManager.addService(new Services("Массаж шейно-воротниковой зоны", 2500, "описание"));
//        dataBaseManager.closeDb();
    }
}