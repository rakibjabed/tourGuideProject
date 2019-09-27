package com.example.tour_guide;

import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    private Button historicalButton,restaurantButton;
     private Intent intent;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        historicalButton = (Button) findViewById(R.id.historicalButtonId);
        restaurantButton =  findViewById(R.id.restaurantButtonId);

        historicalButton.setOnClickListener(this);
        restaurantButton.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {

        if(v.getId()== R.id.historicalButtonId){

            intent = new Intent(MainActivity.this,ProfileActivity.class);
            intent.putExtra("name", "historical");
                    startActivity(intent);

        }
        if(v.getId()== R.id.restaurantButtonId){

            intent = new Intent(MainActivity.this,RestaurantActivity.class);
            intent.putExtra("name", "restaurant");
            startActivity(intent);

        }



    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();

        AlertDialog.Builder alertDialogBuilder;

        alertDialogBuilder = new AlertDialog.Builder(MainActivity.this);


        alertDialogBuilder.setIcon(R.drawable.question);
        alertDialogBuilder.setTitle(R.string.title_text);
        alertDialogBuilder.setMessage(R.string.message_text);
        alertDialogBuilder.setCancelable(false);

        alertDialogBuilder.setPositiveButton("Yes", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {

                finish();



            }
        });
        alertDialogBuilder.setNegativeButton("No", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {

                dialog.cancel();



            }
        });

         AlertDialog alertDialog = alertDialogBuilder.create();
         alertDialog.show();

    }
}
