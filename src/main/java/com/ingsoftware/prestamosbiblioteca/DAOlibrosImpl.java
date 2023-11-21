/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ingsoftware.prestamosbiblioteca;

import com.ingsoftware.db.Database;
import com.ingsoftware.interfaces.DAOlibros;
import com.ingsoftware.models.clientes;
import com.ingsoftware.models.libros;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Adrian Quej
 */
public class DAOlibrosImpl extends Database implements DAOlibros {

    @Override
    public void registrar(libros lib) throws Exception {
        try{
            this.Conectar();
            PreparedStatement st = this.conexion.prepareStatement("INSERT INTO libros(nombre_libro, autor, ISBN, ano, Num_copia) VALUES(?,?,?,?,?);");
            
            st.setString(1, lib.getNombre_libro());
            st.setString(2, lib.getAutor());
            st.setString(3, lib.getISBN());
            st.setInt(4, lib.getAno());
            st.setInt(5, lib.getNum_copia());
            st.executeUpdate();
            st.close();
            
        } catch (Exception e){
            throw e;
        } finally {
            this.Cerrar();
        }
    }

    @Override
    public void modificar(libros lib) throws Exception {
        try{
            this.Conectar();
            PreparedStatement st = this.conexion.prepareStatement("UPDATE libros SET nombre_libro = ?, autor= ?, ISBN= ?, ano = ?, Num_copia = ? WHERE libroID = ?;");
            
            st.setString(1, lib.getNombre_libro());
            st.setString(2, lib.getAutor());
            st.setString(3, lib.getISBN());
            st.setInt(4, lib.getAno());
            st.setInt(5, lib.getNum_copia());
            st.setInt(6, lib.getLibroID());

            st.executeUpdate();
            st.close();
            
        } catch (Exception e){
            throw e;
        } finally {
            this.Cerrar();
        }
    }

    @Override
    public void eliminar(int libroID) throws Exception {
        try{
            this.Conectar();
            PreparedStatement st = this.conexion.prepareStatement("DELETE FROM libros WHERE libroID = ?;");
            
            st.setInt(1, libroID);
            st.executeUpdate();
            st.close();
            
        } catch (Exception e){
            throw e;
        } finally {
            this.Cerrar();
        }
    }

    @Override
    public List<libros> listar(String nombre) throws Exception {
        List<libros> lista = null;
        try{ 
            this.Conectar();
            String Query = nombre.isEmpty() ? "SELECT * FROM libros;" : "SELECT * FROM libros WHERE nombre_libro LIKE '%" + nombre + "%';";
            PreparedStatement st = this.conexion.prepareStatement(Query);
            
            lista = new ArrayList();
            ResultSet rs = st.executeQuery();
            while (rs.next()) {
                libros lib = new libros();
                lib.setLibroID(rs.getInt("libroID"));
                lib.setNombre_libro(rs.getString("nombre_libro"));
                lib.setAutor(rs.getString("autor"));
                lib.setISBN(rs.getString("ISBN"));
                lib.setAno(rs.getInt("ano"));
                lib.setNum_copia(rs.getInt("Num_copia"));
                lista.add(lib);
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
    public libros getlibroporid(int U) throws Exception {
        libros lib = new libros();
        
        
        List<libros> lista = null;
        try{ 
            this.Conectar();
            PreparedStatement st = this.conexion.prepareStatement("SELECT * FROM libros WHERE libroID = ? LIMIT 1;");
            st.setInt(1, U);
            
            lista = new ArrayList();
            ResultSet rs = st.executeQuery();
            
            while (rs.next()) {
                lib.setLibroID(rs.getInt("libroID"));
                lib.setNombre_libro(rs.getString("nombre_libro"));
                lib.setAutor(rs.getString("autor"));
                lib.setISBN(rs.getString("ISBN"));
                lib.setAno(rs.getInt("ano"));
                lib.setNum_copia(rs.getInt("Num_copia"));
            }
            rs.close();
            st.close();
            
        } catch (Exception e){
            System.out.println(e.getMessage());
        } finally {
            this.Cerrar();
        }
        return lib;
    }
    
}
