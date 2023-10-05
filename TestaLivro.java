class Livro {
    private String titulo;
    private String autor;
    private int ano;
    private String editora;

    //Método Construtor

    public Livro(String titulo, String autor, int ano, String editora) {
        this.titulo = titulo;
        this.autor = autor;
        this.ano = ano;
        this.editora = editora;
    }

    // Métodos get para o título, autor, ano e editora
    public String getTitulo() {
        return titulo;
    }
    
    public String getAutor() {
        return autor;
    }
   
    public int getAno() {
        return ano;
    }
    
    public String getEditora() {
        return editora;
    }
    
    // Métodos set para o título, autor, ano e editora
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public void setEditora(String editora) {
        this.editora = editora;
    }

    // Método toString para exibir o estado da instância 
    
    public String toString() {
        return titulo + "\n" + autor + "\n" + editora + ", " + ano;
    }
}

public class TestaLivro {
    public static void main(String[] args) {
        // Criando instâncias dos três livros mais vendidos pela Amazon
        Livro livro1 = new Livro("The Da Vinci Code", "Dan Brown", 2003, "Doubleday");
        Livro livro2 = new Livro("Iron Flame (The Empyrean, 2)", "Rebecca Yarros", 2023, "Entangled: Red Tower Books");
        Livro livro3 = new Livro("Just Because", "Matthew McConaughey", 2004, "Viking Books for Young Readers");

        // Exibindo o estado de cada instância
        System.out.println("Livro 1:\n" + livro1);
        System.out.println("\nLivro 2:\n" + livro2);
        System.out.println("\nLivro 3:\n" + livro3);
    }
}
