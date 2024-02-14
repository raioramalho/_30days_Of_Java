import java.math.BigDecimal;

public class Day1 {
    public static void main(String[] args) {
        //Exercicio, calculadora simples com todas as operaçoes matemáticas.
        Integer valor1 = 10;
        Integer valor2 = 5;

        Integer soma = valor1 + valor2;
        Integer subtra = valor1 - valor2;
        Integer divisao = valor1 / valor2;
        Integer multi = valor1 * valor2;

        System.out.println("Soma: 10+5 = "+ soma);
        System.out.println("Sub: 10-5 = "+ subtra);
        System.out.println("Div: 10/5 = "+ divisao);
        System.out.println("Multi: 10*5 = "+ multi);
    }
}
