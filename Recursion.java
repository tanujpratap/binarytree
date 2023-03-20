import java.util.Scanner;
class Recursion{
int fact(int n){
if(n==0){
return 1;}
else{ 
    return n*fact(n-1);
}
}
public static void main(String[]args){
Scanner sc=new Scanner(System.in);
System.out.println("enter the number");
int x=sc.nextInt();
Recursion R=new Recursion();
System.out.println(R.fact(x));}}