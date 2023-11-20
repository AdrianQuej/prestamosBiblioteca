/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ingsoftware.prestamosbiblioteca;

import com.ingsoftware.db.Database;
import com.ingsoftware.interfaces.DAOclientes;
import com.ingsoftware.models.clientes;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Adrian Quej
 */
public class DAOclientesImpl extends Database implements DAOclientes{
    @Override
    public void registrar(clientes cli) throws Exception {
        try{
            this.Conectar();
            PreparedStatement st = this.conexion.prepareStatement("INSERT INTO clientes(nombre, direccion,telefono) VALUES(?,?,?)");
            
            st.setString(1, cli.getNombre());
            st.setString(2, cli.getDireccion());
            st.setString(3, cli.getTelefono());
            st.executeUpdate();
            st.close();
            
        } catch (Exception e){
            throw e;
        } finally {
            this.Cerrar();
        }
    }

    @Override
    public void modificar(clientes cli) throws Exception {
        try{
            this.Conectar();
            PreparedStatement st = this.conexion.prepareStatement("UPDATE clientes SET nombre = ?, direccion= ?, telefono= ? WHERE clientesID = ?;");
            
            st.setString(1, cli.getNombre());
            st.setString(2, cli.getDireccion());
            st.setString(3, cli.getTelefono());
            st.setInt(4, cli.getClientesID());

            st.executeUpdate();
            st.close();
            
        } catch (Exception e){
            throw e;
        } finally {
            this.Cerrar();
        }
    }

    @Override
    public void eliminar(int clientesID) throws Exception {
        try{
            this.Conectar();
            PreparedStatement st = this.conexion.prepareStatement("DELETE FROM clientes WHERE clientesID = ?;");
            
            st.setInt(1, clientesID);
            st.executeUpdate();
            st.close();
            
        } catch (Exception e){
            throw e;
        } finally {
            this.Cerrar();
        }
    }

    @Override
    public List<clientes> listar(String nombre) throws Exception {
        List<clientes> lista = null;
        try{ 
            this.Conectar();
            String Query = nombre.isEmpty() ? "SELECT * FROM clientes;" : "SELECT * FROM clientes WHERE nombre LIKE '%" + nombre + "%';";
            PreparedStatement st = this.conexion.prepareStatement(Query);
            
            lista = new ArrayList();
            ResultSet rs = st.executeQuery();
            while (rs.next()) {
                clientes cli = new clientes();
                cli.setClientesID(rs.getInt("clientesID"));
                cli.setNombre(rs.getString("nombre"));
                cli.setDireccion(rs.getString("direccion"));
                cli.setTelefono(rs.getString("telefono"));
                lista.add(cli);
            }
            rs.close();
            st.close();
            
        } catch (Exception e){
            System.out.println(e.getMessage());
        } finally {
            this.Cerrar();
        }
        return lista;
    }

    @Override
    public clientes getclienteporid(int clienteid) throws Exception {
        clientes cli = new clientes();
        
        
        List<clientes> lista = null;
        try{ 
            this.Conectar();
            PreparedStatement st = this.conexion.prepareStatement("SELECT * FROM clientes WHERE clientesID = ? LIMIT 1;");
            st.setInt(1, clienteid);
            
            lista = new ArrayList();
            ResultSet rs = st.executeQuery();
            
            while (rs.next()) {
                cli.setClientesID(rs.getInt("clientesID"));
                cli.setNombre(rs.getString("nombre"));
                cli.setDireccion(rs.getString("direccion"));
                cli.setTelefono(rs.getString("telefono"));
            }
            rs.close();
            st.close();
            
        } catch (Exception e){
            System.out.println(e.getMessage());
        } finally {
            this.Cerrar();
        }
        return cli;
    }
}
