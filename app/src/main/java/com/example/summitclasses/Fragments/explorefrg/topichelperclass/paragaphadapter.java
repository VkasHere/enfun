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

public class paragaphadapter extends RecyclerView.Adapter<paragaphadapter.viewholder> {
    ArrayList<tpchelperclass> featuredlocations;
    public paragaphadapter(ArrayList<tpchelperclass> featuredlocations) {
        this.featuredlocations = featuredlocations;
    }
    @NonNull
    @Override
    public paragaphadapter.viewholder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.topics,parent,false);
        paragaphadapter.viewholder featuredviewholder = new paragaphadapter.viewholder(view);
        return featuredviewholder;
    }

    @Override
    public void onBindViewHolder(@NonNull paragaphadapter.viewholder holder, final int position) {
        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Context context=view.getContext();
                tpchelperclass helperclass1 = featuredlocations.get(position);
                Intent intent;
                 String fst="https://firebasestorage.googleapis.com/v0/b/summitclasses12.appspot.com/o/para%2Fbeti3.jpg?alt=media&token=5530569c-ede4-4b89-af56-0a58edf3ae53";
                 String sec="https://firebasestorage.googleapis.com/v0/b/summitclasses12.appspot.com/o/para%2Ffavteach.jpg?alt=media&token=fd8d3795-9365-43b7-8ae3-cc8e11d739fc";
                 String trd="https://firebasestorage.googleapis.com/v0/b/summitclasses12.appspot.com/o/para%2Fprize%20.jpg?alt=media&token=792c423c-c431-49e2-b344-b753104ca2b7";
                 String frth="https://firebasestorage.googleapis.com/v0/b/summitclasses12.appspot.com/o/para%2Flibrary.jpg?alt=media&token=5a143950-5d7f-42bf-a7a3-f05ac543c4f9";
                 String fivth="https://firebasestorage.googleapis.com/v0/b/summitclasses12.appspot.com/o/para%2Ffestival.jpg?alt=media&token=3f1d1201-7b00-4c44-b01a-90c4659c5f3e";
                String sixth="https://firebasestorage.googleapis.com/v0/b/summitclasses12.appspot.com/o/para%2Fquiz.jpg?alt=media&token=5ef06eee-2312-4c8b-8455-125fd9dacab3";
                String sev="https://firebasestorage.googleapis.com/v0/b/summitclasses12.appspot.com/o/para%2Fprize.jpg?alt=media&token=cfb96b81-6669-4a18-aeb3-c3b75aee0bfb";
                String egt="https://firebasestorage.googleapis.com/v0/b/summitclasses12.appspot.com/o/para%2Fvisithis.jpg?alt=media&token=99801373-9c97-4e78-8b59-b0ab925b02fc";
                String nin="https://firebasestorage.googleapis.com/v0/b/summitclasses12.appspot.com/o/para%2Fvalueofgames.jpg?alt=media&token=7066fae0-1a3b-44ca-96b6-e1384727c9aa";
                String ten="https://firebasestorage.googleapis.com/v0/b/summitclasses12.appspot.com/o/para%2Fvod.jpg?alt=media&token=d504dbf8-1c28-48ad-be8e-30feee103ed9";
                String ele="https://firebasestorage.googleapis.com/v0/b/summitclasses12.appspot.com/o/para%2Flifeincity.jpg?alt=media&token=8bfadfa6-fc97-41cb-8699-7ea7d1501079";
                String twe="https://firebasestorage.googleapis.com/v0/b/summitclasses12.appspot.com/o/para%2Fimptoftrees.jpg?alt=media&token=3fd52540-0da9-4715-a962-4044e30dddb2";
                String thr="https://firebasestorage.googleapis.com/v0/b/summitclasses12.appspot.com/o/para%2Fcashless.jpg?alt=media&token=8b311a7c-cf2e-4c92-a056-ff9d21d201bd";
                String forth="https://firebasestorage.googleapis.com/v0/b/summitclasses12.appspot.com/o/para%2Fmorn.jpg?alt=media&token=ab9690d4-e6be-466d-b180-a82b7e911ae6";
                String fit="https://firebasestorage.googleapis.com/v0/b/summitclasses12.appspot.com/o/para%2Fimpofedu.jpg?alt=media&token=9338fdcc-790a-4d3e-acfe-93043ae97fe7";
                String sixti="https://firebasestorage.googleapis.com/v0/b/summitclasses12.appspot.com/o/para%2Fmyparent.jpg?alt=media&token=d4cfc83e-846d-4124-8bbd-97d2d45ff454";
                switch (position){
                    case 0:
                        intent =  new Intent(context, para.class);
                        intent.putExtra("ttl",helperclass1.getTopicnm());
                        intent.putExtra("img",fst);
                        context.startActivity(intent);
                        break;
                    case 1:
                        intent =  new Intent(context, para.class);
                        intent.putExtra("ttl",helperclass1.getTopicnm());
                        intent.putExtra("img",sec);
                        context.startActivity(intent);
                        break;
                    case 2:
                        intent =  new Intent(context, para.class);
                        intent.putExtra("ttl",helperclass1.getTopicnm());
                        intent.putExtra("img",trd);
                        context.startActivity(intent);
                        break;
                    case 3:
                        intent =  new Intent(context, para.class);
                        intent.putExtra("ttl",helperclass1.getTopicnm());
                        intent.putExtra("img",frth);
                        context.startActivity(intent);
                        break;
                    case 4:
                        intent =  new Intent(context, para.class);
                        intent.putExtra("ttl",helperclass1.getTopicnm());
                        intent.putExtra("img",fivth);
                        context.startActivity(intent);
                        break;
                    case 5:
                        intent =  new Intent(context, para.class);
                        intent.putExtra("ttl",helperclass1.getTopicnm());
                        intent.putExtra("img",sixth);
                        context.startActivity(intent);
                        break;
                    case 6:
                        intent =  new Intent(context, para.class);
                        intent.putExtra("ttl",helperclass1.getTopicnm());
                        intent.putExtra("img",sev);
                        context.startActivity(intent);
                        break;
                    case 7:
                        intent =  new Intent(context, para.class);
                        intent.putExtra("ttl",helperclass1.getTopicnm());
                        intent.putExtra("img",egt);
                        context.startActivity(intent);
                        break;
                    case 8:
                        intent =  new Intent(context, para.class);
                        intent.putExtra("ttl",helperclass1.getTopicnm());
                        intent.putExtra("img",nin);
                        context.startActivity(intent);
                        break;
                    case 9:
                        intent =  new Intent(context, para.class);
                        intent.putExtra("ttl",helperclass1.getTopicnm());
                        intent.putExtra("img",ten);
                        context.startActivity(intent);
                        break;
                        case 10:
                        intent =  new Intent(context, para.class);
                        intent.putExtra("ttl",helperclass1.getTopicnm());
                        intent.putExtra("img",ele);
                        context.startActivity(intent);
                        break;
                        case 11:
                        intent =  new Intent(context, para.class);
                        intent.putExtra("ttl",helperclass1.getTopicnm());
                        intent.putExtra("img",twe);
                        context.startActivity(intent);
                        break;
                        case 12:
                        intent =  new Intent(context, para.class);
                        intent.putExtra("ttl",helperclass1.getTopicnm());
                        intent.putExtra("img",thr);
                        context.startActivity(intent);
                        break;
                        case 13:
                        intent =  new Intent(context, para.class);
                        intent.putExtra("ttl",helperclass1.getTopicnm());
                        intent.putExtra("img",forth);
                        context.startActivity(intent);
                        break;
                        case 14:
                        intent =  new Intent(context, para.class);
                        intent.putExtra("ttl",helperclass1.getTopicnm());
                        intent.putExtra("img",fit);
                        context.startActivity(intent);
                        break;
                        case 15:
                        intent =  new Intent(context, para.class);
                        intent.putExtra("ttl",helperclass1.getTopicnm());
                        intent.putExtra("img",sixti);
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
