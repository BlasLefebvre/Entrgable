package com.example.digital.proyectointegrador;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.net.InterfaceAddress;
import java.util.List;

public class RecetaAdapter extends RecyclerView.Adapter {
    private List<Receta> listaDeRecetas;
    private ListenerRecetaAdapter listenerRecetaAdapter;


    public RecetaAdapter(List<Receta> listaDeRecetas, ListenerRecetaAdapter listener) {
        this.listaDeRecetas = listaDeRecetas;
        listenerRecetaAdapter = listener;

    }

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflador = LayoutInflater.from(parent.getContext());
        View viewDeLaCleda = inflador.inflate(R.layout.celda_receta, parent, false);
        RecetaViewHolder recetaViewHolder = new RecetaViewHolder(viewDeLaCleda);


        return recetaViewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {
        Receta receta = listaDeRecetas.get(position);
        RecetaViewHolder recetaViewHolder = (RecetaViewHolder) holder;
        recetaViewHolder.bind(receta);

    }

    @Override
    public int getItemCount() {
        return listaDeRecetas.size();
    }


    private class RecetaViewHolder extends RecyclerView.ViewHolder {
        private ImageView imageViewReceta;
        private TextView textViewNombreReceta;
        private Receta receta;


        public RecetaViewHolder(View itemView) {
            super(itemView);
            imageViewReceta = itemView.findViewById(R.id.imagen_receta);
            textViewNombreReceta = itemView.findViewById(R.id.nombre_receta);
            itemView.setOnClickListener(new View.OnClickListener() {

                @Override
                public void onClick(View v) {
                    listenerRecetaAdapter.informarSeleccion(receta);

                }
            });
        }

        public void bind(Receta unaReceta) {
            this.receta = unaReceta;
            textViewNombreReceta.setText(unaReceta.getNombre());
            imageViewReceta.setImageResource(unaReceta.getImagenReceta());


        }
    }


    public interface ListenerRecetaAdapter {
        public void informarSeleccion(Receta receta);



    }
}
