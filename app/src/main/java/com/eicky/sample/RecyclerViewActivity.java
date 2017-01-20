package com.eicky.sample;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.io.Serializable;

/**
 * @author Wangli
 * @Description:
 * @date: 2016/12/29 17:30
 * @version: V1.0
 */
public class RecyclerViewActivity extends AppCompatActivity {
    private RecyclerView mRecyclerView;
    private SampleAdapter mAdapter;
    private static final String TYPE_KEY = "type_key";
    private Type mType;

    public enum Type implements Serializable{
        LIST, GRID
    }

    public static void startActivity(Context context, Type type){
        Intent intent = new Intent(context, RecyclerViewActivity.class);
        intent.putExtra(TYPE_KEY, type);
        context.startActivity(intent);
    }

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recycler_view);
        mType = (Type) getIntent().getSerializableExtra(TYPE_KEY);
        mRecyclerView = (RecyclerView) findViewById(R.id.recycler_view);
        if (mType == Type.LIST){
            LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this);
            mAdapter = new SampleAdapter(linearLayoutManager, this);
            mRecyclerView.setLayoutManager(new LinearLayoutManager(this));
        } else if (mType == Type.GRID){
            GridLayoutManager gridLayoutManager = new GridLayoutManager(this, 2);
            mRecyclerView.setLayoutManager(gridLayoutManager);
            mAdapter = new SampleAdapter(gridLayoutManager, this);
        }
        mRecyclerView.setAdapter(mAdapter);
    }
}
