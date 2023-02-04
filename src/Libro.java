import java.util.ArrayList;
import java.util.Scanner;

public class Libro {
    private String titulo;
    private String autor;
    private Integer NumPaginas;

    private ArrayList<Libro> listaLibros;
    public Libro() {
        this.listaLibros = new ArrayList<>();
    }

    public Libro(String titulo, String autor, Integer numPaginas, ArrayList<Libro> listaLibros) {
        this.titulo = titulo;
        this.autor = autor;
        NumPaginas = numPaginas;
        this.listaLibros = listaLibros;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public Integer getNumPaginas() {
        return NumPaginas;
    }

    public void setNumPaginas(Integer numPaginas) {
        NumPaginas = numPaginas;
    }

    public ArrayList<Libro> getListaLibros() {
        return listaLibros;
    }

    public void setListaLibros(ArrayList<Libro> listaLibros) {
        this.listaLibros = listaLibros;
    }

    public void addLibro() {
        Scanner sc = new Scanner(System.in);
        Libro nuevoLibro = new Libro();
        System.out.println("Ingrese el titulo del libro");
        titulo = sc.nextLine();
        nuevoLibro.setTitulo(titulo);

        System.out.println("Ingrese el autor del libro");
        autor = sc.nextLine();
        nuevoLibro.setAutor(autor);

        System.out.println("Ingrese el numero de paginas del libro");
        NumPaginas = sc.nextInt();
        nuevoLibro.setNumPaginas(NumPaginas);

        agregarLibro(nuevoLibro);
    }

        public void agregarLibro (Libro nuevoLibro) {
            this.listaLibros.add(nuevoLibro);
        }

        public void Verlibros() {
        for (Libro nuevoLibro : listaLibros) {

        }
        }
        public void Mas300pag() {
        for (Libro i : listaLibros) {
            if (i.getNumPaginas() >= 300) {
                System.out.println(i);

            }
        }
        }



    public void Menos150pag() {
        for (Libro i : listaLibros) {
            if (i.getNumPaginas() < 150) {
                System.out.println(i);

            }
        }
    }

            @Override
            public String toString() {
                return "Libro{" +
                        "titulo='" + titulo + '\'' +
                        ", autor='" + autor + '\'' +
                        ", NumPaginas=" + NumPaginas +
                        ", listaLibros=" + listaLibros +
                        '}';
            }

        }



