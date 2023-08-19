
package objetos;

import java.util.Calendar;
import javax.swing.JOptionPane;

public class triglicerideos {
    private String nome;
    private String tipoSanguineo;
    private int idade;
    
    private int nivelTriglicerideos;

    
    public int calcularIdade(int anoNascimento){
        int anoAtual = Calendar.getInstance().get(Calendar.YEAR);
        this.idade = anoAtual - anoNascimento;
        return anoAtual - anoNascimento;
    }
    
    public void cadastrarExame(){
        nome = JOptionPane.showInputDialog("Nome do paciente:");
        tipoSanguineo = JOptionPane.showInputDialog("Tipo sanguíneo:");
        nivelTriglicerideos = Integer.parseInt(JOptionPane.showInputDialog("Nível de triglicerideos"));
    }
    
    public void classificarResultado(){
        if(this.idade < 10){
           System.out.println("Exame Triglicerídeos: \n- Nível: " + nivelTriglicerideos +  "Com jejum: deve ser inferior a 75mg/l"); 
        }
        if(this.idade >= 10 && this.idade < 20){
            System.out.println("Exame Triglicerídeos: \n- Nível: " + nivelTriglicerideos +  "\n- Com jejum: deve ser inferior a 90mg/l");
        }
        if(this.idade >= 20){
            System.out.println("Exame Triglicerídeos: \n- Nível: " + nivelTriglicerideos + "\n- Com jejum: deve ser inferior a 150mg/l");
        }
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

    public int getNivelTriglicerideos() {
        return nivelTriglicerideos;
    }

    public void setNivelTriglicerideos(int nivelTriglicerideos) {
        this.nivelTriglicerideos = nivelTriglicerideos;
    }
    
    
}
