/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hospital;
//import java.awt.HeadlessException;
import java.util.*;
import javax.swing.JOptionPane;
/**
 *
 * @author dell
 */
public class reception 
{
private int rid;
public String rname;
static public int nop;
public static patient po[]=new patient[20];
public void regpat()
{
    
    System.out.println("\n Welcome to the #AdiBad Reception !\nWould you like to : \n1. EXPLORE \t2.REGISTER PATIENT \t3. MOVE ON");
    Scanner u=new Scanner(System.in);
    int q=u.nextInt();
    switch(q)
    {
        case 1:    
            System.out.println(" This Hospital Program uses the following techniques of java : ");
            System.out.println(" 1. Interlinking Classes\n 2. Creating abstract classes and methods\n"
                    + " 3. Interfaces and their implementation[test]\n 4. Delay function\n 5. Color background[not visible with Netbeans]\n"
                    + " 5. Menu and Password driven methods\n 6. Message Dialog Box [Swingx class]   ");
            System.out.println("\n*This hospital wouldn't have been possible without Ms. Anuradha Ravi*");
            System.out.printf(" \n\nAcknowledgement to the following for concrete information:\n"
                    + "1. www.dreamincode.net\n"
                    + "2. Class Presentations\n"
                    + "3. https:/www.google.co.in/search?q=symptomsr+oe=utf-8&client=firefox-b&gfe_rd=cr&ei=bZ4AWKLkN-7s8Ae8s5C4BA#q+java+netbeans\n"
                    + "4. https:/www.mkyong.com"
                    + "\n5. https:/www.google.co.in/search?q=symptoms&ie=utf-8&oe=utf-8&client=firefox-b&gfe_rd=cr&ei=bZ4AWKLkN-7s8Ae8s5C4BA#q=n"
                    + "6. www.stackoverflow.com\n"
                    + "7. https:/www.google.co.in/search?q=symptoms+of+fracture&ie=utf-8&oe=utf-8&client=firefox-b&gfe_rd=cr&ei=bZ4AWKLkN-7s8Ae8s5C4BA\n");
    
            
            break;
        case 2:
            System.out.println(" *-* We'll be asking you for a few details, kindly be PATIENT  *-* .<pun intended>.*-*");
                
            //................................PATIENT HAS ENTERED.......................
            patient p[]=new patient[20];
            
            System.out.printf(" We need to know the number of patients :\t ");
            int c=0;
            String temp=new String();
            nop=u.nextInt();
            int bc=1;
            if(nop>0)
            {
           System.out.println(" GETTING DETAILS ");
            while(c!=nop)
                {  
                    System.out.println(" \t\t\tPATIENT  :  "+(c+1));
                     p[c]=new patient();
                     p[c].pget();
                     System.out.printf("\t Would you consider yourself young ? (y/n)\t:\t");
                     temp=u.next();
                     p[c].setyo(temp);
                     if(c==2)
                     {
                     System.out.println("\n I don't think you're being honest! ");
                     try{Thread.sleep(2000);
                     while(bc==1)
                     {
                     System.out.println("Would you like to respond?\n\t\t 1. You're right, I'll enter my age again\n"
                             + "\t\t 2. Please don't try to shame me\n"
                             + "\t\t 3. I'm awesome and I don't need to reveal my age to define my health status\n"
                             + "\t\t 4. Kindly do not show me such assumptions again");
                      bc=u.nextInt();    
                     switch (bc) {
                             case 1:
                                 temp=new String();
                                 temp=u.next();
                                 break;
                             case 2:
                                 System.out.println(" I'll keep that in mind Mr/Ms "+p[c].retpname().toUpperCase());
                                 break;
                             case 3:
                                 System.out.println(" Aha! You'll make good friends with Aditya Badola :) ");
                                 break;
                             default:
                                 System.out.println(" I'll keep that in mind Mr/Ms "+p[c].retpname().toUpperCase());
                                 break;
                                
                         }
                    bc++;
                     }
                     }
                     catch (Exception E){System.out.println(" May God bless your soul !");}
                     }
        
                    rid=c+1;
                    c++;
                }
           
            
            //............................disp patient.........................
                    if(nop!=0)
                    {
                    System.out.println("\n\n DISPLAY DETAILS ?(y/n) ");
                    String ch=u.next();
                    if(ch.equals("y"))
                    {
                        c=0;
                        while(c!=nop)
                        {
                            p[c].pdisp(p, (c+1));
                            c++;
                        } 
                    }
                    }
                    department d=new department(); 
                    department.getpat(p);           //send this object patient as reference to department class
                    
                    po=p;
                    //test the disease (if the patient chooses any)
                    jftest it=new jftest();
                    it.itest.tes();
                    
                    //................check admit?..........................
                    //System.out.printf("\n Let's see if the Doctor suggested your admission into the Ward !\nEnter a Patient ID to see if admission is valid :");
                    //int f=u.nextInt();
                    try
                    {
                        Thread.sleep(3000);
                    System.out.println(" Here is a list of patient(s) with their PSTATS :");
                    for(int f=0;f<nop;f++) 
                    {
                        System.out.printf(" PATIENT \t"+(f+1)+"\t : ");
                        patstat(f, p);
                        System.out.println("");
                        
                    }
                    pn np=new pn(nop);
                    
        

                    //...........operation room to be given or not...........
                    Thread.sleep(3000);
                    System.out.println(" We are happy to report that your PSTATS have been sent to your doctor !");
                    po=p;
               }catch (Exception E)
                  {
                      System.out.println(" Oops! Something went wrong!");
                  }
                    //.........get payment....................................
               try
               {
                   Thread.sleep(3000);
                    char v;
                  c=0;
                  for(c=0;c<nop;c++)
                  {
                  System.out.println("\t\t PAYMENT DUE FOR PATIENT "+(c+1));
                  System.out.println(".....................................................");
               Thread.sleep(2000);
                  p[c].pay_charges();
                    System.out.println(" Go ahead with payment ?");
                    String te=new String(); 
                    te=u.next();
                    v=te.charAt(0); int x;
                    if(v=='y')
                  {
                     p[c].setpd(1);
                     rcvpay();
                  } 
                  }
               }
                
            catch (Exception E)
                  {
                      System.out.println(" Oops! Something went wrong!");
                  }
            
                  }       
                   
                    
            break;
 default : System.out.println(" Hope you have a great day :)");    
    }

}

    /**
     *
     * @return
     */
    public patient[] givep()
{
    return po;
}
   public int throwpid()
    {
      return nop;  
    }
public void rcvpay()
{
    try{
    System.out.println(" We'd like to conduct a monetary transcation here.\nPlease comply.");
    //Thread.sleep(5);
    color col=new color(); col.see();
    
    JOptionPane.showMessageDialog(null," PAY WITH GRATITUDE TO #ABHospitals");
}
    catch (Exception E)
            {
                System.out.println(" EXCEPTION HANDELED !");
            }
}
 public void derefpat()
     {
         for(int i=0;i<nop;i++)
             po[i]=null;
     }
    
public void patstat(int n, patient p[])
{
    //n=n-1;
    int patstat=0;
            Random randGen;
        randGen = new Random();
        patstat = Math.abs(randGen.nextInt());
        for(int h=0;h<nop;h++)
        {
            p[h].pstat=new String();
          if(patstat%2==0)
        {
            p[h].pstat="ADMISSABLE";
        }
        else
        {
            p[h].pstat="NOT ADMISSABLE";
        }  
          patstat = Math.abs(randGen.nextInt());
        }
            System.out.println(p[n].pstat);
        }

}



