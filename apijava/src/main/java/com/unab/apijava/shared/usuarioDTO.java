package com.unab.apijava.shared;

import java.io.Serializable;

public class usuarioDTO implements Serializable {
    
    private static final long serialVersionUID =1L;

    private long id;
    private String userId;
    private String nombre;
    private String correo;
    private String userName;
    private String password;
    private String ecrytedpassword;
    
    public long getId() {
        return id;
    }
    public void setId(long id) {
        this.id = id;
    }
    public String getUserId() {
        return userId;
    }
    public void setUserId(String userId) {
        this.userId = userId;
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
    public String getUserName() {
        return userName;
    }
    public void setUserName(String userName) {
        this.userName = userName;
    }
    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }
    public String getEcrytedpassword() {
        return ecrytedpassword;
    }
    public void setEcrytedpassword(String ecrytedpassword) {
        this.ecrytedpassword = ecrytedpassword;
    }

    
    
  
}
