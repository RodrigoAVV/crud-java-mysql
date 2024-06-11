package daos;

import clases.Estudiante;
import config.Conexion;
import java.awt.HeadlessException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class EstudianteDAO {
    public ArrayList<Estudiante> getEstudiantes(){
        ArrayList<Estudiante> estudiantes = new ArrayList<>();
        try {
            Conexion db = new Conexion();
            Connection cnn = db.conectarMySQL();
            String consulta="SELECT * FROM estudiantes";
            Statement sentencia = cnn.createStatement();
            ResultSet resultado = sentencia.executeQuery(consulta);
            while (resultado.next()){
                Estudiante e = new Estudiante(
                    resultado.getInt("estudiante_id"),
                    resultado.getString("nombre"),
                    resultado.getString("apellido1"),
                    resultado.getString("apellido2"),
                    resultado.getString("curso"),
                    resultado.getString("run"),
                    resultado.getString("correo"),
                    resultado.getString("fecha_nacimiento"),
                    resultado.getInt("edad"),
                    resultado.getInt("peso"),
                    resultado.getInt("estatura")
                );
                estudiantes.add(e);
            }
            cnn.close();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return estudiantes;
    }
    
    public int addNewEstudiante(Estudiante est){
        int res = 0;
        try {
            Conexion db = new Conexion();
            Connection cnn = db.conectarMySQL();
            String consulta = "INSERT INTO estudiantes(nombre,apellido1,apellido2,curso,run,correo,fecha_nacimiento,edad,peso,estatura)"
                    + " VALUES(?,?,?,?,?,?,?,?,?,?)";
            PreparedStatement ps = cnn.prepareStatement(consulta);
            ps.setString(1, est.getNombre());
            ps.setString(2, est.getApellido1());
            ps.setString(3, est.getApellido2());
            ps.setString(4, est.getCurso());
            ps.setString(5, est.getRun());
            ps.setString(6, est.getCorreo());
            ps.setString(7, est.getFecha_nacimiento());
            ps.setInt(8, est.getEdad());
            ps.setInt(9, est.getPeso());
            ps.setInt(10, est.getEstatura());
            res = ps.executeUpdate();
            cnn.close();
        } catch (HeadlessException | SQLException e) {
            System.err.println(e);
        }
        return res;
    }
    
    public int updateEstudianteById(Estudiante est,int id){
        int res = 0;
        try {
            Conexion db = new Conexion();
            Connection cnn = db.conectarMySQL();
            String consulta = "UPDATE estudiantes set nombre=?,apellido1=?,apellido2=?,curso=?,run=?,correo=?,fecha_nacimiento=?,edad=?,peso=?,estatura=?"
                    + " WHERE estudiante_id=?";
            PreparedStatement ps = cnn.prepareStatement(consulta);
            ps.setString(1,est.getNombre());
            ps.setString(2,est.getApellido1());
            ps.setString(3,est.getApellido2());
            ps.setString(4,est.getCurso());
            ps.setString(5,est.getRun());
            ps.setString(6,est.getCorreo());
            ps.setString(7,est.getFecha_nacimiento());
            ps.setInt(8,est.getEdad());
            ps.setInt(9,est.getPeso());
            ps.setInt(10,est.getEstatura());
            ps.setInt(11,id);
            res = ps.executeUpdate();
            cnn.close();
        } catch (HeadlessException | SQLException e) {
            System.err.println(e);
        }
        return res;
    }
    
    public Estudiante getEstudianteById(int id){
        ResultSet res;
        Estudiante est = new Estudiante();
        try {
            Conexion db = new Conexion();
            Connection cnn = db.conectarMySQL();
            String consulta = "SELECT * FROM estudiantes  WHERE estudiante_id=?";
            PreparedStatement ps = cnn.prepareStatement(consulta);
            ps.setInt(1,id);
            res = ps.executeQuery();
            if (res.next()) {
                est.setEstudiante_id(res.getInt("estudiante_id"));
                est.setNombre(res.getString("nombre"));
                est.setApellido1(res.getString("apellido1"));
                est.setApellido2(res.getString("apellido2"));
                est.setCurso(res.getString("curso"));
                est.setRun(res.getString("run"));
                est.setCorreo(res.getString("correo"));
                est.setFecha_nacimiento(res.getString("fecha_nacimiento"));
                est.setEdad(res.getInt("edad"));
                est.setPeso(res.getInt("peso"));
                est.setEstatura(res.getInt("estatura"));
            }
        } catch (HeadlessException | SQLException e) {
            System.err.println(e);
        }
        return est;
    }
    
    public int deleteEstudianteById(int id){
        int res = 0;
        try {
            Conexion db = new Conexion();
            Connection cnn = db.conectarMySQL();
            String consulta = "DELETE FROM estudiantes WHERE estudiante_id=?";
            PreparedStatement ps = cnn.prepareStatement(consulta);    
            ps.setInt(1, id);
            res = ps.executeUpdate();
            cnn.close();
        } catch (HeadlessException | NumberFormatException | SQLException e) {
            System.err.println(e);
        }
        return res;
    }
}
