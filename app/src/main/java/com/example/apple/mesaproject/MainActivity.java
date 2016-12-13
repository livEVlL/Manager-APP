package com.example.apple.mesaproject;


import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btnlogin = (Button)findViewById(R.id.btn_login) ;
        btnlogin.setOnClickListener(new Button.OnClickListener(){
            public void onClick(View v){
                changeLayout();
            }
        });
    }
    public void changeLayout(){
        Toast.makeText(this,"Login Success",Toast.LENGTH_SHORT).show();
        setContentView(R.layout.mainpage);
    }

}
