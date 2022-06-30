package com.example.recyclerviewcontactlist;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.LinearLayout;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    RecyclerView rcvContactList;

    ArrayList<String> ContactName = new ArrayList<>();
    ArrayList<String> ContactNumber = new ArrayList<>();
    ArrayList<Integer> UserImg = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initView();

    }

    private void initView() {

        rcvContactList = findViewById(R.id.rcvContactList);

        ContactName.add("Arpan Ramani");
        ContactName.add("Arpan Ramani");
        ContactName.add("Arpan Ramani");
        ContactName.add("Arpan Ramani");
        ContactName.add("Arpan Ramani");
        ContactName.add("Arpan Ramani");
        ContactName.add("Arpan Ramani");
        ContactName.add("Arpan Ramani");
        ContactName.add("Arpan Ramani");
        ContactName.add("Arpan Ramani");

        ContactNumber.add("98793 12139");
        ContactNumber.add("98793 12139");
        ContactNumber.add("98793 12139");
        ContactNumber.add("98793 12139");
        ContactNumber.add("98793 12139");
        ContactNumber.add("98793 12139");
        ContactNumber.add("98793 12139");
        ContactNumber.add("98793 12139");
        ContactNumber.add("98793 12139");
        ContactNumber.add("98793 12139");

        UserImg.add(R.drawable.user);
        UserImg.add(R.drawable.user);
        UserImg.add(R.drawable.user);
        UserImg.add(R.drawable.user);
        UserImg.add(R.drawable.user);
        UserImg.add(R.drawable.user);
        UserImg.add(R.drawable.user);
        UserImg.add(R.drawable.user);
        UserImg.add(R.drawable.user);
        UserImg.add(R.drawable.user);


        MyAdapter adapter = new MyAdapter(ContactName,ContactNumber,UserImg);

        LinearLayoutManager manager = new LinearLayoutManager(this,LinearLayoutManager.VERTICAL,false);
        rcvContactList.setLayoutManager(manager);

        rcvContactList.setAdapter(adapter);

    }
}