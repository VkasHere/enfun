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

public class noticeadapter extends RecyclerView.Adapter<noticeadapter.viewholder> {
    ArrayList<tpchelperclass> featuredlocations;
    public noticeadapter(ArrayList<tpchelperclass> featuredlocations) {
        this.featuredlocations = featuredlocations;
    }
    @NonNull
    @Override
    public viewholder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.topics,parent,false);
        noticeadapter.viewholder featuredviewholder = new noticeadapter.viewholder(view);
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
                String fst="https://firebasestorage.googleapis.com/v0/b/summitclasses12.appspot.com/o/Noticewri%2Faculprog.jpg?alt=media&token=71c1d9fb-9e2d-4985-ab70-db43d1bde38a";
                String sec="https://firebasestorage.googleapis.com/v0/b/summitclasses12.appspot.com/o/Noticewri%2Fannual.jpg?alt=media&token=ab5b6a6d-1044-4c0b-86fe-c6b42ccc48ba";
                String trd="https://firebasestorage.googleapis.com/v0/b/summitclasses12.appspot.com/o/Noticewri%2Fartmag.jpg?alt=media&token=7c321974-5adf-4943-8017-7c8bc5edf1df";
                String frth="https://firebasestorage.googleapis.com/v0/b/summitclasses12.appspot.com/o/Noticewri%2Fbloooddon.jpg?alt=media&token=2ba440f9-7ba0-4b2a-9574-18dadbacb1b4";
                String fivth="https://firebasestorage.googleapis.com/v0/b/summitclasses12.appspot.com/o/Noticewri%2Fcelebrate.jpg?alt=media&token=e77c6cd3-d10c-4775-bd33-ab7dc3d2d018";
                String sixth="https://firebasestorage.googleapis.com/v0/b/summitclasses12.appspot.com/o/Noticewri%2Fchangeinschool.jpg?alt=media&token=fb5e9b99-a97f-4a95-85fc-ad288aeb5753";
                String sev="https://firebasestorage.googleapis.com/v0/b/summitclasses12.appspot.com/o/Noticewri%2Fchild.jpg?alt=media&token=9b7804fe-1025-4983-83aa-08bbe3836719";
                String egt="https://firebasestorage.googleapis.com/v0/b/summitclasses12.appspot.com/o/Noticewri%2Fdebate.jpg?alt=media&token=70d1d75a-55b1-4654-b978-ac0f111a6e81";
                String nin="https://firebasestorage.googleapis.com/v0/b/summitclasses12.appspot.com/o/Noticewri%2Fdistrict.jpg?alt=media&token=d9d998d1-3a59-40e3-851c-48f6a97373d6";
                String ten="https://firebasestorage.googleapis.com/v0/b/summitclasses12.appspot.com/o/Noticewri%2Fdrama.jpg?alt=media&token=053c18dd-1d95-4683-a932-96430f2fb085";
                String ele="https://firebasestorage.googleapis.com/v0/b/summitclasses12.appspot.com/o/Noticewri%2Feducationtour.jpg?alt=media&token=860141a0-07e9-47a9-9a39-54939c33f231";
                String twe="https://firebasestorage.googleapis.com/v0/b/summitclasses12.appspot.com/o/Noticewri%2Fexcertiongoa.jpg?alt=media&token=cf4b6766-d540-419f-bc4d-14860cbb11f7";
                String thr="https://firebasestorage.googleapis.com/v0/b/summitclasses12.appspot.com/o/Noticewri%2Ffinalcricket.jpg?alt=media&token=1a12cdfa-f747-442c-960f-cc7e778be542";
                String forty="https://firebasestorage.googleapis.com/v0/b/summitclasses12.appspot.com/o/Noticewri%2Fgandhi.jpg?alt=media&token=a468945f-a31c-4b67-9191-c9a5fbc8b3c9";
                String fifty="https://firebasestorage.googleapis.com/v0/b/summitclasses12.appspot.com/o/Noticewri%2Fholiholi.jpg?alt=media&token=a702f0b7-50af-4b34-bb99-33143a886257";
                String sixty="https://firebasestorage.googleapis.com/v0/b/summitclasses12.appspot.com/o/Noticewri%2Fimpofyogas.jpg?alt=media&token=32546536-808b-4e66-8c40-854d591fea45";
                String seventy="https://firebasestorage.googleapis.com/v0/b/summitclasses12.appspot.com/o/Noticewri%2Fimportanceofyoga.jpg?alt=media&token=22ba2d94-de3d-4e0c-8b97-d48e4e967996";
                String eighty="https://firebasestorage.googleapis.com/v0/b/summitclasses12.appspot.com/o/Noticewri%2Finter.jpg?alt=media&token=f26c9401-54c0-4ad9-8b44-6cd76018d5aa";
                String ninty="https://firebasestorage.googleapis.com/v0/b/summitclasses12.appspot.com/o/Noticewri%2Flost.jpg?alt=media&token=8488f6c0-0047-4093-bcc8-5330131d845e";
                String twenty="https://firebasestorage.googleapis.com/v0/b/summitclasses12.appspot.com/o/Noticewri%2Fmedicalcheck.jpg?alt=media&token=d44ba038-d3b9-4eba-b8fb-a9f8963d89c8";
                String tweone="https://firebasestorage.googleapis.com/v0/b/summitclasses12.appspot.com/o/Noticewri%2Foneact.jpg?alt=media&token=2ce9e1bc-7535-4dd1-85df-93726646d730";
                String twetwo="https://firebasestorage.googleapis.com/v0/b/summitclasses12.appspot.com/o/Noticewri%2Fquizcom.jpg?alt=media&token=9eda15fa-842e-4e7e-9fa5-c021f1d37e0d";
                String twethree="https://firebasestorage.googleapis.com/v0/b/summitclasses12.appspot.com/o/Noticewri%2Fstudentunio.jpg?alt=media&token=cddb40d2-4983-4414-a289-7256113de6b5";
                String twefor="https://firebasestorage.googleapis.com/v0/b/summitclasses12.appspot.com/o/Noticewri%2Fswach.jpg?alt=media&token=c8bff69f-f29c-48ae-8c12-57e9836eef75";
                String twefive="https://firebasestorage.googleapis.com/v0/b/summitclasses12.appspot.com/o/Noticewri%2Ftour.jpg?alt=media&token=ce9d229d-387b-476e-8707-be64f132a56e";
                String twesix="https://firebasestorage.googleapis.com/v0/b/summitclasses12.appspot.com/o/Noticewri%2Ftourtochit.jpg?alt=media&token=6924f53f-f873-4cdc-9a44-a0f641b362e0";
                String tweseven="https://firebasestorage.googleapis.com/v0/b/summitclasses12.appspot.com/o/Noticewri%2Fyogaday.jpg?alt=media&token=a6284ebd-6d9b-47ef-bb35-28212d2c78e0";
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
                        intent.putExtra("img", fifty);
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
                    case 18:
                        intent = new Intent(context, para.class);
                        intent.putExtra("ttl", helperclass1.getTopicnm());
                        intent.putExtra("img", ninty);
                        context.startActivity(intent);
                        break;
                    case 19:
                        intent = new Intent(context, para.class);
                        intent.putExtra("ttl", helperclass1.getTopicnm());
                        intent.putExtra("img", twenty);
                        context.startActivity(intent);
                        break;
                    case 20:
                        intent = new Intent(context, para.class);
                        intent.putExtra("ttl", helperclass1.getTopicnm());
                        intent.putExtra("img", tweone);
                        context.startActivity(intent);
                        break;
                    case 21:
                        intent = new Intent(context, para.class);
                        intent.putExtra("ttl", helperclass1.getTopicnm());
                        intent.putExtra("img", twetwo);
                        context.startActivity(intent);
                        break;
                    case 22:
                        intent = new Intent(context, para.class);
                        intent.putExtra("ttl", helperclass1.getTopicnm());
                        intent.putExtra("img", twethree);
                        context.startActivity(intent);
                        break;
                    case 23:
                        intent = new Intent(context, para.class);
                        intent.putExtra("ttl", helperclass1.getTopicnm());
                        intent.putExtra("img", twefor);
                        context.startActivity(intent);
                        break;

                    case 24:
                        intent = new Intent(context, para.class);
                        intent.putExtra("ttl", helperclass1.getTopicnm());
                        intent.putExtra("img", twefive);
                        context.startActivity(intent);
                        break;
                    case 25:
                        intent = new Intent(context, para.class);
                        intent.putExtra("ttl", helperclass1.getTopicnm());
                        intent.putExtra("img", twesix);
                        context.startActivity(intent);
                        break;
                    case 26:
                        intent = new Intent(context, para.class);
                        intent.putExtra("ttl", helperclass1.getTopicnm());
                        intent.putExtra("img", tweseven);
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
