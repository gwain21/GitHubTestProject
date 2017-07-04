package com.smithkeegan.githubtestproject;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //Ayyy boy, commit five
        ((TextView)findViewById(R.id.main_textView)).setText("This is text");
        //New comment here, commit three
        //New comment as well, commit four
        //Adding a new branch, commit six
        //Adding a newer branch! Commit seven, merge then push.
    }
}
