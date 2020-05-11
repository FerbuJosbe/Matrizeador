/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package matrizeador;

/**
 *
 * @author Fernando Jose
 */
public final class Matriz 
{
    public String[][] table;
    public int filas;
    public int columnas;
    
    public Matriz(int filas, int columnas)
    {
        this.table = new String[filas][columnas];
    }
}
