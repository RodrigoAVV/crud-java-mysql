package clases;
public class Estudiante {
    private int estudiante_id;
    private String nombre;
    private String apellido1;
    private String apellido2;
    private String curso;
    private String run;
    private String correo;
    private String fecha_nacimiento;
    private int edad;
    private int peso;
    private int estatura;

    public Estudiante(int estudiante_id, String nombre, String apellido1, String apellido2, String curso, String run, String correo, String fecha_nacimiento, int edad, int peso, int estatura) {
        this.estudiante_id = estudiante_id;
        this.nombre = nombre;
        this.apellido1 = apellido1;
        this.apellido2 = apellido2;
        this.curso = curso;
        this.run = run;
        this.correo = correo;
        this.fecha_nacimiento = fecha_nacimiento;
        this.edad = edad;
        this.peso = peso;
        this.estatura = estatura;
    }

    public Estudiante() {
    }

    public int getEstudiante_id() {
        return estudiante_id;
    }

    public void setEstudiante_id(int estudiante_id) {
        this.estudiante_id = estudiante_id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido1() {
        return apellido1;
    }

    public void setApellido1(String apellido1) {
        this.apellido1 = apellido1;
    }

    public String getApellido2() {
        return apellido2;
    }

    public void setApellido2(String apellido2) {
        this.apellido2 = apellido2;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public String getRun() {
        return run;
    }

    public void setRun(String run) {
        this.run = run;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getFecha_nacimiento() {
        return fecha_nacimiento;
    }

    public void setFecha_nacimiento(String fecha_nacimiento) {
        this.fecha_nacimiento = fecha_nacimiento;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    public int getEstatura() {
        return estatura;
    }

    public void setEstatura(int estatura) {
        this.estatura = estatura;
    }

    @Override
    public String toString() {
        return "Estudiante{" + "estudiante_id=" + estudiante_id + ", nombre=" + nombre + ", apellido1=" + apellido1 + ", apellido2=" + apellido2 + ", curso=" + curso + ", run=" + run + ", correo=" + correo + ", fecha_nacimiento=" + fecha_nacimiento + ", edad=" + edad + ", peso=" + peso + ", estatura=" + estatura + '}';
    }
}
