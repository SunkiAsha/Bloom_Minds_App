package com.example.mad;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;

public class HelpFragment extends Fragment {
    EditText sub,comp;
    Button btn;
    ImageButton ss;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_help, container, false);
        sub = (EditText) view.findViewById(R.id.et1);
        comp = (EditText) view.findViewById(R.id.editTextTextMultiLine);
        btn = (Button) view.findViewById(R.id.button6);
        ss = (ImageButton) view.findViewById(R.id.imgbtn);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Intent.ACTION_SEND);
                i.putExtra(Intent.EXTRA_EMAIL, new String[]{"bloomminds123@gmail.com"});
                i.putExtra(Intent.EXTRA_SUBJECT,sub.getText().toString());
                i.putExtra(Intent.EXTRA_TEXT,comp.getText().toString());
                i.setType("message/rfc822");
                startActivity(Intent.createChooser(i,"Choose Mail app"));
            }
        });
        ss.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Intent.ACTION_CALL);
                i.setData(Uri.parse("tel:"+"9876543210"));
                startActivity(i);
            }
        });
        return view;
    }
}