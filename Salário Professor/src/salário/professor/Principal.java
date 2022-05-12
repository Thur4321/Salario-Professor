
package salário.professor;

import javax.swing.JOptionPane;

public class Principal {
    public static void main (String[] args){
        
        SalárioProfessor objProfessor = new SalárioProfessor();
        objProfessor.setValorHora(20);
        
        JOptionPane.showMessageDialog(null, "Valor da Hora " +objProfessor.getValorHora(),"AppSalárioProfessor", 1);
    }
}
