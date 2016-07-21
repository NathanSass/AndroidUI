package com.nathansass.androidui;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//        int[] attrs = new int[]{R.attr.selectableItemBackground};
//        TypedArray typedArray = getActivity().obtainStyledAttributes(attrs);
//        int backgroundResource = typedArray.getResourceId(0, 0);
//        myView.setBackgroundResource(backgroundResource);
    }
}
