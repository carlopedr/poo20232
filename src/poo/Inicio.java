
package poo;

public class Inicio {
    public static void main(String[] args) {
        //Automovil auto1=new Automovil();
        //auto1.color="Negro";
        //auto1.marca="Ferrari";
        //auto1.matricula="HTF546";
        //auto1.cilidrada=3000;
        Automovil auto1 = new Automovil("Ferrari","Rojo","GTR546",3400);
        System.out.println("Marca: "+auto1.marca);
        auto1.dimeSiEsMetalizado();
        auto1.cambiarMatricula("ABC123");
        System.out.println("Matrícula: " + auto1.matricula);
        boolean rta=auto1.verificarMarca("Ferrari");
        System.out.println("rta verificación: "+rta);
        
    }
}
