package com.example.tour_guide;

import android.arch.lifecycle.ViewModelProvider;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class RestaurantActivity extends AppCompatActivity implements View.OnClickListener {

    private Button  parjotonButton,northButton,aharButton,grandButton,shahButton,cityButton;
    private Intent intent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_restaurant);

        parjotonButton = (Button) findViewById(R.id.parjotonButtonId);
        northButton = (Button) findViewById(R.id.northButtonId);
        shahButton = (Button) findViewById(R.id.shahButtonId);
        aharButton = (Button) findViewById(R.id.aharButtonId);
        grandButton = (Button) findViewById(R.id.grandButtonId);
        cityButton = (Button) findViewById(R.id.cityButtonId);

        parjotonButton.setOnClickListener(this);
        northButton.setOnClickListener(this);
        shahButton.setOnClickListener(this);
        aharButton.setOnClickListener(this);
        grandButton.setOnClickListener(this);
        cityButton.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {


        if(v.getId()==R.id.parjotonButtonId){
            intent = new Intent(RestaurantActivity.this,ShowDetails.class);

            intent.putExtra("name" ,"parjoton");
            startActivity(intent);
        }
        if(v.getId()==R.id.northButtonId){
            intent = new Intent(RestaurantActivity.this,ShowDetails.class);

            intent.putExtra("name" ,"north");
            startActivity(intent);
        }
        if(v.getId()==R.id.aharButtonId){
            intent = new Intent(RestaurantActivity.this,ShowDetails.class);

            intent.putExtra("name" ,"ahar");
            startActivity(intent);
        }
        if(v.getId()==R.id.grandButtonId){
            intent = new Intent(RestaurantActivity.this,ShowDetails.class);

            intent.putExtra("name" ,"grand");
            startActivity(intent);
        }
        if(v.getId()==R.id.shahButtonId){
            intent = new Intent(RestaurantActivity.this,ShowDetails.class);

            intent.putExtra("name" ,"shah");
            startActivity(intent);
        }
        if(v.getId()==R.id.cityButtonId){
            intent = new Intent(RestaurantActivity.this,ShowDetails.class);

            intent.putExtra("name" ,"city");
            startActivity(intent);
        }

    }
}
