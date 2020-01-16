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
public class DBExtras_Evento {
    private int cod_item;
    private int cod_evento;
    private String anotacao;

    public DBExtras_Evento(int cod_item, int cod_evento, String anotacao) {
        this.cod_item = cod_item;
        this.cod_evento = cod_evento;
        this.anotacao = anotacao;
    }    
    
    public int getCod_item() {
        return cod_item;
    }

    public void setCod_item(int cod_item) {
        this.cod_item = cod_item;
    }

    public int getCod_evento() {
        return cod_evento;
    }

    public void setCod_evento(int cod_evento) {
        this.cod_evento = cod_evento;
    }

    public String getAnotacao() {
        return anotacao;
    }

    public void setAnotacao(String anotacao) {
        this.anotacao = anotacao;
    }


}
