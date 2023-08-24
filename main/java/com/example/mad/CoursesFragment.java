package com.example.mad;

import android.content.Intent;
import android.os.Bundle;

import androidx.cardview.widget.CardView;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class CoursesFragment extends Fragment {
    CardView c1,c2,c3,c4;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
       View view = inflater.inflate(R.layout.fragment_courses, container, false);
       c1 = (CardView) view.findViewById(R.id.cv1);
        c2 = (CardView) view.findViewById(R.id.cv2);
        c3 = (CardView) view.findViewById(R.id.cv3);
        c4 = (CardView) view.findViewById(R.id.cv4);
       c1.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View view) {
               Intent i =new Intent(getContext(), CourseraActivity.class);
               startActivity(i);
           }
       });
        c2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i =new Intent(getContext(), UdemyActivity.class);
                startActivity(i);
            }
        });
        c3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i =new Intent(getContext(), IbmActivity.class);
                startActivity(i);
            }
        });
        c4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i =new Intent(getContext(), GreatActivity.class);
                startActivity(i);
            }
        });
        return view;
    }
}