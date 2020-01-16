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
public class DBTipo_Contato {
    
    private int cod;
    private String tipo;
    private String mascara;

    /**
     * 
     * @param cod
     * @param tipo
     * @param macara 
     */
    public DBTipo_Contato(int cod, String tipo, String mascara) {
        setCod(cod);
        setTipo(tipo);
        setMascara(mascara);
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

    /**
     * 
     * @return String
     */
    public String getMascara() {
        return mascara;
    }

    /**
     * 
     * @param mascara 
     */
    public void setMascara(String mascara) {
        this.mascara = mascara;
    }
    
    
    
}
