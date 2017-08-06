package com.example.ftrani.menuopcionites;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ListView listView = (ListView) findViewById(R.id.listView);
        //defino array con nombres a mostra en listview
        List<String> nombres = new ArrayList<String>();
        nombres.add("Juan");
        nombres.add("Pedro");
        nombres.add("Jose");
        nombres.add("Juan");
        nombres.add("Pedro");
        nombres.add("Jose");
        nombres.add("Juan");
        nombres.add("Pedro");
        nombres.add("Jose");
        nombres.add("Juan");
        nombres.add("Pedro");
        nombres.add("Jose");
        //defino adaptador
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(MainActivity.this,android.R.layout.simple_list_item_1,nombres);
        //Asigno adaptador al listview
        listView.setAdapter(adapter);

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {

        getMenuInflater().inflate(R.menu.menu_main, menu);

        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        switch (item.getItemId()){
            case R.id.mnuBuscar:
                Toast.makeText(MainActivity.this,"Seleccione Buscar",Toast.LENGTH_SHORT).show();
                return true;
            case R.id.mnuTools:
                Toast.makeText(MainActivity.this,"Seleccione Tools",Toast.LENGTH_SHORT).show();
                return true;
            case R.id.mnuCerrar:
                finish();
                return true;

            default:
                return super.onOptionsItemSelected(item);
        }

    }
}
