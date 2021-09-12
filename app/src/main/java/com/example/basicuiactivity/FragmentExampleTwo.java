package com.example.basicuiactivity;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


public class FragmentExampleTwo extends Fragment {
    static TextView tv2;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v =  inflater.inflate(R.layout.fragment_fragment_example_two, container, false);
        tv2=v.findViewById(R.id.tv2);
// Inflate the layout for this fragment

        return v;
    }
    public void update(){
        String s= this.getArguments().getString("hello");
        tv2.setText(s);
    }
}