package br.edu.unidavi.androidtomadaarduinoclient;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;

public class TomadaClient_MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.tomadaclient_activity_main);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.tomada_client__main, menu);
        return true;
    }
    
}
