/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.ingsoftware.interfaces;

import com.ingsoftware.models.libros;
import java.util.List;

/**
 *
 * @author Adrian Quej
 */
public interface DAOlibros {
    public void registrar(libros lib) throws Exception;
    public void modificar(libros lib) throws Exception;
    public void eliminar(int libroID) throws Exception;
    public List<libros> listar(String nombre) throws Exception;
    public libros getlibroporid(int U) throws Exception;
}
