package com.example.apirest;

import android.content.Context;
import android.content.Intent;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;


import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import com.example.apirest.Model.Persona;

import java.util.List;


public class PersonaAdapter extends ArrayAdapter<Persona> {

    private Context context;
    private  List<Persona>personas;

    public PersonaAdapter(@NonNull Context context, int resource, @NonNull List<Persona> objects) {
        super(context, resource, objects);
        this.context=context;
        this.personas=objects;
    }

    @Override
    public View getView(final int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        LayoutInflater layoutInflater=(LayoutInflater)context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View rowView=layoutInflater.inflate(R.layout.content_main,parent,false);

        TextView txtApellidos=(TextView)rowView.findViewById(R.id.Apellidos);


        txtApellidos.setText(String.format("APPLIED: %s",personas.get(position).getName()));



        return rowView;

    }

}
