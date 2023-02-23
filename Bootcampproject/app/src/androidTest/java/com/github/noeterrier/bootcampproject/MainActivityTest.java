package com.github.noeterrier.bootcampproject;

import androidx.test.espresso.Espresso;
import androidx.test.espresso.ViewInteraction;
import androidx.test.espresso.action.ViewActions;
import androidx.test.espresso.intent.Intents;
import androidx.test.espresso.intent.matcher.IntentMatchers;
import androidx.test.espresso.matcher.ViewMatchers;
import androidx.test.ext.junit.rules.ActivityScenarioRule;
import androidx.test.ext.junit.runners.AndroidJUnit4;

import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class MainActivityTest {

    @Rule
    public ActivityScenarioRule<MainActivity> testRule = new ActivityScenarioRule<>(MainActivity.class);


    @Test
    public void testExample() {

        Intents.init();

        ViewInteraction mainNameInteraction = Espresso.onView(ViewMatchers.withId(R.id.mainName));
        mainNameInteraction.perform(ViewActions.replaceText("John Doe"));

        ViewInteraction mainGoButtonInteraction = Espresso.onView(ViewMatchers.withId(R.id.mainGoButton));
        mainGoButtonInteraction.perform(ViewActions.click());

        Intents.intended(IntentMatchers.hasComponent(GreetingActivity.class.getName()));

        Intents.release();
    }
}
