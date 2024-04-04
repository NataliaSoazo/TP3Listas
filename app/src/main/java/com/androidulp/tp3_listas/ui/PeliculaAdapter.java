package com.androidulp.tp3_listas.ui;
import android.content.Context;
import android.renderscript.ScriptGroup;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.RecyclerView;


import com.androidulp.tp3_listas.R;
import com.androidulp.tp3_listas.databinding.ItemBinding;
import com.androidulp.tp3_listas.modelo.Pelicula;

import org.w3c.dom.Text;

import java.util.List;

public class PeliculaAdapter extends RecyclerView.Adapter<PeliculaAdapter.VieHolderInmueble> {

    private List<Pelicula> peliculas;
    private LayoutInflater li;
    private Context context;

    public PeliculaAdapter(List<Pelicula> peliculas, LayoutInflater li, Context context) {
        this.peliculas = peliculas;
        this.li = li;
        this.context = context;
    }

    @NonNull
    @Override
    public VieHolderInmueble onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = li.inflate(R.layout.item, parent, false);
        return new VieHolderInmueble(view);
    }

    @Override
    public void onBindViewHolder(@NonNull VieHolderInmueble holder, int position) {
        holder.titulo.setText(peliculas.get(position).getTitulo());
        holder.descripcion.setText(peliculas.get(position).getDescripcion());
        holder.director.setText(peliculas.get(position).getDirector());
        holder.foto.setImageResource(peliculas.get(position).getFoto());

    }

    @Override
    public int getItemCount() {
        return peliculas.size();
    }

    public class VieHolderInmueble extends RecyclerView.ViewHolder{
        private TextView titulo;
        private TextView descripcion;
        private TextView director;
        private ImageView foto;
        private Button detalles;
        public VieHolderInmueble(@NonNull View itemView) {
            super(itemView);
             titulo = itemView.findViewById((R.id.tvTitulo));
             descripcion = itemView.findViewById(R.id.tvDescripcion);
             director = itemView.findViewById(R.id.tvDirector);
             foto = itemView.findViewById(R.id.imgPelicula);
             detalles = itemView.findViewById(R.id.btDetalles);
             //detalles.setOnClickListener();

        }
    }

}



