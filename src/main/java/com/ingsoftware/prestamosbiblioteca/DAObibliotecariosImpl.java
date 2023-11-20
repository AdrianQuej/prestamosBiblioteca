/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ingsoftware.prestamosbiblioteca;

import com.ingsoftware.db.Database;
import com.ingsoftware.interfaces.DAObibliotecarios;
import com.ingsoftware.models.bibliotecarios;
import java.sql.PreparedStatement;
import java.util.List;

/**
 *
 * @author Adrian Quej
 */
public class DAObibliotecariosImpl extends Database implements DAObibliotecarios{

    @Override
    public void registrar(bibliotecarios bib) throws Exception {
        try{
            this.Conectar();
            PreparedStatement st = this.conexion.prepareStatement("INSERT INTO bibliotecarios(usuario, contrasena, nombre) VALUES(?,?,?)");
            st.setString(1, bib.getUsuario());
            st.setString(2, bib.getContrasena());
            st.setString(3, bib.getNombre());
            st.executeUpdate();
            st.close();
        } catch (Exception e){
            throw e;
        } finally {
            this.Cerrar();
        }
    }

    @Override
    public void modificar(bibliotecarios bib) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void eliminar(bibliotecarios bib) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public List<bibliotecarios> listar() throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
