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
abstract class disease
{
public ArrayList <String> ld=new ArrayList <String>(); 
public int nd;
public void list()//private earlier
{
    
ld.add("\n  <1> a. Creaky joints b. Bleeding c. Bruising d. Limping  e. Physical deformity f. Swelling\n");//fracture
ld.add("<2> a. Headache b. Muscle pain c. Joint swelling+Rash\n");   //insect bite
ld.add("<3> a. Dizziness b. Fatigue c. Light-headedness d. Clammy skin e. Cold sweat f. Sensation of an abnormal heartbeat g. Shortness of breath\n");//heart attack
ld.add("<4> a. Abnormal bumps b. Unexplained fevers c. Night sweats d. Unintentional weight loss\n");//cancer
ld.add("<5> a. Weak muscles b. Muscle quiver c. Difficulty swallowing e. Dilated pupil f. Drooling g. Excess salivation h. Headache\n");//rabies
ld.add("<6> a. Groin rash b. Itching c. Redness\n");//jock infection
ld.add("<7> a. Headache b. Facial pain c. Runny nose d.Nasal congestion\n");//sinus infection
ld.add("<8> a. Dizziness b. Fainting c. Lack of concentration d. Blurred vision e.  Cold, clammy, pale skin\n");//low bp
ld.add("<9> a. Bad breath b. Dental cavities c. Tooth loss d. Toothache\n");//tooth infection
ld.add("<10> a. Euthanasia\n");//voluntary death from incurable pain
    nd=ld.size();
    int dis=thrownd();
    //System.out.println(" We have a list of these "+dis+" diseases");
    System.out.println(ld);
    
}

int thrownd()
{
    return (nd);
}

public void throwlod()
{
 System.out.println(ld.toArray());
}

}