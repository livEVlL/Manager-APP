package com.example.apple.mesaproject;

import android.app.Activity;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.view.View;
import android.widget.Button;

/**
 * Created by apple on 2016/12/14.
 */

public class forgot extends Activity {
    @Override
    public void onCreate(Bundle savedInstanceState, PersistableBundle persistentState) {
        super.onCreate(savedInstanceState, persistentState);
        setContentView(R.layout.forgot);

        Button goback = (Button)findViewById(R.id.btn_goback);
        goback.setOnClickListener(new Button.OnClickListener(){
            public void onClick(View v){
                changeLayout3();
            }
        });

    }
    public void changeLayout3(){
        setContentView(R.layout.activity_main);
    }
}
