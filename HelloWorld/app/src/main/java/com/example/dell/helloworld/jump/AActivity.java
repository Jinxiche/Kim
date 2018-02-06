package com.example.dell.helloworld.jump;

import android.content.ComponentName;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.example.dell.helloworld.R;

/**
 * Created by dell on 2018/2/1.
 */

public class AActivity extends AppCompatActivity {

    private Button mBtnJumpA;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_a);
        mBtnJumpA= (Button) findViewById(R.id.btn_jump_a);
        mBtnJumpA.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //1
                Intent intent=new Intent(AActivity.this,BActivity.class);
                Bundle bundle=new Bundle();
                bundle.putString("name","jindeshun");
                bundle.putInt("number",88);
                intent.putExtras(bundle);
                startActivity(intent);
                //startActivityForResult(intent,0);

                //2
                //Intent intent=new Intent();
                //intent.setClass(AActivity.this,BActivity.class);
                //startActivity(intent);

                //3
                //Intent intent=new Intent();
                //intent.setClassName(AActivity.this,"com.example.dell.helloworld.jump.BActivity");
                //startActivity(intent);

                //4
                //Intent intent=new Intent();
                //intent.setComponent(new ComponentName(AActivity.this,"com.example.dell.helloworld.jump.BActivity"));
                //startActivity(intent);

                //yin--1
                //Intent intent=new Intent();
                //intent.setAction("com.skypan.test.BActivity");
                //startActivity(intent);
            }
        });
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        Toast.makeText(AActivity.this,data.getExtras().getString("title"),Toast.LENGTH_LONG).show();
    }
}
