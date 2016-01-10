package nurse.triage;

/*
 * A representation of display activity
 * @author Zhuo Gu, Guanfeng Dong
 */

import nurse.Patient;
import nurse.manager.PatientManager;
import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.widget.TextView;
import android.content.Intent;

public class DisplayActivity extends Activity {

	public static final String FILENAME = "patients.txt";
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		/*
		 * This method is run when the Activity is created.
		 */
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_display);
		
		/*
		 * Get the Intent that started this Activity. We inherited this 
		 * method from Activity.
		 */
		Intent intent = getIntent();
		
		/*
		 * getSerializableExtra returns a Serializable. Need to cast it to
		 * Patient to use the methods of Patient. This cast is OK, since 
		 * Patient implements Serializable.
		 */
		Patient patient = (Patient) intent.getSerializableExtra("patientKey");
		String patientName = patient.getName();
		TextView newlyRegistered = (TextView) findViewById(R.id.newly_record);
		
		PatientManager pm = (PatientManager) intent.getSerializableExtra("patientManager");
		pm.getPatients().put(patient.getHealthCardNumber(), patient);
		pm.writeFile(pm.getPatients(), FILENAME);
		/*
		 * We couldn't have set this text in the xml file: we don't know
		 * what it will be, since it depends on user input. We need to 
		 * generate the text for this TextView dynamically, within the
		 * program.
		 */
		newlyRegistered.setText(patientName + 
					" was recorded successfully.");
		
		
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.display, menu);
		return true;
	}

}
