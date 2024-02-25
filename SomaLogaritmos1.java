public class SomaLogaritmos1 {

    public static double mudandoBase(double valor, double base){
        return Math.log(valor) / Math.log(base);
    }
    
    
    public static void main(String[] args) {
        double A = 100.0;
        double B = 1000.0;
        double X = 10.0;
            
        double log_a = (mudandoBase(A, X));
        double log_b = (mudandoBase(B, X));
            
        double soma = log_a + log_b;
            
       System.out.println();
       System.out.println("A soma logaritmica do log de " + A + " e " + B + " na base " + X + " é igual a " + soma);  
    }
}