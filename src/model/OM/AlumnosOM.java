/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model.OM;

import java.util.Arrays;
import java.util.List;
import model.dto.Alumno;

/**
 *
 * @author frans
 */
public class AlumnosOM {
    public static List<Alumno> getAlumnos(){
        return Arrays.asList(
                new Alumno(Arrays.asList(3,6,9,4,7), "PACO"),
                new Alumno(Arrays.asList(9,8,9,9,9),"ALEJANDRO"),
                new Alumno(Arrays.asList(2,3,2,6,9), "LUCIFER"));
    }
    
    
    
}
