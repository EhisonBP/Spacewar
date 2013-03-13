package ve.gob.epb.asteroides;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class MainActivity extends Activity {

	private Button bAcercaDe;
	private Button bPreferencias;

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
		
		bPreferencias = (Button) findViewById(R.id.Boton02);
		bPreferencias.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				lanzarPreferencias();
				
				
			}
		});
	}

	public void lanzarAcercaDe() {
		Intent i = new Intent(this, AcerdaDe.class);
		startActivity(i);
	}
	
	public void lanzarPreferencias(){
		Intent intent = new Intent(this, Preferencias.class);
		startActivity(intent);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		super.onCreateOptionsMenu(menu);
		MenuInflater inflater = getMenuInflater();
		inflater.inflate(R.menu.main, menu);
		return true;
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		switch (item.getItemId()) {
		case R.id.acercaDe:
			lanzarAcercaDe();
			break;
		case R.id.config:
			lanzarPreferencias();
			break;
		}
		return false;
	}

}
