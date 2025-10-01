/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author maria
 */
public class Cliente {
    int rut;
    String razon_social;
    String direccion;
    float limite_credito;
    float deuda;

    public int getRut() {
        return rut;
    }

    public void setRut(int rut) {
        this.rut = rut;
    }

    public String getRazon_social() {
        return razon_social;
    }

    public void setRazon_social(String razon_social) {
        this.razon_social = razon_social;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public float getLimite_credito() {
        return limite_credito;
    }

    public void setLimite_credito(float limite_credito) {
        this.limite_credito = limite_credito;
    }

    public float getDeuda() {
        return deuda;
    }

    public void setDeuda(float deuda) {
        this.deuda = deuda;
    }

    public Cliente() {
    }

    public Cliente(int rut, String razon_social, String direccion, float limite_credito, float deuda) {
        this.rut = rut;
        this.razon_social = razon_social;
        this.direccion = direccion;
        this.limite_credito = limite_credito;
        this.deuda = deuda;
    }
    
    
}
