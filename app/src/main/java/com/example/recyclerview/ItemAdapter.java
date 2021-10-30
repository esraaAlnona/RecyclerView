package com.example.recyclerview;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

import de.hdodenhof.circleimageview.CircleImageView;

public class ItemAdapter extends RecyclerView.Adapter <ItemAdapter.ItemViewHolder>{
    private ArrayList<Item> mitems;

    public ItemAdapter(ArrayList<Item> itemsList){
        mitems = itemsList;
    }

    @NonNull
    @Override
    public ItemViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item,parent,false);
        ItemViewHolder itemViewHolder = new ItemViewHolder(view);
        return itemViewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull ItemViewHolder holder, int position) {
        Item item = mitems.get(position);
        holder.mImage.setImageResource(item.getMimageView());
        holder.mTxt1.setText(item.getMtxtView1());
        holder.mTxt2.setText(item.getMtxtView2());
    }

    @Override
    public int getItemCount() {
        return mitems.size();
    }

    public static class ItemViewHolder extends RecyclerView.ViewHolder{
        public CircleImageView mImage;
        public TextView mTxt1;
        public TextView mTxt2;

        public ItemViewHolder(View view){
            super(view);
            mImage = view.findViewById(R.id.myImage);
            mTxt1 =  view.findViewById(R.id.txt1);
            mTxt2 =  view.findViewById(R.id.txt2);
        }

    }
}
