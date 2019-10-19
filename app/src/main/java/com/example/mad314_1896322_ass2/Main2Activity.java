package com.example.mad314_1896322_ass2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

public class Main2Activity extends AppCompatActivity {

    String stuId;
    String stuPass;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);



        Intent i=getIntent();
        stuId=i.getStringExtra("id");
        stuPass=i.getStringExtra("pass");



    }
}
