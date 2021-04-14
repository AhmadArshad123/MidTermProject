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
public class ManagingCLO {
    private static ManagingCLO instances;
    private List<CLO> CLOList;

     ManagingCLO(){
        CLOList= new ArrayList<CLO>();
    }
    
     
     public static ManagingCLO getIsntances(){
        if(instances==null)
        {
            instances = new ManagingCLO();
        }
        
        return instances;
    }
    
    public void addCLO(CLO a)
    {
        CLOList.add(a);
    }
    
    public void showCLO(){
     
        
        
        
          for(int i = 0 ; i< CLOList.size() ; i++ )
          {
            JOptionPane.showMessageDialog(null,  CLOList.get(i).getCLOnumber()+ CLOList.get(i).getCLODiscription()) ; 
          }
          
          
          
    }
    
}
