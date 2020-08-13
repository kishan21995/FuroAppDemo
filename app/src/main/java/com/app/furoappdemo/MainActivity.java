package com.app.furoappdemo;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    RecyclerView recyclerView;
    List<ModelClass> modelClassList = new ArrayList();
    Adapter mAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.recycler_view);

        mAdapter = new Adapter(modelClassList);
        RecyclerView.LayoutManager mLayoutManager = new LinearLayoutManager(getApplicationContext());
        recyclerView.setLayoutManager(mLayoutManager);
        recyclerView.setItemAnimator(new DefaultItemAnimator());
        recyclerView.setAdapter(mAdapter);

        prepareMovieData();

    }

    private void prepareMovieData() {
        ModelClass movie = new ModelClass("Yogi suggested Dil Mera by The Local Train ",  "2h");
        modelClassList.add(movie);

        movie = new ModelClass("Rohan loved your suggestion of Ozone", "2h");
        modelClassList.add(movie);

        movie = new ModelClass("The Local Train uploaded a new album",  "2h");
        modelClassList.add(movie);

        movie = new ModelClass("Congrets You were added to tatin Srivastava ",  "2h");
        modelClassList.add(movie);

        movie = new ModelClass("Yogi suggest Ozone by yatin Project ",  "2h");
        modelClassList.add(movie);

        mAdapter.notifyDataSetChanged();

    }
}