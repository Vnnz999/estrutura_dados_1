import java.util.Stack;

public class ATV11 {
    public static void main(String[] args) {
        // Cria uma nova instância da classe Stack para armazenar Strings.
        // Stack é uma estrutura de dados LIFO (Last-In, First-Out).
        Stack<String> historicoDeNavegacao = new Stack<>();

        // 1. Adiciona elementos na pilha usando o método push().
        // O último elemento adicionado será o primeiro a ser removido.
        historicoDeNavegacao.push("https://pt.wix.com/blog");
        historicoDeNavegacao.push("https://pt.wix.com/");
        historicoDeNavegacao.push("https://pt.wix.com/blog/explore/categories/criacao-e-design-de-sites");
        historicoDeNavegacao.push("https://pt.wix.com/blog/explore/categories/dicas-de-marketing");
        historicoDeNavegacao.push("https://pt.wix.com/blog/explore/categories/ecommerce-e-vendas");
        // Este é o topo da pilha agora.

        // 2. Acessa o elemento do topo da pilha sem removê-lo.
        // O método peek() retorna "carrinho.com".
        System.out.println("Página atual (topo): " + historicoDeNavegacao.peek());

        // 3. Remove e retorna o elemento do topo da pilha.
        // O método pop() remove "carrinho.com" e o retorna.
        System.out.println("Voltando para a página anterior: " + historicoDeNavegacao.pop());

        // 4. Acessa o novo elemento do topo da pilha.
        // O novo topo é "produtos.com".
        System.out.println("Página atual: " + historicoDeNavegacao.peek());
    }
}