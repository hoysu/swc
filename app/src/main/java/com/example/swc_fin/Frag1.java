package com.example.swc_fin;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.ButtonBarLayout;
import androidx.fragment.app.Fragment;

public class Frag1 extends Fragment {

    //private View view;

    String str = " ";
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.frag1, container, false);

        Button btn_upload = (Button) view.findViewById(R.id.btn_upload);
        btn_upload.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText et_today = (EditText) view.findViewById(R.id.et_today);
                str += " \n " + et_today.getText().toString();
                TextView tV_today = (TextView) view.findViewById(R.id.tV_today);
                tV_today.setText(str);
            }
        });
        return view;
    }
}