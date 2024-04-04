package com.androidulp.tp3_listas.ui;

import android.app.Application;
import android.content.Context;

import androidx.annotation.NonNull;
import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;

import com.androidulp.tp3_listas.R;
import com.androidulp.tp3_listas.modelo.Pelicula;

import java.util.ArrayList;
import java.util.List;

public class MainActivityViewModel extends AndroidViewModel {
    private Context context;
    private MutableLiveData<List<Pelicula>> peliculasMutable;

    public MainActivityViewModel(@NonNull Application application) {
        super(application);
        this.context = application.getApplicationContext();
    }


    public LiveData<List<Pelicula>> getPeliculaMutable(){
        if(peliculasMutable==null){
            this.peliculasMutable=new MutableLiveData<>();
        }
        return peliculasMutable;
    }

    public void crearLista(){
        ArrayList<Pelicula> lista=new ArrayList<>();
        lista.add(new Pelicula("Mi amigo el dinosaurio", "pelicula infantil",R.drawable.p2, "", "", ""));
        lista.add(new Pelicula("Mi amigo el dinosaurio", "pelicula infantil",R.drawable.p2, "", "", ""));
        peliculasMutable.setValue(lista);

    }
}
