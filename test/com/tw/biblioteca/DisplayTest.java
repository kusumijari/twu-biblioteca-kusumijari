package com.tw.biblioteca;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DisplayTest {

   @Test
   public void shouldShowWelcomeMessage() {
      Display display = new Display("Hello!Welcome to biblioteca");

      assertEquals("Hello!Welcome to biblioteca", display.welcomeMesasge());
   }

}