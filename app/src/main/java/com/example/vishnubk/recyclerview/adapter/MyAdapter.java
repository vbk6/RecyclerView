package com.example.vishnubk.recyclerview.adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.vishnubk.recyclerview.R;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by vishnubk on 26/2/16.
 */
 public class MyAdapter extends RecyclerView.Adapter<MyAdapter.ViewHolder> {

 Context context;
    String[] asd;
    List<String> list=new ArrayList<String>() ;

    public MyAdapter(Context context,String[] asd) {
        this.context=context;
        this.asd=asd;


        list.add("a");
        list.add("b");
    }


    public static class ViewHolder extends RecyclerView.ViewHolder {
        // each data item is just a string in this case
        public TextView mTextView;
        public ViewHolder(View v) {
            super(v);
            mTextView = (TextView)v.findViewById(R.id.textView);
        }
    }
    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.item_cintact, parent, false);
        ViewHolder vh = new ViewHolder(v);
        return vh;


    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        holder.mTextView.setText(asd[position]);

    }

    @Override
    public int getItemCount() {
        return asd.length;

    }


}
