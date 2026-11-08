package com.informaticonfig.spring.app1.springboot_applications.models.dto;

public class EmpleadoDTO {
    private String nombre;
    private String apellido;
    private String direccion;
    private String puesto;
    private Integer edad;
    private String telefono;
    private Integer id;

    public EmpleadoDTO() {
    }

    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }
    public String getApellido() { return apellido; }
    public void setApellido(String apellido) { this.apellido = apellido; }
    public String getDireccion() { return direccion; }
    public void setDireccion(String direccion) { this.direccion = direccion; }
    public String getPuesto() { return puesto; }
    public void setPuesto(String puesto) { this.puesto = puesto; }
    public Integer getEdad() { return edad; }
    public void setEdad(Integer edad) { this.edad = edad; }
    public String getTelefono() { return telefono; }
    public void setTelefono(String telefono) { this.telefono = telefono; }
    public Integer getId() { return id; }
    public void setId(Integer id) { this.id = id; }
}
