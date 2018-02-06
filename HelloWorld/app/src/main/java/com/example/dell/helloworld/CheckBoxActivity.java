package com.example.dell.helloworld;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.Toast;

public class CheckBoxActivity extends AppCompatActivity {

    private CheckBox mCb_5;
    private CheckBox mCb_6;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_check_box);
        mCb_5 = (CheckBox) findViewById(R.id.cb_5);
        mCb_6 = (CheckBox) findViewById(R.id.cb_6);

        mCb_5 .setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                Toast .makeText(CheckBoxActivity .this,isChecked?"5 yes":"5 no",Toast.LENGTH_SHORT ).show() ;
            }
        });
        mCb_6 .setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                Toast .makeText(CheckBoxActivity .this,isChecked?"6 yes":"6 no",Toast.LENGTH_SHORT ).show() ;
            }
        });
    }
}
