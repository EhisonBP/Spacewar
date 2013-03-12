package ve.gob.epb.asteroides;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;



public class MainActivity extends Activity {

	private Button bAcercaDe;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		bAcercaDe = (Button) findViewById(R.id.Boton03);
		bAcercaDe.setOnClickListener(new OnClickListener() {

			public void onClick(View view) {
				lanzarAcercaDe();

			}
		});
	}

	public void lanzarAcercaDe() {
		Intent i = new Intent(this, AcerdaDe.class);
		startActivity(i);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

}
