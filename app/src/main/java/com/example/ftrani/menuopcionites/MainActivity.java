package com.example.ftrani.menuopcionites;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.ContextMenu;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImageView imgAvatar = (ImageView) findViewById(R.id.imgAvatar);
        //habilitamos soporte para menu contextual
        registerForContextMenu(imgAvatar);

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

    @Override
    public void onCreateContextMenu(ContextMenu menu, View v, ContextMenu.ContextMenuInfo menuInfo) {
        getMenuInflater().inflate(R.menu.menu_contexto, menu);

    }

    @Override
    public boolean onContextItemSelected(MenuItem item) {

        switch (item.getItemId()){
            case R.id.mnuEditar:
                Toast.makeText(MainActivity.this,"Selecciono Editar!!",Toast.LENGTH_SHORT).show();
                return true;
            case R.id.mnuBorrar:
                Toast.makeText(MainActivity.this,"Seleccione Borrar!!",Toast.LENGTH_SHORT).show();
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }

    }
}
