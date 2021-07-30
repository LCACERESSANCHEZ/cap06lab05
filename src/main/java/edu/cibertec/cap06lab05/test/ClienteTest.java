/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.cibertec.cap06lab05.test;

import edu.cibertec.cap06lab05.dao.ClienteDAO;
import edu.cibertec.cap06lab05.dao.ClienteDAOImpl;
import edu.cibertec.cap06lab05.entity.ClienteEntity;
import java.util.List;
import java.sql.Date;     
public class ClienteTest {

     
    public static void main(String[] args) {
        ClienteDAO daocliente = new ClienteDAOImpl();
        /**** Para Listar Clientes ***/
        /*
        List<ClienteEntity> list = daocliente.clienteQry();
        for(ClienteEntity c1: list){
            System.out.println(c1.toString());
        }*/
        
        
        
        /****Para Insertar Clientes *****/      
        /*
        ClienteEntity c = new ClienteEntity();
        c.setAppaterno("Caceres");
        c.setApmaterno("Sanchez");
        c.setNombres("Luis");
        c.setNacimiento(new Date(System.currentTimeMillis()));
        c.setDireccion("Jr General sucre #123");
        c.setReferencia("Vega");
        c.setGenero("M");
        c.setEstado("1");
        System.out.println(daocliente.clientesIns(c));*/
        
        
        /****Para Eliminar Clientes *****/
        /*
        System.out.println(daocliente.clientesDel("8"));
        */
        
        /****Para Editar Clientes *****/  
        /*
        ClienteEntity c = new ClienteEntity();
        c.setCodigocliente(9);
        c.setAppaterno("Caceres");
        c.setApmaterno("Sanchez");
        c.setNombres("Luis");
        c.setNacimiento(new Date(System.currentTimeMillis()));
        c.setDireccion("Jr General sucre #123");
        c.setReferencia("Vega");
        c.setGenero("1");
        c.setEstado("1");
        System.out.println(daocliente.clientesUpd(c));
        */
        
        /****Para Capturar un Cliente *****/  
        System.out.println(daocliente.clientesGet(6));
    }
    
}
