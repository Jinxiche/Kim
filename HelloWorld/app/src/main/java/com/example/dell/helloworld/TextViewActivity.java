package com.example.dell.helloworld;

import android.graphics.Paint;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import java.sql.RowIdLifetime;

public class TextViewActivity extends AppCompatActivity {

    private TextView mTv1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_text_view);
        mTv1=(TextView) findViewById(R.id.tv_1);
        mTv1.getPaint().setFlags(Paint.STRIKE_THRU_TEXT_FLAG );
        mTv1.getPaint().setAntiAlias(true);
    }
}
