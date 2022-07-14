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

public class reportadpter extends RecyclerView.Adapter<reportadpter.viewholder> {
    ArrayList<tpchelperclass> featuredlocations;
    public reportadpter(ArrayList<tpchelperclass> featuredlocations) {
        this.featuredlocations = featuredlocations;
    }
    @NonNull
    @Override
    public viewholder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.topics,parent,false);
        reportadpter.viewholder featuredviewholder = new reportadpter.viewholder(view);
        return featuredviewholder;
    }

    @Override
    public void onBindViewHolder(@NonNull viewholder holder, final int position) {
        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Context context = view.getContext();
                tpchelperclass helperclass1 = featuredlocations.get(position);
                Intent intent;
                String fst = "https://firebasestorage.googleapis.com/v0/b/summitclasses12.appspot.com/o/report%2Fmornpra.jpg?alt=media&token=5e6dd1da-8d86-4002-a65c-3e9113bc308e";
                String sec = "https://firebasestorage.googleapis.com/v0/b/summitclasses12.appspot.com/o/report%2Fa%20boys.jpg?alt=media&token=beaabb41-286d-4986-af2e-e011a416e76f";
                String trd = "https://firebasestorage.googleapis.com/v0/b/summitclasses12.appspot.com/o/report%2Fpoorgames.jpg?alt=media&token=ee651fd1-6427-44c1-ba2d-93dc0d69ea75";
                String frth = "https://firebasestorage.googleapis.com/v0/b/summitclasses12.appspot.com/o/report%2Fpoorwater.jpg?alt=media&token=8237053f-48a7-44df-91c1-d4834335309f";
                String fivth = "https://firebasestorage.googleapis.com/v0/b/summitclasses12.appspot.com/o/report%2Findep.jpg?alt=media&token=1200453b-8ca9-4b90-beff-0a6ad17f9caa";
                String sixth = "https://firebasestorage.googleapis.com/v0/b/summitclasses12.appspot.com/o/report%2Fa%20house%20on%20fire.jpg?alt=media&token=77e92f6f-dc15-4122-bc26-7ec30256d66d";
                String sev = "https://firebasestorage.googleapis.com/v0/b/summitclasses12.appspot.com/o/report%2Ftheif.jpg?alt=media&token=af704b4e-4155-460a-af68-b2c45bec6b23";
                String egt = "https://firebasestorage.googleapis.com/v0/b/summitclasses12.appspot.com/o/report%2Fguestteam.jpg?alt=media&token=b3e3d268-3bbb-49d5-8399-d8da5d5faa0f";
                String nin = "https://firebasestorage.googleapis.com/v0/b/summitclasses12.appspot.com/o/report%2Fa%20jobless.jpg?alt=media&token=60c6ec0d-fd7b-4e8d-907c-1977222a5253";
                String ten = "https://firebasestorage.googleapis.com/v0/b/summitclasses12.appspot.com/o/report%2Frobbes.jpg?alt=media&token=1c4a1eb9-44ec-4be6-bcca-5ce43accaffa";
                String ele = "https://firebasestorage.googleapis.com/v0/b/summitclasses12.appspot.com/o/report%2Fflowers.jpg?alt=media&token=9e2992c8-50a0-4ac4-9fbe-4589a6440c6d";
                String twe = "https://firebasestorage.googleapis.com/v0/b/summitclasses12.appspot.com/o/report%2Fpolitical.jpg?alt=media&token=92f61dec-b957-4cc4-a829-6dcdc7e0051d";

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
