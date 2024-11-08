
package com.busquedabinaria.busqueda;

public class BusquedaBinaria1 {
    public static void main(String[] args) {
        int A [] = {2,4,6,8,10,12,14,16,18,20,22,24};
        
        int pos = BusquedaBinaria(A, 8);
        
        if(pos == -1){
            System.out.println("El dato no esta en el arreglo");
        }else{
            System.out.println("El dato se encuentra en la posicion "+ pos);    
        }
    }
    
    public static int BusquedaBinaria(int[] A, int dato){
        int inicio, mitad, fin;
        inicio = 0;
        fin = A.length -1;
        
        while(inicio < fin){
            mitad = (inicio + fin)/2;
            if(A[mitad] == dato){
                return mitad;
            }else if(A[mitad]<dato){
                inicio = mitad+1;
            }else{
                fin = mitad-1;
            }
        }
        return -1;
    }
}
