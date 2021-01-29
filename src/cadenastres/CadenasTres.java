/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cadenastres;

import java.util.Scanner;

/**
 *
 * @author Noriega
 */
public class CadenasTres {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);
        String pal, invertida="";
        int tam, i=0, j=0, k=0,n=0;
        
        //lee cadena
        System.out.println("Ingrese una cadena menor de 10 caracteres");
        pal = sc.nextLine();
        
        //obtiene el tamaño
        tam = pal.length();
        
        //invierte la palabra
        
        String array[]=pal.split(" ");
        for(i=0;i<array.length;i++){
            char a[]=array[i].toCharArray();
            for(j=a.length-1;j>=0;j--){
                invertida+=a[j];
            }
            invertida+=" ";
        }
       
        //obtiene cuantos caracteres le faltan para llegar a 10
        tam=9-tam;
        if(tam<1){
            
        }else{
            //crea una cadena nueva con las caracteres faltantes
            String subStr=invertida.substring(0, tam);

            //concatena las dos cadenas
            pal=pal.concat(subStr);
        }

        
        //parte de arriba
        for(i=0;i<=9;i++){
            if(i%2==1){
                for(k=10;k>=i;k--){
                    if(k%2==1){
                        System.out.print( " " );
                    }
                }
                for(j=0;j<i;j++){
                    System.out.print(""+pal.charAt(j));
                }
                System.out.println( );
            }
        }
        
        //parte de abajo
        for(i=9;i>1;i--){
            if((i%2)==1){
                for(k=i;k<=11;k++){
                    if((k%2)==1){
                        System.out.print( " " );
                    }
                }
                for(j=i-2;j>0;j--){ 
                    System.out.print(""+pal.charAt(n));
                    n++;
                }
                n=0;
                System.out.println( );
            }
        }
    }
    
}
