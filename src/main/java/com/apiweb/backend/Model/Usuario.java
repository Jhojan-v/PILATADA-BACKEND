package com.apiweb.backend.Model;

import jakarta.persistence.*;

@Entity
@Table(name = "usuario")
public class Usuario {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id_usuario;

    private String nombre;

    private String correo;

    private String password;

  //  @ManyToOne
 //   @JoinColumn(name = "id_facultad")
 //   private Facultad facultad;

//    @ManyToOne
//   @JoinColumn(name = "id_rol")
//    private Rol rol;

    // GETTERS Y SETTERS
    public int getId_usuario() {
        return id_usuario;
    }

    public void setId_usuario(int id_usuario) {
        this.id_usuario = id_usuario;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

   // public Facultad getFacultad() {
     //   return facultad;
 //   }

  //  public void setFacultad(Facultad facultad) {
  //      this.facultad = facultad;
  //  }

  //  public Rol getRol() {
  //      return rol;
  //  }

  //  public void setRol(Rol rol) {
      //  this.rol = rol;
  //  }
}