package com.openclassrooms.entrevoisins.ui.neighbour_list;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentActivity;

import com.bumptech.glide.Glide;
import com.openclassrooms.entrevoisins.R;
import com.openclassrooms.entrevoisins.di.DI;
import com.openclassrooms.entrevoisins.model.Neighbour;
import com.openclassrooms.entrevoisins.service.NeighbourApiService;

import butterknife.ButterKnife;
import butterknife.Unbinder;



public class ViewNeighbourActivity extends FragmentActivity {

    private NeighbourApiService mApiService;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.viewneighbouractivity);
        mApiService = DI.getNeighbourApiService();

        Intent bundle= getIntent();
        int id=bundle.getIntExtra("id",0);
        String userName=bundle.getStringExtra("username");
        String photo=bundle.getStringExtra("photo");
        String address=bundle.getStringExtra("addresse");
        String numtel=bundle.getStringExtra("phonenumber");
        String addmail=bundle.getStringExtra("addressemail");
        String aproposdemoi=bundle.getStringExtra("aboutme");


        TextView name = findViewById(R.id.nameLyt);
        TextView name1 = findViewById(R.id.nameLyt1);
        TextView address1 = findViewById(R.id.addressInput);
        TextView phone1 = findViewById(R.id.phoneNumberLyt);
        TextView mail = findViewById(R.id.avatarUrlLyt);
        TextView apropos = findViewById(R.id.aboutMeLyt);


        ImageView   img = findViewById(R.id.kb9);
        Glide.with(this).load(photo).into(img);

        name.setText(userName);
        name1.setText(userName);
        address1.setText(address);
        phone1.setText(numtel);
        mail.setText(addmail);
        apropos.setText(aproposdemoi);

        findViewById(R.id.ReturnButton).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });

        findViewById(R.id.button_etoile).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Neighbour favoriteNeighbour = new  Neighbour(id,userName,photo,address,numtel,addmail, aproposdemoi);
                // public Neighbour(long id, String name, String avatarUrl, String address,
                //                     String phoneNumber, String addEmail, String aboutMe)
                mApiService.createNeighbour(favoriteNeighbour);
                finish();
            }
        });



    }

}