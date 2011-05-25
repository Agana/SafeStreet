package com.myitghana.win;


import android.app.Activity;
import android.content.Intent;

import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.Toast;


public class Confirm extends Activity implements OnClickListener {
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.confirm);
        Button noButton = (Button) findViewById(R.id.confirmno);
        noButton.setOnClickListener(this);
			
    } public void onClick(View v) {
    	Toast.makeText(v.getContext(), "Soliciting responses...", Toast.LENGTH_LONG).show();
    	Intent intent = new Intent(
				this,
				Done.class
				);
				startActivity(intent);
    }}
		
