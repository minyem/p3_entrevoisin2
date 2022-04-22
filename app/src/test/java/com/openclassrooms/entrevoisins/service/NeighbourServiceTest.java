package com.openclassrooms.entrevoisins.service;

import com.bumptech.glide.Glide;
import com.openclassrooms.entrevoisins.di.DI;
import com.openclassrooms.entrevoisins.model.Neighbour;
import com.openclassrooms.entrevoisins.ui.neighbour_list.MyNeighbourRecyclerViewAdapter;
import com.openclassrooms.entrevoisins.ui.neighbour_list.ViewNeighbourActivity;

import org.hamcrest.collection.IsIterableContainingInAnyOrder;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import android.content.Intent;


import java.util.List;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertThat;

import android.content.Intent;
import android.widget.TextView;

/**
 * Unit test on Neighbour
 */
@RunWith(JUnit4.class)
public class NeighbourServiceTest {

    private NeighbourApiService service;

    @Before
    public void setup() {
        service = DI.getNewInstanceApiService();
    }

    @Test
    public void getNeighboursWithSuccess() {
        List<Neighbour> neighbours = service.getNeighbours();
        List<Neighbour> expectedNeighbours = DummyNeighbourGenerator.DUMMY_NEIGHBOURS;
        assertThat(neighbours, IsIterableContainingInAnyOrder.containsInAnyOrder(expectedNeighbours.toArray()));
    }

    @Test
    public void deleteNeighbourWithSuccess() {
        Neighbour neighbourToDelete = service.getNeighbours().get(0);
        service.deleteNeighbour(neighbourToDelete);
        assertFalse(service.getNeighbours().contains(neighbourToDelete));
    }

    @Test
    public void transmettreWithSuccess() {
        MyNeighbourRecyclerViewAdapter.ViewHolder holder;
        Intent i = new Intent(holder.mainContent.getContext(), ViewNeighbourActivity.class);
        holder.mainContent.getContext().startActivity(i);
        assert (holder.mainContent.getContext().startActivity(i),notifyAll());
    }

    @Test
    public void affichageWithSuccess(){
        Intent bundle= getIntent();
        String userName=bundle.getStringExtra("username");

        TextView name.setText(userName);
        assertNotNull(name.setText(userName));

        TextView name1.setText(userName);
        assertNotNull(name.setText(userName));

        String photo=bundle.getStringExtra("photo");
        assertNotNull(bundle.getStringExtra("photo"));
    }


}
