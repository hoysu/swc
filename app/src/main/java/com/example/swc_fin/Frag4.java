package com.example.swc_fin;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import java.util.ArrayList;
import java.util.List;

public class Frag4 extends Fragment {

    View view;
    ListView list_item;
    Button btn_move1;
    Button btn_move2;
    Button btn_move3;
    Button btn_move4;
    Button btn_move5;
    TextView disease;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.frag4, container, false);

        list_item = view.findViewById(R.id.list_item);
        btn_move1 = view.findViewById(R.id.btn_move1);
        btn_move2 = view.findViewById(R.id.btn_move2);
        btn_move3 = view.findViewById(R.id.btn_move3);
        btn_move4 = view.findViewById(R.id.btn_move4);
        btn_move5 = view.findViewById(R.id.btn_move5);
        disease = view.findViewById(R.id.disease);
        List<String> data = new ArrayList<>();

        ArrayAdapter<String> adapter = new ArrayAdapter<>(getContext(), android.R.layout.simple_list_item_1,data);
        list_item.setAdapter(adapter);

        data.add("본태성 고혈압");
        data.add("치주질환");
        data.add("급성기관지염");
        data.add("등통증");
        data.add("2형당뇨병");

        btn_move1.setOnClickListener(v -> {
            Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://terms.naver.com/entry.naver?docId=926908&cid=51007&categoryId=51007"));
            startActivity(intent);
        });

        btn_move2.setOnClickListener(v -> {
            Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://terms.naver.com/entry.naver?docId=926978&cid=51007&categoryId=51007"));
            startActivity(intent);
        });

        btn_move3.setOnClickListener(v -> {
            Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://terms.naver.com/entry.naver?docId=6226090&cid=51007&categoryId=51007"));
            startActivity(intent);
        });

        btn_move4.setOnClickListener(v -> {
            Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://m.terms.naver.com/entry.naver?docId=6226065&cid=51007&categoryId=51007"));
            startActivity(intent);
        });

        btn_move5.setOnClickListener(v -> {
            Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://m.terms.naver.com/entry.naver?docId=2841313&cid=56739&categoryId=56739"));
            startActivity(intent);
        });

        disease.setOnClickListener(v -> {
            Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://health.kdca.go.kr/healthinfo/biz/health/main/mainPage/main.do"));
            startActivity(intent);
        });

        return view;
    }
}
