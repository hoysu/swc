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

public class Frag3 extends Fragment {

    //private View view;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.frag3, container, false);

        EditText name = view.findViewById(R.id.name);
        EditText content = view.findViewById(R.id.content);
        TextView name_textview = view.findViewById(R.id.name_textview);
        TextView content_textview = view.findViewById(R.id.content_textview);
        Button btn_edit = view.findViewById(R.id.btn_edit);
        btn_edit.setOnClickListener(v -> {
            String str_name = name.getText().toString();
            name_textview.setText("작성자:" +str_name);
            String str_content = content.getText().toString();
            content_textview.setText(str_content);

        });
        return view;
    }
}