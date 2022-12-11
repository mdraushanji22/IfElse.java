import java.util.Scanner;
public class IfElse {
    public static void main(String[] args) {
        int n;
        System.out.println("Enter tha any number");
        Scanner r=new Scanner(System.in);
        n=r.nextInt();
        if(n>=0){
            System.out.println("+ve number");
        }
        else{
            System.out.println("-ve Number");
        }
    }


}
