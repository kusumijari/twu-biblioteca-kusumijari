package com.tw.biblioteca;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DisplayTest {

   @Test
   public void shouldShowWelcomeMessage() {
      Display display = new Display("Hello!");

      assertEquals("Hello!", display.welcomeMesasge());
   }


}