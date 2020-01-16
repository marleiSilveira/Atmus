/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classesDB;

/**
 * @author Marlei M.S.B.
 */
public class DBCliente {
    private int    cod;               
    private int    cod_pessoa;                             
    private String data_nasc;
    private String sexo; 
    private String comentarios;           

    public DBCliente(int cod, int cod_pessoa, String data_nasc, String sexo, String comentarios) {
        this.cod = cod;
        this.cod_pessoa = cod_pessoa;
        this.data_nasc = data_nasc;
        this.sexo = sexo;
        this.comentarios = comentarios;
    }    
    
    public int getCod() {
        return cod;
    }

    public void setCod(int cod) {
        this.cod = cod;
    }

    public int getCod_pessoa() {
        return cod_pessoa;
    }

    public void setCod_pessoa(int cod_pessoa) {
        this.cod_pessoa = cod_pessoa;
    }

    public String getData_nasc() {
        return data_nasc;
    }

    public void setData_nasc(String data_nasc) {
        this.data_nasc = data_nasc;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getComentarios() {
        return comentarios;
    }

    public void setComentarios(String comentarios) {
        this.comentarios = comentarios;
    }

    
    
}
