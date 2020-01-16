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
public class DBFornecedor {
    private int cod;
    private int cod_pessoa;
    private int tipo;
    private String comentarios; 

    /**
     * 
     * @param cod
     * @param cod_pessoa
     * @param tipo
     * @param comentarios 
     */
    public DBFornecedor(int cod, int cod_pessoa, int tipo, String comentarios) {
        setCod(cod);
        setCod_pessoa(cod_pessoa);
        setTipo(tipo);
        setComentarios(comentarios);
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
    public int getCod_pessoa() {
        return cod_pessoa;
    }

    /**
     * 
     * @param cod_pessoa 
     */
    public void setCod_pessoa(int cod_pessoa) {
        this.cod_pessoa = cod_pessoa;
    }

    /**
     * 
     * @return String 
     */
    public int getTipo() {
        return tipo;
    }

    /**
     * 
     * @param tipo 
     */
    public void setTipo(int tipo) {
        this.tipo = tipo;
    }

    /**
     * 
     * @return String
     */
    public String getComentarios() {
        return comentarios;
    }

    /**
     * 
     * @param comentarios 
     */
    public void setComentarios(String comentarios) {
        this.comentarios = comentarios;
    }
    
    
    
}
