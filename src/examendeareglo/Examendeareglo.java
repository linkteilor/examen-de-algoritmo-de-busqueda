/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examendeareglo;

import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author Laboratorio 7
 */
public class Examendeareglo {

   public static void pregunta1(){
        // declaramos variables
        int NumerodeAuto=0;
        int valordeaAuto=0;
        int clave =0;
        int suma = 0;      
        int impuesto=0;
        
        Scanner leer=new Scanner(System.in);
        System.out.println("Ingrse el numero de Auto ");
        NumerodeAuto=leer.nextInt();
        System.out.println("Ingrese el costo del Auto");
        valordeaAuto=leer.nextInt();
        for  (int i = 0; i < NumerodeAuto; i++) {
            System.out.println("Ingrse la clave del Auto");
            clave=leer.nextInt();
            if (clave==1){
             impuesto=(int) (valordeaAuto*0.1);
                System.out.println("El Impuesto es :"+impuesto);
                suma=suma+impuesto;
            }else if (clave==2){
                impuesto=(int) (valordeaAuto*0.05);
                System.out.println("El Impuesto es");
                suma=suma+impuesto;
            }else if (clave==3){
                impuesto=(int) (valordeaAuto*0.07);
                System.out.println("El Impuesto es");
                suma=suma+impuesto;
                
            }
            System.out.println("El Valor del Auto a pagar es :"+suma);
            }

    }
    public static void pregunta2() throws IOException{

        int numero1=0,numero2=0;
        LeerTeclado lt=new LeerTeclado();
        System.out.println("Operaciones aritmeticas--->Seleccione una opcion:");
        System.out.println(" + ---->suma");
        System.out.println(" - ---->resta");
        System.out.println(" * ---->multiplicacion");
        System.out.println(" / ---->division ");
        String op = null;
        op = lt.leer(op, "ELIJA UNA OPERACION ARITMETICA");
        switch(op){
            case "+":
                numero1=lt.leer(numero1, "Ingrese primer número");
                numero2=lt.leer(numero2, "Ingrese segundo número");
                System.out.println("La suma: "+(numero1+numero2));
                break;
            case "-":
                numero1=lt.leer(numero1, "Ingrese primer número");
                numero2=lt.leer(numero2, "Ingrese segundo número");
                System.out.println("La resta: "+(numero1-numero2));
                break;
            case "*":
                numero1=lt.leer(numero1, "Ingrese primer número");
                numero2=lt.leer(numero1, "Ingrese segundo número");
                System.out.println("La multiplicacion: "+(numero1*numero2));
                break;
            case "/":
                numero1=lt.leer(numero1, "Ingrese primer número");
                numero2=lt.leer(numero2, "Ingrese segundo número");
                System.out.println("La division: "+(numero1/numero2));
                break;
           default:System.out.println("Opcion no valida");
        }
    }
    
     public static void pregunta3(){
           Scanner lt;
        lt = new Scanner(System.in);
          int[] vector={42,57,14,40,96,19,8,68,1,4};
        int temp; 
        String orden,des;
        System.out.println("ordenacion de forma descendente y ascendente");
        System.out.println("ascendente = asc:");
        System.out.println("descendente = des:");
        orden=lt.nextLine();
        // de forma ascendente usando el if(){}else{} y dentro de if usamos un for
        if(orden.equals("asc")){
        for (int i = 1; i < vector.length; i++) {
            for (int j = 0; j < vector.length-i; j++) {
                if(vector[j] > vector[j+1]){
                temp=vector[j];
                vector[j]=vector[j+1];
                vector[j+1]=temp;
                }
            }
        }
        // de foma descendente
        }else{
             for (int i = 1; i < vector.length; i++) {
            for (int j = 0; j < vector.length-i; j++) {
                if(vector[j] < vector[j+1]){
                temp=vector[j];
                vector[j]=vector[j+1];
                vector[j+1]=temp;
                }
            }
        }
            
        }
        for (int i = 0; i < vector.length; i++) {
        System.out.print(vector[i]+"|");    
        }
    
    }
    public static void pregunta4(){
        Scanner lt=new Scanner(System.in);
        
        int[] vector={1,10,9,8,11,7,6,12,2,3,4,5};
        int x=0;
        boolean marca=false;
        
        System.out.println("ingrese el numero del 1 al 12:");
        int mes=lt.nextInt();
            
            while(1<vector.length && marca==false){
                if (vector[x]==mes) {
                    marca=true;                    
                }
                x++;
            }
            if (marca=false) {
                System.out.println("no se encontro el numero");
        } else {
                
                System.out.println("el numero fue encontrado en el posicion: \n"+(x));
                
        }
            
        }
  
        
        public static void main(String[] pregunta5) throws IOException {
            Scanner lt=new Scanner(System.in);
                 int opcion=0;
        do{
            switch(opcion){
            case 1:{pregunta1();}break;
            case 2:{pregunta2();}break;
            case 3:{pregunta3();}break;
            case 4:{pregunta4();}break;
            
            }
            System.out.println("Seleccion el algoritmo que desea probar del 1 a 4:");
            opcion=lt.nextInt();
        }while(opcion!=0);
    }

    
}
