package com.eagles.appcontrol.main;

import android.app.Activity;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.Toast;

import com.eagles.appcontrol.R;
import com.eagles.appcontrol.teacher.UI.ItemClickListener;
import com.eagles.appcontrol.teacher.adapters.CursoMateriaAdapter;
import com.eagles.appcontrol.teacher.model.CursoMateria;

import java.util.ArrayList;
import java.util.List;

import javax.inject.Inject;

public class MainActivity extends Activity implements ItemClickListener {

    RecyclerView recyclerView;

    CursoMateriaAdapter adapter;

    List<CursoMateria> item;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = (RecyclerView) findViewById(R.id.lstPerfilClases);
        item = new ArrayList<>();
        item.add(new CursoMateria());
        item.add(new CursoMateria());
        item.add(new CursoMateria());
        item.add(new CursoMateria());
        item.add(new CursoMateria());
        item.add(new CursoMateria());
        item.add(new CursoMateria());
        item.add(new CursoMateria());
        item.add(new CursoMateria());

        adapter = new CursoMateriaAdapter(this.getApplicationContext(),item,this);
        setupRecyclerView();
    }

//    private void setupInjection(){
//        DaggerCursoMateriaComponent
//                .builder();
//    }

    private void setupRecyclerView() {
        recyclerView.setLayoutManager(new GridLayoutManager(getParent(),2));
        recyclerView.setAdapter(adapter);
    }

    @Override
    public void onItemClick(CursoMateria cursoMateria) {
        // aqui iniciar la clase del profesor
        Toast.makeText(getApplicationContext(),"curso num",Toast.LENGTH_SHORT).show();
    }
}
