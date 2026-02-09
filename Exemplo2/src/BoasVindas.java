import javax.swing.JOptionPane;

public class BoasVindas {

    public static void main(String args[]) {
        JOptionPane.showMessageDialog(null, "Olá mundo!");
        
        String nome;
        int idade;
        double altura;
        
        nome = JOptionPane.showInputDialog("Digite seu nome:");
        idade = Integer.parseInt(JOptionPane.showInputDialog("Digite sua idade:"));
        altura = Double.parseDouble(JOptionPane.showInputDialog("Digite sua altura:"));
        
        String mensagem = "*** Dados do aluno ***" + "\nNome é " + nome + "\nIdade é " + idade + "\nAltura é " + altura;
        JOptionPane.showMessageDialog(null, mensagem);
    }    
}
