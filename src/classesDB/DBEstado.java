/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classesDB;

/**
 * @author Marlei M.S.B.
 */

public class DBEstado {
    private int    cod;                                           
    private String estado;
    private String uf;
    private int    cod_pais;

    
    public DBEstado(int cod, String estado, String uf, int cod_pais) {
        this.cod = cod;
        this.estado = estado;
        this.uf = uf;
        this.cod_pais = cod_pais;
    }
    
    
    public int getCod() {
        return cod;
    }

    public void setCod(int cod) {
        this.cod = cod;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getUf() {
        return uf;
    }

    public void setUf(String uf) {
        this.uf = uf;
    }

    public int getCod_pais() {
        return cod_pais;
    }

    public void setCod_pais(int cod_pais) {
        this.cod_pais = cod_pais;
    }

   


}
