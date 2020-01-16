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
public class DBHistorico_Agendamento {
    private int cod;
    private int cod_agendamento;
    private String comentario;
    private String data;
    private String hora;

    /**
     * @param cod
     * @param cod_agendamento
     * @param comentario
     * @param data
     * @param hora 
     */
    public DBHistorico_Agendamento(int cod, int cod_agendamento, String comentario, String data, String hora) {
        setCod(cod);
        setCod_agendamento(cod_agendamento);
        setComentario(comentario);
        setData(data);
        setHora(hora);
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
    public int getCod_agendamento() {
        return cod_agendamento;
    }

    /**
     * 
     * @param cod_agendamento 
     */
    public void setCod_agendamento(int cod_agendamento) {
        this.cod_agendamento = cod_agendamento;
    }

    /**
     * 
     * @return String 
     */
    public String getComentario() {
        return comentario;
    }

    /**
     * 
     * @param comentario 
     */
    public void setComentario(String comentario) {
        this.comentario = comentario;
    }

    /**
     * 
     * @return String 
     */
    public String getData() {
        return data;
    }

    /**
     * 
     * @param data 
     */
    public void setData(String data) {
        this.data = data;
    }

    /**
     * 
     * @return String 
     */
    public String getHora() {
        return hora;
    }

    /**
     * 
     * @param hora 
     */
    public void setHora(String hora) {
        this.hora = hora;
    }
    
    
    
}
