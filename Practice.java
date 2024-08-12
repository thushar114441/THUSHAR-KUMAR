import java.util.*;
public class Practice{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

       int x=sc.nextInt();
       int y=sc.nextInt();
       
       
    
        for(int i=0;i<x;i++){
            for(int j=0;j<i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
       
            if(x==y){
                System.out.println("x equal to y");
            }else if(x>y){
                System.out.println("x greater then y");
            }else{
                System.out.println("x smaller then y");
            }
        int button=sc.nextInt();

        switch(button){
                case 0:
                        System.out.println("zero");
                        break;
                case 1:
                        System.out.println("one");
                        break;
                default:
                        System.out.println("invalid choice");
            }
        int[] student=new int[5];
            student[0]=67;
            student[1]=56;
            student[2]=57;
            student[3]=58;
            student[4]=59;
            //System.out.println(student[2]);
            for(int i=0;i<=5;i++){
                System.out.println(student[i]);
            }

                
                
            }
            


}
