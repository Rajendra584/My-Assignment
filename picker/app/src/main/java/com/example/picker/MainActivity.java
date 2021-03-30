package com.example.picker;

import androidx.appcompat.app.AppCompatActivity;

import android.app.DatePickerDialog;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.util.Calendar;

public class MainActivity extends AppCompatActivity {
    int day,month,year;
    TextView tv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tv=findViewById(R.id.textView2);
    }
    @Override
    public boolean onCreateMenu(Menu )

    public void showdata(View view)
    {
        Calendar c=Calendar.getInstance();
        day=c.get(Calendar.DATE);
        month=c.get(Calendar.MONTH);
        year=c.get(Calendar.YEAR);
        DatePickerDialog dp =DatePickerDialog(this,c
        }
    }
}