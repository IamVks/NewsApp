package com.example.vikas.navigationdrawer;

import android.app.Fragment;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

/**
 * Created by VIKAS on 12/31/2017.
 */

public class Hindi extends Fragment {

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view= inflater.inflate(R.layout.fragment_menu_3, container, false);
        final String[] sites = { "jagran amarujala" , "bhaskar" , "livehindustan" , "epaper.patrika" , "prabhatkhabar" , "jansatta", "navbharattimes" , "punjabkesari",
                "epaper.haribhoomi" , "divyahimachal" , "sanjeevnitoday"  ,"business-standard" , "saamana" , "prabhasakshi", "panchjanya"};
        ListView add = (ListView)view.findViewById(R.id.simpleview);
        ArrayAdapter<String> listviewadapter =new ArrayAdapter<String>(
                getActivity(),
                android.R.layout.simple_list_item_1,
                sites
        );
        add.setAdapter(listviewadapter);

        add.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int i, long id) {
                Intent intent = new Intent(getActivity().getApplication(), Webviews.class);

                intent.putExtra("NEWSPAPER", sites[i]);
                startActivity(intent);
            }
        });
        return view;
    }


    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        //you can set the title for your toolbar here for different fragments different titles
        getActivity().setTitle("Hindi");
    }
}