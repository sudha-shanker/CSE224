package com.example.basicuiactivity;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;


public class FragmentExampleOne extends Fragment {
    EditText tv1;
    Button b1;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v= inflater.inflate(R.layout.fragment_fragment_example_one, container, false);
        tv1 = v.findViewById(R.id.tv1);
        b1 =  v.findViewById(R.id.bt1);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String str = tv1.getText().toString();
                FragmentExampleTwo obj = new FragmentExampleTwo();
                Bundle b = new Bundle();
                b.putString("hello", str);
                obj.setArguments(b);
                obj.update();

            }
    });
        return v;

}
}
