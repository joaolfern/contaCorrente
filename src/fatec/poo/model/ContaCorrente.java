package fatec.poo.model;

public class ContaCorrente {

    private int numero;
    private double saldo;

    public ContaCorrente(int numero, double saldo) {
        this.numero = numero;
        this.saldo = saldo;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public boolean sacar(double valorSacado) {
        if (saldo >= valorSacado) {
            saldo -= valorSacado;
            return true;
        }
        return false;
    }

    public void depositar(double valorDepositado) {
        saldo += valorDepositado;
    }
}
