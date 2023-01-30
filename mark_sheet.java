import java.util.Scanner;
public class mark_sheet {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter name of a pearson");
        String name= sc.next();
        System.out.println("enter roll no. of a pearson");
        int rollNUmber= sc.nextInt();
        System.out.println("enter field of intrest");
        String field= sc.next();
        System.out.println("Name :"+name);
        System.out.println("roll number :"+rollNUmber);
        System.out.println("field of intrest :"+field);
    }
}
