/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package control;

import java.util.ArrayList;
import model.OM.AlumnosOM;
import model.repo.AlumnoRepository;

/**
 *
 * @author frans
 */
public class Control {
    AlumnoRepository alumnoRepository = new AlumnoRepository((ArrayList)AlumnosOM.getAlumnos());
    
    
}
