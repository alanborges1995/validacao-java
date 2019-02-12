package validacaojava;

import javax.swing.JFrame;
import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class ValidacaoMain {

    public static void main(String[] args) {
        
        JFrame janela = new JFrame();
        TelaValidacao tela = new TelaValidacao();
        
        janela.setDefaultCloseOperation(janela.EXIT_ON_CLOSE);
        janela.setVisible(true);
        janela.setSize(400,300);
        janela.setResizable(false);
        janela.add(tela);
        
    }
    
}
