package com.eicky.sample;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.eicky.HeaderRecyclerViewAdapter;

/**
 * @author Wangli
 * @Description:
 * @date: 2016/12/28 18:25
 * @version: V1.0
 */
public class SampleAdapter extends HeaderRecyclerViewAdapter<SampleAdapter.HeaderViewHolder, SampleAdapter.ItemViewHolder> {
    private Context mContext;

    public SampleAdapter(RecyclerView.LayoutManager layoutManager, Context context) {
        super(layoutManager);
        mContext = context;
    }

    @Override
    protected int getHeaderCount() {
        return 10;
    }

    @Override
    protected int getItemCountForSection(int section) {
        return 3;
    }

    @Override
    protected HeaderViewHolder onCreateHeaderViewHolder(ViewGroup parent, int viewType) {
        return new HeaderViewHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.item_title, null));
    }

    @Override
    protected ItemViewHolder onCreateItemViewHolder(ViewGroup parent, int viewType) {
        return new ItemViewHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.item_img, null));
    }

    @Override
    protected void onBindHeaderViewHolder(HeaderViewHolder holder, int headerPosition) {
        holder.mTextView.setText("我是标题" + headerPosition);
    }

    @Override
    protected void onBindItemViewHolder(ItemViewHolder holder, int headerPosition, int itemPosition) {
        holder.mImageView.setImageResource(mContext.getResources().getIdentifier("img" + (itemPosition % 3),
                "mipmap", mContext.getPackageName()));
    }


    class HeaderViewHolder extends RecyclerView.ViewHolder{
        TextView mTextView;

        public HeaderViewHolder(View itemView) {
            super(itemView);
            mTextView = (TextView) itemView.findViewById(R.id.title);
        }
    }

    class ItemViewHolder extends RecyclerView.ViewHolder{
        ImageView mImageView;

        public ItemViewHolder(View itemView) {
            super(itemView);
            mImageView = (ImageView) itemView.findViewById(R.id.img);
        }
    }
}
