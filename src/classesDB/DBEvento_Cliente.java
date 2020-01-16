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
public class DBEvento_Cliente {
    private int cod_evento;
    private int cod_cliente;

    
    /**
     * @param cod_evento
     * @param cod_cliente 
     */
    public DBEvento_Cliente(int cod_evento, int cod_cliente) {
        setCod_evento(cod_evento);
        setCod_cliente(cod_cliente);
    }
    
    /**
     * 
     * @return int 
     */
    public int getCod_evento() {
        return cod_evento;
    }

    /**
     * 
     * @param cod_evento 
     */
    public void setCod_evento(int cod_evento) {
        this.cod_evento = cod_evento;
    }

    /**
     * 
     * @return int 
     */
    public int getCod_cliente() {
        return cod_cliente;
    }

    /**
     * 
     * @param cod_cliente 
     */
    public void setCod_cliente(int cod_cliente) {
        this.cod_cliente = cod_cliente;
    }
    
    
}
