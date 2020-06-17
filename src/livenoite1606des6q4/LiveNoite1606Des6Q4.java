package livenoite1606des6q4;

import javax.swing.JOptionPane;

/**
 *
 * @author Jeferson Leon
 */
public class LiveNoite1606Des6Q4 {

    /**
     * Escrever um algoritmo que leia uma quantidade desconhecida de 
     * números e conte quantos deles estão nos seguintes 
     * intervalos: [0,25], [26,50], [51,75] e [76,100]. A entrada de
     * dados deve terminar quando for lido um número negativo.
     */
    public static void main(String[] args) {
       int num, cont025, cont2650,cont5175, cont76100;
       cont025 = 0; cont2650=0; cont5175=0; cont76100=0;
       num=0;
       while(num>=0){
            num = Integer.parseInt(JOptionPane.showInputDialog("Informe um nº "
                    + "entre 0 e 100  "
                    + "ou digite um nº negativo para sair:\nDigite:"));
              if (num >= 0 && num <= 25) {
                  cont025++;
              }else if (num >= 26 && num <= 50) {
                  cont2650++;
              }else if (num >= 51 && num <= 75) {
                  cont5175++;
              }else if (num >= 76 && num <= 100) {
                  cont76100++;
              }else if(num>100){
                  JOptionPane.showMessageDialog(null,"Valor fora do intervalo "
                          + "de contagem");
              }else{
                  JOptionPane.showMessageDialog(null,"Bye!!");
              }
//fim do if encadeado
       }//fim do loop (while)
        JOptionPane.showMessageDialog(null,"Resultado da coleta de valores"
                +"\nQuant. [0,25]   : "+cont025
                +"\nQuant. [26,50]  : "+cont2650
                +"\nQuant. [51,75]  : "+cont5175
                +"\nQuant. [76, 100]: "+cont76100);
                  
    }
    
}
