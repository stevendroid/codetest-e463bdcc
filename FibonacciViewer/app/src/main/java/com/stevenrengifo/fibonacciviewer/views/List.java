package com.stevenrengifo.fibonacciviewer.views;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.stevenrengifo.fibonacciviewer.R;

import java.util.ArrayList;

public class List extends Activity {

    ListView fibsList;
    ArrayList<Integer> fibs;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list);

        fibsList = (ListView) findViewById(R.id.listView);
    }
}
