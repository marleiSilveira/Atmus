/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classesDB;

/**
 * @author Marlei M.S.B.
 */
public class DBCidade {
    private int    cod;                                           
    private String cidade;
    private String CEP;
    private int    cod_estado;

    public DBCidade(int cod, String cidade, String CEP, int cod_estado) {
        this.cod = cod;
        this.cidade = cidade;
        this.CEP = CEP;
        this.cod_estado = cod_estado;
    }    
    
    public int getCod() {
        return cod;
    }

    public void setCod(int cod) {
        this.cod = cod;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getCEP() {
        return CEP;
    }

    public void setCEP(String CEP) {
        this.CEP = CEP;
    }

    public int getCod_estado() {
        return cod_estado;
    }

    public void setCod_estado(int cod_estado) {
        this.cod_estado = cod_estado;
    }


}
