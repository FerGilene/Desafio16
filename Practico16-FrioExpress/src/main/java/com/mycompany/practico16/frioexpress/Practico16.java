/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.practico16.frioexpress;

import controlador.ClienteController;
import controlador.ProductoController;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import modelo.Cliente;
import modelo.Producto;

/**
 *
 * @author maria
 */
public class Practico16 {

    static Scanner sc = new Scanner(System.in);
    private static ProductoController controladorProducto = new ProductoController();
    private static ClienteController controladorCliente = new ClienteController();

    public static void main(String[] args) {
        
        System.out.println("INGRESE UNA OPCION");
        System.out.println("1. Ingresar producto");
        System.out.println("2. Ingresar cliente");
        System.out.println("3. Mostrar productos");
        System.out.println("4. Mostrar clientes");
        System.out.println("5. Realizar pedido");
        System.out.println("6. Mostrar productos con stock minimo");
        System.out.println("7. Alerta de cadena de frio");
        System.out.println("8. Salir");
        System.out.print("Seleccione una opción: ");
        
        int opcion = sc.nextInt();

        switch (opcion) {
            case 1:
                ingresarProducto();
                break;
            case 2:
                ingresarCliente();
                break;

            case 3:
                mostrarProductos();
                break;

            case 4:
                mostrarClientes();
                break;
            case 5:
                 realizarPedido();
                break;
            case 6:
                mostrarStockMinimo();
                break;
            case 7:
                alertaCadenaFrio();
                break;
        }

    }

    public static void mostrarStockMinimo() {
        List<Producto> StockMinimos = new ArrayList<>();
        StockMinimos = controladorProducto.getProductosStockMinimo();
        for (Producto unProducto : StockMinimos) {
            System.out.println("Código: " + unProducto.getCodigo()
                    + ", Nombre: " + unProducto.getNombre()
                    + ", Temperatura: " + unProducto.getTemperatura()
                    + ", Minutos fuera: " + unProducto.getMinutos());
        }
    }

    public static void mostrarClientes() {
        List<Cliente> colClientes;
        colClientes = controladorCliente.getClientes();
        for (Cliente unCliente : colClientes) {
            System.out.println("RUT: " + unCliente.getRut()
                    + ", Razon Social: " + unCliente.getRazon_social()
                    + ", Direccion: " + unCliente.getDireccion()
                    + ", Limite de credito: " + unCliente.getLimite_credito()
                    + ", Deuda: " + unCliente.getDeuda()
            );
        }
    }

    public static void mostrarProductos() {
        List<Producto> colProductos;
        colProductos = controladorProducto.getProductos();
        for (Producto unProducto : colProductos) {
            System.out.println("Código: " + unProducto.getCodigo()
                    + ", Nombre: " + unProducto.getNombre()
                    + ", Temperatura: " + unProducto.getTemperatura()
                    + ", Minutos fuera: " + unProducto.getMinutos());
        }
    }

    public static void alertaCadenaFrio(){

    }
    
    public static void realizarPedido(){
        
    }

    public static void ingresarProducto() {
        System.out.println("Ingrese el codigo: ");
        int codigo = sc.nextInt();
        sc.nextLine(); // limpia el salto de línea pendiente
        System.out.println("Ingrese el nombre: ");
        String nombre = sc.nextLine();
        System.out.println("Ingrese la categoria: ");
        String categoria = sc.nextLine();
        //Cuando usas nextInt() o nextFloat(), el Scanner no consume el salto de línea, así que el siguiente nextLine() se salta la entrada.
        System.out.println("Ingrese la temperatura: ");
        int temperatura = sc.nextInt();
        sc.nextLine(); // limpia el salto de línea pendiente
        System.out.println("Ingrese el stock: ");
        int stock = sc.nextInt();
        sc.nextLine(); // limpia el salto de línea pendiente
        System.out.println("Ingrese el stock minimo: ");
        int stock_minimo = sc.nextInt();
        sc.nextLine(); // limpia el salto de línea pendiente
        int minutos = sc.nextInt();
        sc.nextLine();
        System.out.println("Ingrese el precio: ");
        float precio = sc.nextFloat();
        sc.nextLine(); // limpia el salto de línea pendiente
        Producto unProducto = new Producto(codigo, nombre, categoria, temperatura, stock, stock_minimo, precio, minutos);
        controladorProducto.agregarProducto(unProducto);

    }

    public static void ingresarCliente() {
        System.out.println("Ingrese el RUT: ");
        int rut = sc.nextInt();
        System.out.println("Ingrese la razon social: ");
        String razon_social = sc.nextLine();
        System.out.println("Ingrese el direccion: ");
        String direccion = sc.nextLine();
        System.out.println("Ingrese el limite de credito: ");
        float limite_credito = sc.nextFloat();
        System.out.println("Ingrese la deuda actual: ");
        float deuda = sc.nextFloat();
        sc.nextLine();
        Cliente unCliente = new Cliente(rut, razon_social, direccion, limite_credito, deuda);
        controladorCliente.agregarCliente(unCliente);
    }

}
