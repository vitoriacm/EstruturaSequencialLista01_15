import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        Scanner teclado = new Scanner(System.in);

        System.out.println("Digite o valor ganho por hora");
        double ganhosPorhoraTrabalho = teclado.nextDouble();

        System.out.println("Digite o Numero de horas trabalhadas no Mês");
        double quantidadeHorasTrabalhadas = teclado.nextDouble();

        teclado.close();

        double TotalSalarioMensalBruto = (ganhosPorhoraTrabalho * quantidadeHorasTrabalhadas);

        // Salario com descontos inclusos

        double ValorPagoIR = TotalSalarioMensalBruto * 0.11;

        double valorpagoInss = ValorPagoIR * 0.8;

        double valorPagoSindicato = valorpagoInss * 0.5;

        double SalarioLiquido = TotalSalarioMensalBruto - (ValorPagoIR + valorpagoInss + valorPagoSindicato);

        // saidas

        System.out.printf(" O Total Salario Mensal Bruto %.2f\n", TotalSalarioMensalBruto);

        System.out.printf(" O Valor Pago de Imposto de Renda %.1f\n", ValorPagoIR);

        System.out.printf(" O Valor Pago ao INSS %.2f\n", valorpagoInss);

        System.out.printf(" O Valor Pago ao Sindicato %.2f\n", valorPagoSindicato);

        System.out.printf(" O Salario liquido total %.2f\n", SalarioLiquido);

    }
}
