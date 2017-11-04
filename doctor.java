/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hospital;
import java.util.Scanner;

/**
 *
 * @author dell
 */
public class doctor 
{

    private int did;
    private String dname=new String();
    
    doctor()
    {
        did=1;
    }
    public void ddetails()
    {
        System.out.printf("\tKindly enter the details as asked. ");
        Scanner u=new Scanner(System.in);
        System.out.printf("\n Doctor name : ");
        dname=u.next();
        System.out.printf(" Doctor id : ");
        did=u.nextInt();
        System.out.println("\t\tDoctor profile : "+dname+" #"+did);
    }
     public void ddisp(doctor p[],int n)
    {
                System.out.printf("\t\tDoctor profile : "+dname+" #"+n);
    }
    public int retdid()
    {
        return did;
    }
    
    public void pay_charges()
    {
        
     System.out.println(" Your pay charges are : ");   
        
    }
    

}

