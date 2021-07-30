/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.cibertec.cap06lab05.dao;

import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.Statement;
import java.sql.ResultSet;
import java.util.List;
import java.util.ArrayList;
import edu.cibertec.cap06lab05.entity.ClienteEntity;

public class ClienteDAOImpl implements ClienteDAO{
    private Connection obtenerConexion(){
        Connection conn = null;
        try {
            String driver = "com.mysql.jdbc.Driver";
            String url ="jdbc:mysql://localhost:3306/dbdat?serverTimezone=UTC";
            String user ="root";
            String pwd ="mysql";
            Class.forName(driver);
            conn = DriverManager.getConnection(url,user,pwd);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return conn;
    }
    @Override
    public List<ClienteEntity> clienteQry(){
        List<ClienteEntity> list =null;
        StringBuilder sql = new StringBuilder("SELECT ");
        sql.append(" codigocliente,appaterno,apmaterno,nombres,nacimiento,direccion, ");
        sql.append(" referencia,IF(genero LIKE '1','M','F'), ");
        sql.append(" IF(estado LIKE '1','Si','No') ");
        sql.append(" FROM cliente ORDER BY appaterno, apmaterno, nombres");
        try (Connection cn = obtenerConexion();
                Statement st = cn.createStatement();
                ResultSet rs = st.executeQuery(sql.toString());){
            list = new ArrayList<>();
            while(rs.next()){
                ClienteEntity c = new ClienteEntity();
                c.setCodigocliente(rs.getInt(1));
                c.setAppaterno(rs.getString(2));
                c.setApmaterno(rs.getString(3));
                c.setNombres(rs.getString(4));
                c.setNacimiento(rs.getDate(5));
                c.setDireccion(rs.getString(6));
                c.setReferencia(rs.getString(7));
                c.setGenero(rs.getString(8));
                c.setEstado(rs.getString(9));
                list.add(c);
            }
            cn.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return list;
    }
    @Override
    public String clientesIns(ClienteEntity clientes){
        String result="";
        String sql ="INSERT INTO cliente("
                + "appaterno, apmaterno,nombres,nacimiento,direccion,referencia,genero,estado) "
                + "values (?,?,?,?,?,?,?,?)";
        try (Connection cn = obtenerConexion();
                PreparedStatement ps = cn.prepareStatement(sql)){
                ps.setString(1, clientes.getAppaterno());
                ps.setString(2, clientes.getApmaterno());
                ps.setString(3, clientes.getNombres());
                ps.setDate(4, clientes.getNacimiento());
                ps.setString(5, clientes.getDireccion());
                ps.setString(6, clientes.getReferencia());
                ps.setString(7, clientes.getGenero());
                ps.setString(8, clientes.getEstado());
              
                int ctos = ps.executeUpdate();
                if (ctos==0){
                    result ="0 filas afectadas";
                }
                cn.close();
        } catch (Exception e) {
            result = e.getMessage();
        }
        return result;
    }
    @Override
    public String clientesDel(String ids){
        String result ="";
        String sql ="DELETE FROM cliente WHERE codigocliente="+ids;
        try (Connection cn = obtenerConexion();
                Statement st = cn.createStatement()){
                int ctos = st.executeUpdate(sql);
                if (ctos==0){
                    result ="0 filas afectadas";
                }
                cn.close();
        } catch (Exception e) {
            result = e.getMessage();
        }
        return result;
    }
    
    @Override
    public String clientesUpd(ClienteEntity clientes){
        String result="";
        String sql ="UPDATE cliente "
                + "SET appaterno = ?, apmaterno = ?, nombres = ?, nacimiento = ?, direccion = ?, referencia = ?, genero = ?, estado = ? WHERE (codigocliente = ?)";
        try (Connection cn = obtenerConexion();
                PreparedStatement ps = cn.prepareStatement(sql)){
                ps.setString(1, clientes.getAppaterno());
                ps.setString(2, clientes.getApmaterno());
                ps.setString(3, clientes.getNombres());
                ps.setDate(4, clientes.getNacimiento());
                ps.setString(5, clientes.getDireccion());
                ps.setString(6, clientes.getReferencia());
                ps.setString(7, clientes.getGenero());
                ps.setString(8, clientes.getEstado());
                ps.setInt(9, clientes.getCodigocliente());
              
                int ctos = ps.executeUpdate();
                if (ctos==0){
                    result ="0 filas afectadas";
                }
                cn.close();
        } catch (Exception e) {
            result = e.getMessage();
        }
        return result;
    }

    @Override
    public ClienteEntity clientesGet(Integer idcliente) {
        ClienteEntity cliente = new ClienteEntity();
        StringBuilder sql = new StringBuilder("SELECT ");
        sql.append(" codigocliente,appaterno,apmaterno,nombres,nacimiento,direccion, ");
        sql.append(" referencia,genero, estado");
        sql.append(" FROM cliente WHERE codigocliente = ");
        sql.append(idcliente);
        try (Connection cn = obtenerConexion();
                Statement st = cn.createStatement();
                ResultSet rs = st.executeQuery(sql.toString());){
            while (rs.next()) {
                cliente.setCodigocliente(rs.getInt(1));
                cliente.setAppaterno(rs.getString(2));
                cliente.setApmaterno(rs.getString(3));
                cliente.setNombres(rs.getString(4));
                cliente.setNacimiento(rs.getDate(5));
                cliente.setDireccion(rs.getString(6));
                cliente.setReferencia(rs.getString(7));
                cliente.setGenero(rs.getString(8));
                cliente.setEstado(rs.getString(9));
            }
            cn.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return cliente;
    }
}
