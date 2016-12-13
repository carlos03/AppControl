package com.eagles.appcontrol.teacher.model;

/**
 * Created by carlosc on 12/12/2016.
 */

public class CursoMateria {
    private String nombreCurso;
    private String nombreMateria;
    private int idCurso;
    private int idMateria;

    //.. aumentar los ids y de mas parametros


    public CursoMateria() {
        this.nombreCurso = "Curso Predeterminado";
        this.nombreMateria = "Materia Predeterminada";
        this.idCurso = -1;
        this.idMateria = -2;
    }

    public CursoMateria(String nombreCurso, String nombreMateria, int idCurso, int idMateria) {
        this.nombreCurso = nombreCurso;
        this.nombreMateria = nombreMateria;
        this.idCurso = idCurso;
        this.idMateria = idMateria;
    }

    public String getNombreCurso() {
        return nombreCurso;
    }

    public void setNombreCurso(String nombreCurso) {
        this.nombreCurso = nombreCurso;
    }

    public String getNombreMateria() {
        return nombreMateria;
    }

    public void setNombreMateria(String nombreMateria) {
        this.nombreMateria = nombreMateria;
    }

    public int getIdCurso() {
        return idCurso;
    }

    public void setIdCurso(int idCurso) {
        this.idCurso = idCurso;
    }

    public int getIdMateria() {
        return idMateria;
    }

    public void setIdMateria(int idMateria) {
        this.idMateria = idMateria;
    }

    @Override
    public String toString() {
        String rs="";
        rs=getNombreMateria()+" -> "+getNombreCurso();
        return rs;
    }
}
