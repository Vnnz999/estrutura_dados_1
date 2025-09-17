
public class EX4
{
	public static void main(String[] args) {
		double[] preco= new double[4];
		
		preco[0]= 1.50;
		preco[1]= 2.75;
		preco[2]= 5.00;
		preco[3]= 3.25;
		
		double soma= 0;
		
		for(int i = 0; i < preco.length; i++){
		    
		soma += preco[i];
		}
		System.out.println("O resultado da soma é: "+soma);
	}
}
