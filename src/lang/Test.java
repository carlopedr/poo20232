/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lang;

/**
 *
 * @author Principal
 */
public class Test {

    public static void main(String[] args) {
        int park[][] = new int[3][4];
        boolean free = false;
        for (int f = 0; f < park.length; f++) {
            for (int c = 0; c < park[f].length; c++) {
                park[f][c]=1;
                if (park[f][c] == 0) {
                    free = true;
                    break;
                }
            }
        }
        if(free==true){
            System.out.println("Hay espacios vacios");
        }else
            System.out.println("No hay espacios vacios");

    }

}
