package com.ttn.Spring_Boot.Assingments.testservice;

import com.ttn.Spring_Boot.Assingments.domain.Order;
import com.ttn.Spring_Boot.Assingments.service.EmailService;
import com.ttn.Spring_Boot.Assingments.service.OrderService;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;

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
}

