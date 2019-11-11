package com.example.spinnerwidget;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;
import android.widget.Adapter;
import android.widget.ArrayAdapter;
import android.widget.Spinner;


import com.google.android.material.tabs.TabLayout;
import androidx.fragment.app.FragmentManager;

import Adapter.ViewPageAdapter;
import Details.FamilyMember;
import Details.HouseDetails;
import Details.PersonalDetails;


public class MainActivity extends AppCompatActivity {
    private ViewPager viewPager;
    private TabLayout tabLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate (savedInstanceState);
        setContentView (R.layout.activity_main);

//        Spinner spinner=(Spinner)findViewById (R.id.religious);
//        String[] List= getResources ().getStringArray (R.array.religion);
//        ArrayAdapter<String> adapter=new ArrayAdapter<String> (this,R.layout.fragment_personal_details,R.id.tvreligious.list);
//        spinner.setAdapter(adapter);


       tabLayout =findViewById (R.id.tabId);
       viewPager = findViewById (R.id.ViewPager);

      ViewPageAdapter adapter = new ViewPageAdapter (getSupportFragmentManager ());


        adapter.addFragment (new PersonalDetails (),"Personal Details");
        adapter.addFragment (new HouseDetails (),"House Details");
        adapter.addFragment (new FamilyMember (),"Family Member");

        viewPager.setAdapter (adapter);
        tabLayout.setupWithViewPager (viewPager);



    }
}
