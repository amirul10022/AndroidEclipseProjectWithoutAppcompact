package com.example.simpleactivity;

import android.app.Activity;
import android.os.Bundle;
import android.widget.EditText;


public class SecondActivity extends Activity {

	EditText receivedDataEditText;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_second);
		
		receivedDataEditText=(EditText)findViewById(R.id.receivedDataEditTextID);
		
		receivedDataEditText.setText(MainActivity.SendData);
		
	}
}
