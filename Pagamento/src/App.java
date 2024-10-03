import java.time.LocalDate;

import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

import entities.Contrato;
import entities.Parcelas;
import service.ContratoServico;

import service.PayPalService;

public class App {
    public static void main(String[] args) throws Exception {

        DateTimeFormatter fmt =  DateTimeFormatter.ofPattern("dd/MM/yyyy");
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);



        System.out.println("Entre os dados do contrato: ");
        System.out.print("Numero: ");
        int numeroContrato = sc.nextInt();
        System.out.print("Date (dd/MM/yyyy): ");
        LocalDate dataContrato =  LocalDate.parse(sc.next(),fmt);
        System.out.print("Valor do contrato: ");
        double valorContrato = sc.nextDouble();

        Contrato contrato = new Contrato(numeroContrato, dataContrato, valorContrato);

        System.out.print("Entre com o numero de parcelas: ");
        int numParcelas = sc.nextInt();

        ContratoServico contratoServico = new ContratoServico(new PayPalService());

        contratoServico.processContract(contrato, numParcelas);

        System.out.println("Parcelas:");
        for(Parcelas parcela : contrato.getParcelas()){
            System.out.println(parcela);
        }

        
       

       


      




        

  

        sc.close();

    }
}
