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
public class DBEvento_Pacote {
    private int cod_evento;
    private int cod_pacote;

    /**
     * @param cod_evento
     * @param cod_pacote 
     */
    public DBEvento_Pacote(int cod_evento, int cod_pacote) {
        setCod_evento(cod_evento);
        setCod_pacote(cod_pacote);
    }

    /**
     * @return int
     */
    public int getCod_evento() {
        return cod_evento;
    }

    /**
     * @param cod_evento 
     */
    public void setCod_evento(int cod_evento) {
        this.cod_evento = cod_evento;
    }

    /**
     * @return int
     */
    public int getCod_pacote() {
        return cod_pacote;
    }

    /**
     * @param cod_pacote 
     */
    public void setCod_pacote(int cod_pacote) {
        this.cod_pacote = cod_pacote;
    }
    
    
    
}
