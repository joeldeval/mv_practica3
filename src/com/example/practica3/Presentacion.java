package com.example.practica3;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class Presentacion extends Activity {

	TextView nombreMeme;
	ImageView imagenMeme;
	Bundle bl;
	String nombre;
	int imagen=0;
	final String NOMBRE="nombre", IMAGEN="imagen";
	int [] meme = {
			R.drawable.img01,
			R.drawable.img02,
			R.drawable.img03,
			R.drawable.img04,
			R.drawable.img05
	};
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.presentacion);
		iniciar();
	}
	
	private void iniciar(){
		nombreMeme = (TextView) findViewById(R.id.nombreMeme);
		imagenMeme = (ImageView) findViewById(R.id.imagenMeme);
		bl = this.getIntent().getExtras();
		nombre = bl.getString(NOMBRE);
		imagen = bl.getInt(IMAGEN);
		nombreMeme.setText(nombre);
		imagenMeme.setImageResource(meme[imagen]);
		
		
	}
	


}
