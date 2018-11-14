package com.example.digital.proyectointegrador;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;


/**
 * A simple {@link Fragment} subclass.
 */


public class FragmentDetalle extends Fragment {



    public FragmentDetalle() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View vistaDelFragment =  inflater.inflate(R.layout.fragment_fragment_detalle, container, false);

        ImageView imagenDetalle  = vistaDelFragment.findViewById(R.id.imagen_detalle);
        TextView nombreDetalle = vistaDelFragment.findViewById(R.id.nombre_receta_Detalle);
        TextView ingredientesDetalle = vistaDelFragment.findViewById(R.id.Ingredientes_receta_Detalle);
        TextView preparacionDetalle = vistaDelFragment.findViewById(R.id.Preparacion_receta_Detalle);

        //Recibo el bundle
        Bundle bundle = getArguments();

        //Recibo el producto que implementa serializable
        Receta recetaSeleccionado = (Receta) bundle.getSerializable("clave");

        imagenDetalle.setImageResource(recetaSeleccionado.getImagenReceta());
        nombreDetalle.setText(recetaSeleccionado.getNombre());
        ingredientesDetalle.setText(recetaSeleccionado.getIngredientes());
        preparacionDetalle.setText(recetaSeleccionado.getPreparacion());



        return vistaDelFragment;
    }



}
