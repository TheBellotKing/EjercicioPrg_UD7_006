/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ud7_006;

/**
 *
 * @author dam1d06
 */
public class UD7_006 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String titulo, autor;
        int ejemplares;
        
        // Se crea el objeto libro1 utilizando el constructor con parámetros
        Libro libro1 = new Libro("El quijote", "Cervantes", 1, 0);
        
        // Se crea el objeto libro2 utilizando el constructor por defecto
        Libro libro2 = new Libro();
        
        // Se teclean los datos del libro2
        System.out.print("Introduce titulo: ");
        titulo = Teclado.cadena();
        System.out.print("Introduce autor: ");
        autor = Teclado.cadena();
        System.out.print("Numero de ejemplares: ");
        ejemplares = Teclado.entero();
        
        // Se asigna a libro2 los datos pedidos por teclado.
        libro2.setTitulo(titulo);
        libro2.setAutor(autor);
        libro2.setEjemplares(ejemplares);
        
        // Se muestran por pantalla los datos del objeto libro1
        System.out.println("Libro 1:");
        System.out.println("Titulo: " + libro1.getTitulo());
        System.out.println("Autor: " + libro1.getAutor());
        System.out.println("Ejemplares: " + libro1.getEjemplares());
        System.out.println("Prestados: " + libro1.getPrestados());
        System.out.println();
        
        // Se realiza un préstamo de libro1. El método devuelve true si se ha podido prestar
        if (libro1.prestamo())
       System.out.println("Se ha prestado el libro " + libro1.getTitulo());
        else
       System.out.println("No quedan ejemplares del libro " + libro1.getTitulo() +
       " para prestar");
        // Se realiza una devolución de libro1. El método devuelve true si se ha podido devolver
        if (libro1.devolucion())
       System.out.println("Se ha devuelto el libro " + libro1.getTitulo());
        else
       System.out.println("No hay ejemplares del libro " + libro1.getTitulo() +
       " prestados");
        // Se realiza otro préstamo de libro1
        if (libro1.prestamo())
       System.out.println("Se ha prestado el libro " + libro1.getTitulo());
        else
       System.out.println("No quedan ejemplares del libro " + libro1.getTitulo() +
       " para prestar");
        // Se realiza otro préstamo de libro1. En este caso no se podrá realizar ya que
        // solo hay un ejemplar de este libro y ya está prestado. Se mostrará un mensaje
        if (libro1.prestamo())
       System.out.println("Se ha prestado el libro " + libro1.getTitulo());
        else
       System.out.println("No quedan ejemplares del libro " + libro1.getTitulo() +
       " para prestar");

        // Se intenta devolver un libro no prestado
        if (libro2.devolucion())
       System.out.println("Se ha devuelto el libro " + libro2.getTitulo());
        else
       System.out.println("No hay ejemplares del libro " + libro2.getTitulo() +
       " prestados");

        // Mostrar los datos del objeto libro1
        System.out.println("Libro 1:");
        System.out.println("Titulo: " + libro1.getTitulo());
        System.out.println("Autor: " + libro1.getAutor());
        System.out.println("Ejemplares: " + libro1.getEjemplares());
        System.out.println("Prestados: " + libro1.getPrestados());
        System.out.println();
        // Mostrar los datos del objeto libro2
        System.out.println("Libro 2:");
        System.out.println("Titulo: " + libro2.getTitulo());
        System.out.println("Autor: " + libro2.getAutor());
        System.out.println("Ejemplares: " + libro2.getEjemplares());
        System.out.println("Prestados: " + libro2.getPrestados());
        System.out.println();
    }
    
}
