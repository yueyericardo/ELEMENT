package com.example.element;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.Window;

public class About extends ActionBarActivity {
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
//		requestWindowFeature(Window.FEATURE_NO_TITLE);
		setContentView(R.layout.about);
	}
}
