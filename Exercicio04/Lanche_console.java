import java.util.Arrays;

/*Classe principal*/

public class Lanche_console{
    public static void main(String[] args){
        Lanche_Interface lancheComum = new Lanche_Comum("X-Burger", 10.0, Arrays.asList("Pão", "Carne", "Queijo"));
        Lanche_Interface lancheGourmet = new Lanche_Gourmet(lancheComum);
        Lanche_Interface lancheVegano = new Lanche_Vegano(lancheComum);

        System.out.println("Lanche Comum: " + lancheComum.getNome() + " - R$ " + lancheComum.getPreco());
        System.out.println("Ingredientes: " + lancheComum.getIngredientes());

        System.out.println("Lanche Gourmet: " + lancheGourmet.getNome() + " - R$ " + lancheGourmet.getPreco());
        System.out.println("Ingredientes: " + lancheGourmet.getIngredientes());

        System.out.println("Lanche Vegano: " + lancheVegano.getNome() + " - R$ " + lancheVegano.getPreco());
        System.out.println("Ingredientes: " + lancheVegano.getIngredientes());
    }
}
