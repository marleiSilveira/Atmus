/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classesDB;

/**
 *
 * @author Marlei M.S.B
 */
public class DBGrupo {
    private int cod;
    private String descricao;
    private int corR;
    private int corG;
    private int corB;

    /**
     * @param cod
     * @param descricao
     * @param corR
     * @param corG
     * @param corB 
     */
    public DBGrupo(int cod, String descricao, int corR, int corG, int corB) {
        setCod(cod);
        setDescricao(descricao);
        setCorR(corR);
        setCorG(corG);
        setCorB(corB);
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
    public String getDescricao() {
        return descricao;
    }

    /**
     * 
     * @param descricao 
     */
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    /**
     * 
     * @return int
     */
    public int getCorR() {
        return corR;
    }

    /**
     * 
     * @param corR 
     */
    public void setCorR(int corR) {
        this.corR = corR;
    }

    /**
     * 
     * @return int
     */
    public int getCorG() {
        return corG;
    }

    /**
     * 
     * @param corG 
     */
    public void setCorG(int corG) {
        this.corG = corG;
    }

    /**
     * 
     * @return int 
     */
    public int getCorB() {
        return corB;
    }

    /**
     * 
     * @param corB 
     */
    public void setCorB(int corB) {
        this.corB = corB;
    }
    
    
}
