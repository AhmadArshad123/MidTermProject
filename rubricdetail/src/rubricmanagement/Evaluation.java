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
public class Evaluation {
    private String Assno;
    private String Clono;
    private String Regno;
    private Double TotalMarks;
    private Double Obtainmarks;
    public List<Double> levelmarks = new ArrayList<Double>();
    public List<Double> totalmarks = new ArrayList<Double>();
//    private Double Level1marks;
  //  private Double Level2marks;
    //private Double Level3marks;
   // private Double Level4marks;

    /**
     * @return the Assno
     */
    public String getAssno() {
        return Assno;
    }

    /**
     * @param Assno the Assno to set
     */
    public void setAssno(String Assno) {
        this.Assno = Assno;
    }

    /**
     * @return the Clono
     */
    public String getClono() {
        return Clono;
    }

    /**
     * @param Clono the Clono to set
     */
    public void setClono(String Clono) {
        this.Clono = Clono;
    }

    /**
     * @return the Regno
     */
    public String getRegno() {
        return Regno;
    }

    /**
     * @param Regno the Regno to set
     */
    public void setRegno(String Regno) {
        this.Regno = Regno;
    }

    /**
     * @return the TotalMarks
     */
    public Double getTotalMarks() {
        return TotalMarks;
    }

    /**
     * @param TotalMarks the TotalMarks to set
     */
    public void setTotalMarks(Double TotalMarks) {
        this.TotalMarks = TotalMarks;
    }

    /**
     * @return the Obtainmarks
     */
    public Double getObtainmarks() {
        return Obtainmarks;
    }

    /**
     * @param Obtainmarks the Obtainmarks to set
     */
    public void setObtainmarks(Double Obtainmarks) {
        this.Obtainmarks = Obtainmarks;
    }

    

    
    
    
    
    
}
