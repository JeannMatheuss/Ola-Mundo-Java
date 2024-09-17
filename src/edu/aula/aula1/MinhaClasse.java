package edu.aula.aula1;
public class MinhaClasse {
    public static void main (String [] args) {
        System.out.print( " Olá, Mundo!");

        String primeiroNome = "Jean";
        String segundoNome = "Matheus";

        String nomeCompleto = nomeCompleto(primeiroNome, segundoNome);
        System.out.println(nomeCompleto);
    }

    // Método nomeCompleto
    public static String nomeCompleto (String primeiroNome, String segundoNome) {
        return "Resultado do método: " + primeiroNome.concat(" ").concat(segundoNome);
    }
}
