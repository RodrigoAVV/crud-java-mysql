package cl.lec;

import clases.Estudiante;
import java.util.ArrayList;
import daos.EstudianteDAO;

public class Javamysql {

    public static void main(String[] args) {
        EstudianteDAO ed = new EstudianteDAO();
        /*
            //Obtiene todos los estudiantes
            ArrayList<Estudiante> estudiantes = ed.getEstudiantes();
            System.out.println(estudiantes.toString());
        */
        
        /*
            //Registra un nuevo estudiante
            Estudiante e = new Estudiante(1,"algo","algo","algo","algo","algo","algo","2000/10/10",1,1,1);
            System.out.println(ed.addNewEstudiante(e));
        */
        
        /*
            //Actualiza un estudiante
            Estudiante e = new Estudiante(1,"algo","algo","algo","algo","algo","algo","2000/10/25",1,1,1);
            System.out.println(ed.updateEstudianteById(e, 13));
        */
        
        System.out.println(ed.getEstudianteById(5).toString());
        
        //Elimina un estudiante
        //System.out.println(ed.deleteEstudianteById(13));
    }
}
