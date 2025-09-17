import java.util.Stack;

public class ATV9 {

    public static void main(String[] args) {

         Stack<String> nomes = new Stack<>();
        
        System.out.println("Pilha criada: " + nomes);
        System.out.println("A pilha está vazia? " + nomes.isEmpty());
        System.out.println("---");

         nomes.push("Carlos");
        nomes.push("Ana");
        nomes.push("Bruno");
        nomes.push("marcos");
        nomes.push("vini");
        nomes.push("ana");
        nomes.push("dani");
        nomes.push("dam");
        nomes.push("joel");
        nomes.push("gael");
        nomes.push("enzo");
        nomes.push("danilo");
        nomes.push("manga");
        
        
        System.out.println("Elementos adicionados. Pilha atual: " + nomes);
        System.out.println("Tamanho da pilha: " + nomes.size());
        System.out.println("---");

        String nomeDoTopo = nomes.peek();
        System.out.println("Elemento no topo (sem remover): " + nomeDoTopo);
        System.out.println("Pilha após o peek(): " + nomes);
        System.out.println("---");

        String nomeRemovido1 = nomes.pop();
        System.out.println("Elemento removido: " + nomeRemovido1);
        System.out.println("Pilha após a primeira remoção: " + nomes);

        String nomeRemovido2 = nomes.pop();
        System.out.println("Elemento removido: " + nomeRemovido2);
        System.out.println("Pilha após a segunda remoção: " + nomes);
        System.out.println("---");
        

        System.out.println("A pilha está vazia? " + nomes.isEmpty());
    }
}