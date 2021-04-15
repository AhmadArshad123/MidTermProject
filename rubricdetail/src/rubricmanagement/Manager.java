/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rubricmanagement;

import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;



/**
 *
 * @author hp
 */
public class Manager  {
    //public List <Student> stdList = new ArrayList<Student>();
    private static Manager instance ;

    
    public List<Student> stdList;
    public List<CLO> CLOList;

     Manager(){
        stdList= new ArrayList<Student>();
        CLOList= new ArrayList<CLO>();
    }
     
     public static Manager getIsntance(){
        if(instance==null)
        {
            instance = new Manager();
        }
        
        return instance;
    }
     
    public void addStudent(Student c)
    {
        stdList.add(c);
    }
    
    public void deleteStudent(int c)
    {
        stdList.remove(c);
    }
    
    public void editStudent(Student a,int c)
    {
        stdList.set(c,a);
    }
    
    public void addCLO(CLO a)
    {
        CLOList.add(a);
    }
    public void editCLO(CLO a,int c)
    {
        CLOList.set(c,a);
    }
    public void showCLO(){
     
        
        
        
          for(int i = 0 ; i< CLOList.size() ; i++ )
          {
            JOptionPane.showMessageDialog(null,  CLOList.get(i).getCLOnumber()+ CLOList.get(i).getCLODiscription()) ; 
          }
          
          
          
    }
    public void showStudent(){
     
        
        
        
          for(int i = 0 ; i< stdList.size() ; i++ )
          {
            JOptionPane.showMessageDialog(null,  stdList.get(i).getStudentName()); 
          }
          
          
          
    }
    
   
    
   
}
