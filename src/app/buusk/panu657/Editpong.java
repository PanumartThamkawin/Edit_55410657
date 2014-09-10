package app.buusk.panu657;
	import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Editpong extends Activity implements OnClickListener {
	private Button btnsubmit;
	private EditText etxt1, etxt2, etxt3, etxt4,etxt5,etxt6;
	private String txt01, txt02, txt03, txt04,txt05,txt06;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		setContentView(R.layout.edit657);
		super.onCreate(savedInstanceState);
		ViewMatching();
	}

	private void ViewMatching() {
		btnsubmit = (Button) findViewById(R.id.button1);
		btnsubmit.setOnClickListener(this);
		etxt1 = (EditText) findViewById(R.id.etxt1);
		etxt2 = (EditText) findViewById(R.id.etxt2);
		etxt3 = (EditText) findViewById(R.id.etxt3);
		etxt4 = (EditText) findViewById(R.id.etxt4);
		etxt5 = (EditText) findViewById(R.id.etxt5);
		etxt6 = (EditText) findViewById(R.id.etxt6);

	}

	@Override
	public void onClick(View v) {
		switch (v.getId()) {
		case R.id.button1:
			txt01 = (etxt1.getText().toString());
			txt02 = (etxt2.getText().toString());
			txt03 = (etxt3.getText().toString());
			txt04 = (etxt4.getText().toString());
			txt05 = (etxt5.getText().toString());
			txt06 = (etxt6.getText().toString());

			Intent R = new Intent(getApplicationContext(), MainActivity.class);
			R.putExtra("txt01", txt01);
			R.putExtra("txt02", txt02);
			R.putExtra("txt03", txt03);
			R.putExtra("txt04", txt04);
			R.putExtra("txt05", txt05);
			R.putExtra("txt06", txt06);
			startActivity(R);
			break;
		default:
			break;
		}
	}
}