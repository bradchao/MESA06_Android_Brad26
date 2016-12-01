package com.example.user.brad26;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.GridView;

public class MainActivity extends AppCompatActivity {
    private GridView gridView;
    private MyAdapter myAdapter;
    private int[] balls = {R.drawable.ball1,R.drawable.ball2,
    R.drawable.ball3,R.drawable.ball4,R.drawable.ball5,
    R.drawable.ball6,R.drawable.ball7,R.drawable.ball8,
    R.drawable.ball9,R.drawable.ball10};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        gridView = (GridView)findViewById(R.id.gridView);
        initGridView();

    }

    private void initGridView(){
        myAdapter = new MyAdapter(this);
        gridView.setAdapter(myAdapter);
    }

    private class MyAdapter extends BaseAdapter {
        private Context context;
        MyAdapter(Context context){this.context = context;}

        @Override
        public int getCount() {
            return balls.length;
        }

        @Override
        public Object getItem(int i) {
            return null;
        }

        @Override
        public long getItemId(int i) {
            return 0;
        }

        @Override
        public View getView(int i, View view, ViewGroup viewGroup) {
            return null;
        }
    }





}
