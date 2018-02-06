package com.example.dell.helloworld;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.ProgressBar;

import com.bumptech.glide.Glide;

public class ImageViewActivity extends AppCompatActivity {

    private ProgressBar mPb;
    private ImageView  mIv1;
    private ImageView  mIv4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_image_view);
        mIv1   = (ImageView) findViewById(R.id.iv_1 );
        mPb = (ProgressBar) findViewById(R.id.pb );
        mIv4   = (ImageView) findViewById(R.id.iv_4 );
        Glide.with(this).load("http://p0.so.qhimgs1.com/bdr/_240_/t01f82d91642d961e5a.png").into(mIv4);
        mIv1  .setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (mPb .getVisibility() ==View.GONE )
                {
                    mPb .setVisibility(View.VISIBLE );
                }
                else {
                    mPb .setVisibility(View.GONE);
                }
            }
        }) ;
    }
}
