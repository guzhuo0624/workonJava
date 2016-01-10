package nurse.triage;

import java.io.IOException;
import java.text.ParseException;

import nurse.Patient;
import nurse.VitalSign;
import nurse.manager.PatientManager;
import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends Activity {

		public static final String FILENAME = "patients.txt";
		private PatientManager manager;
		

	    @Override
	    protected void onCreate(Bundle savedInstanceState) {
	        super.onCreate(savedInstanceState);
	        setContentView(R.layout.activity_main);
	        
	        try {
	        	System.out.println("Start to create a new patient manager.");
				manager = new PatientManager(this.getApplicationContext().getFilesDir(),
											 FILENAME);
				System.out.println("after creating PM.");
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (ParseException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	        
	    }


	    @Override
	    public boolean onCreateOptionsMenu(Menu menu) {
	        // Inflate the menu; this adds items to the action bar if it is present.
	        getMenuInflater().inflate(R.menu.main, menu);
	        return true;
	    }
	    
	   /**
	    * as the requirement.
	    * @param view
	    */
	    public void recordPatient(View view) {
	    	
	    	/*  Intent is used to launch the next activity and to pass
	    	 * information to it. 
	    	 */
	    	Intent intent = new Intent(this, DisplayActivity.class);
	    	
	    	/*
	    	 * findViewById returns a View. We need to cast it EditText in
	    	 * order to use the methods of EditText. 
	    	 */
	    	EditText patientNameText = (EditText) findViewById(R.id.patient_name);
	    	String patientName = patientNameText.getText().toString();
	    	
	    	EditText patientBirthdayText = (EditText) findViewById(R.id.patient_birthday);
	    	String patientBirthday = patientBirthdayText.getText().toString();
	    	
	    	EditText patientHealthcardnumberText = (EditText) findViewById(R.id.patient_healthcard);
	    	String patientHealthcardnumber = patientHealthcardnumberText.getText().toString();
	    	
	    	EditText patientArrivaltimeText = (EditText) findViewById(R.id.patient_arrivaltime);
	    	String patientArrivalTime = patientArrivaltimeText.getText().toString();
	    	
	    	Patient patient = new Patient(patientName, patientBirthday, patientHealthcardnumber, patientArrivalTime);
	    	
	    	
	    	System.out.println("New vital sign.");
	    	EditText ageText = (EditText) findViewById(R.id.age);
	    	String age = ageText.getText().toString();
	    	
	    	EditText tempText = (EditText) findViewById(R.id.temp);
	    	String temp = tempText.getText().toString();
	    	
	    	EditText sysText = (EditText) findViewById(R.id.systolic);
	    	String sys = sysText.getText().toString();
	    	
	    	EditText diaText = (EditText) findViewById(R.id.diastolic);
	    	String dia = diaText.getText().toString();
	    	
	    	EditText  hrText = (EditText) findViewById(R.id.heartRate);
	    	String heartRate = hrText.getText().toString();
	    	
	    	VitalSign vs = new VitalSign(Integer.parseInt(age), Double.parseDouble(temp),
	    								 Integer.parseInt(sys), Integer.parseInt(dia),
	    								 Integer.parseInt(heartRate));
	    	System.out.println("finish vital sign.");
	    	patient.addVitalSigns(vs);
	    	/*
	    	 * patient needs to be Serializable.
	    	 */
	    	intent.putExtra("patientKey", patient);
	    	intent.putExtra("patientManager", manager);
	    	
	    	manager.add(patient);// add the new patient to my PatientManager
	    	
	    	startActivity(intent);
	    }   
	}
