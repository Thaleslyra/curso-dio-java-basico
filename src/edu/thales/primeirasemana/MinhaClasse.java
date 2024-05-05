package edu.thales.primeirasemana;

public class MinhaClasse {
    public static void main(String[] args) {

        System.out.println(nomeCompleto("Thales", "André"));
        Integer primeiroNumero = 34;

    }

    public static String nomeCompleto (String primeiroNome, String segundoNome) {
        return primeiroNome.concat(" ").concat(segundoNome);
    }
}
