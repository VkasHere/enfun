package com.example.summitclasses.notice;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.example.summitclasses.R;

import java.util.ArrayList;


public class NoticeAdapter extends RecyclerView.Adapter<NoticeAdapter.NoticeViewAdapter> {

    private Context context;
    private ArrayList<notice_data_class> list;

    public NoticeAdapter(Context context, ArrayList<notice_data_class> list) {
        this.context = context;
        this.list = list;
    }

    @NonNull
    @Override
    public NoticeViewAdapter onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view  = LayoutInflater.from(context).inflate(R.layout.notice_item, parent, false);
        NoticeViewAdapter noticeViewAdapter= new NoticeViewAdapter(view);
        return  noticeViewAdapter;
    }

    @Override
    public void onBindViewHolder(@NonNull NoticeViewAdapter holder, final int position) {

        final notice_data_class currentItem = list.get(position);
        holder.deleteNoticeTitle.setText(currentItem.getText());
        holder.date.setText(currentItem.getDate());
        holder.time.setText(currentItem.getTime());



        try {
            if (currentItem.getUrl() != null)
                Glide.with(context).load(currentItem.getUrl()).into(holder.deleteNoticeImage);
        } catch (Exception e) {
            e.printStackTrace();
        }


    }

    @Override
    public int getItemCount()    {
        return list.size();
    }

    public class NoticeViewAdapter extends RecyclerView.ViewHolder {

        private TextView deleteNoticeTitle, date, time;
        private ImageView deleteNoticeImage;

        public NoticeViewAdapter(@NonNull View itemView) {
            super(itemView);
            deleteNoticeTitle = itemView.findViewById(R.id.deleteNoticeTitle);
            deleteNoticeImage = itemView.findViewById(R.id.deleteNoticeImage);
            date = itemView.findViewById(R.id.date);
            time = itemView.findViewById(R.id.time);
        }
    }
}
