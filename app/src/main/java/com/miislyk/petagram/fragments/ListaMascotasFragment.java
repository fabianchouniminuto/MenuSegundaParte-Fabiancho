package com.miislyk.petagram.fragments;


import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
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
public class ListaMascotasFragment extends Fragment {

    ArrayList<Mascota> mascotas;
    private RecyclerView listaMascotas;

    public ListaMascotasFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        // Inflate the layout for this fragment

        View view = inflater.inflate(R.layout.fragment_lista_mascotas, container, false);

        listaMascotas = (RecyclerView) view.findViewById(R.id.recyclerFragmentListaMascotas);

        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getActivity());
        linearLayoutManager.setOrientation(LinearLayoutManager.VERTICAL);

        listaMascotas.setLayoutManager(linearLayoutManager);

        inicializarListaMascotas();
        inicializarAdaptador();

        return view;
    }

    public void inicializarAdaptador(){

        MascotaAdaptador adaptador = new MascotaAdaptador(mascotas, getActivity());
        listaMascotas.setAdapter(adaptador);

    }

    public void inicializarListaMascotas(){

        mascotas = new ArrayList<Mascota>();

        mascotas.add(new Mascota(R.drawable.fox, "Kira"));
        mascotas.add(new Mascota(R.drawable.bear, "Nero"));
        mascotas.add(new Mascota(R.drawable.elephant, "Lola"));
        mascotas.add(new Mascota(R.drawable.sheep, "Gardfiel"));
        mascotas.add(new Mascota(R.drawable.monkey, "Simon"));
    }

}
