package com.goldhawk.WWAndroid;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.goldhawk.WWAndroid.Model.Concrete.*;

public class Main extends Activity {
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.calculator_uk);
        
        Button calPoints = (Button)findViewById(R.id.calculatePointsBttn);
        
        calPoints.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				
				EditText fat = (EditText)findViewById(R.id.fatEdit);
				EditText protein = (EditText)findViewById(R.id.proteinEdit);
				EditText carbs = (EditText)findViewById(R.id.carbsEdit);
				EditText fibre = (EditText)findViewById(R.id.fibreEdit);
				
				try
				{
				UKProPointFood generalFood = new UKProPointFood("general", 
						 Double.parseDouble(fat.getText().toString()),
						 Double.parseDouble(protein.getText().toString()),
						 Double.parseDouble(carbs.getText().toString()),
						 Double.parseDouble(fibre.getText().toString()));
											
				CharSequence txt = String.valueOf(generalFood.calculatePoints()) + " Pro Points";
				
				Toast.makeText(getApplicationContext(), txt, Toast.LENGTH_LONG).show();
				//Toast.makeText(getApplicationContext(), "hello", Toast.LENGTH_LONG);
				}catch(Exception e)
				{
					TextView txt = (TextView)findViewById(R.id.pointsTotal);
					txt.setText(e.getMessage());
				}
				
			}
		});
        
    }
}