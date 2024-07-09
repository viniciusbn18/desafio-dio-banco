import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class ContaCorrente extends Conta {

    public ContaCorrente(Cliente cliente) {
        super(cliente);
    }

    @Override
    public void imprimirExtratoComum() {
        System.out.println("=== Extrato Conta Corrente ===");
        System.out.println("Numero da Conta: " + this.cliente.getNumeroDaConta());
        System.out.println("Agência: " + this.cliente.getAgencia());
        System.out.println("Saldo atual: " + saldo);

        LocalDateTime dataHoraAtual = LocalDateTime.now();
        DateTimeFormatter formatoData = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
        String dataFormatada = dataHoraAtual.format(formatoData);

        System.out.println("Data e hora da solicitação: " + dataFormatada);
    }

}