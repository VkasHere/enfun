package com.example.summitclasses.Fragments.helperadapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.example.summitclasses.Fragments.helperclass.ahelperclass;
import com.example.summitclasses.R;

import java.util.ArrayList;

public class ahelperadapter extends RecyclerView.Adapter<ahelperadapter.helperviewholder> {


    ArrayList<ahelperclass> featuredlocations;
    public ahelperadapter(ArrayList<ahelperclass> featuredlocations) {
        this.featuredlocations = featuredlocations;
    }

    @NonNull
    @Override
    public helperviewholder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.recycler_card_view,parent,false);
        helperviewholder ahelper = new helperviewholder(view);
        return ahelper;
    }

    @Override
    public void onBindViewHolder(@NonNull helperviewholder holder, int position) {
        ahelperclass featured_class = featuredlocations.get(position);
        holder.namer.setText(featured_class.getNamer());
        holder.marks.setText(featured_class.getMarks());
        holder.batch.setText(featured_class.getBatch());
        Glide.with(holder.image.getContext()).load(featured_class.getImage()).placeholder(R.drawable.pna).into(holder.image);

    }

    @Override
    public int getItemCount() {
        return featuredlocations.size();
    }

    public class helperviewholder extends RecyclerView.ViewHolder {
        ImageView image;
        TextView namer,marks,batch;
        public helperviewholder(@NonNull View itemView) {
            super(itemView);
            //hooks
            image =itemView.findViewById(R.id.photo);
            namer =itemView.findViewById(R.id.name_re);
            marks =itemView.findViewById(R.id.mark_re);
            batch =itemView.findViewById(R.id.batch_re);


        }
    }
}
