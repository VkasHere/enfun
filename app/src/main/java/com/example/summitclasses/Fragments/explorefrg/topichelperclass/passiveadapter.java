package com.example.summitclasses.Fragments.explorefrg.topichelperclass;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.summitclasses.Fragments.explorefrg.rv1.narrationfull.DtoIRules;
import com.example.summitclasses.Fragments.explorefrg.rv1.narrationfull.Exclamatory;
import com.example.summitclasses.Fragments.explorefrg.rv1.narrationfull.Imperative;
import com.example.summitclasses.Fragments.explorefrg.rv1.narrationfull.intro;
import com.example.summitclasses.Fragments.explorefrg.rv1.narrationfull.optative;
import com.example.summitclasses.Fragments.explorefrg.rv1.passivefull.Exercise2;
import com.example.summitclasses.Fragments.explorefrg.rv1.passivefull.Exercise3;
import com.example.summitclasses.Fragments.explorefrg.rv1.passivefull.extras;
import com.example.summitclasses.Fragments.explorefrg.rv1.passivefull.futureten;
import com.example.summitclasses.Fragments.explorefrg.rv1.passivefull.pastten;
import com.example.summitclasses.Fragments.explorefrg.rv1.passivefull.presentten;
import com.example.summitclasses.Fragments.explorefrg.rv1.passivefull.test11;
import com.example.summitclasses.R;

import java.util.ArrayList;

public class passiveadapter extends RecyclerView.Adapter<passiveadapter.viewholder> {
    ArrayList<tpchelperclass> featuredlocations;
    public passiveadapter(ArrayList<tpchelperclass> featuredlocations) {
        this.featuredlocations = featuredlocations;
    }
    @NonNull
    @Override
    public viewholder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.topics,parent,false);
        passiveadapter.viewholder featuredviewholder = new passiveadapter.viewholder(view);
        return featuredviewholder;
    }

    @Override
    public void onBindViewHolder(@NonNull viewholder holder, final int position) {
        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Context context=view.getContext();
                tpchelperclass helperclass1 = featuredlocations.get(position);
                Intent intent;
                switch (position){
                    case 0:
                        intent =  new Intent(context, intro.class);
                        intent.putExtra("ttl",helperclass1.getTopicnm());
                        context.startActivity(intent);
                        break;
                    case 1:
                        intent =  new Intent(context, presentten.class);
                        intent.putExtra("ttl",helperclass1.getTopicnm());
                        context.startActivity(intent);
                        break;
                    case 2:
                        intent =  new Intent(context, pastten.class);
                        intent.putExtra("ttl",helperclass1.getTopicnm());
                        context.startActivity(intent);
                        break;
                    case 3:
                        intent =  new Intent(context, futureten.class);
                        intent.putExtra("ttl",helperclass1.getTopicnm());
                        context.startActivity(intent);
                        break;
                    case 4:
                        intent =  new Intent(context, extras.class);
                        intent.putExtra("ttl",helperclass1.getTopicnm());
                        context.startActivity(intent);
                        break;
                    case 5:
                        intent =  new Intent(context, test11.class);
                        intent.putExtra("ttl",helperclass1.getTopicnm());
                        context.startActivity(intent);
                        break;
                    case 6:
                        intent =  new Intent(context, Exercise2.class);
                        intent.putExtra("ttl",helperclass1.getTopicnm());
                        context.startActivity(intent);
                        break;
                    case 7:
                        intent =  new Intent(context, Exercise3.class);
                        intent.putExtra("ttl",helperclass1.getTopicnm());
                        context.startActivity(intent);
                        break;

                }
            }
        });

        tpchelperclass helperclass1 = featuredlocations.get(position);
        holder.title.setText(helperclass1.getTopicnm());
        holder.num.setText(helperclass1.getNum());
        holder.ply.setImageResource(helperclass1.getPlybtn());
    }

    @Override
    public int getItemCount() {
        return featuredlocations.size();
    }

    public class viewholder extends RecyclerView.ViewHolder {
        TextView title,num;
        ImageView ply;
        public viewholder(@NonNull View itemView) {
            super(itemView);
            title=itemView.findViewById(R.id.topic);
            ply=itemView.findViewById(R.id.ply);
            num=itemView.findViewById(R.id.num);

        }
    }
}
