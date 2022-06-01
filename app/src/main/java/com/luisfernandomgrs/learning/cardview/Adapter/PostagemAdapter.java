package com.luisfernandomgrs.learning.cardview.Adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.luisfernandomgrs.learning.cardview.Model.Postagem;
import com.luisfernandomgrs.learning.cardview.R;

import java.util.List;

public class PostagemAdapter extends RecyclerView.Adapter<PostagemAdapter.MyViewHolder> {
    List<Postagem> listaPostagens;

    public PostagemAdapter(List<Postagem> _listaPostagens) {
        this.listaPostagens = _listaPostagens;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View itemLista = LayoutInflater.from(parent.getContext()).inflate(R.layout.postagem_detalhe, parent, false);

        return new MyViewHolder(itemLista);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        Postagem _postagem = listaPostagens.get(position);
        holder.textNome.setText(_postagem.getNome());
        holder.textPostagem.setText(_postagem.getPostagem());
        holder.imagemPostagem.setImageResource(_postagem.getImagem());
    }

    @Override
    public int getItemCount() {
        return this.listaPostagens.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {
        private TextView textNome;
        private TextView textPostagem;
        private ImageView imagemPostagem;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            textNome = itemView.findViewById(R.id.textNome);
            textPostagem = itemView.findViewById(R.id.textPostagem);
            imagemPostagem = itemView.findViewById(R.id.imagePostagem);
        }
    }
}
