package lang;

public class Primo {
    public static void main(String[] args) {
        int num,k=0;
        num=4;
        for(int i=2;i<=(num/2);i++){
            k=num%i;
            if (k==0){
                System.out.println(num + " no es primo");
                break;
            }
                        
        }
        if(k!=0){
            System.out.println(num + " es primo");
        }
        
        
    }
    
}
