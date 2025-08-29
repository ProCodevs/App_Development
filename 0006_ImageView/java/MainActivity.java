package com.procodevs.Imageview;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ImageView;

public class MainActivity extends Activity {

	// Veriable declear kora
	ImageView imageJava;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		// Java ver sathe xml id'r Linkup kora
		imageJava = findViewById(R.id.imageJava);

		// nicher Line diye image take load kora
		imageJava.setImageResource(R.drawable.pic);

	}
}