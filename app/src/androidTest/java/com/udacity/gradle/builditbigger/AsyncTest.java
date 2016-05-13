package com.udacity.gradle.builditbigger;

import android.test.InstrumentationTestCase;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

public class AsyncTest extends InstrumentationTestCase {
    String jokes = null;
    public final void testAsyncTask() throws Throwable {

        final CountDownLatch signal = new CountDownLatch(1);
        runTestOnUiThread(new Runnable() {
            @Override
            public void run() {
                new JokeAsyncTask() {
                    @Override
                    protected void onPostExecute(String result) {
                        super.onPostExecute(result);
                        jokes = result;
                        signal.countDown();
                    }
                }.execute();
            }
        });
        signal.await(10, TimeUnit.SECONDS);
        assertNotNull(jokes);

    }

}
