package com.example.basicuiactivity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class ListViewExample extends AppCompatActivity {
    private ListView mListView;

    private String[] users = { "Java", "Data Structure", "Android", "Python", "JSON", "Java Script"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_view_example);
        mListView = findViewById(R.id.userlist);
       final ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, users);
      // final ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, getResources().getStringArray(R.array.array_technology));
        mListView.setAdapter(adapter);

        mListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {
                // TODO Auto-generated method stub
                String value = adapter.getItem(position);
                Toast.makeText(getApplicationContext(), value, Toast.LENGTH_SHORT).show();
            }
        });
            }
}