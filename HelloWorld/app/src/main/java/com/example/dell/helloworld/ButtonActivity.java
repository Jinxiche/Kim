package com.example.dell.helloworld;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class ButtonActivity extends AppCompatActivity {

    private Button mBtn3;
    private TextView mTv1;
    private Button mBtn4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_button);
        mBtn3 = (Button) findViewById(R.id.btn_3);
        mTv1 = (TextView) findViewById(R.id.tv_1);
        mBtn4 = (Button) findViewById(R.id.btn_4);
        setListener();
    }

    private  void setListener() {
        OnClick onClick = new OnClick();
        mBtn3.setOnClickListener(onClick);
        mTv1.setOnClickListener(onClick);
        mBtn4.setOnClickListener(onClick);
    }

    private  class OnClick implements View.OnClickListener {

        @Override
        public void onClick(View v) {
            switch (v.getId()) {
                case R.id.btn_3:
                    Toast.makeText(ButtonActivity.this, "You Clicked Button3", Toast.LENGTH_SHORT).show();
                    break;
                case R.id.tv_1:
                    Toast.makeText(ButtonActivity.this, "You Clicked TextView1", Toast.LENGTH_SHORT).show();
                    break;
                case R.id.btn_4:
                    Toast.makeText(ButtonActivity.this, "You Clicked Button4", Toast.LENGTH_SHORT).show();
                    break;
            }
        }
    }
}
