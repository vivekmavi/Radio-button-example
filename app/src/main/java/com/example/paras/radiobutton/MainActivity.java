package com.example.paras.radiobutton;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.view.ContextThemeWrapper;
import android.view.View;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.RadioButton;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements CompoundButton.OnCheckedChangeListener{

    RadioButton radioButton1,radioButton2,radioButton3;
    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button = (Button) findViewById(R.id.btn_to_uncheck_all);

        radioButton1 = (RadioButton) findViewById(R.id.radio_btn1);
        radioButton2 = (RadioButton) findViewById(R.id.radio_btn2);
        radioButton3 = (RadioButton) findViewById(R.id.radio_btn3);

        button.setOnClickListener(new MyClassForOnClick(this));

        radioButton1.setOnCheckedChangeListener(this);
        radioButton2.setOnCheckedChangeListener(this);
        radioButton3.setOnCheckedChangeListener(this);
    }

    @Override
    public void onCheckedChanged(CompoundButton compoundButton, boolean isChecked)
    {
        if(isChecked)
        {
            if(compoundButton==radioButton1)
            {
                Toast.makeText(this," radio button 1 checked",Toast.LENGTH_SHORT).show();
            }
            if(compoundButton==radioButton2)
            {
                Toast.makeText(this," radio button 1 checked",Toast.LENGTH_SHORT).show();
            }
            if(compoundButton==radioButton3)
            {
                Toast.makeText(this," radio button 1 checked",Toast.LENGTH_SHORT).show();

                radioButton1.setChecked(false);
                radioButton2.setChecked(false);
                radioButton3.setChecked(false);

            }
        }

    }
}

class MyClassForOnClick implements View.OnClickListener
{   MainActivity mainActivityReference;

    MyClassForOnClick(Context c)
    {
        mainActivityReference = (MainActivity) c;

    }
    @Override
    public void onClick(View view) {
        if(view.getId()==R.id.btn_to_uncheck_all)
        {
            mainActivityReference.radioButton1.setChecked(false);
            mainActivityReference.radioButton2.setChecked(false);
            mainActivityReference.radioButton3.setChecked(false);
        }
    }
}