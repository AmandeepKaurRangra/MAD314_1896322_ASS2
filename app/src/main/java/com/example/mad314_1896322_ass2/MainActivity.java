package com.example.mad314_1896322_ass2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText studentId;
    EditText studentPassword;
    Button logIn;

    String myid="1";
    String mypass="a";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        studentId=findViewById(R.id.id);
        studentPassword=findViewById(R.id.password);
        logIn=findViewById(R.id.logIn);
        System.out.println("Rich");

        logIn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Editable idData=studentId.getText();
                String sid=idData.toString();

                Editable passwordData=studentPassword.getText();
                String spassword=passwordData.toString();

                if(sid.equalsIgnoreCase(myid) && spassword.equalsIgnoreCase(mypass))
                {
                Intent i=new Intent(MainActivity.this,Main2Activity.class);
                i.putExtra("id",sid);
                i.putExtra("pass",spassword);
                startActivity(i);
                }
            }
        });
    }
}
