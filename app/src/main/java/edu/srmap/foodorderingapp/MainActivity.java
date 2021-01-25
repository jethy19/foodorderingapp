package edu.srmap.foodorderingapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ImageButton image = (ImageButton)findViewById(R.id.mainlandimage);
        image.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent menu = new Intent(MainActivity.this, mainlandchina.class);
                startActivity(menu);
            }
        });
        ImageButton image1 = (ImageButton)findViewById(R.id.tagerine9image);
        image1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent menu = new Intent(MainActivity.this, tangerine9.class);
                startActivity(menu);
            }
        });
        ImageButton image2 = (ImageButton)findViewById(R.id.thetreatimage);
        image2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent menu = new Intent(MainActivity.this, thetreat.class);
                startActivity(menu);
            }
        });
        ImageButton image3 = (ImageButton)findViewById(R.id.mauryagardenimage);
        image3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent menu = new Intent(MainActivity.this, mauryagarden.class);
                startActivity(menu);
            }
        });
        ImageButton image4 = (ImageButton)findViewById(R.id.goldenbirdimage);
        image4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent menu = new Intent(MainActivity.this, goldenbird.class);
                startActivity(menu);
            }
        });
    }
    public void mainlandchina(View view)
    {
        Intent menu = new Intent(this,mainlandchina.class);
        startActivity(menu);
    }
    public void tangerine9(View view)
    {
        Intent menu = new Intent(this,tangerine9.class);
        startActivity(menu);
    }
    public void thetreat(View view)
    {
        Intent menu = new Intent(this,thetreat.class);
        startActivity(menu);
    }
    public void mauryagarden(View view)
    {
        Intent menu = new Intent(this,mauryagarden.class);
        startActivity(menu);
    }
    public void goldenbird(View view)
    {
        Intent menu = new Intent(this,goldenbird.class);
        startActivity(menu);
    }
}