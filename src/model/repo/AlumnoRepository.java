/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model.repo;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import model.dto.Alumno;
import model.dto.Materias;
import model.interfaces.AlumnoRepositoryAPI;

/**
 *
 * @author frans
 */
public class AlumnoRepository implements AlumnoRepositoryAPI {
    
    private List<Alumno> listaAlumnos;

    public AlumnoRepository(ArrayList<Alumno> listaAlumnos) {
        this.listaAlumnos = listaAlumnos;
    }
    
    @Override
    public List<Alumno> findAll() {
//      throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        return listaAlumnos;
    }

    @Override
    public Map<Alumno, List<Materias>> findAlumnosSuspensosConDos() {
        //TODO
//      throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        Map<Alumno, Materias> mapAlumnosSuspensos = new HashMap<>();
        int contador = 0;
        for (Alumno alumno : listaAlumnos) {
            for (Integer integer : alumno.getNotas()) {
                if(integer < 5){
                    contador++;
                }
            }
            if(contador >= 2){
                mapAlumnosSuspensos.put(alumno, Materias.filosofia);
                contador = 0;
            }
        }
        return null; 
        
    }
    
}
