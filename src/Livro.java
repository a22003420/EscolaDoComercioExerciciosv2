public class Livro {
    private String titulo;
    private double preco;

    public Livro(String titulo, double preco) {
        this.titulo = titulo;
        this.preco = preco;
    }

    public double getPreco() {

        return preco;
    }

    public void mostrarInfo() {

        System.out.println("Título: " + titulo + " | Preço: " + preco + " €");
    }
}
