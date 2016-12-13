package com.eagles.appcontrol.teacher.adapters;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import com.eagles.appcontrol.R;
import com.eagles.appcontrol.teacher.UI.ItemClickListener;
import com.eagles.appcontrol.teacher.model.CursoMateria;

import java.util.List;

/**
 * Created by carlosc on 12/12/2016.
 * adaptador para el grid de los perfiles de las materias
 */

public class CursoMateriaAdapter extends RecyclerView.Adapter<CursoMateriaAdapter.ViewHolder> {

    private List<CursoMateria> items;
    private Context context;
    private ItemClickListener listener;

    public CursoMateriaAdapter(Context c, List<CursoMateria> items, ItemClickListener clickListener) {
        this.items = items;
        this.context = c;
        this.listener = clickListener;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.content_btn_perfil_cm, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        CursoMateria cm = items.get(position);
        holder.titulo.setText(cm.toString());
        holder.subTitulo.setText("Ultima conexion...");
        holder.setClickListener(cm, listener);

    }

    @Override
    public int getItemCount() {
        return items.size();
    }

    public void setItem(List<CursoMateria> cm) {
        items.addAll(cm);
        notifyDataSetChanged();
    }


    static class ViewHolder extends RecyclerView.ViewHolder {

        TextView titulo;
        TextView subTitulo;
        Button button;

        public ViewHolder(View itemView) {
            super(itemView);
            titulo = (TextView) itemView.findViewById(R.id.txtNombreCM);
            subTitulo = (TextView) itemView.findViewById(R.id.txtSubtituloNombreCM);
            button = (Button) itemView.findViewById(R.id.btnIniciarCM);
        }

        public void setClickListener(final CursoMateria cursoMateria,
                                     final ItemClickListener listener) {
            button.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    // envio el item seleccionado o el btn presionado o seleccionado del
                    // grid para que con los parametro elegidos inicie la clase.
                    listener.onItemClick(cursoMateria);
                }
            });

        }
    }
}
