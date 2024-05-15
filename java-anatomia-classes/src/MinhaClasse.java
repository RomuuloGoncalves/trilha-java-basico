public class MinhaClasse {

  public static void main(String[] args) {
    System.out.print("Olá mundo \n");

    String primeiroNome = "Rômulo";
    String segundoNome = "Gonçalves";
    String nomeCompleto = nomeCompleto(primeiroNome, segundoNome);
    System.out.print(nomeCompleto);
  }

  public static String nomeCompleto (String primeiroNome, String segundoNome){
    return primeiroNome.concat(" ").concat(segundoNome);
  }
}