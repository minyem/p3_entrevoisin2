package com.openclassrooms.entrevoisins.neighbour_list;

import static androidx.test.espresso.Espresso.onView;
import static androidx.test.espresso.action.ViewActions.click;
import static androidx.test.espresso.assertion.ViewAssertions.matches;
import static androidx.test.espresso.intent.Intents.intended;
import static androidx.test.espresso.intent.matcher.IntentMatchers.hasComponent;
import static androidx.test.espresso.matcher.ViewMatchers.isDisplayed;
import static androidx.test.espresso.matcher.ViewMatchers.withId;
import static androidx.test.espresso.matcher.ViewMatchers.withText;
import static com.openclassrooms.entrevoisins.utils.RecyclerViewItemCountAssertion.withItemCount;
import static org.hamcrest.CoreMatchers.not;
import static org.hamcrest.CoreMatchers.notNullValue;

import androidx.test.espresso.contrib.RecyclerViewActions;
import androidx.test.espresso.intent.Intents;
import androidx.test.espresso.matcher.ViewMatchers;
import androidx.test.rule.ActivityTestRule;

import com.openclassrooms.entrevoisins.R;
import com.openclassrooms.entrevoisins.ui.neighbour_list.ListNeighbourActivity;
import com.openclassrooms.entrevoisins.ui.neighbour_list.ViewNeighbourActivity;
import com.openclassrooms.entrevoisins.utils.DeleteViewAction;

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
    public ActivityTestRule<ListNeighbourActivity> mActivityRule =
            new ActivityTestRule(ListNeighbourActivity.class);

    @Before
    public void setUp() {
        Intents.init();
        mActivity = mActivityRule.getActivity();
        ViewMatchers.assertThat(mActivity, notNullValue());
    }

    @Test
    public void checkTests(){

        //test vérifiant que lorsqu’on clique sur un élément de la liste, l’écran de
        //détails est bien lancé ;

        onView(withId(R.id.list_neighbours)).perform(
                RecyclerViewActions.actionOnItemAtPosition(0,click()));

        intended(hasComponent(ViewNeighbourActivity.class.getName()));
        //test vérifiant qu’au démarrage de ce nouvel écran, le TextView indiquant
        //le nom de l’utilisateur en question est bien rempli ;
        onView(withId(R.id.nameLyt)).check(matches(not(withText(""))));

// TEST DE SUPPRESSION D'UN ELEMENT

        onView(ViewMatchers.withId(R.id.list_neighbours)).check(withItemCount(ITEMS_COUNT));

        onView(ViewMatchers.withId(R.id.list_neighbours))
                .perform(RecyclerViewActions.actionOnItemAtPosition(1, new DeleteViewAction()));

        onView(ViewMatchers.withId(R.id.list_neighbours)).check(withItemCount(ITEMS_COUNT-1));

        // TEST DE VOISIN MARQUE COMME FAVORI
        onView(ViewMatchers.withId(R.id.list_neighbours)).check(withItemCount(ITEMS_COUNT));

    }

   @Test
    public void checkButtonRetour(){
    // test vérifiant que lorsque l'on clique sur la flèche,
    // la liste s'affiche correctement

       onView(withId(R.id.list_neighbours)).perform(
               RecyclerViewActions.actionOnItemAtPosition(0,click()));
       onView(withId(R.id.layout1)).check(matches(isDisplayed()));
       onView(withId(R.id.ReturnButton)).perform(click());
       onView(withId(R.id.list_neighbours)).check(matches(isDisplayed()));
    };

    @Test
    public void checkButtonEtoile(){
        // test vérifiant que lorsque l'on clique sur le bouton étoile,
        // la liste principale par défault s'affiche correctement

        onView(withId(R.id.list_neighbours)).perform(
                RecyclerViewActions.actionOnItemAtPosition(0,click()));
        onView(withId(R.id.layout1)).check(matches(isDisplayed()));
        onView(withId(R.id.button_etoile)).perform(click());
        onView(withId(R.id.list_neighbours)).check(matches(isDisplayed()));
    };
    @Test
    public void checkAvatar(){
        // test vérifiant que lorsque l'on clique sur le bouton étoile,
        // la liste principale par défault s'affiche correctement

        onView(withId(R.id.list_neighbours)).perform(
                RecyclerViewActions.actionOnItemAtPosition(0,click()));
        onView(withId(R.id.layout1)).check(matches(isDisplayed()));
        onView(withId(R.id.kb9)).check(matches(isDisplayed()));
    };

    @Test
    public void checkName(){
        // test vérifiant que lorsque l'on clique sur le bouton étoile,
        // la liste principale par défault s'affiche correctement

        onView(withId(R.id.list_neighbours)).perform(
                RecyclerViewActions.actionOnItemAtPosition(0,click()));
        onView(withId(R.id.layout1)).check(matches(isDisplayed()));
        onView(withId(R.id.nameLyt)).check(matches(not(withText(""))));

    };
};
