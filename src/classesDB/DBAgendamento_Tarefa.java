/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classesDB;

/**
 *
 * @author MarleiMaria
 */
public class DBAgendamento_Tarefa {
    private int cod;
    private int cod_evento;
    private int cod_tipo;
    private String data;
    private String usuario;
    private String status;
    private String hora_ini_plan;
    private String hora_fim_plan;
    private String hora_ini_real;
    private String hora_fim_real;

    /**
     * @param cod
     * @param cod_evento
     * @param cod_tipo
     * @param data
     * @param usuario
     * @param status
     * @param hora_ini_plan
     * @param hora_fim_plan
     * @param hora_ini_real
     * @param hora_fim_real 
     */
    public DBAgendamento_Tarefa(int cod, int cod_evento, int cod_tipo, String data, String usuario, String status, String hora_ini_plan, String hora_fim_plan, String hora_ini_real, String hora_fim_real) {
        setCod(cod);
        setCod_evento(cod_evento);
        setCod_tipo(cod_tipo);
        setData(data);
        setUsuario(usuario);
        setStatus(status);
        setHora_ini_plan(hora_ini_plan);
        setHora_fim_plan(hora_fim_plan);
        setHora_ini_real(hora_ini_real);
        setHora_fim_real(hora_fim_real);
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
    public int getCod_tipo() {
        return cod_tipo;
    }

    /**
     * 
     * @param cod_tipo 
     */
    public void setCod_tipo(int cod_tipo) {
        this.cod_tipo = cod_tipo;
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
    public String getUsuario() {
        return usuario;
    }

    /**
     * 
     * @param usuario 
     */
    public void setUsuario(String usuario) {
        this.usuario = usuario;
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

    /**
     * 
     * @return String
     */
    public String getHora_ini_plan() {
        return hora_ini_plan;
    }

    /**
     * 
     * @param hora_ini_plan 
     */
    public void setHora_ini_plan(String hora_ini_plan) {
        this.hora_ini_plan = hora_ini_plan;
    }

    /**
     * 
     * @return String
     */
    public String getHora_fim_plan() {
        return hora_fim_plan;
    }

    /**
     * 
     * @param hora_fim_plan 
     */
    public void setHora_fim_plan(String hora_fim_plan) {
        this.hora_fim_plan = hora_fim_plan;
    }

    /**
     * 
     * @return String
     */
    public String getHora_ini_real() {
        return hora_ini_real;
    }

    /**
     * 
     * @param hora_ini_real 
     */
    public void setHora_ini_real(String hora_ini_real) {
        this.hora_ini_real = hora_ini_real;
    }

    /**
     * 
     * @return String 
     */
    public String getHora_fim_real() {
        return hora_fim_real;
    }

    /**
     * 
     * @param hora_fim_real 
     */
    public void setHora_fim_real(String hora_fim_real) {
        this.hora_fim_real = hora_fim_real;
    }
    
    
}
