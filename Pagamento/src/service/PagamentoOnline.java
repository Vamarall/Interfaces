package service;

public interface PagamentoOnline {

    public double paymentFee(double amount);
    public double interest(double amount, int months);

    
}
