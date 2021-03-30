package com.example.registrationpage;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.registrationpage.databinding.ActivityDetailsBinding;

public class DetailsActivity extends AppCompatActivity {
    ActivityDetailsBinding detailsBinding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
     detailsBinding = DataBindingUtil.setContentView(this,R.layout.activity_details);
     detailsBinding.tvDetails.setVisibility(View.VISIBLE);
     Intent i=getIntent();
     String n=i.getStringExtra("myname");
     String p=i.getStringExtra("mypassword");
     String e=i.getStringExtra("myemail");
     String a=i.getStringExtra("myaddress");
     String g=i.getStringExtra("mygender");
     String m=i.getStringExtra("mymobile");
     String r=i.getStringExtra("myrating");
        detailsBinding.tvDetails.append("name:"+n+"\n"+"password:"+p+"\n"+"email:"+e+"\n"+"mobile:"+m+"\n"+"gender:"+g+"\n"+"address:"+a+"\n"+"rating is :"+r);
    }
}