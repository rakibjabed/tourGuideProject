package com.example.tour_guide;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class ShowDetails extends AppCompatActivity {

    private ImageView imageView;
    private TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_show_details);

        imageView = (ImageView) findViewById(R.id.imageiewId);
        textView = (TextView) findViewById(R.id.textViewId);



        Bundle bundle = getIntent().getExtras();
        if(bundle!=null){
            String placeName = bundle.getString("name");
            Details(placeName);
        }






    }

    private void Details(String placeName) {

        if(placeName.equals("tajhat")){
            imageView.setImageResource(R.drawable.tajhat);
            textView.setText(R.string.tajhat_text);
        }
        if(placeName.equals("tista")){
            imageView.setImageResource(R.drawable.tista);
            textView.setText(R.string.tista_text);
        }
        if(placeName.equals("mohipur")){
            imageView.setImageResource(R.drawable.mohipur);
            textView.setText(R.string.mohipur_text);
        }
        if(placeName.equals("residence")){
            imageView.setImageResource(R.drawable.residencerokeya);
            textView.setText(R.string.residence_text);
        }
        if(placeName.equals("zoo")){
            imageView.setImageResource(R.drawable.zoo);
            textView.setText(R.string.zoo_text);
        }
        if(placeName.equals("proyas")){
            imageView.setImageResource(R.drawable.proyaspark);
            textView.setText(R.string.proyas_text);
        }
        if(placeName.equals("vinnya")){
            imageView.setImageResource(R.drawable.vinnojogot);
            textView.setText(R.string.vinnya_text);
        }

        if(placeName.equals("parjoton")){
            imageView.setImageResource(R.drawable.porjotonmotel);
            textView.setText(R.string.zoo_text);
        }
        if(placeName.equals("north")){
            imageView.setImageResource(R.drawable.northview);
            textView.setText(R.string.northview_text);
        }
        if(placeName.equals("ahar")){
            imageView.setImageResource(R.drawable.aharhotel);
            textView.setText(R.string.aharhotel_text);
        }
        if(placeName.equals("grand")){
            imageView.setImageResource(R.drawable.grandpalace);
            textView.setText(R.string.grandpalace_text);
        }
        if(placeName.equals("shah")){
            imageView.setImageResource(R.drawable.shahamanot);
            textView.setText(R.string.shahamanat_text);
        }
        if(placeName.equals("city")){
            imageView.setImageResource(R.drawable.cityview);
            textView.setText(R.string.cityview_text);
        }

    }
}
