package com.example.dell.helloworld;

import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.example.dell.helloworld.util.ToastUtil;

public class DialogActivity extends AppCompatActivity {

    private Button mBtnDialog1;
    private Button mBtnDialog2;
    private Button mBtnDialog3;
    private Button mBtnDialog4;
    private Button mBtnDialog5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dialog);
        mBtnDialog1 = (Button) findViewById(R.id.btn_dialog1);
        mBtnDialog2 = (Button) findViewById(R.id.btn_dialog2);
        mBtnDialog3 = (Button) findViewById(R.id.btn_dialog3);
        mBtnDialog4 = (Button) findViewById(R.id.btn_dialog4);
        mBtnDialog5 = (Button) findViewById(R.id.btn_dialog5);
        OnClick onClick = new OnClick();
        mBtnDialog1.setOnClickListener(onClick);
        mBtnDialog2.setOnClickListener(onClick);
        mBtnDialog3.setOnClickListener(onClick);
        mBtnDialog4.setOnClickListener(onClick);
        mBtnDialog5.setOnClickListener(onClick);
    }

    class OnClick implements View.OnClickListener {
        @Override
        public void onClick(View v) {
            switch (v.getId()) {
                case R.id.btn_dialog1:
                    AlertDialog.Builder builder1 = new AlertDialog.Builder(DialogActivity.this);
                    builder1.setTitle("please answer").setMessage("what about this app?").setIcon(R.drawable.icon_imageview_hat).setPositiveButton("good", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int which) {
                            ToastUtil.showMsg(DialogActivity.this, "you are a good guy");
                        }
                    }).setNeutralButton("just so so", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int which) {
                            ToastUtil.showMsg(DialogActivity.this, "look again");
                        }
                    }).setNegativeButton("bad", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int which) {
                            ToastUtil.showMsg(DialogActivity.this, "you are lie");
                        }
                    }).show();
                    break;
                case R.id.btn_dialog2:
                    final String[] array2 = new String[]{"boy", "girl"};
                    AlertDialog.Builder builder2 = new AlertDialog.Builder(DialogActivity.this);
                    builder2.setTitle("choose sex").setItems(array2, new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int which) {
                            ToastUtil.showMsg(DialogActivity.this, array2[which]);
                        }
                    }).show();
                    break;
                case R.id.btn_dialog3:
                    final String[] array3 = new String[]{"boy", "girl"};
                    AlertDialog.Builder builder3 = new AlertDialog.Builder(DialogActivity.this);
                    builder3.setTitle("choosen").setSingleChoiceItems(array3, 0, new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int which) {
                            ToastUtil.showMsg(DialogActivity.this, array3[which]);
                            dialog.dismiss();
                        }
                    }).setCancelable(false).show();
                    break;
                case R.id.btn_dialog4:
                    final String[] array4 = new String[]{"dance", "sing", "write"};
                    final boolean[] isSelected = new boolean[]{false, false, false};
                    AlertDialog.Builder builder4 = new AlertDialog.Builder(DialogActivity.this);
                    builder4.setTitle("chose your hobbit").setMultiChoiceItems(array4, isSelected, new DialogInterface.OnMultiChoiceClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int which, boolean isChecked) {
                            ToastUtil.showMsg(DialogActivity.this, array4[which] + ":" + isChecked);
                        }
                    }).setPositiveButton("OK", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int which) {
                            ToastUtil.showMsg(DialogActivity.this, "right");
                        }
                    }).setNegativeButton("wait", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int which) {
                            ToastUtil.showMsg(DialogActivity.this, "again");
                        }
                    }).show();
                    break;
                case R.id.btn_dialog5:
                    AlertDialog.Builder builder5=new AlertDialog.Builder(DialogActivity.this);
                    View view=LayoutInflater.from(DialogActivity.this).inflate(R.layout.layout_dialog,null);
                    EditText etUserName= (EditText) view.findViewById(R.id.et_username);
                    EditText etPassword= (EditText) view.findViewById(R.id.et_password);
                    Button btnLogin= (Button) view.findViewById(R.id.btn_login);
                    btnLogin.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {

                        }
                    });
                    builder5.setTitle("please sign in").setView(view).show();
                    break;
            }
        }
    }
}
