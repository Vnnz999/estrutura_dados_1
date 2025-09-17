import java.util.Stack;

public class ATV10 {
    public static void main(String[] args) {
        Stack<Integer> pilha = new Stack<>();

        pilha.push(10);
        pilha.push(20);
        pilha.push(30);
        pilha.push(40);
        pilha.push(50);
        pilha.push(60);
        pilha.push(70);
        pilha.push(80);
        pilha.push(90);
        pilha.push(100);

        System.out.println("Pilha atual: " + pilha);

        System.out.println("Topo da pilha: " + pilha.peek());

        int removido = pilha.pop();
        System.out.println("Elemento removido: " + removido);
        System.out.println("Pilha após pop: " + pilha);
        
        System.out.println("A pilha está vazia? " + pilha.isEmpty());
    }
}