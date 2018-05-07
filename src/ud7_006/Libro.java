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
public class Libro {
    private String titulo, autor;
    private int ejemplares, prestados;
    
    public Libro()
    {
        
    }
    public Libro(String titulo, String autor, int ejemplares, int prestados){
        this.titulo = titulo;
        this.autor = autor;
        this.ejemplares = ejemplares;
        this.prestados = prestados;        
    }
    
    public String getTitulo() {
        return titulo;
    }
    
    public void setTitulo(String titulo){
        this.titulo = titulo;
    }
    
    public String getAutor() {
        return autor;
    }
    
    public void setAutor(String autor){
        this.autor = autor;
    }
    
    public int getEjemplares(){
        return ejemplares;
    }
    
    public void setEjemplares(int ejemplares){
        this.ejemplares = ejemplares;
    }
    
    public int getPrestados(){
        return prestados;
    }
    
    public void setPrestados(int prestados){
        this.prestados = prestados;
    }
    
    public boolean prestamo(){
        boolean realizado = false;
        
        if (ejemplares - prestados > 0 ){
            ejemplares = ejemplares - 1;
            prestados = prestados + 1;
            realizado = true;
        }
        
        return realizado;
    }
    
    public boolean devolucion(){
        boolean realizado = false;
        
        if (prestados > 0 ){
            ejemplares = ejemplares + 1;
            prestados = prestados - 1;
            realizado = true;
        }
        
        return realizado;
    }
}
