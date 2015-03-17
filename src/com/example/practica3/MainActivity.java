package com.example.practica3;

import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ListView;


public class MainActivity extends ActionBarActivity {


	ListView lista;
	Resources r;
	String [] meme;
	String nombre;
	int imagen=0;
	Intent i;
	final String NOMBRE="nombre", IMAGEN="imagen";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        iniciar();
    }
    
    private void iniciar(){
		lista = (ListView) findViewById(R.id.listaMemes);
		r = MainActivity.this.getResources();
		meme =r.getStringArray(R.array.memes);
		lista.setOnItemClickListener(new OnItemClickListener(){

			@Override
			public void onItemClick(AdapterView<?> parent, View view,
					int position, long id) {
				// TODO Auto-generated method stub
				nombre = meme[position];
				imagen = position;
				i = new Intent(MainActivity.this, Presentacion.class);
				i.putExtra(NOMBRE, nombre);
				i.putExtra(IMAGEN, imagen);
				startActivity(i);
				
			}
			
		});
	}


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();
        if (id == R.id.action_settings) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
}
