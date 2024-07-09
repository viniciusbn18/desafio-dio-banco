import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public abstract class Conta implements IConta {

    protected double saldo;
    protected Cliente cliente;

    public Conta(Cliente cliente) {
        this.cliente = cliente;
    }

    public double getSaldo() {
        return saldo;
    }

    @Override
    public void sacar(double valor) {
        saldo = saldo - valor;
    }

    @Override
    public void depositar(double valor) {
        saldo = saldo + valor;
    }

    @Override
    public void transferir(double valor, IConta contaDestino) {
        this.sacar(valor);
        this.depositar(valor);
    }

    @Override
    public abstract void imprimirExtratoComum();

}
