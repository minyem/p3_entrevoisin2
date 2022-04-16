package com.openclassrooms.entrevoisins.service.neighbour_list;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.openclassrooms.entrevoisins.R;

import junit.framework.TestCase;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

@RunWith(value = JUnit4.class)
public class ViewNeighbourActivityTest<userName> extends TestCase {






    TextView name = findViewById(R.id.nameLyt);
    TextView name1 = findViewById(R.id.nameLyt1);
    ImageView img = findViewById(R.id.kb9);


        name.setText(userName);
        assertNotNull(name);

        name1.setText(userName);
        assertNotNull(name1);

        Glide.with(this).load(photo).into(img);
        assertNotNull(img);


}



}