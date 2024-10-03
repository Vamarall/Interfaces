package entities;

import java.time.LocalDate;

import java.time.format.DateTimeFormatter;

public class Parcelas {

    private LocalDate data;
    private double valor;
    private static DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");

    public Parcelas(LocalDate dueDate, double valor) {
        this.data = dueDate;
        this.valor = valor;
    }

    public Parcelas() {
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public LocalDate getdata() {
        return data;
    }

    @Override
    public String toString() {
        return data.format(fmt) + " - " + String.format("%.2f", valor);
    }

}
