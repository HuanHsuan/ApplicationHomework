package com.example.huan.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void click_bt(View view){
        Intent intent = new Intent();
        intent.setClass( MainActivity.this,Main2Activity.class);
        EditText et01 = (EditText)findViewById(R.id.et01);
        Bundle bundle = new Bundle();
        bundle.putString("saying",et01.getText().toString());

        intent.putExtras(bundle);
        startActivity(intent);
        MainActivity.this.finish();
    }
}
