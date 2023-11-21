/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ingsoftware.prestamosbiblioteca;

import com.ingsoftware.db.Database;
import com.ingsoftware.interfaces.DAObibliotecarios;
import com.ingsoftware.models.bibliotecarios;
import com.ingsoftware.models.clientes;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
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

    @Override
    public boolean getLoginBib(String usuario, String contrasena) throws Exception {
        bibliotecarios bib = new bibliotecarios();
        List<bibliotecarios> lista = null;
        try{ 
            this.Conectar();
            PreparedStatement st = this.conexion.prepareStatement("SELECT * FROM bibliotecarios WHERE usuario = ? && contrasena = ? LIMIT 1;");
            st.setString(1, usuario);
            st.setString(2, contrasena);
            
            lista = new ArrayList();
            ResultSet rs = st.executeQuery();
            
            while (rs.next()) {
                bib.setBibliotecarioID(rs.getInt("bibliotecarioID"));
                bib.setUsuario(rs.getString("usuario"));
                bib.setContrasena(rs.getString("contrasena"));
                bib.setNombre(rs.getString("nombre"));
            }
            
            
            rs.close();
            st.close();
            System.out.println(bib.getBibliotecarioID());
        } catch (Exception e){
            System.out.println(e.getMessage());
        } finally {
            this.Cerrar();
        }
        if (bib.getBibliotecarioID() != 0) {
                return true;
            } else { return false;}
    }

    @Override
    public bibliotecarios buscarBibliotecario(String usuario) throws Exception {
        bibliotecarios bib = new bibliotecarios();
        List<bibliotecarios> lista = null;
        try{ 
            this.Conectar();
            PreparedStatement st = this.conexion.prepareStatement("SELECT * FROM bibliotecarios WHERE usuario = ? LIMIT 1;");
            st.setString(1, usuario);
            
            
            lista = new ArrayList();
            ResultSet rs = st.executeQuery();
            
            while (rs.next()) {
                bib.setBibliotecarioID(rs.getInt("bibliotecarioID"));
                bib.setUsuario(rs.getString("usuario"));
                bib.setContrasena(rs.getString("contrasena"));
                bib.setNombre(rs.getString("nombre"));
            }
            
            
            rs.close();
            st.close();
            System.out.println(bib.getBibliotecarioID());
        } catch (Exception e){
            System.out.println(e.getMessage());
        } finally {
            this.Cerrar();
        }
        
        return bib;
    }
    
}
