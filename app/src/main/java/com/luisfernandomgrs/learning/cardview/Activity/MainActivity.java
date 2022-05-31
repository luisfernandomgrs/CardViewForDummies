package com.luisfernandomgrs.learning.cardview.Activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.luisfernandomgrs.learning.cardview.Adapter.PostagemAdapter;
import com.luisfernandomgrs.learning.cardview.R;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);
        recyclerView = findViewById(R.id.recyclerPostagem);

        // Define layout
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);

        // Define Adapter
        PostagemAdapter adapter = new PostagemAdapter();
        recyclerView.setAdapter(adapter);
    }
}