package com.example.vikas.navigationdrawer;

import android.app.Fragment;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ListView;

/**
 * Created by VIKAS on 12/31/2017.
 */

public class Aboutus extends Fragment {
    public Aboutus(){

    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        //returning our layout file
        //change R.layout.yourlayoutfilename for each of your fragments
        View view= inflater.inflate(R.layout.about_layout, container, false);


       /*  ps = (Button) view.findViewById(R.id.ps_btn);
        Button fb = (Button) view.findViewById(R.id.fb_btn);

        ps.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                *//*Intent i = new Intent(Intent.ACTION_VIEW);
                i.setData(Uri.parse("https://www.facebook.com/VckySoft-802108683221720"));
                //if (i.resolveActivity(getPackageManager()) !=null){
                    startActivity(i);*//*
            }
        });

        fb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Intent.ACTION_VIEW);
                i.setData(Uri.parse("https://www.facebook.com/VckySoft-802108683221720"));
                //if (i.resolveActivity(getPackageManager()) !=null){
                startActivity(i);
            }
        });*/
      return view;
    }


    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        //you can set the title for your toolbar here for different fragments different titles
        getActivity().setTitle("ABOUT US");
    }
}