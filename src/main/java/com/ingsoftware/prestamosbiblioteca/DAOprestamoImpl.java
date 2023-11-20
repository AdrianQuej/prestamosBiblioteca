/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ingsoftware.prestamosbiblioteca;

import com.ingsoftware.db.Database;
import com.ingsoftware.interfaces.DAOprestamo;
import com.ingsoftware.models.libros;
import com.ingsoftware.models.prestamo;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Adrian Quej
 */
public class DAOprestamoImpl extends Database implements DAOprestamo {

    @Override
    public void registrar(prestamo pre) throws Exception {
        try{
            this.Conectar();
            PreparedStatement st = this.conexion.prepareStatement("INSERT INTO prestamo(libroID, bibliotecarioID, clienteID, fecha_prestamo, fecha_devolucion, tipo_prestamo) VALUES(?,?,?,?,?,?);");
            
            st.setInt(1, pre.getLibroID());
            st.setInt(2, pre.getBibliotecarioID());
            st.setInt(3, pre.getClienteID());
            st.setString(4, pre.getFecha_prestamo());
            st.setString(5, pre.getFecha_devolucion());
            st.setString(6, pre.getTipo_prestamo());
            st.executeUpdate();
            st.close();
            
        } catch (Exception e){
            throw e;
        } finally {
            this.Cerrar();
        }
    }

    @Override
    public void modificar(prestamo pre) throws Exception {
        try{
            this.Conectar();
            PreparedStatement st = this.conexion.prepareStatement("UPDATE prestamo SET libroID = ?, bibliotecarioID= ?, clienteID= ?, fecha_prestamo = ?, fecha_devolucion = ?, tipo_prestamo = ? WHERE prestamoID = ?;");
            
            st.setInt(1, pre.getLibroID());
            st.setInt(2, pre.getBibliotecarioID());
            st.setInt(3, pre.getClienteID());
            st.setString(4, pre.getFecha_prestamo());
            st.setString(5, pre.getFecha_devolucion());
            st.setString(6, pre.getTipo_prestamo());
            st.setInt(7, pre.getPrestamoID());
            st.executeUpdate();
            st.close();
            
        } catch (Exception e){
            throw e;
        } finally {
            this.Cerrar();
        }
    }

    @Override
    public void eliminar(int prestamoID) throws Exception {
        try{
            
            this.Conectar();
            PreparedStatement st = this.conexion.prepareStatement("UPDATE prestamo SET estadoPrestamo = ? WHERE prestamoID = ?;");
            st.setString(1, "ENTREGADO");
            st.setInt(2, prestamoID);
            st.executeUpdate();
            st.close();
            
        } catch (Exception e){
            throw e;
        } finally {
            this.Cerrar();
        }
    }

    @Override
    public List<prestamo> listar(int prestamoID) throws Exception {
        List<prestamo> lista = null;
        try{ 
            this.Conectar();
            String Query = prestamoID==-1 ? "SELECT * FROM prestamo;" : "SELECT * FROM prestamo WHERE prestamoID LIKE '%" + prestamoID + "%';";
            PreparedStatement st = this.conexion.prepareStatement(Query);
            
            lista = new ArrayList();
            ResultSet rs = st.executeQuery();
            while (rs.next()) {
                prestamo pres = new prestamo();
                pres.setPrestamoID(rs.getInt("prestamoID"));
                pres.setLibroID(rs.getInt("libroID"));
                pres.setBibliotecarioID(rs.getInt("bibliotecarioID"));
                pres.setClienteID(rs.getInt("clienteID"));
                pres.setFecha_prestamo(rs.getString("fecha_prestamo"));
                pres.setFecha_devolucion(rs.getString("fecha_devolucion"));
                pres.setTipo_prestamo(rs.getString("tipo_prestamo"));
                pres.setEstadoPrestamo(rs.getString("estadoPrestamo"));
                lista.add(pres);
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
    
}
