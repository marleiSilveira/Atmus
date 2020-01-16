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
public class DBTipo_Relacionamento {
    
    private int cod;
    private String tipo;

    /**
     * 
     * @param cod
     * @param tipo
     */
    public DBTipo_Relacionamento(int cod, String tipo) {
        setCod(cod);
        setTipo(tipo);
    }

    /**
     * 
     * @return int 
     */
    public int getCod() {
        return cod;
    }

    /**
     * 
     * @param cod 
     */
    public void setCod(int cod) {
        this.cod = cod;
    }

    /**
     * 
     * @return String 
     */
    public String getTipo() {
        return tipo;
    }

    /**
     * 
     * @param tipo 
     */
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }    
    
}
