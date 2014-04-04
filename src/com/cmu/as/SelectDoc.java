package com.cmu.as;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class SelectDoc extends Activity{
	public void onCreate(Bundle savedInstanceState) 
	{
	      super.onCreate(savedInstanceState); // call superclass's version
	      setContentView(R.layout.select_doc); // inflate the GUI
	      
	      if ( savedInstanceState == null ) // the app just started running
	      {
	      } // end if
	      else // app is being restored from memory, not executed from scratch
	      {
	         // initialize the bill amount to saved amount
	      } // end else
	}
	
	public void confirm(View view) {
		Intent intent = new Intent(this, SelectDate.class);
		startActivity(intent);
	}
	
	public void newTab(View view) {
		Intent intent = new Intent(this, SelectHos.class);
		startActivity(intent);
	}
	
	public void past(View view){
		Intent intent = new Intent(this, PastActivity.class);
		startActivity(intent);

	}
	
	public void future(View view){
		Intent intent = new Intent(this, FutureActivity.class);
		startActivity(intent);

	}
	
	public void info(View view){
		Intent intent = new Intent(this, InfoActivity.class);
		startActivity(intent);

	}



}
