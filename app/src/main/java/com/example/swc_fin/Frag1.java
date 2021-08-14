package com.example.swc_fin;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public class Frag1 extends Fragment {

    //private View view;

    String str = " ";
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.frag1, container, false);

        Button btn_upload = view.findViewById(R.id.btn_upload);
        btn_upload.setOnClickListener(v -> {
            EditText et_today = view.findViewById(R.id.et_today);
            str += " \n " + et_today.getText().toString();
            TextView tV_today = view.findViewById(R.id.tV_today);
            tV_today.setText(str);
        });
        return view;
    }
}