package com.example.linguadeus;

import android.app.Dialog;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.navigation.fragment.NavHostFragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageButton;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link uvod1_lekcija2_fragment5#newInstance} factory method to
 * create an instance of this fragment.
 */
public class uvod1_lekcija2_fragment5 extends Fragment {

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public uvod1_lekcija2_fragment5() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment uvod1_lekcija2_fragment5.
     */
    // TODO: Rename and change types and number of parameters
    public static uvod1_lekcija2_fragment5 newInstance(String param1, String param2) {
        uvod1_lekcija2_fragment5 fragment = new uvod1_lekcija2_fragment5();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view= inflater.inflate(R.layout.fragment_uvod1_lekcija2_fragment5, container, false);
        Button button1=view.findViewById(R.id.button1);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Dialog greska;
                greska=new Dialog(getContext());
                greska.setContentView(R.layout.greska);
                greska.show();
            }
        });
        Button button2=view.findViewById(R.id.button2);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                NavHostFragment.findNavController(uvod1_lekcija2_fragment5.this)
                        .navigate(R.id.action_uvod1_lekcija2_fragment5_to_uvod1_lekcija2_fragment6);
            }
        });
        Button button3=view.findViewById(R.id.button3);
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Dialog greska;
                greska=new Dialog(getContext());
                greska.setContentView(R.layout.greska);
                greska.show();
            }
        });
        Button button4=view.findViewById(R.id.button4);
        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Dialog greska;
                greska=new Dialog(getContext());
                greska.setContentView(R.layout.greska);
                greska.show();
            }
        });
        Button bsound=view.findViewById(R.id.bsound);
        bsound.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                final MediaPlayer md=MediaPlayer.create(getContext(),R.raw.snimak5_u1l2);
                md.start();
            }
        });
        ImageButton backbutton=view.findViewById(R.id.backbutton);
        backbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getActivity(),MainActivity.class));
            }
        });
        return view;
    }
}