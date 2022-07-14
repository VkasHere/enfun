package com.example.summitclasses.Fragments.helperadapter;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.example.summitclasses.Fragments.explorefrg.rv1.rv1fst;
import com.example.summitclasses.Fragments.explorefrg.rv2.paragraph.debate;
import com.example.summitclasses.Fragments.explorefrg.rv2.paragraph.para;
import com.example.summitclasses.Fragments.explorefrg.rv2.paragraph.paragraph;
import com.example.summitclasses.Fragments.explorefrg.rv2.paragraph.speech;
import com.example.summitclasses.Fragments.explorefrg.rv2.paragraph.story;
import com.example.summitclasses.Fragments.helperclass.helperclass1;
import com.example.summitclasses.R;
import com.example.summitclasses.dashbord;

import java.util.ArrayList;

public class heperadapter2  extends RecyclerView.Adapter<com.example.summitclasses.Fragments.helperadapter.heperadapter2.helperviewholder> {

    ArrayList<helperclass1> featuredlocations;

    public heperadapter2(ArrayList<helperclass1> featuredlocations) {
        this.featuredlocations = featuredlocations;
    }

    @NonNull
    @Override
    public helperviewholder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.rv1,parent,false);
        heperadapter2.helperviewholder featuredviewholder = new heperadapter2.helperviewholder(view);
        return featuredviewholder;
    }

    @Override
    public void onBindViewHolder(@NonNull helperviewholder holder, final int position) {
        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Context context = view.getContext();
                helperclass1 helperclass1 = featuredlocations.get(position);
                Intent intent;
                switch (position){
                    case 0:
                        intent =  new Intent(context, paragraph.class);
                        intent.putExtra("chap",helperclass1.getTitle());
                        intent.putExtra("url",helperclass1.getImgyrl());
                        context.startActivity(intent);
                        break;
                    case  1:
                        intent =  new Intent(context, speech.class);
                        intent.putExtra("chap",helperclass1.getTitle());
                        intent.putExtra("url",helperclass1.getImgyrl());
                        context.startActivity(intent);
                        break;
                    case 2:
                        intent =  new Intent(context, debate.class);
                        intent.putExtra("chap",helperclass1.getTitle());
                        intent.putExtra("url",helperclass1.getImgyrl());
                        context.startActivity(intent);
                        break;
                    case 3:
                        intent =  new Intent(context, story.class);
                        intent.putExtra("chap",helperclass1.getTitle());
                        intent.putExtra("url",helperclass1.getImgyrl());
                        context.startActivity(intent);
                        break;



                }

        }
        });
        helperclass1 helperclass1 = featuredlocations.get(position);
        holder.title.setText(helperclass1.getTitle());
        Glide.with(holder.icon.getContext()).load(helperclass1.getImgyrl()).into(holder.icon);
    }
    @Override
    public int getItemCount() {
        return featuredlocations.size();
    }

    public static class helperviewholder extends RecyclerView.ViewHolder {
        TextView title;
        ImageView icon;

        public helperviewholder(@NonNull View itemView) {
            super(itemView);
            title = itemView.findViewById(R.id.txt);
            icon = itemView.findViewById(R.id.icn);

        }}}

