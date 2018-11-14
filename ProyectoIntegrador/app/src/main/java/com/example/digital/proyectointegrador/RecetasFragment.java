package com.example.digital.proyectointegrador;


import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import com.example.digital.proyectointegrador.RecetaAdapter.ListenerRecetaAdapter;

import java.util.ArrayList;
import java.util.List;


/**
 * A simple {@link Fragment} subclass.
 */
public class RecetasFragment extends Fragment implements ListenerRecetaAdapter {


    public RecetasFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View vistaDelFragment = inflater.inflate(R.layout.fragment_recetas, container, false);


        RecyclerView recyclerReceta;
        recyclerReceta = vistaDelFragment.findViewById(R.id.recyclerView);

        List<Receta> receta = cargarRecetas();

        RecetaAdapter personajesAdapter = new RecetaAdapter(receta, this);

        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getContext(), LinearLayoutManager.VERTICAL, false);

        recyclerReceta.setLayoutManager(linearLayoutManager);
        recyclerReceta.setAdapter(personajesAdapter);
        recyclerReceta.setHasFixedSize(true);

        return vistaDelFragment;

    }




    private List<Receta> cargarRecetas(){
        List<Receta> recetas = new ArrayList<>();

        recetas.add(new Receta("Empanada","Ingredientes","preparacion",R.drawable.empanada ));
        recetas.add(new Receta("Milanesa","Ingredientes","preparacion",R.drawable.malanesa ));
        recetas.add(new Receta("Empanada","Ingredientes","preparacion",R.drawable.empanada ));
        recetas.add(new Receta("Milanesa","Ingredientes","preparacion",R.drawable.malanesa ));



        return recetas;
    }


    @Override
    public void informarSeleccion(Receta receta) {

    }
}
