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

public class speechadapter extends RecyclerView.Adapter<speechadapter.viewholder> {
    ArrayList<tpchelperclass> featuredlocations;
    public speechadapter(ArrayList<tpchelperclass> featuredlocations) {
        this.featuredlocations = featuredlocations;
    }
    @NonNull
    @Override
    public viewholder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.topics,parent,false);
        speechadapter.viewholder featuredviewholder = new speechadapter.viewholder(view);
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
                String fst="https://firebasestorage.googleapis.com/v0/b/summitclasses12.appspot.com/o/speech%2Fpets.jpg?alt=media&token=66c1cd7b-d17e-436c-8988-00e1b15681a6";
                String sec="https://firebasestorage.googleapis.com/v0/b/summitclasses12.appspot.com/o/speech%2Fpetsnot.jpg?alt=media&token=ad6f799c-affb-45b5-82e0-922d7274b964";
                String trd="https://firebasestorage.googleapis.com/v0/b/summitclasses12.appspot.com/o/speech%2Fsnakechar.jpg?alt=media&token=90557620-0638-4cd0-96e9-281c655998cb";
                String frth="https://firebasestorage.googleapis.com/v0/b/summitclasses12.appspot.com/o/speech%2Fplantsanim.jpg?alt=media&token=9f23699f-222c-412d-8f3b-31d75f44fb4e";
                String fivth="https://firebasestorage.googleapis.com/v0/b/summitclasses12.appspot.com/o/speech%2Fageofcom.jpg?alt=media&token=1511979d-1cc8-419f-a496-c4b16aaa6e5a";
                String sixth="https://firebasestorage.googleapis.com/v0/b/summitclasses12.appspot.com/o/speech%2Fthevill.jpg?alt=media&token=66a6eb2c-6a4d-4407-9cd1-4b4d384bb2c7";
                String sev="https://firebasestorage.googleapis.com/v0/b/summitclasses12.appspot.com/o/speech%2Fmyduty.jpg?alt=media&token=81d76f5e-aa66-4762-b2db-3f89a268e843";
                String egt="https://firebasestorage.googleapis.com/v0/b/summitclasses12.appspot.com/o/speech%2Fmobileboon.jpg?alt=media&token=38523be7-17c9-4da3-b6b1-a4823a77be90";
                String nin="https://firebasestorage.googleapis.com/v0/b/summitclasses12.appspot.com/o/speech%2Ftheimpnews.jpg?alt=media&token=90d7c732-1c8f-4f32-a834-edf370a4d4d0";
                String ten="https://firebasestorage.googleapis.com/v0/b/summitclasses12.appspot.com/o/speech%2Fimpoftress.jpg?alt=media&token=b11a1c65-bcdc-485b-864f-10b2f8c24b60";
                String ele="https://firebasestorage.googleapis.com/v0/b/summitclasses12.appspot.com/o/speech%2Fimpofgood.jpg?alt=media&token=1eedfea2-8b4f-4154-bd5f-0ee6f19d56eb";
                String twe="https://firebasestorage.googleapis.com/v0/b/summitclasses12.appspot.com/o/speech%2Fteacherdy.jpg?alt=media&token=1cf0556a-4ba5-4bfa-aa4d-76366181d623";
                String thr="https://firebasestorage.googleapis.com/v0/b/summitclasses12.appspot.com/o/speech%2Fjoyofply.jpg?alt=media&token=45a68181-b155-4e73-8b8d-0c4835a16394";
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
