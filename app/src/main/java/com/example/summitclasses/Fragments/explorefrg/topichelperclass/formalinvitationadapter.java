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

import com.example.summitclasses.Fragments.explorefrg.rv2.paragraph.para;
import com.example.summitclasses.R;

import java.util.ArrayList;

public class formalinvitationadapter extends RecyclerView.Adapter<formalinvitationadapter.viewholder> {
    ArrayList<tpchelperclass> featuredlocations;
    public formalinvitationadapter(ArrayList<tpchelperclass> featuredlocations) {
        this.featuredlocations = featuredlocations;
    }
    @NonNull
    @Override
    public viewholder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.topics,parent,false);
        formalinvitationadapter.viewholder featuredviewholder = new formalinvitationadapter.viewholder(view);
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
                String fst="https://firebasestorage.googleapis.com/v0/b/summitclasses12.appspot.com/o/formalinvitation%2Faccepttday.jpg?alt=media&token=1703c070-0d49-4d4c-bdcd-4bcba456e955";
                String sec="https://firebasestorage.googleapis.com/v0/b/summitclasses12.appspot.com/o/formalinvitation%2Fannual.jpg?alt=media&token=77994c2c-3753-4f5c-afa0-e91da8d4efc8";
                String trd="https://firebasestorage.googleapis.com/v0/b/summitclasses12.appspot.com/o/formalinvitation%2Fbdayparty.jpg?alt=media&token=b1d6e736-a767-493e-9801-89196e9c1a55";
                String frth="https://firebasestorage.googleapis.com/v0/b/summitclasses12.appspot.com/o/formalinvitation%2Fcareerday.jpg?alt=media&token=f625da80-542c-49ad-a80d-0c333f06adc0";
                String fivth="https://firebasestorage.googleapis.com/v0/b/summitclasses12.appspot.com/o/formalinvitation%2Fcheifguest.jpg?alt=media&token=b18fafc4-39b2-4659-8e24-cd3875b8af2a";
                String sixth="https://firebasestorage.googleapis.com/v0/b/summitclasses12.appspot.com/o/formalinvitation%2Fcheifguest2.jpg?alt=media&token=8f7e884b-0bbd-4920-9a2b-44981d001e11";
                String sev="https://firebasestorage.googleapis.com/v0/b/summitclasses12.appspot.com/o/formalinvitation%2Fdeclinedinner.jpg?alt=media&token=4dca91e9-3a87-43c0-a53e-dcd3f85d6380";
                String egt="https://firebasestorage.googleapis.com/v0/b/summitclasses12.appspot.com/o/formalinvitation%2Fdeclinefarewell.jpg?alt=media&token=304cfc3c-5d33-4add-88d5-04cc0c35f13c";
                String nin="https://firebasestorage.googleapis.com/v0/b/summitclasses12.appspot.com/o/formalinvitation%2Fdeclinegrehpravesh'.jpg?alt=media&token=673f8466-5d9f-437a-96e2-d850e00d70e9";
                String ten="https://firebasestorage.googleapis.com/v0/b/summitclasses12.appspot.com/o/formalinvitation%2Fdinner.jpg?alt=media&token=d65ead4e-2ed5-423d-867e-c6e8efdeacc6";
                String ele="https://firebasestorage.googleapis.com/v0/b/summitclasses12.appspot.com/o/formalinvitation%2Fdinnerparty.jpg?alt=media&token=fe154c82-5c8c-4dfd-8a4e-6194aaa5ed07";
                String twe="https://firebasestorage.googleapis.com/v0/b/summitclasses12.appspot.com/o/formalinvitation%2Fgrahpravesh.jpg?alt=media&token=a561da4f-a71c-4ccc-9a40-e771b2923d7c";
                String thr="https://firebasestorage.googleapis.com/v0/b/summitclasses12.appspot.com/o/formalinvitation%2Finuagrate.jpg?alt=media&token=31af66f4-08e4-4e2b-9796-cfedbb067021";
                String forty="https://firebasestorage.googleapis.com/v0/b/summitclasses12.appspot.com/o/formalinvitation%2Fnotbday.jpg?alt=media&token=94f50328-664c-4f06-a474-78ca09f91217";
                String fif="https://firebasestorage.googleapis.com/v0/b/summitclasses12.appspot.com/o/formalinvitation%2Fretired.jpg?alt=media&token=8dad3e70-c212-4d41-8bca-c19b60ac770d";
                String sixty="https://firebasestorage.googleapis.com/v0/b/summitclasses12.appspot.com/o/formalinvitation%2Fteacherday.jpg?alt=media&token=131a2936-04f5-4a86-8551-3ef361b72952";
                String seventy="https://firebasestorage.googleapis.com/v0/b/summitclasses12.appspot.com/o/formalinvitation%2Funablefordinner.jpg?alt=media&token=4c90916a-8115-4ce9-90f2-c12dce84e10c";
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

                    case 13:
                        intent = new Intent(context, para.class);
                        intent.putExtra("ttl", helperclass1.getTopicnm());
                        intent.putExtra("img",forty);
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
