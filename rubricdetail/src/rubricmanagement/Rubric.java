/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rubricmanagement;

/**
 *
 * @author hp
 */
public class Rubric {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       // TODO         
                
//code application logic here
        Manager.getIsntance().loadStudent();
        Manager.getIsntance().loadCLOs();
        Frame MainFrame = new Frame();
        MainFrame.setVisible(true);
        
        
    }
    
}
