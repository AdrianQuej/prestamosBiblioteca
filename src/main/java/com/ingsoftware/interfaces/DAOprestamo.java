/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.ingsoftware.interfaces;

import com.ingsoftware.models.prestamo;
import java.util.List;

/**
 *
 * @author Adrian Quej
 */
public interface DAOprestamo {
    public void registrar(prestamo pre) throws Exception;
    public void modificar(prestamo pre) throws Exception;
    public void eliminar(int prestamoID) throws Exception;
    public List<prestamo> listar(int prestamoID) throws Exception;
}
