package com.example.user_pc.d0441381_hk3;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Main2Activity extends MainActivity {
    Button Backof;
    EditText data;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        Backof=(Button)findViewById(R.id.button2);
        data=(EditText)findViewById((R.id.editText));
        Backof.setOnClickListener(returnpop);
        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
    }
    private View.OnClickListener returnpop=new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            String redata=data.getText().toString();
            Intent intent = new Intent();
            intent.putExtra("Name",redata);
            setResult(RESULT_OK,intent);
            //intent.putExtra(dat);
            finish();

        }
    };

}
