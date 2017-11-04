/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hospital;
import static hospital.reception.nop;
//import java.io.*;
import java.util.Scanner;
/**
 *
 * @author dell
 */
public class department
{
    public static int pid;
    public static patient pn[]; 
    public static doctor dn[];
     reception r=new reception();
    public static Operation opo[];
    department() 
    {
        department.pid = 1;
        opo=new Operation[20];
      
    }
   
    
     public void getpid()
    {
        reception r=new reception();
        department.pid=r.throwpid();
    }
     public void derefdoc()
     {
         for(int i=0;i<nop;i++)
             dn[i]=null;
     }
    
    public void doc()
{
  
    //...........................DOCTOR ENTERS..................................
    doctor d[];
        d = new doctor[20];
    //    Operation op[]=new Operation[20];
    
    pass p1=new pass();                       
    if(p1.dpass()==1)
    {
        System.out.println(" Take care ! (0_0) Each doctor links to a unique patient for best customer service (^_^) ");
        System.out.println(pid+"\t Doctors required today :  ");
        int num=0;
       
        patient pn[]=new patient[20]; 
         pn=r.givep();
     
        int c=0;
        for(int s=0;s<pid;s++)
        {
        System.out.println((pid-s)+" doctor(s) required : \n\t\t Doctor : "+(s+1));
        
        
        d[s]=new doctor(); 
        d[s].ddetails();
        
        opo[c]=new Operation();
        
         if(pn[c].pstat.equals("ADMISSABLE"))
                        {
                        System.out.printf(" PATIENT \t"+(s+1)+"\t : ");
                        System.out.println(" You are authorized to allocate an Operation Theatre for this patient ");                                                                         
                        System.out.printf("\t Mr/Ms ' "+pn[c].retpname().toUpperCase()+" ' is diagnosed with"+pn[c].diag);
                        opo[c].odetails();
                        System.out.println(" OPERATION SCHEDULED \n");
                        pn[c].takepopt(opo[c].throname());
                        
                        }
                    else                    //alt+shift+right moves text right one tab space
                 {
                     System.out.println(" PATIENT \t"+(s+1)+"\t does not require a Surgical Operation/Treatment ");
                     opo[c].oname=new String();
                     opo[c].oname="NOT REQUIRED";
                      pn[c].takepopt(opo[c].throname());
                 }
        c++;
      
        }
       
        
    }
    dn=d;
}
    public static void getpat(patient p[])
    {
     // System.out.println(" getpat has recieved patient p[]");
      pn=new patient[20];
      pn=p;
    }
  
public void init(patient p[])
{
//    System.out.printf("   CHECK CORRECT OP ? 1.\t"+opo[0].oname+"\t2.\t"+opo[1].oname);//wrong
   
    int c=0;
    for(int i=0;i<pid;i++)
    {
       
        p[i].hash.concat(Integer.toString((dn[i].retdid()))); //hash is tring so we have to concat the did(int) 
                                                                 //to original value of hash(pid)
        System.out.printf("\n Hash value :\t ");
        System.out.printf(p[i].hash);
        dn[i].ddisp(dn,(i+1)); pn[i].pdisp(pn,(i+1));
        System.out.println(" Treatment for "+pn[i].diag);
        if(pn[i].retpd()==1)
            System.out.println(" Payment Complete ");
        else
            System.out.println(" Payment due ");
       /* String takeoname=new String();
      opo[i].oname=new String();
        takeoname=opo[i].oname;
      */
       System.out.printf(" Operation Theatre \t:\t");
       System.out.println(pn[i].givepopt());                                                 //System.out.printf(opo[c].oname);
       //System.out.printf(opo[c].throname());//...........IS NOT WORKING...WHY???????
      c++;
     }
    
}
public void exec()
{
  System.out.println(" EXECUTIVE MODE ");
  int choice;
  Scanner u= new Scanner(System.in);
 // BufferedReader br=new BufferedReader(new InputStreamReader(System.in)); //everything in comments here can substitute scanner
 try
  {
  pass p=new pass();
  if(p.privcode()==1)
  {
      System.out.println(" You have the power to \n1.Delete all data \n2.Display Operation Chart");
      
      //choice = Integer.parseInt(br.readLine());
      choice=u.nextInt();
      switch(choice)
      {
          case 1: System.out.println(" BEGINING DEREFERENCING ");
            this.derefdoc();
            r.derefpat();
            System.out.println("\t.\n\t.\n\t.\n Declared patient and doctor classes dereferenced. ");
          break;
          case 2: System.out.println("\t Note Hospital Policy : PATIENT LINKED TO UNIQUE DOCTOR\n ");
          Thread.sleep(2000);
          System.out.println("\t Operation Chart Finalized ");
          Thread.sleep(1000);
          try
          {
          init(pn);       
          
          }
          catch (Exception E)
          {
              System.out.println("\n It appears that you have dereferenced all data. Please enter again!");
          }
          break;
          default: System.out.println(" None of the choices chosen. Moving forward ");
  
      }
      
  }    
      else
      System.out.println(" Access Denied");
  }
  catch(Exception E)
  {
     System.out.println(" Couldn't take keyboard Input :( ");
  }
  
  
}

}