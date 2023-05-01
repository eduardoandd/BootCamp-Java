public class MinhaClasse {
     
    public static void main(String[] args) {
        // String meuNome = "Eduardo";
        
        // int anoFabricacao = 2022;

        // boolean verdadeira =  true;
        // boolean falça =  false;

        String primeiroNome = "Eduardo";
        String segundoNome="Andrade";

        String nomeCompleto = nomeCompleto(primeiroNome, segundoNome);

        System.out.println(nomeCompleto);
    }

    public static String nomeCompleto(String primeiroNome, String segundoNome){
            
        return "O resultado é: ".concat(primeiroNome.concat(" ").concat(segundoNome));
        //primeiroNome + " " + segundoNome;
    }
}
