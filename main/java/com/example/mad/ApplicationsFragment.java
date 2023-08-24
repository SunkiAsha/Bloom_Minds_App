package com.example.mad;

import android.annotation.SuppressLint;
import android.app.PendingIntent;
import android.content.Intent;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.cardview.widget.CardView;
import androidx.fragment.app.Fragment;

import android.telephony.SmsManager;
import android.view.ContextMenu;
import android.view.LayoutInflater;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.widget.Button;
import android.widget.Toast;

public class ApplicationsFragment extends Fragment {
    CardView cv1,cv2,cv3,cv4,cv5,cv6;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_applications, container, false);
        cv1 = (CardView) view.findViewById(R.id.c1);
        cv2 = (CardView) view.findViewById(R.id.c2);
        cv3 = (CardView) view.findViewById(R.id.c3);
        cv4 = (CardView) view.findViewById(R.id.c4);
        cv5 = (CardView) view.findViewById(R.id.c5);
        cv6 = (CardView) view.findViewById(R.id.c6);
        registerForContextMenu(cv1);
        cv1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i =new Intent(getContext(),MainActivity2.class);
                startActivity(i);
            }
        });
        cv2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i =new Intent(getContext(),MainActivity3.class);
                startActivity(i);
            }
        });
        cv3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i =new Intent(getContext(),MainActivity4.class);
                startActivity(i);
            }
        });
        cv4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i =new Intent(getContext(),MainActivity5.class);
                startActivity(i);
            }
        });
        cv5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i =new Intent(getContext(),MainActivity6.class);
                startActivity(i);
            }
        });
        cv6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i =new Intent(getContext(),MainActivity7.class);
                startActivity(i);
            }
        });
        return view;
    }

    @Override
    public void onCreateContextMenu(@NonNull ContextMenu menu, @NonNull View v, @Nullable ContextMenu.ContextMenuInfo menuInfo) {
        super.onCreateContextMenu(menu, v, menuInfo);
        getActivity().getMenuInflater().inflate(R.menu.context_menu, menu);
    }

    @Override
    public boolean onContextItemSelected(@NonNull MenuItem item) {
        switch(item.getItemId()){
            case R.id.t1:
                Intent i = new Intent(Intent.ACTION_SEND);
                i.putExtra(Intent.EXTRA_TEXT,"https://projectworlds.in/android-projects-with-source-code/women-safety-app-android-project-source-code/");
                i.setType("message/rfc822");
                startActivity(Intent.createChooser(i,"Choose Mail App"));
                return true;
            case R.id.t2:
                Intent it = new Intent(getActivity(), ApplicationsFragment.class);
                @SuppressLint("UnspecifiedImmutableFlag")
                PendingIntent pi = PendingIntent.getActivity(getContext(),0,it,0);
                SmsManager sm = SmsManager.getDefault();
                sm.sendTextMessage("9876543210",null,"https://projectworlds.in/android-projects-with-source-code/women-safety-app-android-project-source-code/",pi,null);

                Toast.makeText(getActivity(),"message sent",Toast.LENGTH_LONG).show();
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }
}