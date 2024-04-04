package com.androidulp.tp3_listas.ui;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.widget.GridLayout;
import android.widget.ListView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.androidulp.tp3_listas.R;
import com.androidulp.tp3_listas.databinding.ActivityMainBinding;
import com.androidulp.tp3_listas.modelo.Pelicula;

import java.util.List;

public class MainActivity extends AppCompatActivity {
    ActivityMainBinding binding;
    private List<Pelicula> peliculas;
    private LayoutInflater li;
    private Context context;
    private MainActivityViewModel mv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding=ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        mv= ViewModelProvider.AndroidViewModelFactory.getInstance(getApplication()).create(MainActivityViewModel.class);
        mv.getPeliculaMutable().observe(this, new Observer<List<Pelicula>>() {
            @Override
            public void onChanged(List<Pelicula> peliculas) {
                RecyclerView rv = findViewById(R.id.rvPeliculas);
                GridLayoutManager gl = new GridLayoutManager(MainActivity.this, 2,GridLayoutManager.HORIZONTAL, false);
                rv.setLayoutManager(gl);
                PeliculaAdapter pa =  new PeliculaAdapter(peliculas, getLayoutInflater(),MainActivity.this);
                rv.setAdapter(pa);

            }
        });


        mv.crearLista();

    }

}