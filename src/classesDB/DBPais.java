/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classesDB;

/**
 * @author Marlei M.S.B.
 */
public class DBPais {
    private int    cod;                                           
    private String pais;             

    
    public DBPais(int cod, String pais) {
        this.cod = cod;
        this.pais = pais;
    }
    
    
    public int getCod() {
        return cod;
    }

    public void setCod(int cod) {
        this.cod = cod;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    


}
