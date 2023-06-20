public interface IConta {

     void sacar(double valor);    

     void depositar(double valor);

     void transferir(double valor, Conta contaDestino);

     void chequeEspecial(double valor);

     void sacarEspecial(double valor);
     
    void imprimirExtrato();
}
