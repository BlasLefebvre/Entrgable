package com.example.digital.proyectointegrador;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import java.util.zip.Inflater;


/**
 * A simple {@link Fragment} subclass.
 */
public class IndexFragment extends Fragment {

private ImageView imageView;
    public IndexFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View vistaDelFragment = inflater.inflate(R.layout.fragment_index, container, false);






        return vistaDelFragment;
    }


}
