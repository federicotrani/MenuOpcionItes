package com.example.ftrani.menuopcionites;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.ContextMenu;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.PopupMenu;
import android.widget.RelativeLayout;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        RelativeLayout layMain = (RelativeLayout) findViewById(R.id.layMain);
        //habilitamos soporte para menu contextual
        registerForContextMenu(layMain);

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {

        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu_main, menu);

        return true;
    }

    public void mostrarPopup(View v){
        ImageView imgAvatar = (ImageView) findViewById(R.id.imgAvatar);
        PopupMenu popupMenu = new PopupMenu(this, imgAvatar);
        popupMenu.getMenuInflater().inflate(R.menu.menu_popup,popupMenu.getMenu());

        //metodo de escucha para evento click del menu popup
        popupMenu.setOnMenuItemClickListener(new PopupMenu.OnMenuItemClickListener() {
            @Override
            public boolean onMenuItemClick(MenuItem item) {

                switch (item.getItemId()){
                    case R.id.mnuImagen:
                        Toast.makeText(MainActivity.this,"Ver Imagen!!",Toast.LENGTH_SHORT).show();
                        break;
                    case R.id.mnuDetalleImagen:
                        Toast.makeText(MainActivity.this,"Ver Detalle Imagen!!",Toast.LENGTH_SHORT).show();
                        break;
                }
                return true;
            }
        });

        //mostramos el menu
        popupMenu.show();
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
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu_contexto, menu);
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
