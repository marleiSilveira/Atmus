/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaces;

import javax.swing.JOptionPane;

/**
 *
 * @author Marlei M.S.B.
 */
public class Mensagem {
    //final significa que a variável é uma constrante e não poderá receber outro valor e deverá ser inicializada 
    //static significa que só uma alocação de memória será criada para esta variável, não existirão duas cópias em simultâneo
    private static final String CONFIRMAR = "Confirmar";
    private static final String CANCELAR = "Cancelar"; 
    private static final String MSN_CONFIRME = "Confirme a exclusão do item";
    private static final String TITLE_CONFIRME = "Confirmação de exclusão";
    
    /**
     * Exibe mensagem de confirmação de exclusão: 
     * "Confirme a exclusão do item"
     * @return 0 = Confirmar; 1 = Excluir  
     */
    public static int confirmarExclusao(){
        Object[] options = {CONFIRMAR, CANCELAR};
        int conf = JOptionPane.showOptionDialog(null, 
                                                MSN_CONFIRME ,
                                                TITLE_CONFIRME, 
                                                JOptionPane.YES_NO_OPTION, 
                                                JOptionPane.QUESTION_MESSAGE, 
                                                null,  //não está usando um icone customizado
                                                options, //titulo dos botões 
                                                options[0]); //titulo default dos botões 
        
        return conf;
    }
    
}
