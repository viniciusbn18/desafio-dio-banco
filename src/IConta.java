public interface IConta {

    public void sacar(double valor);

    public void transferir(double valor, IConta contaDestino);

    public void imprimirExtratoComum();

    public void depositar(double valor);

}
