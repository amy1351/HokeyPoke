package com.garfieldcs.database;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import com.garfieldcs.pokefinder.R;

public class FilterActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_filter);

        Button btnFilters = (Button) findViewById(R.id.button2);
        btnFilters.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Log.d("onClick", "Button is Clicked");
                Intent intent = new Intent(FilterActivity.this, MapsActivity.class);
                startActivity(intent);
            }
        });
    }
}
