package task_s_1;

import java.util.Scanner;

public class Task_s_1 {

    static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        
        product.dB();
        person pe =new person();
        
        product.print();
        System.out.println("3####################");
           
        pe.setId(1);
        pe.setName("mohamed ");
        
        System.out.println("--------------------------------------------");
        pe.print();
        System.out.println("--------------------------------------------");
        pe.getOrd().addToOrder(1, 10000);
        pe.getOrd().addToOrder(1, 10);
        pe.getOrd().addToOrder(2, 30);
        
        pe.getOrd().doneOrder();
      //  pe.getOrd().addToOrder(3, 20);
        pe.getOrd().printOrder();
        
       
       //product.print();
    }
    
}
