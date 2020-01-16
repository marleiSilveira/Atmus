/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classesDB;

/**
 * @author Marlei M.S.B.
 */
public class DBRelacionamento_Cliente {
    private int cod;
    private int cod_cliente_A;
    private int cod_cliente_B;
    private String relacionamento_AB;
    private String relacionamento_BA;

    
    /**
     * @param cod
     * @param cod_cliente_A
     * @param cod_cliente_B
     * @param relacionamento_AB
     * @param relacionamento_BA 
     */
    public DBRelacionamento_Cliente(int cod, int cod_cliente_A, int cod_cliente_B, String relacionamento_AB, String relacionamento_BA) {
        setCod(cod);
        setCod_cliente_A(cod_cliente_A);
        setCod_cliente_B(cod_cliente_B);
        setRelacionamento_AB(relacionamento_AB);
        setRelacionamento_BA(relacionamento_BA);
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
     * @return int
     */
    public int getCod_cliente_A() {
        return cod_cliente_A;
    }

    /**
     * 
     * @param cod_cliente_A 
     */
    public void setCod_cliente_A(int cod_cliente_A) {
        this.cod_cliente_A = cod_cliente_A;
    }

    /**
     * 
     * @return int 
     */
    public int getCod_cliente_B() {
        return cod_cliente_B;
    }

    /**
     * 
     * @param cod_cliente_B 
     */
    public void setCod_cliente_B(int cod_cliente_B) {
        this.cod_cliente_B = cod_cliente_B;
    }

    /**
     * 
     * @return String 
     */
    public String getRelacionamento_AB() {
        return relacionamento_AB;
    }

    /**
     * 
     * @param relacionamento_AB 
     */
    public void setRelacionamento_AB(String relacionamento_AB) {
        this.relacionamento_AB = relacionamento_AB;
    }

    /**
     * 
     * @return String
     */
    public String getRelacionamento_BA() {
        return relacionamento_BA;
    }

    /**
     * 
     * @param relacionamento_BA 
     */
    public void setRelacionamento_BA(String relacionamento_BA) {
        this.relacionamento_BA = relacionamento_BA;
    }
    
    
    
}
