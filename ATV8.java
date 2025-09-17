public class ATV8 {

    public static void main(String[] args) {
        String[][] nomes = new String[3][];

        nomes[0] = new String[2]; 

        nomes[1] = new String[3]; 

        nomes[2] = new String[1]; 

        nomes[0][0] = "João";
        nomes[0][1] = "Maria";

        nomes[1][0] = "Pedro";
        nomes[1][1] = "Ana";
        nomes[1][2] = "Carlos";

        nomes[2][0] = "Paula";
        
        System.out.println("Array Irregular:");
        for (int i = 0; i < nomes.length; i++) {
            System.out.print("Linha " + i + ": ");
            for (int j = 0; j < nomes[i].length; j++) {
                System.out.print(nomes[i][j] + " ");
            }
            System.out.println();
        }
    }
}