package org.example.Utilidades;

public enum Mensaje {
    FORMATO_NOMBRE("Revise el formato del nombre"),
    LONGITUD_NOMBRE("El nombre debe ser mayor a 10 digitos"),
    FORMATO_UBICACION("La ubicacion debe ser un numero"),
    FORMATO_CORREO("Revise el formato del correo");

    private String mensaje;

    Mensaje(String mensaje) {
        this.mensaje = mensaje;
    }

    public String getMensaje() {
        return mensaje;
    }

    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }
}
