package ArgProg40.ClaseCinco;

import java.time.LocalDateTime;

public class Persona {
    private String nombre;
    private String apellido;
    private LocalDateTime fechadeNacimiento;

    public Persona() {

    }

    public Persona(String nombre, String apellido, LocalDateTime fechadeNacimiento) {
        this.setNombre(nombre);
        this.setApellido(apellido);
        this.fechadeNacimiento = fechadeNacimiento;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre.toUpperCase().charAt(0) + nombre.substring(1, nombre.length()).toLowerCase();
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido.toUpperCase().charAt(0) + apellido.substring(1, apellido.length()).toLowerCase();

    }

    public LocalDateTime getFechadeNacimiento() {
        return fechadeNacimiento;
    }

    public void setFechadeNacimiento(LocalDateTime fechadeNacimiento) {
        this.fechadeNacimiento = fechadeNacimiento;
    }

    @Override
    public String toString() {
        return nombre + " " + apellido;
    }
}
