package edu.thales.primeirasemana;


public class MinhaClasse {
    public static void main(String[] args) {

        System.out.println(nomeCompleto("Thales", "André"));
        Integer primeiroNumero = 34;

        String nome = "GLEYSON";
        int idade = 22;
        double peso = 68.5;
        char sexo = 'M';
        boolean doadorOrgao = false;



    }

    public static String nomeCompleto (String primeiroNome, String segundoNome) {
        return primeiroNome.concat(" ").concat(segundoNome);
    }
}
