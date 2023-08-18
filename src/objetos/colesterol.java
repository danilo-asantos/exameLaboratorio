
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
    
    public void cadastrarExame(){
        nome = JOptionPane.showInputDialog("Informe o nome do paciente:");
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
            System.out.println("Nível de colesterol HDL: " + colesterolHdl + "\n HDL - BOM");
        }else if(colesterolHdl <= 45 && idade < 20){
            System.out.println("Nível de colesterol HDL: " + colesterolHdl + "\n - Abaixo do adequado. Deve ser superior a 45mg/l");
        }
        
        if(colesterolHdl > 40 && idade >= 20){
            System.out.println("Nível de colesterol HDL: " + colesterolHdl + "\n HDL - BOM");
        }else if(colesterolHdl <= 40 && idade >= 20){
            System.out.println("Nível de colesterol HDL: " + colesterolHdl +  "\n - Abaixo do adequado. Deve ser superior a 40mg/l");
        } 
        
        if("B".equals(riscoPacienteCapsLock)){
            System.out.println("Nível de colesterol LDL: " + colesterolLdl + "\n - Risco: baixo. Deve ser inferior a: 100 mg/l.");
        }else if ("M".equals(riscoPacienteCapsLock)){
            System.out.println("Nível de colesterol LDL: " + colesterolLdl + "\n - Risco: médio. Deve ser inferior a: 70mg/l ");
        }else if ("A".equals(riscoPacienteCapsLock)){
            System.out.println("Nível de colesterol LDL: " + colesterolLdl + "\n - Risco: alto. Deve ser inferior a: 50mg/l");
        }
    }
    
    public void mostrarResultado(){
        
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
}
