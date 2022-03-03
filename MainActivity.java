package com.example.recycleview;

import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    RecyclerView lista;
    RecyclerView.Adapter adaptador;

    FloatingActionButton button;


    String[] Data = new String[]{"Item 1", "Item 2", "Elemento 3", "Elemento 4", "Elemento 5", "Elemento 6", "Elemento 7", "Elemento 8"
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lista = (RecyclerView) findViewById(R.id.recyclerview);
        button = (FloatingActionButton) findViewById(R.id.fab);


        // I'm connecting my RecyclerView to a Layout Manager. The idea here is to structure our list with a vertical
        // orientation.
        lista.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false));

        // ¿?
        adaptador = new RecyclerAdapter(Data);
        lista.setAdapter(adaptador);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Esto es un SNACKBAR", Snackbar.LENGTH_LONG)
                        .setAction("Cerrar", cerrar)
                        .show();
            }
        });
    }

    public View.OnClickListener cerrar = new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            finish();

        }
    };


}