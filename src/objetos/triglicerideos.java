
package objetos;

import java.util.Calendar;

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
