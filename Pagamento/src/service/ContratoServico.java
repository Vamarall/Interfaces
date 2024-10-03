package service;

import java.time.LocalDate;

import entities.Contrato;
import entities.Parcelas;

public class ContratoServico {
    private PagamentoOnline pagamentoOnline;

    public ContratoServico(PagamentoOnline pagamentoOnline) {
        this.pagamentoOnline = pagamentoOnline;
    }

    public void processContract(Contrato contrato, int meses) {

        double parcelaBasica  = contrato.getValor() / meses;

        for (int i = 1; i <= meses; i++) {
            LocalDate dueDate = contrato.getData().plusMonths(i);

            double interest = pagamentoOnline.interest(parcelaBasica, i);
            double fee = pagamentoOnline.paymentFee(parcelaBasica + interest);
            double result = parcelaBasica + interest + fee;

            contrato.getParcelas().add(new Parcelas(dueDate,result ));
        }

    }
}
