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
public class DBItens_Pacote {
    private int cod_item;
    private int cod_pacote;

    /**
     * @param cod_item
     * @param cod_pacote 
     */
    public DBItens_Pacote(int cod_item, int cod_pacote) {
        setCod_item(cod_item);
        setCod_pacote(cod_pacote);
    }

    /**
     * 
     * @return int
     */
    public int getCod_item() {
        return cod_item;
    }

    /**
     * 
     * @param cod_item 
     */
    public void setCod_item(int cod_item) {
        this.cod_item = cod_item;
    }

    /**
     * 
     * @return int 
     */
    public int getCod_pacote() {
        return cod_pacote;
    }

    /**
     * 
     * @param cod_pacote 
     */
    public void setCod_pacote(int cod_pacote) {
        this.cod_pacote = cod_pacote;
    }
    
    
    
}
