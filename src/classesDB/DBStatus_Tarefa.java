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
public class DBStatus_Tarefa {
    
    private int cod;
    private String status;

    /**
     * 
     * @param cod
     * @param status
     */
    public DBStatus_Tarefa(int cod, String status) {
        setCod(cod);
        setStatus(status);
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
    public String getStatus() {
        return status;
    }

    /**
     * 
     * @param status 
     */
    public void setStatus(String status) {
        this.status = status;
    }    
    
}

