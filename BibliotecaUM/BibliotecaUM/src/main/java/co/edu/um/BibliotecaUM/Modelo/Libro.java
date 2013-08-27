package co.edu.um.BibliotecaUM.Modelo;

import java.util.Date;

/**
 * Created with IntelliJ IDEA.
 * User: user
 * Date: 20/08/13
 * Time: 08:07 PM
 * To change this template use File | Settings | File Templates.
 */
public class Libro {

    //atributos
    private String isbn;
    private String titulo;
    private String autor;
    private Date fechaPublicacion;
    private int numeroEjemplares;

    //constructores
    public Libro(String isbn, String titulo, String autor, Date fechaPublicacion, int numeroEjemplares) {
        this.isbn = isbn;
        this.titulo = titulo;
        this.autor = autor;
        this.fechaPublicacion = fechaPublicacion;
        this.numeroEjemplares = numeroEjemplares;
    }

    public Libro() {
    }

    //set y get
    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
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

    public Date getFechaPublicacion() {
        return fechaPublicacion;
    }

    public void setFechaPublicacion(Date fechaPublicacion) {
        this.fechaPublicacion = fechaPublicacion;
    }

    public int getNumeroEjemplares() {
        return numeroEjemplares;
    }

    public void setNumeroEjemplares(int numeroEjemplares) {
        this.numeroEjemplares = numeroEjemplares;
    }

    @Override
    public String toString() {
        return "[" + isbn  + "]: " + titulo ;
    }
}
