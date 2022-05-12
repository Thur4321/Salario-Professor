
package salário.professor;

public class SalárioProfessor {

    private float valorHora; 
    
    private int horas;
     
    private float inss; 
    
    public float getValorHora(){
        return valorHora;
    }
    
    public void setValorHora(float valor){
        valorHora=valor;
    }
    
    public int getHoras(){
        return horas;
    }
    
     public void setHoras(int quantidade){
        horas=quantidade;
    }
     
    public float getinss(){
        return inss;
    }
    
     public void setInss(float porcentagem){
        inss=porcentagem;
     }
    
    public float salárioBruto() {
        float salárioBruto=valorHora * horas;
        return salárioBruto;
    }
   
    public float salárioLíquido(){
        float salárioLíquido=salárioBruto() * (1 - inss/100);
        return salárioLíquido;
    }
}
