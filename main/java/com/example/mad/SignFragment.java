package com.example.mad;

import static android.database.sqlite.SQLiteDatabase.openOrCreateDatabase;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Spinner;
import android.widget.Toast;

import Database.Database_helper;

public class SignFragment extends Fragment implements AdapterView.OnItemSelectedListener{
    Button b5;
    EditText e1,e2,e3,e4;
    String[] prof = { "Student", "Faculty","Other"};
    Spinner s1;
    Database_helper db;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_sign, container, false);
        b5 = (Button) view.findViewById(R.id.button5);
        s1 = (Spinner) view.findViewById(R.id.spinner);
        e1 = (EditText) view.findViewById(R.id.e1);
        e2 = (EditText) view.findViewById(R.id.editTextTextPersonName2);
        e3 = (EditText) view.findViewById(R.id.editTextTextPersonName3);
        e4 = (EditText) view.findViewById(R.id.editTextTextPassword);
        db = new Database_helper(getContext());
        s1.setOnItemSelectedListener(this);
        ArrayAdapter aa = new ArrayAdapter(getContext(),android.R.layout.simple_spinner_item,prof);
        aa.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        s1.setAdapter(aa);
        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                boolean isInserted = db.inserdata(e1.getText().toString(),e2.getText().toString(),e3.getText().toString(),e4.getText().toString());
                if(isInserted=true){
                    Toast.makeText(getContext(),"Data Inserted",Toast.LENGTH_SHORT).show();
                    e1.setText("");e2.setText("");
                    e3.setText("");e4.setText("");
                }
                else{
                    Toast.makeText(getContext(),"Data not Inserted",Toast.LENGTH_SHORT).show();
                }
                LogFragment lf = new LogFragment();
                getParentFragmentManager().beginTransaction().replace(R.id.container,lf).commit();
            }
        });
        return view;
    }


    @Override
    public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {

    }

    @Override
    public void onNothingSelected(AdapterView<?> adapterView) {

    }
}