/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ud7_006;

/**
 *
 * <h2> Documentamos: Clase UD7_006. <h2>
 * 
 * Objeto del programa: Clase que simula el funcionamiento de una biblioteca.
 * 
 * @version Curso 17/18
 * @author Alessandro Cardin Feijoo
 * @since 09/05/2018
 * 
 */
public class UD7_006 {
	
	
	/**
	 * Constantes de cadenas de caracteres sobre los mensajes que se muestran por pantalla
	 * 
	 */
    private static final String FinEjemplares2 = "No hay ejemplares del libro ";
	private static final String LibroDevuelto = "Se ha devuelto el libro ";
	private static final String FinEjemplares = "No quedan ejemplares del libro ";
	private static final String LibroPrestado = "Se ha prestado el libro ";

	/**
	 * Metodo principal del programa
	 * 
     * @param args Argumentos de la linea de comandos
     */
    public static void main(String[] args) {
    	
    	/**
    	 * Atributos para almacenar la información que enviamos a la clase Libro
    	 */
        String titulo, autor;
        int ejemplares;
        
        // Se crea el objeto libro1 utilizando el constructor con parmetros
        Libro libroElQuijote = new Libro("El quijote", "Cervantes", 1, 0);
        
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
        mostrarDatosLibro(libroElQuijote);
        
        // Se realiza un prestamo de libro1. El metodo devuelve true si se ha podido prestar
        realizarPrestamo(libroElQuijote);
        
        // Se realiza un devolucion
        realizarDevolucion(libroElQuijote);
        
        // Se realizan dos prestamos más
        realizarPrestamo(libroElQuijote);
        realizarPrestamo(libroElQuijote);

        // Se intenta devolver un libro no prestado
        realizarDevolucion(libro2);
        
        // Se muestran los datos de los libros
        mostrarDatosLibro(libroElQuijote);
        mostrarDatosLibro(libro2);
    }

    /**
     * Mostramos por pantalla si se puede devolver el libro o no 
     * 
     * @see LibroDevuelto
     * @see FinEjemplares
     * 
     * @param libroDevuelto
     */
	private static void realizarDevolucion(Libro libroDevuelto) {
		if (libroDevuelto.devolucion())
       System.out.println(LibroDevuelto + libroDevuelto.getTitulo());
        else
       System.out.println(FinEjemplares2 + libroDevuelto.getTitulo() +
       " prestados");
	}

	/**
	 * Mostramos por pantalla si se puede prestar el libro o no
	 * 
	 * @see LibroPrestado
	 * @see FinEjemplares
	 * 
	 * @param libroPrestado
	 */
	private static void realizarPrestamo(Libro libroPrestado) {
		if (libroPrestado.prestamo())
       System.out.println(LibroPrestado + libroPrestado.getTitulo());
        else
       System.out.println(FinEjemplares + libroPrestado.getTitulo() +
       " para prestar");
	}

	/**
	 * Mostramos la información del libro recibido como parametro
	 * 
	 * @param libroEjempl
	 */
	private static void mostrarDatosLibro(Libro libroEjempl) {
		System.out.println("Libro:");
        System.out.println("Titulo: " + libroEjempl.getTitulo());
        System.out.println("Autor: " + libroEjempl.getAutor());
        System.out.println("Ejemplares: " + libroEjempl.getEjemplares());
        System.out.println("Prestados: " + libroEjempl.getPrestados());
        System.out.println();
	}
    
}
