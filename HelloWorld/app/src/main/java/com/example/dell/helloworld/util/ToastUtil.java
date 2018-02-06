package com.example.dell.helloworld.util;

import android.content.Context;
import android.widget.Toast;

/**
 * Created by dell on 2018/1/31.
 */

public class ToastUtil {
    public static Toast mToast;
    public  static void showMsg(Context context, String msg){
        if(mToast==null){
            mToast=Toast.makeText(context,msg,Toast.LENGTH_SHORT);
        }else {
            mToast.setText(msg);
        }
        mToast.show();
    }
}
