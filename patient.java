/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hospital;
import java.util.*;
import java.io.*;
//import java.io.BufferedReader.*;
public class patient 
{
    protected static int pid=0;

    /**
     *
     */
    protected String hash;
    public String pstat;
    private int pd;
    private String popt=new String();
    private String yo=new String();
    public String diag=new String();
    private String pname=new String();
  public void takepopt(String pop)
  {
      popt=pop;
  }
  public String givepopt()
  {
      return popt;
  }
    public String retyo()
    {
        return yo;
    }
    public void setyo(String p)
    {
        yo=p;
    }
    public int retpd()
    {
        return pd;
    }
    public void setpd(int p)
    {
        pd=p;
    }
    patient()
    { 
        hash=" ";
        pd=0;
    }
     
     public void sediag(String d)
     {
         diag=d;
     }
     public String retpname()
     {
         return pname;
     }
    public void pdisp(patient p[],int n)
    {
        if(this.retyo().equals("y"))
                System.out.println("\t\tPatient name : "+pname+" #"+n+" YOUNG/MINOR ");
        else
                    System.out.println("\t\tPatient name : "+pname+" #"+n+" OLD/SENIOR ");
  }
    public void pget()
    {
        System.out.printf("\tKindly enter the details as asked. ");
        Scanner u=new Scanner(System.in);
        System.out.printf("\n\tPatient id : \t"+(pid++)+" \tPatient name : ");
        pname=u.next();
        hash=Integer.toString(pid);  
    }
    public void pay_charges()
    {
        
    /* System.out.println(" Your pay charges are : BEING COMPILED");
     reception r=new reception();
     r.rcvpay();
      */
        
        if(diag.equals("Fracture"))
                            System.out.println(" TOTAL DUE : INR "+1500);
        if(diag.equals(" Insect Bite"))
                            System.out.println(" TOTAL DUE : INR "+200);
        if(diag.equals(" Heart Attack"))
                            System.out.println(" TOTAL DUE : INR "+1500);
        if(diag.equals(" Cancer"))
                            System.out.println(" TOTAL DUE : INR "+15000);
        if(diag.equals(" Rabies"))
                            System.out.println(" TOTAL DUE : INR "+3500);
        if(diag.equals(" Jock Infection"))
                            System.out.println(" TOTAL DUE : INR "+1500);
        if(diag.equals(" Sinus Infection"))
                            System.out.println(" TOTAL DUE : INR "+1000);
        if(diag.equals("Low BP"))
                            System.out.println(" TOTAL DUE : INR "+25000);
        if(diag.equals("Tooth Infection"))
                            System.out.println(" TOTAL DUE : INR "+5500);
        if(diag.equals("Voluntary Death Procedure"))
                            System.out.println(" TOTAL DUE : INR "+1500000);
        
    }
}
