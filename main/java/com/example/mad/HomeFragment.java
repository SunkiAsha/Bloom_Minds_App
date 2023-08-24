package com.example.mad;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

public class HomeFragment extends Fragment {
    Button b1,b2;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_home, container, false);
        b1 = (Button) view.findViewById(R.id.button3);
        b2 = (Button) view.findViewById(R.id.button4);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                LogFragment lg = new LogFragment();
                FragmentTransaction ft = getActivity().getSupportFragmentManager().beginTransaction();
                ft.replace(R.id.container,lg).addToBackStack("name").commit();
                //getParentFragmentManager().beginTransaction().replace(R.id.container,lg).commit();
            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                SignFragment sg = new SignFragment();
                getParentFragmentManager().beginTransaction().replace(R.id.container,sg).commit();
            }
        });
        return view;
    }
}