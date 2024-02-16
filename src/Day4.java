public class Day4 {
    //Trabalhando com metodos//(funções) de classe
    public static void main(String[] args) {
        String nome = hello();
        System.out.println(nome);
        Integer calc = calc(5,15);
        System.out.println(calc);
    }

    private static String hello() {
        return "Hello world!";
    }

    private static Integer calc(Integer var1, Integer var2) {
        return var1 + var2;
    }
}
