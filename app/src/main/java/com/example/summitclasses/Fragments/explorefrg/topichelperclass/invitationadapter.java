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

public class invitationadapter extends RecyclerView.Adapter<invitationadapter.viewholder> {
    ArrayList<tpchelperclass> featuredlocations;
    public invitationadapter(ArrayList<tpchelperclass> featuredlocations) {
        this.featuredlocations = featuredlocations;
    }
    @NonNull
    @Override
    public viewholder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.topics,parent,false);
        invitationadapter.viewholder featuredviewholder = new invitationadapter.viewholder(view);
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
                String fst="https://firebasestorage.googleapis.com/v0/b/summitclasses12.appspot.com/o/informalinvitation%2Facceptdinner.jpg?alt=media&token=b7bc344e-941e-4fdf-8986-5b4c22cfefc6";
                String sec="https://firebasestorage.googleapis.com/v0/b/summitclasses12.appspot.com/o/informalinvitation%2Facceptekadashi.jpg?alt=media&token=19a2c8c0-f8e9-426f-a32b-3a927ba591f9";
                String trd="https://firebasestorage.googleapis.com/v0/b/summitclasses12.appspot.com/o/informalinvitation%2Fbdaydecline.jpg?alt=media&token=acb2d153-f8f3-4430-aa58-6fe36fd6e71d";
                String frth="https://firebasestorage.googleapis.com/v0/b/summitclasses12.appspot.com/o/informalinvitation%2Fdeclineannual.jpg?alt=media&token=31acdcc3-c92a-465f-838b-da65b7f03aa3";
                String fivth="https://firebasestorage.googleapis.com/v0/b/summitclasses12.appspot.com/o/informalinvitation%2Fdeclinebdayparty.jpg?alt=media&token=0701ac9b-101c-4ed4-a6b6-20a895477668";
                String sixth="https://firebasestorage.googleapis.com/v0/b/summitclasses12.appspot.com/o/informalinvitation%2Fdeclinedinner.jpg?alt=media&token=3fbe3e68-ce18-4538-ac85-a0688197f972";
                String sev="https://firebasestorage.googleapis.com/v0/b/summitclasses12.appspot.com/o/informalinvitation%2Fdeclinediwali.jpg?alt=media&token=c7e75214-22ca-43b7-8b5a-dec16399a583";
                String egt="https://firebasestorage.googleapis.com/v0/b/summitclasses12.appspot.com/o/informalinvitation%2Fdeclineinnaugration.jpg?alt=media&token=f2e9e2c1-3ca4-40f1-bd6a-b9620ffd44f7";
                String nin="https://firebasestorage.googleapis.com/v0/b/summitclasses12.appspot.com/o/informalinvitation%2Fdinnerparty.jpg?alt=media&token=653a92b7-c34f-43cc-aa50-846c008d869a";
                String ten="https://firebasestorage.googleapis.com/v0/b/summitclasses12.appspot.com/o/informalinvitation%2Fgettogether.jpg?alt=media&token=f8177748-13c4-421e-8cf4-1726fd2ecb19";
                String ele="https://firebasestorage.googleapis.com/v0/b/summitclasses12.appspot.com/o/informalinvitation%2Finnuagrate.jpg?alt=media&token=3a2e598d-e572-4a23-bbda-32ceb9e93d91";
                String twe="https://firebasestorage.googleapis.com/v0/b/summitclasses12.appspot.com/o/informalinvitation%2Fsisengagement.jpg?alt=media&token=e0bbb5af-a737-4566-84e2-7cdc34693f17";
                String thr="https://firebasestorage.googleapis.com/v0/b/summitclasses12.appspot.com/o/informalinvitation%2Fsistermarraige.jpg?alt=media&token=ac5e8361-d3d9-4017-8bba-4602e5428e65";
                String forty="https://firebasestorage.googleapis.com/v0/b/summitclasses12.appspot.com/o/informalinvitation%2Fsummer.jpg?alt=media&token=fdcd8b9d-5852-488d-a6ca-8a12431a25d8";
                String fif="https://firebasestorage.googleapis.com/v0/b/summitclasses12.appspot.com/o/informalinvitation%2Funabledinner.jpg?alt=media&token=74cc2a19-4d58-47d4-a396-f3fdc4909886";
                String sixty="https://firebasestorage.googleapis.com/v0/b/summitclasses12.appspot.com/o/informalinvitation%2Funableekadhashi.jpg?alt=media&token=425e6e24-a149-40bd-9004-23b946edee43";
                String seventy="https://firebasestorage.googleapis.com/v0/b/summitclasses12.appspot.com/o/informalinvitation%2Funablegettogather.jpg?alt=media&token=cdf2a4ba-4cce-4419-b8f0-9ca55659c72a";
                String eighty="https://firebasestorage.googleapis.com/v0/b/summitclasses12.appspot.com/o/informalinvitation%2Fweddingceremoney.jpg?alt=media&token=fa7f61d2-a57f-4d76-9f3e-a26dad6d6fb7";
                switch (position)   {
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
                    case 13:
                        intent = new Intent(context, para.class);
                        intent.putExtra("ttl", helperclass1.getTopicnm());
                        intent.putExtra("img", forty);
                        context.startActivity(intent);
                        break;
                    case 14:
                        intent = new Intent(context, para.class);
                        intent.putExtra("ttl", helperclass1.getTopicnm());
                        intent.putExtra("img", fif);
                        context.startActivity(intent);
                        break;
                    case 15:
                        intent = new Intent(context, para.class);
                        intent.putExtra("ttl", helperclass1.getTopicnm());
                        intent.putExtra("img", sixty);
                        context.startActivity(intent);
                        break;
                    case 16:
                        intent = new Intent(context, para.class);
                        intent.putExtra("ttl", helperclass1.getTopicnm());
                        intent.putExtra("img", seventy);
                        context.startActivity(intent);
                        break;
                    case 17:
                        intent = new Intent(context, para.class);
                        intent.putExtra("ttl", helperclass1.getTopicnm());
                        intent.putExtra("img", eighty);
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
