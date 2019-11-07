/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examendeareglo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author Laboratorio 7
 */
public class LeerTeclado {
    
    BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
    
    
    
    public int leer(int dato, String mensaje){
        System.out.println(mensaje);
        try {
            dato=Integer.parseInt(br.readLine());
        } catch (IOException e) {
            System.err.println(e.getMessage());
        }
    return dato;
    }    
    public String leer(String dato, String mensaje){
        System.out.println(mensaje);
        try {
            dato=br.readLine();
        } catch (IOException e) {
            System.err.println(e.getMessage());
        }
    return dato;
    }    
    public double leer(double dato, String mensaje){
        System.out.println(mensaje);
        try {
            dato=Double.parseDouble(br.readLine());
        } catch (IOException e) {
            System.err.println(e.getMessage());
        }
    return dato;
    }
    public char leer(char dato, String mensaje){
        System.out.println(mensaje);
        try {
            dato=(br.readLine().charAt(0));
        } catch (IOException e) {
            System.err.println(e.getMessage());
        }
    return dato;
    }public boolean leer( String mensaje){
        System.out.println(mensaje);
        boolean dato = false;
        try {
            dato=br.equals(br.readLine());
        } catch (IOException e) {
            System.err.println(e.getMessage());
        }
    return dato;
    }
    
}
