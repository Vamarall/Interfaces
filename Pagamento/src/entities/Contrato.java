package entities;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Contrato {
    private int numero;
    private LocalDate data;
    private double valor;

    private List<Parcelas> parcelas = new ArrayList<>();

   

    public Contrato(int numero, LocalDate data, double valor) {
        this.numero = numero;
        this.data = data;
        this.valor = valor;
       
    }

    public Contrato() {
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public LocalDate getData() {
        return data;
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

    public List<Parcelas> getParcelas() {
        return parcelas;
    }

}