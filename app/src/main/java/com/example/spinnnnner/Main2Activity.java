package com.example.spinnnnner;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Spinner;
import android.widget.Toast;

import java.util.ArrayList;

public class Main2Activity extends AppCompatActivity {
private ArrayList<CountryItem>mCountryList;
    private CountryAdapter mAdapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        initList();
        Spinner SpinnerCountries=findViewById(R.id.spinner_countries);
        mAdapter=new CountryAdapter(this,mCountryList);
        SpinnerCountries.setAdapter(mAdapter);
        SpinnerCountries.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                CountryItem clickedItem = (CountryItem) adapterView.getItemAtPosition(i);
                String clickedCountryName = clickedItem.getCountryName();
                Toast.makeText(Main2Activity.this, clickedCountryName + " selected", Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });
    }
    private void initList(){
        mCountryList = new ArrayList<>();
        mCountryList.add(new CountryItem("egypt",R.drawable.egypt));
        mCountryList.add(new CountryItem("China",R.drawable.chi));
        mCountryList.add(new CountryItem("USA",R.drawable.aa));
    }
}
