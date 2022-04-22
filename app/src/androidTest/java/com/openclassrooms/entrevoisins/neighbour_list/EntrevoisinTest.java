package com.openclassrooms.entrevoisins.neighbour_list;

import static androidx.test.espresso.Espresso.onView;
import static androidx.test.espresso.action.ViewActions.click;
import static androidx.test.espresso.assertion.ViewAssertions.matches;
import static androidx.test.espresso.matcher.ViewMatchers.withId;
import static androidx.test.espresso.matcher.ViewMatchers.withText;

import android.view.View;
import com.openclassrooms.entrevoisins.di.DI;
import com.openclassrooms.entrevoisins.model.Neighbour;
import com.openclassrooms.entrevoisins.ui.neighbour_list.MyNeighbourRecyclerViewAdapter;
import com.openclassrooms.entrevoisins.ui.neighbour_list.ViewNeighbourActivity;
import androidx.test.espresso.contrib.RecyclerViewActions;
import androidx.test.espresso.matcher.ViewMatchers;
import com.openclassrooms.entrevoisins.R;
import android.widget.TextView;

import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;



@RunWith(JUnit4.class)
public class EntrevoisinTest {
    /**
     * test instrumentalisé sur les
     * trois affichage
     */

    @Test
    public void  checkNeighbourWithSuccess()
    {


       onView(withId(R.id.nameLyt))
                .check(matches(withText(name.setText(userName)));

       onView(withId(R.id.nameLyt1))
               .check(matches(withText(name.setText(userName)));

       onView(withId(R.id.addressInput))
                .check(matches(withText(address1.setText(address)));

       onView(withId(R.id.phoneNumberLyt))
               .check(matches(withText(phone1.setText(numtel)));

       onView(withId(R.id.avatarUrlLyt))
                .check(matches(withText(mail.setText(addmail)));

       onView(withId(R.id.aboutMeLyt))
                .check(matches(withText(apropos.setText(aproposdemoi)))


    };

    @Test
    public void checkReturnButton()
    {
        onView(withId(R.id.ReturnButton)).perform(click());
    };

    @Test
    public  void checkEtoileButton()
    {
        onView(withId(R.id.button_etoile)).perform(click());
    };
};
