
package objetos;

import java.util.Calendar;
import javax.swing.JOptionPane;

public class colesterol{
    private int colesterolHdl;
    private int colesterolLdl;
 
    private String nome;
    private String tipoSanguineo;
    private int idade;
    private String riscoPaciente;
    private String riscoPacienteCapsLock;
    private String resultadoColesterolHdl;
    private String resultadoColesterolLdl;
    
    public void cadastrarExame(){
        nome = JOptionPane.showInputDialog("Nome do paciente:");
        tipoSanguineo = JOptionPane.showInputDialog("Tipo sanguíneo: ");
        colesterolHdl = Integer.parseInt(JOptionPane.showInputDialog("Nível de colesterol HDL: "));
        colesterolLdl = Integer.parseInt(JOptionPane.showInputDialog("Nível de colesterol LDL: "));
        riscoPaciente = JOptionPane.showInputDialog("Nível de risco do paciente: \n B - BAIXO M - MEDIO A - ALTO");
        riscoPacienteCapsLock = riscoPaciente.toUpperCase();
    }
    
    public int calcularIdade(int anoNascimento) {
        int anoAtual = Calendar.getInstance().get(Calendar.YEAR);
        this.idade = anoAtual - anoNascimento;
        return anoAtual - anoNascimento;
    }
    
    public void classificarResultado(){
        if(colesterolHdl > 45 && idade < 20){
            resultadoColesterolHdl = ("Nível de colesterol HDL: " + colesterolHdl + "\n HDL - BOM");
        }else if(colesterolHdl <= 45 && idade < 20){
            resultadoColesterolHdl = ("Nível de colesterol HDL: " + colesterolHdl + "\n - Abaixo do adequado. Deve ser superior a 45mg/l");
        }
        
        if(colesterolHdl > 40 && idade >= 20){
            resultadoColesterolHdl = ("Nível de colesterol HDL: " + colesterolHdl + "\n HDL - BOM");
        }else if(colesterolHdl <= 40 && idade >= 20){
            resultadoColesterolHdl = ("Nível de colesterol HDL: " + colesterolHdl +  "\n - Abaixo do adequado. Deve ser superior a 40mg/l");
        } 
        
        if(null != riscoPacienteCapsLock)switch (riscoPacienteCapsLock) {
            case "B":
                resultadoColesterolLdl = ("Nível de colesterol LDL: " + colesterolLdl + "\n - Risco: baixo. Deve ser inferior a: 100 mg/l.");
                break;
            case "M":
                resultadoColesterolLdl = ("Nível de colesterol LDL: " + colesterolLdl + "\n - Risco: médio. Deve ser inferior a: 70mg/l ");
                break;
            case "A":
                resultadoColesterolLdl = ("Nível de colesterol LDL: " + colesterolLdl + "\n - Risco: alto. Deve ser inferior a: 50mg/l");
                break;
            default:
                break;
        }
    }
    
    public void mostrarResultado(){
        System.out.println("Nome: " + this.nome);
        System.out.println("Idade: " + this.idade);
        System.out.println("Tipo sanguíneo: " + this.tipoSanguineo);
        System.out.println(resultadoColesterolHdl);
        System.out.println(resultadoColesterolLdl);
    }

    public int getColesterolHDL() {
        return colesterolHdl;
    }

    public void setColesterolHDL(int colesterolHDL) {
        this.colesterolHdl = colesterolHDL;
    }

    public int getColesterolLDL() {
        return colesterolLdl;
    }

    public void setColesterolLDL(int colesterolLDL) {
        this.colesterolLdl = colesterolLDL;
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
    
    public void setRiscoPaciente(String riscoPaciente){
        this.riscoPaciente = riscoPaciente;
    }
    
    public String getRiscoPaciente(){
        return this.riscoPaciente;
    }
    
    public void setResultadoColesterolHdl(String resultadoColesterolHdl){
        this.resultadoColesterolHdl = resultadoColesterolHdl;
    }
    
    public String getResultadoColesterolHdl(){
        return this.resultadoColesterolHdl;
    }
    
    public void setResultadoColesterolLdl(String resultadoColesterolLdl){
        this.resultadoColesterolLdl = resultadoColesterolLdl;
    }
    
    public String getResultadoColesterolLdl(){
        return this.resultadoColesterolLdl;
    }
}
