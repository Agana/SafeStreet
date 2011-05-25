package com.myitghana.win;

import android.app.Activity;
import android.content.Intent;

import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;


public class Description extends Activity implements OnClickListener {
	 public void onCreate(Bundle savedInstanceState) {
	        super.onCreate(savedInstanceState);
	        setContentView(R.layout.description);
	        
	        Button cancelButton = (Button) findViewById(R.id.descdone);
	        cancelButton.setOnClickListener(this);
	 }
			
public void onClick(View v) {
				
				Intent intent = new Intent(
				this,
				Confirm.class
				);
				startActivity(intent);
	       }

}