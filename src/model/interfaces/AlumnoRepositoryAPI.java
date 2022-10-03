/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package model.interfaces;

import java.util.List;
import java.util.Map;
import model.dto.Alumno;
import model.dto.Materias;

/**
 *
 * @author frans
 */
public interface AlumnoRepositoryAPI {
    List<Alumno> findAll();
    
    Map<Alumno, List<Materias>> findAlumnosSuspensosConDos();
}
