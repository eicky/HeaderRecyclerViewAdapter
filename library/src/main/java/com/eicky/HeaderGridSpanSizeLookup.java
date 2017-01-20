package com.eicky;

import android.support.v7.widget.GridLayoutManager;

/**
 * @author Wangli
 * @Description: 为了让标题栏独立成一行
 * @date: 2016/12/28 18:13
 * @version: V1.0
 */
public class HeaderGridSpanSizeLookup extends GridLayoutManager.SpanSizeLookup {
    private HeaderRecyclerViewAdapter<?, ?> mAdapter;
    private GridLayoutManager mGridLayoutManager;

    public HeaderGridSpanSizeLookup(HeaderRecyclerViewAdapter<?, ?> adapter, GridLayoutManager gridLayoutManager) {
        mAdapter = adapter;
        mGridLayoutManager = gridLayoutManager;
    }

    @Override
    public int getSpanSize(int position) {
        //spansize表示一个item的跨度，跨度了多少个span
        if (mAdapter.isHeader(position))
            return mGridLayoutManager.getSpanCount();
        else
            return 1;
    }
}
