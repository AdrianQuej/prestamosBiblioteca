/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.ingsoftware.interfaces;

import com.ingsoftware.models.clientes;
import java.util.List;

/**
 *
 * @author Adrian Quej
 */
public interface DAOclientes {
    public void registrar(clientes cli) throws Exception;
    public void modificar(clientes cli) throws Exception;
    public void eliminar(int clientesID) throws Exception;
    public List<clientes> listar(String nombre) throws Exception;
    public clientes getclienteporid(int U) throws Exception;
}
