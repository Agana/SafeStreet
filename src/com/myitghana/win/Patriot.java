package com.myitghana.win;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;


public class Patriot extends Activity implements OnClickListener {
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        Button okButton = (Button) findViewById(R.id.accident);
        okButton.setOnClickListener(this);
			
    } public void onClick(View v) {
				
				Intent intent = new Intent(
				this,
				Description.class
				);
				startActivity(intent);
								
    }}
		
