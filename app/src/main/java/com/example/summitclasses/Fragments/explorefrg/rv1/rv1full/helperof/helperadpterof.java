package com.example.summitclasses.Fragments.explorefrg.rv1.rv1full.helperof;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.example.summitclasses.R;

import java.util.ArrayList;

public class helperadpterof extends RecyclerView.Adapter<helperadpterof.Viewholder> {
    ArrayList<helperclassof> featuredlocations;

    public helperadpterof(ArrayList<helperclassof> featuredlocations) {
        this.featuredlocations = featuredlocations;
    }
    @NonNull
    @Override
    public Viewholder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.imagetext,parent,false);
        helperadpterof.Viewholder featuredviewholder = new helperadpterof.Viewholder(view);
        return featuredviewholder;
    }

    @Override
    public void onBindViewHolder(@NonNull Viewholder holder, int position) {
        helperclassof helperclass1 = featuredlocations.get(position);
        Glide.with((holder.icon.getContext())).load(helperclass1.getImgurl()).placeholder(R.drawable.progressanim).into(holder.icon);


    }

    @Override
    public int getItemCount() {
        return featuredlocations.size();
    }

    public class Viewholder extends RecyclerView.ViewHolder {
        ImageView icon;
        public Viewholder(@NonNull View itemView) {
            super(itemView);
            icon= itemView.findViewById(R.id.textimg);
        }
    }
}
