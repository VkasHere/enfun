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
import com.example.summitclasses.Fragments.explorefrg.rv2.paragraph.debate;
import com.example.summitclasses.Fragments.explorefrg.rv2.paragraph.paragraph;
import com.example.summitclasses.Fragments.explorefrg.rv2.paragraph.speech;
import com.example.summitclasses.Fragments.explorefrg.rv2.paragraph.story;
import com.example.summitclasses.Fragments.explorefrg.rv3.Advertisement;
import com.example.summitclasses.Fragments.explorefrg.rv3.Invitation;
import com.example.summitclasses.Fragments.explorefrg.rv3.Notice;
import com.example.summitclasses.Fragments.explorefrg.rv3.Report;
import com.example.summitclasses.Fragments.explorefrg.rv3.formalInvitation;
import com.example.summitclasses.Fragments.helperclass.helperclass1;
import com.example.summitclasses.R;

import java.util.ArrayList;

public class heperadapter3 extends RecyclerView.Adapter<heperadapter3.helperviewholder> {

    ArrayList<helperclass1> featuredlocations;

    public heperadapter3(ArrayList<helperclass1> featuredlocations) {
        this.featuredlocations = featuredlocations;
    }

    @NonNull
    @Override
    public helperviewholder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.rv1,parent,false);
        heperadapter3.helperviewholder featuredviewholder = new heperadapter3.helperviewholder(view);
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
                        intent =  new Intent(context, Advertisement.class);
                        intent.putExtra("chap",helperclass1.getTitle());
                        intent.putExtra("url",helperclass1.getImgyrl());
                        context.startActivity(intent);
                        break;
                    case  1:
                        intent =  new Intent(context, Notice.class);
                        intent.putExtra("chap",helperclass1.getTitle());
                        intent.putExtra("url",helperclass1.getImgyrl());
                        context.startActivity(intent);
                        break;
                    case 2:
                        intent =  new Intent(context, Invitation.class);
                        intent.putExtra("chap",helperclass1.getTitle());
                        intent.putExtra("url",helperclass1.getImgyrl());
                        context.startActivity(intent);
                        break;
                    case 3:
                        intent =  new Intent(context, formalInvitation.class);
                        intent.putExtra("chap",helperclass1.getTitle());
                        intent.putExtra("url",helperclass1.getImgyrl());
                        context.startActivity(intent);
                        break;
                    case 4:
                        intent =  new Intent(context, Report.class);
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

