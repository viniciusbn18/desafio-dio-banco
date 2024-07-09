import java.util.Random;

public class Cliente {
    public String agencia;
    public String numeroDaConta;
    public String nome;

    public Cliente(String nome) {
        this.numeroDaConta = geradorDeNumeroDeConta();
        this.agencia = geradorDeNumeroDeAgencia();
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getAgencia() {
        return agencia;
    }

    public String getNumeroDaConta() {
        return numeroDaConta;
    }

    public String geradorDeNumeroDeConta() {
        Random gerador = new Random();

        int numeroDeQuatroDigitos = gerador.nextInt(10000);
        int digitoDaConta = gerador.nextInt(10);
        String numeroFormatado = String.format("%04d-%d", numeroDeQuatroDigitos, digitoDaConta);

        return numeroFormatado;
    }

    public String geradorDeNumeroDeAgencia() {
        Random gerador = new Random();

        int numeroDeTresDigitos = gerador.nextInt(1000);
        int digitoDaAgencia = gerador.nextInt(10);

        String numeroFormatado = String.format("%03d-%d", numeroDeTresDigitos, digitoDaAgencia);

        return numeroFormatado;
    }

    @Override
    public String toString() {
        return nome;
    }
}
