import java.util.Scanner;
public class WaterConsumption{
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
System.out.println("enter the number of litres ");
int l = sc.nextInt();
if (l<=500){
System.out.println("the bill is Rs.100.");
}
else if(l>=500){
System.out.println("the bill is Rs.200.");
}

}
}

