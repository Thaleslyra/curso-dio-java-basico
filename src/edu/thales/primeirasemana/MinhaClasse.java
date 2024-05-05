public class MinhaClasse {
    public static void main(String[] args) {

        System.out.println(nomeCompleto("Thales", "André"));

    }

    public static String nomeCompleto (String primeiroNome, String segundoNome) {
        return primeiroNome.concat(" ").concat(segundoNome);
    }
}
