package br.edu.atividade_reflexiva_julio_oliveira_neto_09018650;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class RVAdapter extends RecyclerView.Adapter<RVAdapter.PersonViewHolder> {

    public static class PersonViewHolder extends RecyclerView.ViewHolder {

        private TextView _nome_cidade;
        private TextView _qtd_habitantes_cidade;
        private ImageView _imagem_cidade;

        PersonViewHolder(View itemView) {
            super(itemView);
            _nome_cidade = (TextView)itemView.findViewById(R.id.nome_cidade);
            _qtd_habitantes_cidade = (TextView)itemView.findViewById(R.id.qtd_habitantes);
            _imagem_cidade = (ImageView)itemView.findViewById(R.id.photo_cidade);
        }
    }

    List<Cidade> cidades;

    RVAdapter(List<Cidade> cidades){
        this.cidades = cidades;
    }

    @Override
    public void onAttachedToRecyclerView(RecyclerView recyclerView) {
        super.onAttachedToRecyclerView(recyclerView);
    }

    @Override
    public PersonViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        View v = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.cardview_activity, viewGroup, false);
        PersonViewHolder pvh = new PersonViewHolder(v);
        return pvh;
    }

    @Override
    public void onBindViewHolder(PersonViewHolder personViewHolder, int i) {
        personViewHolder._nome_cidade.setText(cidades.get(i).get_nome_cidade());
        personViewHolder._qtd_habitantes_cidade.setText(cidades.get(i).get_qtd_habitantes());
        personViewHolder._imagem_cidade.setImageResource(cidades.get(i).get_photoId());
    }

    @Override
    public int getItemCount() {
        return cidades.size();
    }
}
