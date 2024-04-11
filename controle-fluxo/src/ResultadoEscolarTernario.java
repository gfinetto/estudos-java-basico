public class ResultadoEscolarTernario {

    public static void main(String[] args) {
        
        int valorNota = 3;

        String resultado = valorNota >=7 ? "Aprovado" : valorNota >=5 && valorNota <7 ? "Recuperação" : "Reprovado";

        System.out.println(resultado);



    }
    
}
