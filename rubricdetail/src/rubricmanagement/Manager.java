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
    public List<Rubrics> rubricList;

     Manager(){
        stdList= new ArrayList<Student>();
        CLOList= new ArrayList<CLO>();
        rubricList= new ArrayList<Rubrics>();
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
    
    
    public void addRubric(Rubrics a)
    {
        rubricList.add(a);
    } 
     public void editRubric(Rubrics r,int c)
    {
        rubricList.set(c,r);
    }
     
      public void showRubrics(){
     //String format =  String.format("%-110s %-30s %-100s %-100s %-100s"  , "RUBRIC DISCRIPTION", "Component marks", "Level 1", "Level 2", "Level 3"+"\n");
       // String output="";
         // 
          for(int i=0; i<rubricList.size();i++)
          {
              for(int j=0 ; j<4 ; j++)
              {
            JOptionPane.showMessageDialog(null,  rubricList.get(i).Rubric.get(j).getRubricDiscription()+" "+rubricList.get(i).Rubric.get(j).getRubricweightage() +" "+ rubricList.get(i).Rubric.get(j).getRubric1Discription()+" "+ rubricList.get(i).Rubric.get(j).getRubric2Discription()+" "+ rubricList.get(i).Rubric.get(j).getRubric3Discription() ); 
              }
          }
          //JOptionPane.showMessageDialog(null,format+"\n"+output);
          
         // JOptionPane.showMessageDialog(null,rubricList.get(0).Rubric.get(0).getRubricDiscription() + " "+rubricList.get(0).Rubric.get(0).getRubric1Discription()+" "+rubricList.get(0).Rubric.get(0).getRubric2Discription() +" "+rubricList.get(0).Rubric.get(0).getRubric3Discription()  );
          //JOptionPane.showMessageDialog(null,rubricList.get(0).Rubric.get(1).getRubricDiscription() + " "+rubricList.get(0).Rubric.get(1).getRubric1Discription()+" "+rubricList.get(0).Rubric.get(1).getRubric2Discription() +" "+rubricList.get(0).Rubric.get(1).getRubric3Discription()  );
          //JOptionPane.showMessageDialog(null,rubricList.get(0).Rubric.get(2).getRubricDiscription() + " "+rubricList.get(0).Rubric.get(2).getRubric1Discription()+" "+rubricList.get(0).Rubric.get(2).getRubric2Discription() +" "+rubricList.get(0).Rubric.get(2).getRubric3Discription()  );
          //JOptionPane.showMessageDialog(null,rubricList.get(0).Rubric.get(3).getRubricDiscription() + " "+rubricList.get(0).Rubric.get(3).getRubric1Discription()+" "+rubricList.get(0).Rubric.get(3).getRubric2Discription() +" "+rubricList.get(0).Rubric.get(3).getRubric3Discription()  );
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
