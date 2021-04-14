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
public class ManagingStudent  {
    //public List <Student> stdList = new ArrayList<Student>();
    private static ManagingStudent instance ;
    public List<Student> stdList;

     ManagingStudent(){
        stdList= new ArrayList<Student>();
    }
     
     public static ManagingStudent getIsntance(){
        if(instance==null)
        {
            instance = new ManagingStudent();
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
    
    public void showStudent(){
     
        
        
        
          for(int i = 0 ; i< stdList.size() ; i++ )
          {
            JOptionPane.showMessageDialog(null,  stdList.get(i).getStudentName()); 
          }
          
          
          
    }
    
   
    
   
}
