package com.ttn.Spring_Boot.Assingments.testservice;

import com.ttn.Spring_Boot.Assingments.domain.Order;
import com.ttn.Spring_Boot.Assingments.service.EmailService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.runners.MockitoJUnitRunner;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

@RunWith(MockitoJUnitRunner.class)
public class EmailServiceTest {

        @InjectMocks
        EmailService emailService;

//    @Test(expected = RuntimeException.class)
//    public void shouldReturnSameObject() {
//        EmailService emailServiceObject = new EmailService();
//    }

        @Test(expected = RuntimeException.class)
        public void testSendEmailWithOrder_shouldThrowException(){
            Order order = new Order(2,"Item1",20.00);
            emailService.sendEmail(order);
        }

        @Test(expected = RuntimeException.class)
        public void testSendEmailWithOrder_shouldNotNotifyCustomer(){
            Order order = new Order(2,"Item1",20.00);
            emailService.sendEmail(order);
            assertFalse(order.isCustomerNotified());
        }

        @Test
        public void testSendEmailWithCc_shouldNotifyCustomer() {
            Order order = new Order(2, "Item1", 20.00);
            emailService.sendEmail(order,"cc@gmail.com");
            assertTrue(order.isCustomerNotified());
        }

        @Test
        public void testSendEmailWithCc_shouldReturnTrue() {
            Order order = new Order(2, "Item1", 20.00);
            assertTrue(emailService.sendEmail(order, "cc@gmail.com"));
        }
}
