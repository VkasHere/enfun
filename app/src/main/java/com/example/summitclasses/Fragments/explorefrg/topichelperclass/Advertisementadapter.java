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

public class Advertisementadapter extends RecyclerView.Adapter<Advertisementadapter.viewholder> {
    ArrayList<tpchelperclass> featuredlocations;
    public Advertisementadapter(ArrayList<tpchelperclass> featuredlocations) {
        this.featuredlocations = featuredlocations;
    }
    @NonNull
    @Override
    public viewholder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.topics,parent,false);
        Advertisementadapter.viewholder featuredviewholder = new Advertisementadapter.viewholder(view);
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
                String fst="https://firebasestorage.googleapis.com/v0/b/summitclasses12.appspot.com/o/Advertisement%2Fwanted1.jpg?alt=media&token=af0e83ec-7619-48b3-b61e-86c3550232d8";
                String sec="https://firebasestorage.googleapis.com/v0/b/summitclasses12.appspot.com/o/Advertisement%2Fwantedbrid.jpg?alt=media&token=659dee9e-0dbf-4f82-8ea4-e35690d8d836";
                String trd="https://firebasestorage.googleapis.com/v0/b/summitclasses12.appspot.com/o/Advertisement%2FAlliance.jpg?alt=media&token=dbf68365-8a24-47f5-8777-86bccf6aad1a";
                String frth="https://firebasestorage.googleapis.com/v0/b/summitclasses12.appspot.com/o/Advertisement%2Fbridewanted.jpg?alt=media&token=ca73967f-9ba1-4b13-baef-efbee1d084ff";
                String fivth="https://firebasestorage.googleapis.com/v0/b/summitclasses12.appspot.com/o/Advertisement%2Fforsale1.jpg?alt=media&token=9becbad8-48f6-4e91-828f-163577935503";
                String sixth="https://firebasestorage.googleapis.com/v0/b/summitclasses12.appspot.com/o/Advertisement%2Fpurchase.jpg?alt=media&token=ebaa9ccc-61f3-4592-b6bf-1a9a73786f9e";
                String sev="https://firebasestorage.googleapis.com/v0/b/summitclasses12.appspot.com/o/Advertisement%2Fsistuationvacant.jpg?alt=media&token=e0b434fb-489a-4cb4-9934-3a81c61f9e66";
                String egt="https://firebasestorage.googleapis.com/v0/b/summitclasses12.appspot.com/o/Advertisement%2Fsistuationwanted.jpg?alt=media&token=d4d4f02d-e0cd-459e-a4ad-0551146a16b4";
                String nin="https://firebasestorage.googleapis.com/v0/b/summitclasses12.appspot.com/o/Advertisement%2Fsitutationfor.jpg?alt=media&token=0ebf0ef6-f57d-4b89-8e59-80d2e4c2dd08";
                String ten="https://firebasestorage.googleapis.com/v0/b/summitclasses12.appspot.com/o/Advertisement%2Ftolet.jpg?alt=media&token=c89a474a-713e-4433-a5d3-9ea257cceac6";
                String ele="https://firebasestorage.googleapis.com/v0/b/summitclasses12.appspot.com/o/Advertisement%2Fwanted.jpg?alt=media&token=3eb111de-cfc3-4411-8d3f-c02b9cede9ac";
                String twe="";
                String thr="";
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
