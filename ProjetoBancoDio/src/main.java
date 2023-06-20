public class main {
    public static void main(String[] args) {
        Cliente vando = new Cliente();
        vando.setNome("vando");

        Conta cc = new ContaCorrente(vando);
        cc.depositar(50);
        cc.chequeEspecial(100);
        

        Conta cp = new ContaPoupanca(vando);
        cc.transferir(50, cp);

        cc.imprimirExtrato();
        cc.sacarEspecial(50);
        
        cc.imprimirExtrato();
        cp.imprimirExtrato();
    }
}
