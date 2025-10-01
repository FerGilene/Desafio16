/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author maria
 */
public class Producto {
    int codigo;
    String nombre;
    String categoria;
    int temperatura;
    int stock;
    int stock_minimo;
    float precio;
    int minutos;

    public int getMinutos() {
        return minutos;
    }
    
    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public int getTemperatura() {
        return temperatura;
    }

    public void setTemperatura(int temperatura) {
        this.temperatura = temperatura;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public int getStock_minimo() {
        return stock_minimo;
    }

    public void setStock_minimo(int stock_minimo) {
        this.stock_minimo = stock_minimo;
    }

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }

    public Producto() {
    }

    public Producto(int codigo, String nombre, String categoria, int temperatura, int stock, int stock_minimo, float precio, int minutos) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.categoria = categoria;
        this.temperatura = temperatura;
        this.stock = stock;
        this.stock_minimo = stock_minimo;
        this.precio = precio;
        this.minutos=minutos;
        
    }
    
    
}
