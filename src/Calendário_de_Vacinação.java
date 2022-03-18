/*
 @author Geovane Silva Ramirez

Exercício 1 - Calendário de vacinação.

No seu município serão vacinados durante a próxima semana com a 3ª dose da
vacina contra COVID-19 pessoas com idade entre 60 a 85 anos, sendo considerado 
1 dia da semana para cada faixa etária, seguindo a seguinte ordem:

80 a 85 anos – vacinação na segunda-feira

75 a 79 anos – vacinação na terça-feira

70 a 74 anos - vacinação na quarta-feira

65 a 69 anos - vacinação na quinta-feira

60 a 64 anos – vacinação na sexta-feira

Elabore o fluxograma e um programa em linguagem Java que receba o nome da pessoa
e sua idade, e exiba seu nome e o dia da semana que deverá se vacinar.
Caso a idade informada esteja fora da faixa entre 60 e 85 anos, o programa
deverá exibir uma mensagem informando que a pessoa está fora do período de
vacinação.
 */

import javax.swing.JOptionPane;

public class Calendário_de_Vacinação {

    public static void main(String[] args) {
        
        String nome;
        int idade;
        String dia;
        nome = JOptionPane.showInputDialog("Digite seu nome");     
        idade = Integer.parseInt(JOptionPane.showInputDialog("Digite sua idade"));
        
        
        switch (idade) {
          case 80: 
          case 81:
          case 82:
          case 83:
          case 84:
          case 85:
              dia = "Dia de vacinação: segunda-feira";
                break;
          case 75:
          case 76:
          case 77:
          case 78:
          case 79:
              dia = "Dia de vacinação: terça-feira";
                break;
          case 70:
          case 71:
          case 72:
          case 73:
          case 74:
              dia = "Dia de vacinação: quarta-feira";
                break;
          case 65:
          case 66:
          case 67:
          case 68:
          case 69:
              dia = "Dia de vacinação: quinta-feira";
                break;     
          default:
              dia = "FORA DO PERÍODO DE VACINAÇÃO";}
        
        JOptionPane.showMessageDialog (null, nome + "\n" + dia);
        
    
    }
    
}
