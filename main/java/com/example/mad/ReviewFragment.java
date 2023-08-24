package com.example.mad;



import android.annotation.SuppressLint;
import android.content.Context;
import android.content.SharedPreferences;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.RatingBar;
import android.widget.Toast;

import java.io.File;

public class ReviewFragment extends Fragment {
    SQLiteDatabase sb;
    RatingBar rb;
    Button lg;
    SharedPreferences sp;


    @SuppressLint("NewApi")
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_review, container, false);
        lg = (Button) view.findViewById(R.id.button7);
        sp = requireContext().getSharedPreferences("user_info", Context.MODE_PRIVATE);
        lg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                SharedPreferences.Editor editor = sp.edit();
                editor.clear();
                editor.commit();
                LogFragment lf = new LogFragment();
                getParentFragmentManager().beginTransaction().replace(R.id.container,lf).commit();
            }
        });
        return view;
    }

}