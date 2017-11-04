/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hospital;
import java.util.*;
/**
 *
 * @author dell
 */
public class pass
{
    pass()
    {
        
    }
     public int dpass()
    {
        int ds;
        System.out.printf("Please verify your DocCode : ");
        Scanner u=new Scanner(System.in); ds=u.nextInt();
        if(ds==1000)
            return 1;
        else
            System.out.println(" You don't seem to have DocCode validation ");
        return 0;
    }
     public int privcode()
    {
        String ds=new String();
        System.out.printf("Please verify your PrivCode : ");
        Scanner u=new Scanner(System.in); ds=u.next();
        if(ds.equals("#1000"))
            return 1;
        else
            System.out.println(" You don't seem to have PrivCode validation ");
        return 0;
    }
    
     public void abc()
     {
         System.out.println("Test");
     }
}
