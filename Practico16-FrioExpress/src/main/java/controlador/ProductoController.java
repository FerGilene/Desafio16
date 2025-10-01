/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

import java.util.ArrayList;
import java.util.List;
import java.util.TreeMap;
import modelo.Cliente;
import modelo.Producto;

/**
 *
 * @author maria
 */
public class ProductoController {
    private TreeMap <Integer, Producto> coleccionProductos;
    
    // Constructor
    public ProductoController() {
        coleccionProductos = new TreeMap<>();
    }
    
    public void agregarProducto(Producto unProducto){
        coleccionProductos.put(unProducto.getCodigo(), unProducto);
    }
    
    
    public List<Producto>getProductos(){
        return new ArrayList<>(coleccionProductos.values());
    }
    
   public List<Producto>getProductosStockMinimo(){
       List<Producto> StockMinimos= new ArrayList<>();//Creo una nueva lista para agregar los productos con stock minimo
       for (Producto unProducto : coleccionProductos.values()){ //recorro la coleccion ordenada coleccionProductos
           if (unProducto.getStock()< unProducto.getStock_minimo()){ //Comparo los stock
               StockMinimos.add(unProducto); //Si se cumple la condicion ded stock minimo lo cargo en la nueva lista
           }
       }
       return StockMinimos; //devuelvo la lista fitrada
    }
   
    public List<Producto>getRompeCadednaFrio(){
       List<Producto> alertoFrios= new ArrayList<>();//Creo una nueva lista para agregar los productos con stock minimo
       for (Producto unProducto : coleccionProductos.values()){ //recorro la coleccion ordenada coleccionProductos
           if (unProducto.getTemperatura() > -18 && unProducto.getMinutos()>=30){ //Comparo los minutos y temperatura
               alertoFrios.add(unProducto); //Si se cumple la condicion ded stock minimo lo cargo en la nueva lista
           }
       }
       return alertoFrios; //devuelvo la lista fitrada
    }
   
    
}
