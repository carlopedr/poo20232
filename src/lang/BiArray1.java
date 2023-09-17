
package lang;


public class BiArray1 {
    public static void main(String[] args) {
        int nf=3,nc=4;
        int biarreglo[][];
        biarreglo=new int[nf][nc];
        for(int i=0;i<biarreglo.length;i++){
            for(int j=0;j<biarreglo[i].length;j++){
                System.out.print("Pos f= "+i+" c= "+j+":");
                biarreglo[i][j]=(int)(Math.random()*20);
                System.out.println(biarreglo[i][j]);
            }
        }
        
        
    }
}
