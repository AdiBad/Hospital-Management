/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hospital;
import java.util.*;
import java.awt.*;
import javax.swing.JFrame;
/**
 *
 * @author dell
 */
public class Hospital  {
/*public int pid;
    protected void givenop(int nop)
    {
         pid=nop;
    }
    protected int givepid()
    {
        return pid;
    }
  */ 
    public static void main(String[] args)
    {
     try{   
         
    System.out.println(" **********AdiBad Creations************* ");
    Thread.sleep(2000);
    System.out.println("\t\t3\n\t*\t\t*");
    Thread.sleep(1000);
    System.out.println("\t\t2\n\t*\t\t*");
    Thread.sleep(1000);
    System.out.println("\t\t1\n\t*\t\t*");
    Thread.sleep(1000);
    
    System.out.println(" Welcome to the Greatest Hospital in Virtual Reality!\n.......#AdiBad Virtual Hospital is now open.......\n"
            + "\t ^-^ We hope you get well soon ^-^\n");
    char yn='y';
do{
    System.out.println(" Kindly choose the Mode of your choice. ");
    Scanner u=new Scanner(System.in);
    System.out.println("1. VISITOR\t2. ADMINISTRATOR\t3. ESCAPE  ");
    int h=u.nextInt();
    int c;
    switch (h)
    {
        case 1:
    {
    System.out.println(" VISITOR MODE ");
     color clr=new color(); clr.see();
     reception r=new reception();
     r.regpat();
    
    }break;
        case 2:
    {
    System.out.println(" ADMINISTRATOR MODE ");
     department dep=new department();  
     department.pid=reception.nop;
     System.out.println(" Would you like to enter as a \n1.Doctor\n2.Executive");
     int k=u.nextInt();
     if(k==1)
     dep.doc();
     else if(k==2)
     dep.exec();
     else
     System.out.println(" Sorry, that was an invalid entry !");
    }break;
        default:
            System.out.println(" Goodbye ! ");
    
    }
        System.out.println("\n\n Would you like to leave us? (y~Leave/n~Stay)");
        String te=new String();
        te=u.next();
        yn=te.charAt(0);
}while(yn=='n');

    }
catch (Exception E)
                  {
                      System.out.println(" Oops! Something went wrong!");
                  }

    }
}