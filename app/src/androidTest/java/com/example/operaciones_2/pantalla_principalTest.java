package com.example.operaciones_2;


import static androidx.test.espresso.Espresso.onView;
import static androidx.test.espresso.action.ViewActions.click;
import static androidx.test.espresso.action.ViewActions.closeSoftKeyboard;
import static androidx.test.espresso.action.ViewActions.pressImeActionButton;
import static androidx.test.espresso.action.ViewActions.replaceText;
import static androidx.test.espresso.matcher.ViewMatchers.isDisplayed;
import static androidx.test.espresso.matcher.ViewMatchers.withId;
import static androidx.test.espresso.matcher.ViewMatchers.withText;
import static org.hamcrest.Matchers.allOf;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;

import androidx.test.espresso.ViewInteraction;
import androidx.test.ext.junit.rules.ActivityScenarioRule;
import androidx.test.ext.junit.runners.AndroidJUnit4;
import androidx.test.filters.LargeTest;

import org.hamcrest.Description;
import org.hamcrest.Matcher;
import org.hamcrest.TypeSafeMatcher;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

@LargeTest
@RunWith(AndroidJUnit4.class)
public class pantalla_principalTest {

    @Rule
    public ActivityScenarioRule<pantalla_principal> mActivityScenarioRule =
            new ActivityScenarioRule<>(pantalla_principal.class);

    @Test
    public void pantalla_principalTest() {
        ViewInteraction appCompatEditText = onView(
                allOf(withId(R.id.campo_op),
                        childAtPosition(
                                allOf(withId(R.id.ingrese_op),
                                        childAtPosition(
                                                withId(R.id.pant_prin),
                                                2)),
                                0),
                        isDisplayed()));
        appCompatEditText.perform(click());

        ViewInteraction appCompatEditText2 = onView(
                allOf(withId(R.id.campo_op),
                        childAtPosition(
                                allOf(withId(R.id.ingrese_op),
                                        childAtPosition(
                                                withId(R.id.pant_prin),
                                                2)),
                                0),
                        isDisplayed()));
        appCompatEditText2.perform(replaceText("3"), closeSoftKeyboard());

        ViewInteraction appCompatEditText3 = onView(
                allOf(withId(R.id.campo_op), withText("3"),
                        childAtPosition(
                                allOf(withId(R.id.ingrese_op),
                                        childAtPosition(
                                                withId(R.id.pant_prin),
                                                2)),
                                0),
                        isDisplayed()));
        appCompatEditText3.perform(pressImeActionButton());

        ViewInteraction materialButton = onView(
                allOf(withId(R.id.boton_op), withText("Ingresar"),
                        childAtPosition(
                                allOf(withId(R.id.ingrese_op),
                                        childAtPosition(
                                                withId(R.id.pant_prin),
                                                2)),
                                1),
                        isDisplayed()));
        materialButton.perform(click());

        ViewInteraction appCompatEditText4 = onView(
                allOf(withId(R.id.valor_multi_1),
                        childAtPosition(
                                allOf(withId(R.id.pant_multi),
                                        childAtPosition(
                                                withId(android.R.id.content),
                                                0)),
                                1),
                        isDisplayed()));
        appCompatEditText4.perform(replaceText("2"), closeSoftKeyboard());

        ViewInteraction appCompatEditText5 = onView(
                allOf(withId(R.id.valor_multi_2),
                        childAtPosition(
                                allOf(withId(R.id.pant_multi),
                                        childAtPosition(
                                                withId(android.R.id.content),
                                                0)),
                                2),
                        isDisplayed()));
        appCompatEditText5.perform(replaceText("9"), closeSoftKeyboard());

        ViewInteraction materialButton2 = onView(
                allOf(withId(R.id.boton_multi), withText("Ingresar"),
                        childAtPosition(
                                allOf(withId(R.id.accion_boton_multi),
                                        childAtPosition(
                                                withId(R.id.pant_multi),
                                                3)),
                                0),
                        isDisplayed()));
        materialButton2.perform(click());

        ViewInteraction appCompatEditText6 = onView(
                allOf(withId(R.id.valor_multi_2), withText("9"),
                        childAtPosition(
                                allOf(withId(R.id.pant_multi),
                                        childAtPosition(
                                                withId(android.R.id.content),
                                                0)),
                                2),
                        isDisplayed()));
        appCompatEditText6.perform(pressImeActionButton());

        ViewInteraction materialButton3 = onView(
                allOf(withId(R.id.boton_multi), withText("Ingresar"),
                        childAtPosition(
                                allOf(withId(R.id.accion_boton_multi),
                                        childAtPosition(
                                                withId(R.id.pant_multi),
                                                3)),
                                0),
                        isDisplayed()));
        materialButton3.perform(click());

        ViewInteraction materialButton4 = onView(
                allOf(withId(R.id.boton_multi), withText("Ingresar"),
                        childAtPosition(
                                allOf(withId(R.id.accion_boton_multi),
                                        childAtPosition(
                                                withId(R.id.pant_multi),
                                                3)),
                                0),
                        isDisplayed()));
        materialButton4.perform(click());
    }

    private static Matcher<View> childAtPosition(
            final Matcher<View> parentMatcher, final int position) {

        return new TypeSafeMatcher<View>() {
            @Override
            public void describeTo(Description description) {
                description.appendText("Child at position " + position + " in parent ");
                parentMatcher.describeTo(description);
            }

            @Override
            public boolean matchesSafely(View view) {
                ViewParent parent = view.getParent();
                return parent instanceof ViewGroup && parentMatcher.matches(parent)
                        && view.equals(((ViewGroup) parent).getChildAt(position));
            }
        };
    }
}
