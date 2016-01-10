package nurse.triage;

/*
 * A representation of error page
 * @author Guanfeng Dong
 */

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;



public class ErrorPage extends Activity {

	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		this.setContentView(R.layout.errorpage);
		
		Button button_back = (Button)findViewById(R.id.errorback);
		button_back.setOnClickListener(new View.OnClickListener() {
			public void onClick(View view) {
				// TODO Auto-generated method stub
				Intent intent = new Intent();
				
				intent.setClass(ErrorPage.this, Login.class);
				
				startActivity(intent);
			}
		});
	}
}
