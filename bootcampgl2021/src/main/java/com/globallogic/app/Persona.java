package com.globallogic.app;

public abstract class Persona {


    public String documento;
    public String nacion;

    public String getDocumento() {
        return documento;
    }

    public void setDocumento(String documento) {
        this.documento = documento;
    }

    public String getNacion() {
        return nacion;
    }

    public void setNacion(String nacion) {
        this.nacion = nacion;
    }

    public Persona(String documento, String nacion) {
        this.documento = documento;
        this.nacion = nacion;
    }

    public abstract void mostrarDatos();

    
}
