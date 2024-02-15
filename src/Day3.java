public class Day3 {
    //Trabalhando com String
    public static void main(String[] args) {
        String nome = "Alan";
        String sobreNome = "Ramalho";

        System.out.println("""
                nome:  """+nome+"""
                \s
                sobreNome:  """+sobreNome+"""
                \s
                """);


        System.out.println("UpperCase ==>");

        System.out.println("""
                nomeUpper:  """+nome.toUpperCase()+"""
                
                sobreNomeUpper:  """+sobreNome.toUpperCase()+"""
                """);

        System.out.println("LowerCase ==> ");

        System.out.println("""
                nomeLower:  """+nome.toLowerCase()+"""
                
                sobreNomeLower:  """+sobreNome.toLowerCase()+"""
                """);


        System.out.println("""
                nome:   """+nome.replace("A", "X")+"""
                """);
    }
}
