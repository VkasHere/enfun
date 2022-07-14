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

public class debateadapter extends RecyclerView.Adapter<debateadapter.viewholder> {
    ArrayList<tpchelperclass> featuredlocations;
    public debateadapter(ArrayList<tpchelperclass> featuredlocations) {
        this.featuredlocations = featuredlocations;
    }
    @NonNull
    @Override
    public viewholder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.topics,parent,false);
        debateadapter.viewholder featuredviewholder = new debateadapter.viewholder(view);
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
                String fst="https://firebasestorage.googleapis.com/v0/b/summitclasses12.appspot.com/o/Argument%2Farewehap.jpg?alt=media&token=f6ad07f0-d158-4b7d-8edf-dc7241b0b0ac";
                String sec="https://firebasestorage.googleapis.com/v0/b/summitclasses12.appspot.com/o/Argument%2Fengedu.jpg?alt=media&token=4a5ef16c-4f53-4fea-91ed-e5020832baff";
                String trd="https://firebasestorage.googleapis.com/v0/b/summitclasses12.appspot.com/o/Argument%2FTv.jpg?alt=media&token=9e843b64-acb3-4cf3-8ce3-46fbae8ce561";
                String frth="https://firebasestorage.googleapis.com/v0/b/summitclasses12.appspot.com/o/Argument%2Furban.jpg?alt=media&token=064e7daf-0bca-4c38-9fb5-a5d88ce6e578";
                String fivth="https://firebasestorage.googleapis.com/v0/b/summitclasses12.appspot.com/o/Argument%2Fdowery.jpg?alt=media&token=33d8b801-93c8-40ce-b5d5-b537dc52419b";
                String sixth="https://firebasestorage.googleapis.com/v0/b/summitclasses12.appspot.com/o/Argument%2Fmedia.jpg?alt=media&token=f5badd8d-175a-4d59-80fb-14436f84cd1c";
                String sev="https://firebasestorage.googleapis.com/v0/b/summitclasses12.appspot.com/o/Argument%2Fcomedu.jpg?alt=media&token=d979ebed-4904-422e-9939-73db2bbe8803";
                String egt="https://firebasestorage.googleapis.com/v0/b/summitclasses12.appspot.com/o/Argument%2Fhopealon.jpg?alt=media&token=9f09c6f6-522b-4825-a1f3-ade3a41f5cf0";
                String nin="https://firebasestorage.googleapis.com/v0/b/summitclasses12.appspot.com/o/Argument%2Fmaninclu.jpg?alt=media&token=9a7529f0-f4ec-4f8e-a9c0-3262900f3d8c";
                String ten="https://firebasestorage.googleapis.com/v0/b/summitclasses12.appspot.com/o/Argument%2Fbanlab.jpg?alt=media&token=5be69233-c33a-440e-a818-921660b698a2";
                String ele="https://firebasestorage.googleapis.com/v0/b/summitclasses12.appspot.com/o/Argument%2Fscienceisgod.jpg?alt=media&token=872ebfdb-85cc-4815-9f04-3ab7139e67ca";
                String twe="https://firebasestorage.googleapis.com/v0/b/summitclasses12.appspot.com/o/Argument%2Finter.jpg?alt=media&token=c8e524e2-af0e-44f4-afa5-d5034de8608b";
                String thr="https://firebasestorage.googleapis.com/v0/b/summitclasses12.appspot.com/o/Argument%2Fdensity.jpg?alt=media&token=a391d1ea-a220-433b-8a22-25d01197ac65";
                String fou="https://firebasestorage.googleapis.com/v0/b/summitclasses12.appspot.com/o/Argument%2Fwar.jpg?alt=media&token=680b3b4e-a64d-4d2b-907d-96cad3ced27d";
                String fif="https://firebasestorage.googleapis.com/v0/b/summitclasses12.appspot.com/o/Argument%2Ffreedom.jpg?alt=media&token=3059a04c-4d24-4f49-accb-0f219d81e929";
                String six="https://firebasestorage.googleapis.com/v0/b/summitclasses12.appspot.com/o/Argument%2Fmoney.jpg?alt=media&token=ca7a5234-b698-462a-af99-ebff50606972";
                String seven="https://firebasestorage.googleapis.com/v0/b/summitclasses12.appspot.com/o/Argument%2Fhealth.jpg?alt=media&token=8b6b2c54-a297-48ed-9521-665767b798f5";
                String eight="https://firebasestorage.googleapis.com/v0/b/summitclasses12.appspot.com/o/Argument%2Fmanpro.jpg?alt=media&token=935a03e5-9c24-4317-8463-b721ea9eea57";
                String nine="https://firebasestorage.googleapis.com/v0/b/summitclasses12.appspot.com/o/Argument%2Fasyou.jpg?alt=media&token=fad0a367-86bf-4921-bd9b-8cb6a790549f";
                String twen="https://firebasestorage.googleapis.com/v0/b/summitclasses12.appspot.com/o/Argument%2Fsalute.jpg?alt=media&token=113d24b9-b3a2-4442-9af0-d33f7d141f52";
                String tweone="https://firebasestorage.googleapis.com/v0/b/summitclasses12.appspot.com/o/Argument%2Foldage.jpg?alt=media&token=bdbaa44e-e31c-410d-a1bd-5d1232ca3849";
                String twetwo="https://firebasestorage.googleapis.com/v0/b/summitclasses12.appspot.com/o/Argument%2Fspare.jpg?alt=media&token=f5fcb3e6-fcfc-45b4-8338-b6f519b26eb9";
                String twethr="https://firebasestorage.googleapis.com/v0/b  /summitclasses12.appspot.com/o/Argument%2Fspare.jpg?alt=media&token=f5fcb3e6-fcfc-45b4-8338-b6f519b26eb9";
                String twefour="https://firebasestorage.googleapis.com/v0/b/summitclasses12.appspot.com/o/Argument%2Fweigh.jpg?alt=media&token=028304d5-a7ab-4ed7-9bc8-e94a3d112bf8";
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
                        intent.putExtra("img", thr);
                        context.startActivity(intent);
                        break;
                    case 14:
                        intent = new Intent(context, para.class);
                        intent.putExtra("ttl", helperclass1.getTopicnm());
                        intent.putExtra("img", fou);
                        context.startActivity(intent);
                        break;
                    case 15:
                        intent = new Intent(context, para.class);
                        intent.putExtra("ttl", helperclass1.getTopicnm());
                        intent.putExtra("img", fif);
                        context.startActivity(intent);
                        break;
                    case 16:
                        intent = new Intent(context, para.class);
                        intent.putExtra("ttl", helperclass1.getTopicnm());
                        intent.putExtra("img", six);
                        context.startActivity(intent);
                        break;
                    case 17:
                        intent = new Intent(context, para.class);
                        intent.putExtra("ttl", helperclass1.getTopicnm());
                        intent.putExtra("img", seven);
                        context.startActivity(intent);
                        break;
                    case 18:
                        intent = new Intent(context, para.class);
                        intent.putExtra("ttl", helperclass1.getTopicnm());
                        intent.putExtra("img", eight);
                        context.startActivity(intent);
                        break;
                    case 19:
                        intent = new Intent(context, para.class);
                        intent.putExtra("ttl", helperclass1.getTopicnm());
                        intent.putExtra("img", nine);
                        context.startActivity(intent);
                        break;
                    case 20:
                        intent = new Intent(context, para.class);
                        intent.putExtra("ttl", helperclass1.getTopicnm());
                        intent.putExtra("img", twen);
                        context.startActivity(intent);
                        break;
                    case 21:
                        intent = new Intent(context, para.class);
                        intent.putExtra("ttl", helperclass1.getTopicnm());
                        intent.putExtra("img", tweone);
                        context.startActivity(intent);
                        break;
                    case 22:
                        intent = new Intent(context, para.class);
                        intent.putExtra("ttl", helperclass1.getTopicnm());
                        intent.putExtra("img", twetwo);
                        context.startActivity(intent);
                        break;
                    case 23:
                        intent = new Intent(context, para.class);
                        intent.putExtra("ttl", helperclass1.getTopicnm());
                        intent.putExtra("img", twethr);
                        context.startActivity(intent);
                        break;
                    case 24:
                        intent = new Intent(context, para.class);
                        intent.putExtra("ttl", helperclass1.getTopicnm());
                        intent.putExtra("img", twefour);
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
