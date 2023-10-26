package com.example.myapplicationmaml;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class ActivityTiga extends Activity {
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_tiga);

        TextView tv4 = findViewById(R.id.textView4);
        Button bt10 = findViewById(R.id.button10);
        Button bt11 = findViewById(R.id.button11);
        Button bt12 = findViewById(R.id.button12);
        bt10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent iPindah1 = new Intent(ActivityTiga.this, ActivitySatu.class);
                startActivity(iPindah1);
            }
        });

        bt11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent iPindah2 = new Intent(ActivityTiga.this, ActivityDua.class);
                startActivity(iPindah2);
            }
        });

        bt12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                moveTaskToBack(true);
            }
        });
    }
}
