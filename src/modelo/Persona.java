/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author Javier_Prado
 */
abstract class Persona {
    
    private String nombres, apellidos, direccion, tel, genero, mail, fecha_n;

    public Persona(String nombres, String apellidos, String direccion, String tel, String genero, String mail, String fecha_n) {
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.direccion = direccion;
        this.telefono = tel;
        this.genero = genero;
        this.mail = mail;
        this.fecha_nacimiento = fecha_n;
    }
    

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTelefono() {
        return tel;
    }

    public void setTelefono(String telefono) {
        this.telefono = tel;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getmail() {
        return mail;
    }

    public void setmail(String email) {
        this.email = mail;
    }

    public String getFecha_n() {
        return fecha_n;
    }

    public void setFecha_n(String fecha_n) {
        this.fecha_n = fecha_n;
    }
    
        
    protected void agregar(){}
    public void actualizar(){}
    protected void eliminar(){}
}
