package com.example.dell.helloworld.listview;

import android.app.Activity;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import com.example.dell.helloworld.R;

/**
 * Created by dell on 2018/1/25.
 */

public class ListViewActivity extends Activity {

    private ListView mLv1;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_view);
        mLv1 = (ListView) findViewById(R.id.lv_1 );
        mLv1 .setAdapter(new MyListAdapter(ListViewActivity .this) );
        mLv1.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast .makeText(ListViewActivity .this,"Clickpos:"+position ,Toast .LENGTH_SHORT ).show() ;
            }
        });
        mLv1 .setOnItemLongClickListener(new AdapterView.OnItemLongClickListener() {
            @Override
            public boolean onItemLongClick(AdapterView<?> parent, View view, int position, long id) {
                Toast .makeText(ListViewActivity .this,"Longpos:"+position ,Toast .LENGTH_SHORT ).show() ;
                return true;
            }
        }) ;
    }
}
