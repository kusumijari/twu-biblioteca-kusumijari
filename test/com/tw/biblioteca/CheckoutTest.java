package com.tw.biblioteca;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.*;

public class CheckoutTest {

    @Test
    public void shouldAcceptChoiceOfBookFromTheUser() {
        Checkout checkout = new Checkout();
        View mockView = mock(View.class);
        when(mockView.getInput()).thenReturn("1");
        assertEquals("1", checkout.acceptBookChoice(mockView));
    }
}