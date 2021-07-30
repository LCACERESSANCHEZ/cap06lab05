
package edu.cibertec.cap06lab05.entity;

import java.sql.Date;

public class ClienteEntity {
    private Integer codigocliente;
    private String appaterno;
    private String apmaterno;
    private String nombres;
    private Date nacimiento;
    private String direccion;
    private String referencia;
    private String genero;
    private String estado;
    
    public ClienteEntity(){
        
    }
    public ClienteEntity(Integer codigocliente,String appaterno,String apmaterno,String nombres,
    Date nacimiento,String direccion,String referencia,String genero,String estado){
        this.codigocliente=codigocliente;
        this.appaterno=appaterno;
        this.apmaterno=apmaterno;
        this.nombres=nombres;
        this.nacimiento=nacimiento;
        this.direccion=direccion;
        this.referencia=referencia;
        this.genero=genero;
        this.estado=estado;
    }

    /**
     * @return the codigocliente
     */
    public Integer getCodigocliente() {
        return codigocliente;
    }

    /**
     * @param codigocliente the codigocliente to set
     */
    public void setCodigocliente(Integer codigocliente) {
        this.codigocliente = codigocliente;
    }

    /**
     * @return the appaterno
     */
    public String getAppaterno() {
        return appaterno;
    }

    /**
     * @param appaterno the appaterno to set
     */
    public void setAppaterno(String appaterno) {
        this.appaterno = appaterno;
    }

    /**
     * @return the apmaterno
     */
    public String getApmaterno() {
        return apmaterno;
    }

    /**
     * @param apmaterno the apmaterno to set
     */
    public void setApmaterno(String apmaterno) {
        this.apmaterno = apmaterno;
    }

    /**
     * @return the nombres
     */
    public String getNombres() {
        return nombres;
    }

    /**
     * @param nombres the nombres to set
     */
    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    /**
     * @return the nacimiento
     */
    public Date getNacimiento() {
        return nacimiento;
    }

    /**
     * @param nacimiento the nacimiento to set
     */
    public void setNacimiento(Date nacimiento) {
        this.nacimiento = nacimiento;
    }

    /**
     * @return the direccion
     */
    public String getDireccion() {
        return direccion;
    }

    /**
     * @param direccion the direccion to set
     */
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    /**
     * @return the referencia
     */
    public String getReferencia() {
        return referencia;
    }

    /**
     * @param referencia the referencia to set
     */
    public void setReferencia(String referencia) {
        this.referencia = referencia;
    }

    /**
     * @return the genero
     */
    public String getGenero() {
        return genero;
    }

    /**
     * @param genero the genero to set
     */
    public void setGenero(String genero) {
        this.genero = genero;
    }

    /**
     * @return the estado
     */
    public String getEstado() {
        return estado;
    }

    /**
     * @param estado the estado to set
     */
    public void setEstado(String estado) {
        this.estado = estado;
    }
    @Override
    public String toString(){
        return "ClienteEntity{" + "codigocliente="+codigocliente+
                ", appaterno="+appaterno+", apmaterno="+apmaterno+
                ", nombres="+nombres+", nacimiento="+nacimiento+
                ", direccion="+direccion+", referencia="+referencia+
                ", genero="+genero+", estado="+estado+"}";
    }
    
}
