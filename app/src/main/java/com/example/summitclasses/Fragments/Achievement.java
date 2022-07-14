package com.example.summitclasses.Fragments;

import android.app.Dialog;
import android.graphics.Color;
import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;

import com.example.summitclasses.Fragments.helperadapter.ahelperadapter;
import com.example.summitclasses.Fragments.helperclass.ahelperclass;
import com.example.summitclasses.R;
import com.example.summitclasses.slider.SliderAdapterExample;
import com.example.summitclasses.slider.SliderItem;
import com.smarteist.autoimageslider.IndicatorView.animation.type.IndicatorAnimationType;
import com.smarteist.autoimageslider.IndicatorView.draw.controller.DrawController;
import com.smarteist.autoimageslider.SliderAnimations;
import com.smarteist.autoimageslider.SliderView;

import java.util.ArrayList;
import java.util.List;

public class Achievement extends Fragment {
    SliderView sliderView;
    SliderAdapterExample adapterr;
    RecyclerView.Adapter adapter;
    RecyclerView arv1,arv2;
    private Dialog loadingdialog;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v= inflater.inflate(R.layout.fragment_achievement, container, false);

        //hooks
        sliderView = v.findViewById(R.id.imageSlider);
        //recyclerview
        arv1=v.findViewById(R.id.arv1);
        arv2=v.findViewById(R.id.arv2);
        //slider code
        //slider code
        adapterr = new SliderAdapterExample(getActivity());
        sliderView.setSliderAdapter(adapterr);
        sliderView.setIndicatorAnimation(IndicatorAnimationType.WORM); //set indicator animation by using SliderLayout.IndicatorAnimations. :WORM or THIN_WORM or COLOR or DROP or FILL or NONE or SCALE or SCALE_DOWN or SLIDE and SWAP!!
        sliderView.setSliderTransformAnimation(SliderAnimations.SIMPLETRANSFORMATION);
        sliderView.setAutoCycleDirection(SliderView.AUTO_CYCLE_DIRECTION_BACK_AND_FORTH);
        sliderView.setIndicatorSelectedColor(Color.WHITE);
        sliderView.setIndicatorUnselectedColor(Color.GRAY);
        sliderView.setScrollTimeInSec(3);
        sliderView.setAutoCycle(true);
        sliderView.startAutoCycle();
        sliderView.setOnIndicatorClickListener(new DrawController.ClickListener() {
            @Override
            public void onIndicatorClicked(int position) {
                Log.i("GGG", "onIndicatorClicked: " + sliderView.getCurrentPagePosition());
            }
        });
        //dialoge
        loadingdialog = new Dialog(getActivity());
        loadingdialog.setContentView(R.layout.customdialoge);
        loadingdialog.getWindow().setBackgroundDrawable(getActivity().getDrawable(R.drawable.dialoge));
        loadingdialog.getWindow().setLayout(LinearLayout.LayoutParams.WRAP_CONTENT, LinearLayout.LayoutParams.WRAP_CONTENT);
        loadingdialog.show();
        //slide method
        renewItems();
        //recycler view method
        rv1();
        rv2();

