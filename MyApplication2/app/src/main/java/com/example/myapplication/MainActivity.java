package com.example.myapplication;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.PersistableBundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    TextView text;
    int count;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        text=findViewById(R.id.hai);
        if(savedInstanceState=null&&
        {
            count=savedInstanceState!=
        }
    }
    public void showToast(View view)
    {
        Toast.makeText(this, "", Toast.LENGTH_SHORT).show();

    }
    public void showcount(View view)
    {
        count ++;
        text.setText(String.valueOf(count));
    }

    @Override
    protected void onRestoreInstanceState(@NonNull Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);


    }
}

}