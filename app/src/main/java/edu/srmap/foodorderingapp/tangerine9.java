package edu.srmap.foodorderingapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.TextView;

public class tangerine9 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tangerine9);
    }
    int quantity=0;
    int quantity1=0;
    int quantity2=0;
    int quantity3=0;
    int quantity4=0;
    int quantity5=0;
    int quantity6=0;
    int quantity7=0;
    int quantity8=0;
    int quantity9=0;
    int quantity10=0;
    int quantity11=0;
    int quantity12=0;
    int quantity13=0;
    int Rice = 0;
    int cbiriyani = 0;
    int vrice = 0;
    int naan = 0;
    int roti = 0;
    int kulcha = 0;
    int bchicken = 0;
    int schicken = 0;
    int kadaichicken = 0;
    int mkofta = 0;
    int ppaneer = 0;
    int bpaneer = 0;
    int kpaneer = 0;
    int spaneer = 0;
    String order = "";
    int price = 0;
    public void increment(View view)
    {
        if(quantity==10)
        {
            quantity = 10;
        }
        else
        {
            quantity = quantity + 1;
        }
        TextView value= (TextView) findViewById(R.id.numtext);
        value.setText("" + quantity);
        Rice = Rice + 1;
    }
    public void decrement(View view)
    {
        if(quantity==0)
        {
            quantity = 0;
        }
        else
        {
            quantity = quantity - 1;
        }
        TextView value= (TextView) findViewById(R.id.numtext);
        value.setText("" + quantity);
        Rice = Rice - 1;
    }
    public void increment1(View view)
    {
        if(quantity1==10)
        {
            quantity1 = 10;
        }
        else
        {
            quantity1 = quantity1 + 1;
        }
        TextView value= (TextView) findViewById(R.id.num1text);
        value.setText("" + quantity1);
        cbiriyani = cbiriyani + 1;
    }
    public void decrement1(View view)
    {
        if(quantity1==0)
        {
            quantity1 = 0;
        }
        else
        {
            quantity1 = quantity1 - 1;
        }
        TextView value= (TextView) findViewById(R.id.num1text);
        value.setText("" + quantity1);
        cbiriyani = cbiriyani - 1;
    }
    public void increment2(View view)
    {
        if(quantity2==10)
        {
            quantity2 = 10;
        }
        else
        {
            quantity2 = quantity2 + 1;
        }
        TextView value= (TextView) findViewById(R.id.num2text);
        value.setText("" + quantity2);
        vrice = vrice + 1;
    }
    public void decrement2(View view)
    {
        if(quantity2==0)
        {
            quantity2 = 0;
        }
        else
        {
            quantity2 = quantity2 - 1;
        }
        TextView value= (TextView) findViewById(R.id.num2text);
        value.setText("" + quantity2);
        vrice = vrice - 1;
    }
    public void increment3(View view)
    {
        if(quantity3==10)
        {
            quantity3 = 10;
        }
        else
        {
            quantity3 = quantity3 + 1;
        }
        TextView value= (TextView) findViewById(R.id.num3text);
        value.setText("" + quantity3);
        naan = naan + 1;
    }
    public void decrement3(View view)
    {
        if(quantity3==0)
        {
            quantity3 = 0;
        }
        else
        {
            quantity3 = quantity3 - 1;
        }
        TextView value= (TextView) findViewById(R.id.num3text);
        value.setText("" + quantity3);
        naan = naan - 1;
    }
    public void increment4(View view)
    {
        if(quantity4==10)
        {
            quantity4 = 10;
        }
        else
        {
            quantity4 = quantity4 + 1;
        }
        TextView value= (TextView) findViewById(R.id.num4text);
        value.setText("" + quantity4);
        roti = roti + 1;
    }
    public void decrement4(View view)
    {
        if(quantity4==0)
        {
            quantity4 = 0;
        }
        else
        {
            quantity4 = quantity4 - 1;
        }
        TextView value= (TextView) findViewById(R.id.num4text);
        value.setText("" + quantity4);
        roti = roti - 1;
    }
    public void increment5(View view)
    {
        if(quantity5==10)
        {
            quantity5 = 10;
        }
        else
        {
            quantity5 = quantity5 + 1;
        }
        TextView value= (TextView) findViewById(R.id.num5text);
        value.setText("" + quantity5);
        kulcha = kulcha + 1;
    }
    public void decrement5(View view)
    {
        if(quantity5==0)
        {
            quantity5 = 0;
        }
        else
        {
            quantity5 = quantity5 - 1;
        }
        TextView value= (TextView) findViewById(R.id.num5text);
        value.setText("" + quantity5);
        kulcha = kulcha - 1;
    }
    public void increment6(View view)
    {
        if(quantity6==10)
        {
            quantity6 = 10;
        }
        else
        {
            quantity6 = quantity6 + 1;
        }
        TextView value= (TextView) findViewById(R.id.num6text);
        value.setText("" + quantity6);
        bchicken = bchicken + 1;
    }
    public void decrement6(View view)
    {
        if(quantity6==0)
        {
            quantity6 = 0;
        }
        else
        {
            quantity6 = quantity6 - 1;
        }
        TextView value= (TextView) findViewById(R.id.num6text);
        value.setText("" + quantity6);
        bchicken = bchicken - 1;
    }
    public void increment7(View view)
    {
        if(quantity7==10)
        {
            quantity7 = 10;
        }
        else
        {
            quantity7 = quantity7 + 1;
        }
        TextView value= (TextView) findViewById(R.id.num7text);
        value.setText("" + quantity7);
        schicken = schicken + 1;
    }
    public void decrement7(View view)
    {
        if(quantity7==0)
        {
            quantity7 = 0;
        }
        else
        {
            quantity7 = quantity7 - 1;
        }
        TextView value= (TextView) findViewById(R.id.num7text);
        value.setText("" + quantity7);
        schicken = schicken - 1;
    }
    public void increment8(View view)
    {
        if(quantity8==10)
        {
            quantity8 = 10;
        }
        else
        {
            quantity8 = quantity8 + 1;
        }
        TextView value= (TextView) findViewById(R.id.num8text);
        value.setText("" + quantity8);
        kadaichicken = kadaichicken + 1;
    }
    public void decrement8(View view)
    {
        if(quantity8==0)
        {
            quantity8 = 0;
        }
        else
        {
            quantity8 = quantity8 - 1;
        }
        TextView value= (TextView) findViewById(R.id.num8text);
        value.setText("" + quantity8);
        kadaichicken = kadaichicken - 1;
    }
    public void increment9(View view)
    {
        if(quantity9==10)
        {
            quantity9 = 10;
        }
        else
        {
            quantity9 = quantity9 + 1;
        }
        TextView value= (TextView) findViewById(R.id.num9text);
        value.setText("" + quantity9);
        mkofta = mkofta + 1;
    }
    public void decrement9(View view)
    {
        if(quantity9==0)
        {
            quantity9 = 0;
        }
        else
        {
            quantity9 = quantity9 - 1;
        }
        TextView value= (TextView) findViewById(R.id.num9text);
        value.setText("" + quantity9);
        mkofta = mkofta - 1;
    }
    public void increment10(View view)
    {
        if(quantity10==10)
        {
            quantity10 = 10;
        }
        else
        {
            quantity10 = quantity10 + 1;
        }
        TextView value= (TextView) findViewById(R.id.num10text);
        value.setText("" + quantity10);
        bpaneer = bpaneer + 1;
    }
    public void decrement10(View view)
    {
        if(quantity10==0)
        {
            quantity10 = 0;
        }
        else
        {
            quantity10 = quantity10 - 1;
        }
        TextView value= (TextView) findViewById(R.id.num10text);
        value.setText("" + quantity10);
        bpaneer = bpaneer - 1;
    }
    public void increment11(View view)
    {
        if(quantity11==10)
        {
            quantity11 = 10;
        }
        else
        {
            quantity11 = quantity11 + 1;
        }
        TextView value= (TextView) findViewById(R.id.num11text);
        value.setText("" + quantity11);
        ppaneer = ppaneer + 1;
    }
    public void decrement11(View view)
    {
        if(quantity11==0)
        {
            quantity11 = 0;
        }
        else
        {
            quantity11 = quantity11 - 1;
        }
        TextView value= (TextView) findViewById(R.id.num11text);
        value.setText("" + quantity11);
        ppaneer = ppaneer - 1;
    }
    public void increment12(View view)
    {
        if(quantity12==10)
        {
            quantity12 = 10;
        }
        else
        {
            quantity12 = quantity12 + 1;
        }
        TextView value= (TextView) findViewById(R.id.num12text);
        value.setText("" + quantity12);
        kpaneer = kpaneer + 1;
    }
    public void decrement12(View view)
    {
        if(quantity12==0)
        {
            quantity12 = 0;
        }
        else
        {
            quantity12 = quantity12 - 1;
        }
        TextView value= (TextView) findViewById(R.id.num12text);
        value.setText("" + quantity12);
        kpaneer = kpaneer - 1;
    }
    public void increment13(View view)
    {
        if(quantity13==10)
        {
            quantity13 = 10;
        }
        else
        {
            quantity13 = quantity13 + 1;
        }
        TextView value= (TextView) findViewById(R.id.num13text);
        value.setText("" + quantity13);
        spaneer = spaneer + 1;
    }
    public void decrement13(View view)
    {
        if(quantity13==0)
        {
            quantity13 = 0;
        }
        else
        {
            quantity13 = quantity13 - 1;
        }
        TextView value= (TextView) findViewById(R.id.num13text);
        value.setText("" + quantity13);
        spaneer = spaneer - 1;
    }

    public void order (View view)
    {
        CheckBox varname = (CheckBox) findViewById(R.id.RicecheckBox);
        boolean value = varname.isChecked();
        if(value == true)
        {
            order = order + "Rice\t(Quantity)\t" + Rice;
            price = price + Rice*50;
        }
        CheckBox varname1 = (CheckBox) findViewById(R.id.cbiriyanicheckBox);
        boolean value1 = varname1.isChecked();
        if(value1 == true)
        {
            order = order + "\nChicken Biriyani\t(Quantity)\t" + cbiriyani;
            price = price + cbiriyani*150;
        }
        CheckBox varname2 = (CheckBox) findViewById(R.id.vricecheckBox);
        boolean value2 = varname2.isChecked();
        if(value2 == true)
        {
            order = order + "\nVeg Fried Rice\t(Quantity)\t" + vrice;
            price = price + vrice*60;
        }
        CheckBox varname3 = (CheckBox) findViewById(R.id.naancheckBox);
        boolean value3 = varname3.isChecked();
        if(value3 == true)
        {
            order = order + "\nNaan\t(Quantity)\t" + naan;
            price = price + naan*30;
        }
        CheckBox varname4 = (CheckBox) findViewById(R.id.roticheckBox);
        boolean value4 = varname4.isChecked();
        if(value4 == true)
        {
            order = order + "\nRoti\t(Quantity)\t" + roti;
            price = price + roti*20;
        }
        CheckBox varname5 = (CheckBox) findViewById(R.id.kulchacheckBox);
        boolean value5 = varname5.isChecked();
        if(value5 == true)
        {
            order = order + "\nKulcha\t(Quantity)\t" + kulcha;
            price = price + kulcha*40;
        }
        CheckBox varname6 = (CheckBox) findViewById(R.id.bchickencheckBox);
        boolean value6 = varname6.isChecked();
        if(value6 == true)
        {
            order = order + "\nButter Chicken\t(Quantity)\t" + bchicken;
            price = price + bchicken*160;
        }
        CheckBox varname7 = (CheckBox) findViewById(R.id.schickencheckBox);
        boolean value7 = varname7.isChecked();
        if(value7 == true)
        {
            order = order + "\nSpicy Chicken Masala\t(Quantity)\t" + schicken;
            price = price + schicken*150;
        }
        CheckBox varname8 = (CheckBox) findViewById(R.id.kchickencheckBox);
        boolean value8 = varname8.isChecked();
        if(value8 == true)
        {
            order = order + "\nKadai Chicken\t(Quantity)\t" + kadaichicken;
            price = price + kadaichicken*170;
        }
        CheckBox varname9 = (CheckBox) findViewById(R.id.mkoftacheckBox);
        boolean value9 = varname9.isChecked();
        if(value9 == true)
        {
            order = order + "\nMutton Kofta\t(Quantity)\t" + mkofta;
            price = price + mkofta*200;
        }
        CheckBox varname10 = (CheckBox) findViewById(R.id.bpaneercheckBox);
        boolean value10 = varname10.isChecked();
        if(value10 == true)
        {
            order = order + "\nPaneer Butter Masala\t(Quantity)\t" + bpaneer;
            price = price + bpaneer*150;
        }
        CheckBox varname11 = (CheckBox) findViewById(R.id.ppaneercheckBox);
        boolean value11 = varname11.isChecked();
        if(value11 == true)
        {
            order = order + "\nPalak Paneer\t(Quantity)\t" + ppaneer;
            price = price + ppaneer*170;
        }
        CheckBox varname12 = (CheckBox) findViewById(R.id.kpaneercheckBox);
        boolean value12 = varname12.isChecked();
        if(value12 == true)
        {
            order = order + "\nKadai Paneer\t(Quantity)\t" + kpaneer;
            price = price + kpaneer*180;
        }
        CheckBox varname13 = (CheckBox) findViewById(R.id.spaneercheckBox);
        boolean value13 = varname13.isChecked();
        if(value13 == true)
        {
            order = order + "\nMutton Kofta\t(Quantity)\t" + spaneer;
            price = price + spaneer*180;
        };
        Intent i = new Intent(tangerine9.this,ordersummary.class);
        i.putExtra("ordersummary",order);
        i.putExtra("price",price);
        startActivity(i);
        finish();
    }


}