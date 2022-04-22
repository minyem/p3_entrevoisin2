package com.openclassrooms.entrevoisins.utils;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

import androidx.recyclerview.widget.RecyclerView;

import com.openclassrooms.entrevoisins.R;
import com.openclassrooms.entrevoisins.model.Neighbour;
import com.openclassrooms.entrevoisins.ui.neighbour_list.ViewNeighbourActivity;

import org.junit.Before;
import org.junit.Test;

import java.util.List;

import butterknife.BindView;

public class ViewNeighbourtest {
    ViewNeighbourActivity view;
    private List<Neighbour> mNeighbours;
    final RecyclerView.ViewHolder holder;
    public ViewNeighbourtest(List<Neighbour> mNeighbours, RecyclerView.ViewHolder holder) {
        this.mNeighbours = mNeighbours;
        this.holder = holder;
    }
    Intent i = new Intent(new holder.mainContent.getContext(), ViewNeighbourActivity.class);

    @BindView(R.id.main_content)
    public LinearLayout mainContent;

    @Before
    public void MyNeighbourRecyclerViewAdapter(List<Neighbour> items) {
        mNeighbours = items;
    }

    @Test
           public void  getNeighbourWithSuccess()
    {
        protected void onCreate(Bundle savedInstanceState);

    };

    @Test
            public void verifieValeurConforme()
    {
        findViewById(R.id.ReturnButton).setOnClickListener(new View.OnClickListener());
    };

    @Test
    public  void verifieValeur()
    {
        findViewById(R.id.button_etoile).setOnClickListener(new View.OnClickListener());
    };

}
