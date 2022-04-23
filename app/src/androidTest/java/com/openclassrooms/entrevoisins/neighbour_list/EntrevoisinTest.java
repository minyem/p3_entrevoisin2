package com.openclassrooms.entrevoisins.neighbour_list;

import static androidx.test.espresso.Espresso.onData;
import static androidx.test.espresso.Espresso.onView;
import static androidx.test.espresso.action.ViewActions.click;
import static androidx.test.espresso.assertion.ViewAssertions.matches;
import static androidx.test.espresso.intent.Intents.intended;
import static androidx.test.espresso.intent.matcher.IntentMatchers.hasComponent;
import static androidx.test.espresso.matcher.ViewMatchers.withId;
import static androidx.test.espresso.matcher.ViewMatchers.withText;

import static com.openclassrooms.entrevoisins.utils.RecyclerViewItemCountAssertion.withItemCount;
import static org.hamcrest.CoreMatchers.notNullValue;
import static org.hamcrest.Matchers.anything;
import static org.hamcrest.Matchers.not;
import static org.junit.Assert.assertThat;

import android.view.View;
import com.openclassrooms.entrevoisins.di.DI;
import com.openclassrooms.entrevoisins.model.Neighbour;
import com.openclassrooms.entrevoisins.ui.neighbour_list.ListNeighbourActivity;
import com.openclassrooms.entrevoisins.ui.neighbour_list.MyNeighbourRecyclerViewAdapter;
import com.openclassrooms.entrevoisins.ui.neighbour_list.ViewNeighbourActivity;

import androidx.test.espresso.ViewAction;
import androidx.test.espresso.ViewAssertion;
import androidx.test.espresso.contrib.RecyclerViewActions;
import androidx.test.espresso.intent.rule.IntentsTestRule;
import androidx.test.espresso.matcher.ViewMatchers;
import com.openclassrooms.entrevoisins.R;
import com.openclassrooms.entrevoisins.utils.DeleteViewAction;

import android.widget.TextView;

import org.junit.Before;
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
    private static int ITEMS_COUNT = 12;
    private ListNeighbourActivity mActivity;
    @Rule
    public IntentsTestRule<ListNeighbourActivity> mActivityRule = new IntentsTestRule<>(ListNeighbourActivity.class);
    @Before
    public void setup() {
        mActivity = mActivityRule.getActivity();
        assertThat(mActivity, notNullValue());
    }
    @Test
    public void checkNewActivity(){
        onData(anything()).atPosition(0)
                .perform(click());

        intended(hasComponent(ViewNeighbourActivity.class.getName()));
        onView(withId(R.id.nameLyt)).check(matches(not(withText(""))));

        onView(ViewMatchers.withId(R.id.list_neighbours))
                .check((ViewAssertion) withItemCount(ITEMS_COUNT));
        // When perform a click on a delete icon
        onView(ViewMatchers.withId(R.id.list_neighbours))
                .perform(RecyclerViewActions
                        .actionOnItemAtPosition(1, (ViewAction) new DeleteViewAction()));
        // Then : the number of element is 11
        onView(ViewMatchers.withId(R.id.list_neighbours))
                .check((ViewAssertion) withItemCount(ITEMS_COUNT-1));
    }




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
