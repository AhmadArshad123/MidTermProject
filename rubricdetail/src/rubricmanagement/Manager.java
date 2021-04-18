/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rubricmanagement;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.swing.JOptionPane;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;



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
    public List<Evaluation> evaluationsList;


     Manager(){
        stdList= new ArrayList<Student>();
        CLOList= new ArrayList<CLO>();
        rubricList= new ArrayList<Rubrics>();
        evaluationsList= new ArrayList<Evaluation>();
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
     
    public void addEvaluation(Evaluation c)
    {
        evaluationsList.add(c);
    }
    
     
    public boolean saveStudents() throws IOException
    {
        try (FileWriter fw = new FileWriter("Students.txt",false);){
            
            for(int i = 0 ; i< stdList.size() ; i++ )
          {
            fw.write( stdList.get(i).getStudentName()+","+stdList.get(i).getRegNo()+","+stdList.get(i).getSection()+","+stdList.get(i).getSession()+","+stdList.get(i).getPhoneNo()+"\n"); 
          }
         fw.flush();
         fw.close();
         return true;
          
        } catch (Exception e) {
            return false;
        }
 
    }
    
    public boolean saveCLOs() throws IOException
    {
        try (FileWriter fw = new FileWriter("CLOs.txt",false);){
            
            for(int i = 0 ; i< CLOList.size() ; i++ )
          {
            fw.write(CLOList.get(i).getCourseCode()+","+CLOList.get(i).getCourseTitle()+","+CLOList.get(i).getCLOnumber()+","+ CLOList.get(i).getCLODiscription()+"\n") ; 
          }
         fw.flush();
         fw.close();
         return true;
          
        } catch (Exception e) {
            return false;
        }
 
    }
    
    public void saveRubrics()
    {
        //Blank workbook
        XSSFWorkbook workbook = new XSSFWorkbook(); 
         
        //Create a blank sheet
        org.apache.poi.xssf.usermodel.XSSFSheet sheet = workbook.createSheet("Employee Data");
        Map<String, Object[]> data = new TreeMap<String, Object[]>();
        data.put("1", new Object[] {"Rubric Number","Assesment NO","CLO No", "Rubric Discription", "Component Marks","Level 1","Level 2","Level 3"});
        int row1=2;
        for(int i=0 ; i<rubricList.size(); i++)
        {
            for(int j = 0; j<4 ; j++)
            {
                 data.put("row1", new Object[] {rubricList.get(i).Rubric.get(j).getRubricNumber(),rubricList.get(i).getAssesmentno(),rubricList.get(i).getCLO(), rubricList.get(i).Rubric.get(j).getRubricDiscription(), rubricList.get(i).Rubric.get(j).getRubricweightage(),rubricList.get(i).Rubric.get(j).getRubric1Discription(),rubricList.get(i).Rubric.get(j).getRubric2Discription(),rubricList.get(i).Rubric.get(j).getRubric3Discription()});
                 row1++;
                 System.out.println(row1);
            }
        }
        
        Set<String> keyset = data.keySet();
        int rownum = 0;
        for (String key : keyset)
        {
            Row row = sheet.createRow(rownum++);
            Object [] objArr = data.get(key);
            int cellnum = 0;
            for (Object obj : objArr)
            {
               Cell cell = row.createCell(cellnum++);
               if(obj instanceof String)
                    cell.setCellValue((String)obj);
                else if(obj instanceof Integer)
                    cell.setCellValue((Integer)obj);
            }
        }
        
        try
        {
            //Write the workbook in file system
            FileOutputStream out = new FileOutputStream(new File("Rubrics.xlsx"));
            workbook.write(out);
            out.close();
            
        } 
        catch (Exception e) 
        {
            e.printStackTrace();
        }
    }
    
    public void loadStudent() 
            
    {
        try{
        FileReader fr=new FileReader("Students.txt");
            try (BufferedReader br = new BufferedReader(fr)){
                String read = br.readLine();
                while(read!=null){
                    String []array=read.split(",");
                    
                    Student s = new Student();
                    
                    s.setStudentName(array[0]);
                    s.setRegNo(array[1]);
                    s.setSection(array[2]);
                    s.setSession(array[3]);
                    s.setPhoneNo(array[4]);
                    
                    this.stdList.add(s);
                    
                    read =br.readLine();
                     
                }
               fr.close();
                
            } catch (IOException ex) {
                Logger.getLogger(Manager.class.getName()).log(Level.SEVERE, null, ex);
            } 
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Manager.class.getName()).log(Level.SEVERE, null, ex);
        }
        }
         
    
        public void loadCLOs() 
    {
        try{
        FileReader fr=new FileReader("CLOs.txt");
            try (BufferedReader br = new BufferedReader(fr)){
                String read = br.readLine();
                while(read!=null){
                    String []array=read.split(",");
                    
                    CLO s = new CLO();
                    
                    s.setCourseCode(array[0]);
                    s.setCourseTitle(array[1]);
                    s.setCLOnumber(array[2]);
                    s.setCLODiscription(array[3]);
                   
                    
                    this.CLOList.add(s);
                    
                    read =br.readLine();
                     
                }
               fr.close();
                
            } catch (IOException ex) {
                Logger.getLogger(Manager.class.getName()).log(Level.SEVERE, null, ex);
            } 
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Manager.class.getName()).log(Level.SEVERE, null, ex);
        }
        }
    
        
        public boolean saveRubricfile() throws IOException
    {
        try (FileWriter fw = new FileWriter("Rubrics.txt",false);){
            
            for(int i=0 ; i<rubricList.size(); i++)
        {
            fw.write(rubricList.get(i).getAssesmentno()+","+rubricList.get(i).getCLO()+",");
            for(int j = 0; j<4 ; j++)
            {
                 fw.write(rubricList.get(i).Rubric.get(j).getRubricNumber()+","+ rubricList.get(i).Rubric.get(j).getRubricDiscription()+","+ rubricList.get(i).Rubric.get(j).getRubricweightage()+","+rubricList.get(i).Rubric.get(j).getRubric1Discription()+","+rubricList.get(i).Rubric.get(j).getRubric2Discription()+","+rubricList.get(i).Rubric.get(j).getRubric3Discription()+",");   
            }
            fw.write("\n");
        }
         fw.flush();
         fw.close();
         return true;
          
        } catch (Exception e) {
            return false;
        }
    }
     
     
     
     
    
      public void showRubrics(){
     
          String format =  String.format("%-110s %-30s %-100s %-100s %-100s"  , "RUBRIC DISCRIPTION", "Component marks", "Level 1", "Level 2", "Level 3"+"\n");
       String output="";
          
          for(int i=0; i<rubricList.size();i++)
          {
              for(int j=0 ; j<4 ; j++)
              {
            output =  String.format("%-110s %-30s %-100s %-100s %-100s" , rubricList.get(i).Rubric.get(j).getRubricDiscription(),rubricList.get(i).Rubric.get(j).getRubricweightage() , rubricList.get(i).Rubric.get(j).getRubric1Discription(), rubricList.get(i).Rubric.get(j).getRubric2Discription(), rubricList.get(i).Rubric.get(j).getRubric3Discription() +"\n" + output); 
            
              }
          }
          JOptionPane.showMessageDialog(null,format+"\n"+output+"\n");
         
      }
    
    
          
          
          
    
    
   
    
   
}
