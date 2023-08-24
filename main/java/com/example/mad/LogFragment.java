package com.example.mad;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class LogFragment extends Fragment {
    Button b1,b2;
    EditText us,ps;
    SharedPreferences sp;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_log, container, false);
        b1 = (Button) view.findViewById(R.id.button);
        b2 = (Button) view.findViewById(R.id.button2);
        us = (EditText)view.findViewById(R.id.editTextTextPersonName);
        ps = (EditText) view.findViewById(R.id.editTextTextPassword2);
        sp = getContext().getSharedPreferences("user_info", Context.MODE_PRIVATE);
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                SignFragment sg = new SignFragment();
                getParentFragmentManager().beginTransaction().replace(R.id.container,sg).commit();
            }
        });
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String un = us.getText().toString();
                String pd = ps.getText().toString();
                if(un.equals("virat123@gmail.com") && pd.equals("virat123")){
                    SharedPreferences.Editor editor = sp.edit();
                    editor.putString("uname",un);
                    editor.putString("passwd",pd);
                    editor.commit();
                    Toast.makeText(getContext(),"Login success",Toast.LENGTH_LONG).show();
                }
                ActualFragment af = new ActualFragment();
                getParentFragmentManager().beginTransaction().replace(R.id.container,af).commit();
            }
        });
        return view;
    }
}