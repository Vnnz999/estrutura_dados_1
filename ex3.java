
public class ex3
{
	public static void main(String[] args) {
		int[] notas= new int[5];
		
		notas[0]= 85;
		notas[1]= 92;
		notas[2]= 78;
		notas[3]= 95;
		notas[4]= 88;
		
		for (int i = 0; i < notas.length; i++){
		    System.out.print("Nota \n" + (i + 1) + ": " + notas[i]);
		}
	}
}
