package com.example.swc_fin;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Button;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public class Frag2 extends Fragment {

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.frag2, container, false);

        Button gamebt1 = (Button) view.findViewById(R.id.gamebt1);
        gamebt1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.youtube.com/watch?v=jj0RQjUHD1c&t=1s"));
                startActivity(intent);
            }
        });

        Button gamebt2 = (Button) view.findViewById(R.id.gamebt2);
        gamebt2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.youtube.com/watch?v=qfGJspwxaeo&t=38s"));
                startActivity(intent);
            }
        });

        Button gamebt3 = (Button) view.findViewById(R.id.gamebt3);
        gamebt3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.youtube.com/watch?v=eit-mGS1EgU&t=1s"));
                startActivity(intent);
            }
        });

        Button gamebt4 = (Button) view.findViewById(R.id.gamebt4);
        gamebt4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.youtube.com/watch?v=SDqD3jOBSkQ"));
                startActivity(intent);
            }
        });

        Button gamebt5 = (Button) view.findViewById(R.id.gamebt5);
        gamebt5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.youtube.com/watch?v=7wjv7kjfm3s&list=PLhBBx7Sv0kF0yHVP20gsCWjm6Mxq5Uitw"));
                startActivity(intent);
            }
        });

        Button gamebt6 = (Button) view.findViewById(R.id.gamebt6);
        gamebt6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.youtube.com/watch?v=-GzKyytgI60&list=PLhBBx7Sv0kF3Lz61pOV1tbZH1iPo3CkwG"));
                startActivity(intent);
            }
        });

        Button gamebt7 = (Button) view.findViewById(R.id.gamebt7);
        gamebt7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.youtube.com/watch?v=gsbe1jobm8s&list=PLhBBx7Sv0kF1ZsbMXiYctDumH8FZAkr8K"));
                startActivity(intent);
            }
        });

        Button healthbt1 = (Button) view.findViewById(R.id.healthbt1);
        healthbt1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://youtu.be/wP5rGmrTyjg"));
                startActivity(intent);
            }
        });

        Button videobt1 = (Button) view.findViewById(R.id.videobt1);
        videobt1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.youtube.com/watch?v=enD8zJRw8J0"));
                startActivity(intent);
            }
        });

        Button videobt2 = (Button) view.findViewById(R.id.videobt2);
        videobt2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.youtube.com/watch?v=pL_O4uWj0eg"));
                startActivity(intent);
            }
        });

        Button videobt3 = (Button) view.findViewById(R.id.videobt3);
        videobt3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.youtube.com/watch?v=gL4EAcEhEAU"));
                startActivity(intent);
            }
        });
        return view;
    }
}