        return v;
    }


    //slider code
    public void renewItems() {
        List<SliderItem> sliderItemList = new ArrayList<>();
        //dummy data
        for (int i = 0; i < 5; i++) {
            SliderItem sliderItem = new SliderItem();
            sliderItem.setDescription("Slider Item " + i);
            if (i  == 1) {
                sliderItem.setImageUrl("https://firebasestorage.googleapis.com/v0/b/summitclasses12.appspot.com/o/images%2Fslider%2Fsu1.jpg?alt=media&token=09a47903-604c-4929-8199-afeff7fb3c73");
            }else if (i ==2 ){
                sliderItem.setImageUrl("https://firebasestorage.googleapis.com/v0/b/summitclasses12.appspot.com/o/images%2Fslider%2Fsu45.jpg?alt=media&token=44c19de0-20b4-4020-8644-06c6fd0b37ab");

            } else if (i == 3){
                sliderItem.setImageUrl("https://firebasestorage.googleapis.com/v0/b/summitclasses12.appspot.com/o/images%2Fslider%2Fsui5.jpg?alt=media&token=8b9ae6b2-3cf2-4a1c-b4a7-3fd05f425a78");
            } // else if (i==4){
                //sliderItem.setImageUrl("https://s3.amazonaws.com/images.seroundtable.com/google-links-1523447104.jpg");
        //    }
            else {
                sliderItem.setImageUrl("https://firebasestorage.googleapis.com/v0/b/summitclasses12.appspot.com/o/images%2Fslider%2Fsu.jpg?alt=media&token=7b98c410-afcb-4a48-925b-1deec6b40f85");
            }
            sliderItemList.add(sliderItem);
        }
        adapterr.renewItems(sliderItemList);
    }
    //recycler view code
    private void rv2() {
        arv2.setHasFixedSize(true);
        arv2.setLayoutManager(new LinearLayoutManager(getActivity(),LinearLayoutManager.HORIZONTAL,false));

        ArrayList<ahelperclass> featuredlocation = new ArrayList<>();
        String fst="";
        featuredlocation.add(new ahelperclass(fst,"Aman ","99","2019"));
        featuredlocation.add(new ahelperclass(fst,"Rajni ","99","2018"));
        featuredlocation.add(new ahelperclass(fst,"Monika ","98","2020"));
        featuredlocation.add(new ahelperclass(fst,"Priya","97","2019"));
        featuredlocation.add(new ahelperclass(fst,"Fareen ","96","2020"));
        featuredlocation.add(new ahelperclass(fst,"Vinay ","96","2017"));
        featuredlocation.add(new ahelperclass(fst,"Priyanshu","96","2018"));
        featuredlocation.add(new ahelperclass(fst,"Sapna","96","2018"));
        featuredlocation.add(new ahelperclass(fst,"Indu","96","2018"));
        featuredlocation.add(new ahelperclass(fst,"Shubham","95","2019"));
        featuredlocation.add(new ahelperclass(fst,"Kajal","95","2018"));
        featuredlocation.add(new ahelperclass(fst,"Rahul sen","94","2018"));
        featuredlocation.add(new ahelperclass(fst,"Kajal","94","2018"));
        featuredlocation.add(new ahelperclass(fst,"Sania Chishti ","94","2020"));
        featuredlocation.add(new ahelperclass(fst,"Rahul Mandal ","93","2020"));
        featuredlocation.add(new ahelperclass(fst,"Komal sen ","93","2020"));
        featuredlocation.add(new ahelperclass(fst,"Deepak kumar","92","2018"));
        featuredlocation.add(new ahelperclass(fst,"Chandra","91","2017"));
        featuredlocation.add(new ahelperclass(fst,"Aman verma","90","2018"));
        featuredlocation.add(new ahelperclass(fst,"Nikita meena","90","2017"));
        featuredlocation.add(new ahelperclass(fst,"Rajkamal","90","2020"));
        featuredlocation.add(new ahelperclass(fst,"Akash","89","2019"));
        featuredlocation.add(new ahelperclass(fst,"Poonam","88","2019"));

        adapter = new ahelperadapter(featuredlocation);
        arv2.setAdapter(adapter);
        loadingdialog.dismiss();

    }
    private void rv1() {
        arv1.setHasFixedSize(true);
        arv1.setLayoutManager(new LinearLayoutManager(getActivity(),LinearLayoutManager.HORIZONTAL,false));

        ArrayList<ahelperclass> featuredlocation = new ArrayList<>();
        String fst="";
        featuredlocation.add(new ahelperclass(fst,"Trivendra Meena","100","2015"));
        featuredlocation.add(new ahelperclass(fst,"Nikita Meena","97","2015"));
        featuredlocation.add(new ahelperclass(fst,"Rahul Verma","97","2017"));
        featuredlocation.add(new ahelperclass(fst,"Khushi Meghwal","97","2020"));
        featuredlocation.add(new ahelperclass(fst,"Amit jain","96","2017"));
        featuredlocation.add(new ahelperclass(fst,"Bhuvnesh","96","2019"));
        featuredlocation.add(new ahelperclass(fst,"Saziya","96","2019"));
        featuredlocation.add(new ahelperclass(fst,"Shivani Nama","96","2015"));
        featuredlocation.add(new ahelperclass(fst,"Priyanka ","95","2017"));
        featuredlocation.add(new ahelperclass(fst,"Rahul Mandal ","95","2018"));
        featuredlocation.add(new ahelperclass(fst,"Rakesh Malav","95","2018"));
        featuredlocation.add(new ahelperclass(fst,"Aditi","95","2018"));
        featuredlocation.add(new ahelperclass(fst,"Anushka","95","2020"));
        featuredlocation.add(new ahelperclass(fst,"Vanshika","95","2020"));
        featuredlocation.add(new ahelperclass(fst,"Ankit Sikharwar ","94","2018"));
        featuredlocation.add(new ahelperclass(fst,"Shakshi","94","2018"));
        featuredlocation.add(new ahelperclass(fst,"Prabha","94","2018"));
        featuredlocation.add(new ahelperclass(fst,"Divya","94","2020"));
        featuredlocation.add(new ahelperclass(fst,"khushee","94","2020"));
        featuredlocation.add(new ahelperclass(fst,"Ayushi kumari","94","2018"));
        featuredlocation.add(new ahelperclass(fst,"Sana","93","2017"));
        featuredlocation.add(new ahelperclass(fst,"Mohit saini","95","2015"));
        featuredlocation.add(new ahelperclass(fst,"Shalini","94","2016"));
        featuredlocation.add(new ahelperclass(fst,"Rajni","93","2016"));
        featuredlocation.add(new ahelperclass(fst,"Harsh","93","2018"));
        featuredlocation.add(new ahelperclass(fst,"Saurabh Singh","93","2018"));
        featuredlocation.add(new ahelperclass(fst,"Ritika","93","2018"));
        featuredlocation.add(new ahelperclass(fst,"Payal","92","2017"));
        featuredlocation.add(new ahelperclass(fst,"Abhishek","91","2017"));
        featuredlocation.add(new ahelperclass(fst,"Akash Malav","91","2018"));
        featuredlocation.add(new ahelperclass(fst,"Rahul Meghwal","91","2018"));
        featuredlocation.add(new ahelperclass(fst,"Komal sen","91","2018"));
        featuredlocation.add(new ahelperclass(fst,"Laxmi","91","2016"));
        featuredlocation.add(new ahelperclass(fst,"Deepak kumar","91","2016"));
        featuredlocation.add(new ahelperclass(fst,"Tarun","91","2019"));
        featuredlocation.add(new ahelperclass(fst,"Shalini","90","2016"));
        adapter = new ahelperadapter(featuredlocation);
        arv1.setAdapter(adapter);
    }

}