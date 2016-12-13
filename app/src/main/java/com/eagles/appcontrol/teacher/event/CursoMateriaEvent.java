package com.eagles.appcontrol.teacher.event;

import com.eagles.appcontrol.teacher.model.CursoMateria;

import java.util.List;

/**
 * Created by carlosc on 12/12/2016.
 */

/**
 * clase que viaja entre la clase de la api que trae desde el servidor hacia la vista.
 */
public class CursoMateriaEvent {
    private String error;
    private List<CursoMateria> cursoMaterias;

    public String getError() {
        return error;
    }

    public void setError(String error) {
        this.error = error;
    }

    public List<CursoMateria> getCursoMaterias() {
        return cursoMaterias;
    }

    public void setCursoMaterias(List<CursoMateria> cursoMaterias) {
        this.cursoMaterias = cursoMaterias;
    }
}
