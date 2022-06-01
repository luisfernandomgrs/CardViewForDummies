package com.luisfernandomgrs.learning.cardview.Activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.LinearLayout;

import com.luisfernandomgrs.learning.cardview.Adapter.PostagemAdapter;
import com.luisfernandomgrs.learning.cardview.Model.Postagem;
import com.luisfernandomgrs.learning.cardview.R;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private List<Postagem> postagens = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.setTitle("Visualizando minhas fotos");

        setContentView(R.layout.activity_main);
        recyclerView = findViewById(R.id.recyclerPostagem);

        // Define layout
        /*
        // Criando um layout convencional...
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this);
        */
        /*
        // Criando um layout horizontal
        LinearLayoutManager layoutManager = new LinearLayoutManager(this);
        layoutManager.setOrientation(LinearLayoutManager.HORIZONTAL);
        */
        /*
        // Criando um layout de tabela com duas colunas...
        */
        RecyclerView.LayoutManager layoutManager = new GridLayoutManager(this, 2);
        recyclerView.setLayoutManager(layoutManager);

        // Define Adapter
        this.prepararPostagens();
        PostagemAdapter adapter = new PostagemAdapter(postagens);
        recyclerView.setAdapter(adapter);
    }

    public void prepararPostagens() {
        Postagem postedBy;

        postedBy = new Postagem("Luis Fernando Machado", "Janeiro de 2022, 12", R.drawable.imagem1);
        this.postagens.add(postedBy);

        postedBy = new Postagem("Luis Fernando", "Janeiro de 2022, 17", R.drawable.imagem2);
        this.postagens.add(postedBy);

        postedBy = new Postagem("Fernando", "Janeiro de 2022, 19", R.drawable.imagem3);
        this.postagens.add(postedBy);

        postedBy = new Postagem("Fernando", "Janeiro de 2022, 22", R.drawable.imagem2);
        this.postagens.add(postedBy);

        postedBy = new Postagem("Luis Fernando", "Fevereiro de 2022, 7", R.drawable.imagem3);
        this.postagens.add(postedBy);

        postedBy = new Postagem("Luis", "Fevereiro de 2022, 11", R.drawable.imagem3);
        this.postagens.add(postedBy);

        postedBy = new Postagem("Luis", "Fevereiro de 2022, 7", R.drawable.imagem4);
        this.postagens.add(postedBy);
    }
}