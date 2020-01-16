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
public class DBContato {
    private int cod;               
    private int cod_pessoa;       
    private String tipo;             
    private String id;              
    private boolean forma_pref;       

    
    /**
     * @param cod
     * @param cod_cliente
     * @param tipo
     * @param id
     * @param forma_pref 
     */
    public DBContato(int cod, int cod_cliente, String tipo, String id, boolean forma_pref) {
        setCod(cod);
        setCod_pessoa(cod_cliente);
        setTipo(tipo);
        setId(id);
        setForma_pref(forma_pref);
    }
    
    /**
     * @return int 
     */
    public int getCod() {
        return cod;
    }

    /**
     * @param cod 
     */
    public void setCod(int cod) {
        this.cod = cod;
    }

    /**
     * @return  int
     */
    public int getCod_pessoa() {
        return cod_pessoa;
    }

    /**
     * @param cod_pessoa 
     */
    public void setCod_pessoa(int cod_pessoa) {
        this.cod_pessoa = cod_pessoa;
    }

    /**
     * @return String 
     */
    public String getTipo() {
        return tipo;
    }

    /**
     * @param tipo 
     */
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    /**
     * @return String 
     */
    public String getId() {
        return id;
    }

    /**
     * @param id 
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * @return boolean
     */
    public boolean isForma_pref() {
        return forma_pref;
    }

    /**
     * @param forma_pref 
     */
    public void setForma_pref(boolean forma_pref) {
        this.forma_pref = forma_pref;
    }
}
