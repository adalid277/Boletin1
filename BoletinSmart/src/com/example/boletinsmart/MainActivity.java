package com.example.boletinsmart;



import android.app.TabActivity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TabHost;
import android.widget.TabHost.TabSpec;

public class MainActivity extends TabActivity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		 TabHost tabHost = getTabHost();
	        
	        // Tab para viernes
	        TabSpec vier = tabHost.newTabSpec("Viernes");
	        vier.setIndicator("Viernes", getResources().getDrawable(R.drawable.icon_photos_tab));
	        Intent photosIntent = new Intent(this, Viernes.class);
	        vier.setContent(photosIntent);
	        
	        // Tab para sabado
	        TabSpec saba = tabHost.newTabSpec("Sabado");
	        
	        saba.setIndicator("Sabado", getResources().getDrawable(R.drawable.icon_songs_tab));
	        Intent songsIntent = new Intent(this, Sabado.class);
	        saba.setContent(songsIntent);
	        
	        // Tab para Domingo
	        TabSpec domin = tabHost.newTabSpec("Domingo");
	        domin.setIndicator("Domingo", getResources().getDrawable(R.drawable.icon_videos_tab));
	        Intent videosIntent = new Intent(this, Domingo.class);
	        domin.setContent(videosIntent);
	        
	        // agregando todos los TabSpec to TabHost
	        tabHost.addTab(vier); 
	        tabHost.addTab(saba); 	
	        tabHost.addTab(domin);
	        
	}

	

}
