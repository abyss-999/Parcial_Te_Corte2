package com.example.myapplication;

import org.robolectric.RobolectricTestRunner;
import org.robolectric.Robolectric;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import android.content.Intent;
import static org.junit.Assert.assertNotNull;

@RunWith(RobolectricTestRunner.class)
public class testeo {

    private MainActivity activity;

    @Before
    public void setUp() {

        activity = Robolectric.buildActivity(MainActivity.class).create().get();
    }

    @Test
    public void testConocerButton() {
        assertNotNull(activity.findViewById(R.id.conocer));
        activity.findViewById(R.id.conocer).performClick();

        Intent Intent = new Intent(activity, conocer.class);
        assertNotNull(Intent);
    }
}





