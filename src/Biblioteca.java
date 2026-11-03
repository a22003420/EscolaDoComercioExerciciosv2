public class Biblioteca {
    public static void main(String[] args) {
        // 1. Criar 3 objetos da classe Livro
        Livro l1 = new Livro("Os Maias", 12.90);
        Livro l2 = new Livro("Memorial do Convento", 15.50);
        Livro l3 = new Livro("Mensagem", 8.75);

        // 2. Guardar os objetos num array
        Livro[] livros = { l1, l2, l3 };

        // 3. Percorrer o array e mostrar os dados de cada livro
        for (int i = 0; i < livros.length; i++) {
            livros[i].mostrarInfo();
        }

        // Desafio extra: preço total
        double total = 0;
        for (Livro l : livros) {
            total += l.getPreco();
        }
        System.out.println("Preço total: " + total + " €");
    }
}

