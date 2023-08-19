
package objetos;

import java.util.Calendar;
import javax.swing.JOptionPane;


public class glicemia {
    private int nivelGlicose;
    private String resultadoGlicemia;
    private String nome;
    private String tipoSanguineo;
    private int idade;
    
    public int calcularIdade(int anoNascimento) {
        int anoAtual = Calendar.getInstance().get(Calendar.YEAR);
        this.idade = anoAtual - anoNascimento;
        return anoAtual - anoNascimento;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTipoSanguineo() {
        return tipoSanguineo;
    }

    public void setTipoSanguineo(String tipoSanguineo) {
        this.tipoSanguineo = tipoSanguineo;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public int getNivelGlicose() {
        return nivelGlicose;
    }

    public void setNivelGlicose(int nivelGlicose) {
        this.nivelGlicose = nivelGlicose;
    }
    
    public void cadastrarExame(){
        nome = JOptionPane.showInputDialog("Informe o nome do paciente:");
        tipoSanguineo = JOptionPane.showInputDialog("Tipo sanguíneo: ");
        nivelGlicose = Integer.parseInt(JOptionPane.showInputDialog("Nível de glicose: "));
    }
    
    public void classificarResultado(){
        if(nivelGlicose < 100){
            resultadoGlicemia = "RESULTADO DE GLICOSE: Normoglicemia \n Nível: " + nivelGlicose;
        }
        if(nivelGlicose >= 100 && nivelGlicose < 126){
         resultadoGlicemia = "RESULTADO DE GLICOSE: Pré-diabetes \n Nível: " + nivelGlicose;
        }
        if(nivelGlicose >= 126){
            resultadoGlicemia = "RESULTADO DE GLICOSE: Diabete estabelecida \n Nível: " + nivelGlicose;
        }
    }
    
    public void mostrarResultado(){
        System.out.println("Nome: " + this.nome);
        System.out.println("Idade: " + this.idade);
        System.out.println("Tipo sanguíneo: " + this.tipoSanguineo);
        System.out.println(resultadoGlicemia);
    }
    
    
}
