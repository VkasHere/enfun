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
import com.example.summitclasses.Fragments.explorefrg.rv1.rv1full.test11;
import com.example.summitclasses.Fragments.explorefrg.rv2.paragraph.para;
import com.example.summitclasses.R;

import java.util.ArrayList;

public class storyadapter extends RecyclerView.Adapter<storyadapter.viewholder> {
    ArrayList<tpchelperclass> featuredlocations;
    public storyadapter(ArrayList<tpchelperclass> featuredlocations) {
        this.featuredlocations = featuredlocations;
    }
    @NonNull
    @Override
    public viewholder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.topics,parent,false);
        storyadapter.viewholder featuredviewholder = new storyadapter.viewholder(view);
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
                String fst="";
                String sec="";
                String trd="";
                String frth="";
                String fivth="";
                String sixth="";
                String sev="";
                String egt="";
                String nin="";
                String ten="";
                String ele="";
                String twe="";
                String thr="";
                switch (position) {
                    case 0:
                        intent = new Intent(context, para.class);
                        intent.putExtra("ttl", helperclass1.getTopicnm());
                        intent.putExtra("img", fst);
                        context.startActivity(intent);
                        break;
                    case 1:
                        intent = new Intent(context, para.class);
                        intent.putExtra("ttl", helperclass1.getTopicnm());
                        intent.putExtra("img", sec);
                        context.startActivity(intent);
                        break;
                    case 2:
                        intent = new Intent(context, para.class);
                        intent.putExtra("ttl", helperclass1.getTopicnm());
                        intent.putExtra("img", trd);
                        context.startActivity(intent);
                        break;
                    case 3:
                        intent = new Intent(context, para.class);
                        intent.putExtra("ttl", helperclass1.getTopicnm());
                        intent.putExtra("img", frth);
                        context.startActivity(intent);
                        break;
                    case 4:
                        intent = new Intent(context, para.class);
                        intent.putExtra("ttl", helperclass1.getTopicnm());
                        intent.putExtra("img", fivth);
                        context.startActivity(intent);
                        break;
                    case 5:
                        intent = new Intent(context, para.class);
                        intent.putExtra("ttl", helperclass1.getTopicnm());
                        intent.putExtra("img", sixth);
                        context.startActivity(intent);
                        break;
                    case 6:
                        intent = new Intent(context, para.class);
                        intent.putExtra("ttl", helperclass1.getTopicnm());
                        intent.putExtra("img", sev);
                        context.startActivity(intent);
                        break;
                    case 7:
                        intent = new Intent(context, para.class);
                        intent.putExtra("ttl", helperclass1.getTopicnm());
                        intent.putExtra("img", egt);
                        context.startActivity(intent);
                        break;
                    case 8:
                        intent = new Intent(context, para.class);
                        intent.putExtra("ttl", helperclass1.getTopicnm());
                        intent.putExtra("img", nin);
                        context.startActivity(intent);
                        break;
                    case 9:
                        intent = new Intent(context, para.class);
                        intent.putExtra("ttl", helperclass1.getTopicnm());
                        intent.putExtra("img", ten);
                        context.startActivity(intent);
                        break;
                    case 10:
                        intent = new Intent(context, para.class);
                        intent.putExtra("ttl", helperclass1.getTopicnm());
                        intent.putExtra("img", ele);
                        context.startActivity(intent);
                        break;
                    case 11:
                        intent = new Intent(context, para.class);
                        intent.putExtra("ttl", helperclass1.getTopicnm());
                        intent.putExtra("img", twe);
                        context.startActivity(intent);
                        break;
                    case 12:
                        intent = new Intent(context, para.class);
                        intent.putExtra("ttl", helperclass1.getTopicnm());
                        intent.putExtra("img", thr);
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
