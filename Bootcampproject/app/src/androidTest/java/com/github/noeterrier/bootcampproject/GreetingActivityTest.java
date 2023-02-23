package com.github.noeterrier.bootcampproject;

import static androidx.test.espresso.Espresso.onView;
import static androidx.test.espresso.assertion.ViewAssertions.matches;

import android.content.Intent;

import androidx.test.core.app.ActivityScenario;
import androidx.test.core.app.ApplicationProvider;
import androidx.test.espresso.matcher.ViewMatchers;
import androidx.test.ext.junit.runners.AndroidJUnit4;

import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class GreetingActivityTest {

    @Test
    public void testGreeting() {

        Intent intent = new Intent(ApplicationProvider.getApplicationContext(), GreetingActivity.class);

        try (ActivityScenario<MainActivity> s = ActivityScenario.launch(intent)) {
            onView(ViewMatchers.withId(R.id.greetingMessage))
                    .check(matches(ViewMatchers.withId(R.id.greetingMessage)));
        }

    }

}
