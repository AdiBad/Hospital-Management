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
public class Operation
{

    private int oid;
    public String oname=new String();
    public String odate;
                                                            //public patient p[];
        public Operation()
                {
                                                            //  this.p = new patient[20];
                 Date date=new Date();  
                 this.odate=date.toString();
                }
        public Operation(patient p1[])
        {
            this();
                                                                    //this.p = new patient[20];
                                                                    //p=p1;
        }
        public String throname()
        {
            if(oname==null)
            {
                return "Room 1";
            }
            
            return oname;
        }
    public void odetails()
    {
        Scanner u=new Scanner(System.in);
        System.out.printf("\n\t\t Operation theatre : ");
        oname=u.next();
        System.out.printf("\n Today is \t\t:\t"+this.odate+"\n When would you like to schedule an operation (today/tomorrow)\t:\t");
        odate=u.next();
    }
       
}
