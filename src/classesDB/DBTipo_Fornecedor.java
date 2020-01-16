/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classesDB;

/**
 *
 * @author Marlei M.S.B.
 */
public class DBTipo_Fornecedor {
    
    private int cod;
    private String tipo;

    public DBTipo_Fornecedor(int cod, String tipo) {
        this.cod = cod;
        this.tipo = tipo;
    }    
    
    public int getCod() {
        return cod;
    }

    public void setCod(int cod) {
        this.cod = cod;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }


    
}
