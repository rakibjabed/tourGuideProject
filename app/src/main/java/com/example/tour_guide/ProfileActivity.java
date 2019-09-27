package com.example.tour_guide;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ProfileActivity extends AppCompatActivity implements View.OnClickListener {

    private Button tajhatButton,tistaButton,mohipurButton,residenceButton,zooButton,proyasButton,vinnyaButton;
    private Intent intent;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);


        tajhatButton = (Button) findViewById(R.id.tajhatButtonId);
        tistaButton = (Button) findViewById(R.id.tistaButtonId);
        mohipurButton = (Button) findViewById(R.id.mohipurButtonId);
        residenceButton = (Button) findViewById(R.id.residenceButtonId);
        zooButton = (Button) findViewById(R.id.zooButtonId);
        proyasButton = (Button) findViewById(R.id.proyasButtonId);
        vinnyaButton = (Button) findViewById(R.id.vinnyaButtonId);



        tajhatButton.setOnClickListener(this);
        tistaButton.setOnClickListener(this);
        mohipurButton.setOnClickListener(this);
        residenceButton.setOnClickListener(this);
        zooButton.setOnClickListener(this);
        proyasButton.setOnClickListener(this);
        vinnyaButton.setOnClickListener(this);




    }

    @Override
    public void onClick(View v) {

        if(v.getId()==R.id.tajhatButtonId){

            intent = new Intent(ProfileActivity.this,ShowDetails.class);

                    intent.putExtra("name" ,"tajhat");
            startActivity(intent);
        }
        if(v.getId()==R.id.tistaButtonId){

            intent = new Intent(ProfileActivity.this,ShowDetails.class);

            intent.putExtra("name" ,"tista");
            startActivity(intent);
        }

        if(v.getId()==R.id.mohipurButtonId){

            intent = new Intent(ProfileActivity.this,ShowDetails.class);

            intent.putExtra("name" ,"mohipur");
            startActivity(intent);
        }


        if(v.getId()==R.id.residenceButtonId){

            intent = new Intent(ProfileActivity.this,ShowDetails.class);

            intent.putExtra("name" ,"residence");
            startActivity(intent);
        }

        if(v.getId()==R.id.zooButtonId){

            intent = new Intent(ProfileActivity.this,ShowDetails.class);

            intent.putExtra("name" ,"zoo");
            startActivity(intent);
        }

        if(v.getId()==R.id.proyasButtonId){

            intent = new Intent(ProfileActivity.this,ShowDetails.class);

            intent.putExtra("name" ,"proyas");
            startActivity(intent);
        }

        if(v.getId()==R.id.vinnyaButtonId){

            intent = new Intent(ProfileActivity.this,ShowDetails.class);

            intent.putExtra("name" ,"vinnya");
            startActivity(intent);
        }

    }
}
