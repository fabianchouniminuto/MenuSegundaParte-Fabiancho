package com.miislyk.petagram.fragments;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.miislyk.petagram.R;
import com.miislyk.petagram.adapter.MascotaAdaptador;
import com.miislyk.petagram.pojo.Mascota;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 */
public class PerfilFragment extends Fragment {

    ArrayList<Mascota> miMascota;
    private RecyclerView fotosMiMascota;


    public PerfilFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_perfil, container, false);

        fotosMiMascota = (RecyclerView) view.findViewById(R.id.recyclerFragmentMiMascota);

        GridLayoutManager gridLayoutManager = new GridLayoutManager(getActivity(), 2);
        fotosMiMascota.setLayoutManager(gridLayoutManager);

        inicializarListaMiMascota();
        inicializarAdaptador();

        // Inflate the layout for this fragment
        return view;
    }

    public void inicializarListaMiMascota(){

        miMascota = new ArrayList<Mascota>();

        miMascota.add(new Mascota(R.drawable.kira1, "Kira"));
        miMascota.add(new Mascota(R.drawable.kira2, "Kira"));
        miMascota.add(new Mascota(R.drawable.kira3, "Kira"));
        miMascota.add(new Mascota(R.drawable.kira4, "Kira"));
        miMascota.add(new Mascota(R.drawable.kira5, "Kira"));
    }


    public void inicializarAdaptador(){

        MascotaAdaptador adaptador = new MascotaAdaptador(miMascota, getActivity());
        fotosMiMascota.setAdapter(adaptador);

    }

}
