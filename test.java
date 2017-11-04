/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hospital;
import static hospital.reception.nop;
import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author dell
 */
public abstract class test implements itest
{
    itest itest;

    public test() {
        this.itest = new itest()
        {
            @Override
            public void tes()
            {
                System.out.println("\n #AdiBad Hospital services for the following ailments. Kindly browse the following list.");
                //delay of 3 seconds
                try {
                    Thread.sleep(3*1000);
                } catch (InterruptedException ex) {
                    Logger.getLogger(test.class.getName()).log(Level.SEVERE, null, ex);
                }
                
                compare co=new compare();
                co.comp();
                
                Scanner u=new Scanner(System.in);
                
                //pn np=new pn();
                //int i=np.retpn();
                reception r=new reception();
                patient p[]=new patient[20];
                p=r.givep();                //this is the correct patient list
                
             
                int i=r.throwpid();
                
                for(int j=0;j<i;j++)
                {
                    System.out.println(" Hey Patient "+(j+1)+"! ");
                    System.out.printf("Kindly enter the number you feel fit your symptoms :\t");
                    
                    int symp=u.nextInt();
                    System.out.printf(" You have to be treated for : \t");
                    
                    switch(symp)
                    {
                        case 1 : //System.out.println(" Fracture");
                       // p[j].sediag("Fracture");
                        p[j].diag="Fracture";
                            System.out.println(p[j].diag);
                        break;
                        case 2 : //System.out.println(" Insect Bite");
                        p[j].sediag(" Insect Bite");
                        System.out.println(p[j].diag);
                        break;
                        case 3 : //System.out.println(" Heart Attack");
                        p[j].sediag(" Heart Attack");
                        System.out.println(p[j].diag);
                        break;
                        case 4 : //System.out.println(" Cancer");
                        p[j].sediag(" Cancer");
                        System.out.println(p[j].diag);
                        break;
                        case 5 : //System.out.println(" Rabies");
                        p[j].sediag(" Rabies");
                        System.out.println(p[j].diag);
                        break;
                        case 6 : //System.out.println(" Jock Infection");
                        p[j].sediag(" Jock Infection");
                        System.out.println(p[j].diag);
                        break;
                        case 7 : //System.out.println(" Sinus Infection");
                        p[j].sediag(" Sinus Infection");
                        System.out.println(p[j].diag);
                        break;
                        case 8 : //System.out.println(" Low BP");
                        p[j].sediag("Low BP");
                        System.out.println(p[j].diag);
                        break;
                        case 9 : //System.out.println(" Tooth Infection");
                        p[j].sediag("Tooth Infection");
                        System.out.println(p[j].diag);
                        break;
                        case 10 : //System.out.println(" Voluntary Death Procedure");
                        p[j].sediag("Voluntary Death Procedure");
                        System.out.println(p[j].diag);
                        break;
                        default : System.out.println(" *NO DISEASE SELECTED* ");
                    }
                }
            }
        };  }
            }