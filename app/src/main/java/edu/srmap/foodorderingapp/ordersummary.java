package edu.srmap.foodorderingapp;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;

public class ordersummary extends AppCompatActivity {
    String emailvalue;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ordersummary);
        String totalOrder = getIntent().getStringExtra("ordersummary");
        int totalprice = getIntent().getIntExtra("price",0);

        TextView value = (TextView) findViewById(R.id.summary);
        value.setText(totalOrder);
        String message = "TotalPrice : " + totalprice;
        TextView value1 = (TextView) findViewById(R.id.price);
        value1.setText(message);
        emailvalue = totalOrder + "\n\n" + message;
        Button image1 = (Button)findViewById(R.id.emailbutton);
        image1.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("QueryPermissionsNeeded")
            @Override
            public void onClick(View v) {
                if (totalOrder.equals("") || totalprice == 0 ) {
                    Toast.makeText(ordersummary.this, "Please go back and Order Something or fill the name field", Toast.LENGTH_SHORT).show();
                }
                else {
                    EditText nametext = (EditText) findViewById(R.id.nameText);
                    String word1 = nametext.getText().toString();
                    EditText adtext = (EditText) findViewById(R.id.AddressText);
                    String word2 = adtext.getText().toString();
                    emailvalue = emailvalue + "\n" + word1 + "\n" + word2 + "\n" ;
                    Intent intent = new Intent(Intent.ACTION_SENDTO);
                    intent.setData(Uri.parse("mailto:"));
                    intent.putExtra(Intent.EXTRA_EMAIL, new String[]{"jayesh_jethy@srmap.edu.in"});
                    intent.putExtra(Intent.EXTRA_SUBJECT, "Food Order Confirmation");
                    intent.putExtra(Intent.EXTRA_TEXT, emailvalue);
                    if (intent.resolveActivity(getPackageManager()) != null) {
                        startActivity(intent);
                    }
                    else
                    {
                        Toast.makeText(ordersummary.this, "Plese install Mail App to confirm the order", Toast.LENGTH_SHORT).show();
                    }
                }
            }
        });
    }

}