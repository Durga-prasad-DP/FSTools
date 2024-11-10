package com.nit.main;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;


public class AppTest {

  
    @Test
    public void TestWithPositiveValues() {
      App app= new App();
      int excpted =30;
      int actual=app.sum(10, 20);
    }
}
