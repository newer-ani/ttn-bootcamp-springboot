package com.ttn.Spring_Boot.Assingments.testservice;

import com.ttn.Spring_Boot.Assingments.domain.Order;
import com.ttn.Spring_Boot.Assingments.service.EmailService;
import com.ttn.Spring_Boot.Assingments.service.OrderService;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.*;

public class OrderServiceTest {


    @Mock
    EmailService emailService;

    @InjectMocks
    OrderService orderService;

    @Test
    void testPlaceOrder() {
        Order order = mock(Order.class);
        when(order.getPrice()).thenReturn(100.0);

        orderService.placeOrder(order);

        verify(order).setPriceWithTax(20.0);
        verify(emailService).sendEmail(order);
        verify(order).setCustomerNotified(true);
    }

    @Test
    public void testPlaceOrderWithCc_shouldSetPriceAndNotifyCustomer() {
        Order order = new Order(2,"Item1",20.00);
        assertTrue(orderService.placeOrder(order, "cc@gmail.com"));
        assertEquals(24.0, order.getPriceWithTax(), 0.01);
    }

    @Test
    public void testPlaceOrderWithOrder_shouldNotifyCustomer() {
        Order order = new Order(2,"Item1",20.00);
        orderService.placeOrder(order, "cc@gmail.com");
        assertTrue(order.isCustomerNotified());
    }
}

