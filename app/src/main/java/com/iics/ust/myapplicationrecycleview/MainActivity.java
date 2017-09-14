package com.iics.ust.myapplicationrecycleview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.StaggeredGridLayoutManager;
import android.widget.LinearLayout;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    RecyclerView rvAndroidVersions;
    int[] logo;
    String[] codename, version, api, date;
    ArrayList<AndroidVersion> list;
    CustomAdapter adapter;
    //RecyclerView.LayoutManager layoutManager;
    //LinearLayoutManager layoutManager;
    StaggeredGridLayoutManager layoutManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        rvAndroidVersions = (RecyclerView) findViewById(R.id.rv_AndroidVersions);
        logo = new int[]{
                R.drawable.android_1_0, R.drawable.android_1_5_cupcake,
                R.drawable.android_1_6_donut, R.drawable.android_2_0_eclair,
                R.drawable.android_2_2_froyo, R.drawable.android_2_3_gingerbread,
                R.drawable.android_3_0_honeycomb, R.drawable.android_4_0_icecreamsandwich,
                R.drawable.android_4_1_jellybean, R.drawable.android_4_4_kitkat,
                R.drawable.android_5_0_lollipop, R.drawable.android_6_0_marshmallow,
                R.drawable.android_7_0_nougat, R.drawable.android_8_0_oreo
        };
        codename = getResources().getStringArray(R.array.codename);
        version = getResources().getStringArray(R.array.version);
        api = getResources().getStringArray(R.array.api);
        date = getResources().getStringArray(R.array.date);
        list = new ArrayList<AndroidVersion>();
        //layoutManager = new LinearLayoutManager(this);
        //layoutManager = new GridLayoutManager(this, 2);
        layoutManager = new StaggeredGridLayoutManager(6, StaggeredGridLayoutManager.HORIZONTAL);
        //layoutManager.setOrientation(LinearLayoutManager.VERTICAL);
        rvAndroidVersions.setLayoutManager(layoutManager);
        rvAndroidVersions.setHasFixedSize(true);
        for (int i = 0; i < codename.length; i++) {
            list.add(new AndroidVersion(logo[i], codename[i], version[i], api[i], date[i]));
        }
        adapter = new CustomAdapter(list);
        rvAndroidVersions.setAdapter(adapter);
    }
}
