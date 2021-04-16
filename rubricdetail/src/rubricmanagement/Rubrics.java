/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rubricmanagement;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author hp
 */
public class Rubrics {
    private String Assesmentno;
    private String CLO;
    public List<RubricLevel>Rubric=new ArrayList<RubricLevel>();
    

    /**
     * @return the Assesmentno
     */
    public String getAssesmentno() {
        return Assesmentno;
    }

    /**
     * @param Assesmentno the Assesmentno to set
     */
    public void setAssesmentno(String Assesmentno) {
        this.Assesmentno = Assesmentno;
    }

    /**
     * @return the CLO
     */
    public String getCLO() {
        return CLO;
    }

    /**
     * @param CLO the CLO to set
     */
    public void setCLO(String CLO) {
        this.CLO = CLO;
    }

    

    
    
    
    
    
            
            
}
