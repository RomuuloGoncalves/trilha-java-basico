public class Banco {
  int numeroAgencia;
  String agencia;
  String nomeCliente;
  float saldo;

  public void cadastrarNumeroAgencia(int dado){
    numeroAgencia = dado;
  }
  
  public void cadastrarAgencia(String dado){
    agencia = dado;
  }

  public void cadastrarNomeCliente(String dado){
    nomeCliente = dado;
  }

  public void cadastrarSaldo(float dado){
    saldo = dado;
  }
}
