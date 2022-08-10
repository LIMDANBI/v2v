package com.skt.v2v;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.graphics.Bitmap;
import android.widget.ImageView;


public class MainActivity extends AppCompatActivity {

    ImageButton style1, style2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        style1 = (ImageButton) findViewById(R.id.style1);
        style2 = (ImageButton) findViewById(R.id.style2);

        style1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), EgonActivity.class);
                startActivity(intent);
            }
        });

        style2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), GoghActivity.class);
                startActivity(intent);
            }
        });
    }
}