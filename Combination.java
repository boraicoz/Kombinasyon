import java.util.Scanner;
public class Combination {
    public static void main(String[] args) {
        int n,r,nf=1,rf=1,nrf=1;
        Scanner in =new Scanner(System.in);
        do{
            System.out.print("Ilk sayiyi giriniz:");
            n=in.nextInt();
            System.out.print("Ikinci sayiyi giriniz:");
            r=in.nextInt();
        }
        while(n<r);

        for(int x=1,y=1;x<=n||y<=r;x++,y++){
            nf*=x;
            if(y>r){
                continue;
            }
            rf*=y;
        }

        for(int x=1;x<=n-r;x++)
        {
            nrf*=x;
        }

        System.out.println("C("+n+","+r+"):"+nf/(rf*nrf));


    }
}
