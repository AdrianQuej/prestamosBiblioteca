/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.ingsoftware.interfaces;

import com.ingsoftware.models.bibliotecarios;
import java.util.List;

/**
 *
 * @author Adrian Quej
 */
public interface DAObibliotecarios {
    public void registrar(bibliotecarios bib) throws Exception;
    public void modificar(bibliotecarios bib) throws Exception;
    public void eliminar(bibliotecarios bib) throws Exception;
    public List<bibliotecarios> listar() throws Exception;
    public boolean getLoginBib(String usuario, String contrasena) throws Exception;
    public bibliotecarios buscarBibliotecario(String usuario) throws Exception;
    
}
