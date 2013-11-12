package com.example.First_P1;

import android.app.Activity;
import android.os.Bundle;
import android.widget.Button;

public class MyActivity extends Activity {
    /**
     * Called when the activity is first created.
     */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);

        Button btn = (Button)findViewById(R.id.button);

        btn.isLongClickable();

        System.currentTimeMillis();

    }


}
