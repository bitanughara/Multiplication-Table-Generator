import java.util.Scanner;
public class table{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n,i,m,s;
        do{
            System.out.print("Enter 1 for continue and 0 for Stop : ");
            s = sc.nextInt();
            if(s==1){
                System.out.print("Enter the value of n : ");
                n=sc.nextInt();
                System.out.println("Table is : ");
                for(i=1;i<=10;i++){
                m=n*i;  
                System.out.println(n + " " + "x"+" "+ i+ " " +"="+ " " + + m);
                }
            }
            else{
                System.out.println("Enter only 1 and 0 !");
            }
        }
        while(s!=0);
        sc.close();
    }
}