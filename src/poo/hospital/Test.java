
package poo.hospital;

public class Test {
    public static void main(String[] args) {
        Hospital myDH=new Hospital(41001,"Universitario","Altico","+576088711111",400,200);
        System.out.println("myDH1= "+myDH.toString());
        myDH.setTotalRooms(500);
        System.out.println("myDH2= " + myDH.toString());
        System.out.println("myDH num rooms = " + myDH.getTotalRooms());
        myDH.setFullRooms(500);
        myDH.join();
        System.out.println("myDH full rooms = " + myDH.getFullRooms());
        
        myDH.out();
        System.out.println("myDH full rooms = " + myDH.getFullRooms());
        myDH.setFullRooms(0);
        myDH.out();
        System.out.println("myDH full rooms = " + myDH.getFullRooms());
    }
}
