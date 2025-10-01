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
public class ClienteController {

    private TreeMap<Integer, Cliente> coleccionClientes;

    public ClienteController() {
        coleccionClientes = new TreeMap<>();
    }

    public void agregarCliente(Cliente unCliente) {
        coleccionClientes.put(unCliente.getRut(), unCliente);
    }
    
    public List<Cliente>getClientes(){
        return new ArrayList<>(coleccionClientes.values());
    }
}
