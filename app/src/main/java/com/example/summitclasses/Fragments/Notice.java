package com.example.summitclasses.Fragments;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.Toast;

import com.example.summitclasses.R;
import com.example.summitclasses.notice.NoticeAdapter;
import com.example.summitclasses.notice.notice_data_class;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

import java.util.ArrayList;

public class Notice extends Fragment {
    private RecyclerView deleteNoticeRecycler;
    private ProgressBar progressBar;
    private ArrayList<notice_data_class> list;
    private NoticeAdapter adapter;
    LinearLayout backpress;
    private DatabaseReference reference;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v= inflater.inflate(R.layout.fragment_notice, container, false);
        //hooks
        deleteNoticeRecycler = v.findViewById(R.id.rv1);
        progressBar = v.findViewById(R.id.pgr);
        reference = FirebaseDatabase.getInstance().getReference("Notice");
        deleteNoticeRecycler.setLayoutManager(new LinearLayoutManager(getActivity()));
        deleteNoticeRecycler.setHasFixedSize(true);
        //notice
        getNotice();
        return v;
    }
    //notice method
    private void getNotice() {
        reference.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                list = new ArrayList<>();
                for (DataSnapshot snapshot : dataSnapshot.getChildren()){
                    notice_data_class data = snapshot.getValue(notice_data_class.class);
                    list.add(data);
                }

                adapter = new NoticeAdapter(getActivity(),list);
                adapter.notifyDataSetChanged();
                progressBar.setVisibility(View.GONE);
                deleteNoticeRecycler.setAdapter(adapter);
            }

            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {
                progressBar.setVisibility(View.GONE);

                Toast.makeText(getActivity(),databaseError.getMessage() , Toast.LENGTH_SHORT).show();
            }
        });
    }
}