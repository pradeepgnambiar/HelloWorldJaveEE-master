package com.qaagility.controller;

import org.junit.Test;
import static org.junit.Assert.assertEquals;
import com.qaagility.controller.CalcMulti;

public class AppTest {

CalcMulti myCalc = new CalcMulti();
HelloServlet myHello = new HelloServlet();

public void testSlow(){
    System.out.println("Slow");
  }
  
  public void testSlower(){
    System.out.println("Slower");
  }
  
  public void testFast(){
    System.out.println("FAsst-Updated");
  }
  
  @Test
    public void testCalc(){
      assertEquals("Result",18,myCalc.multi());
    }
   public void Hello(){
      assertEquals("Result",18,myCalc.multi());
    }
    
    
}
