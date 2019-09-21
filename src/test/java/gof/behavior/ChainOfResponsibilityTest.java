package gof.behavior;

import gof.behavior.chainofresponsibility.RequesterClient;
import gof.behavior.chainofresponsibility.handlers.AbstractSupportHandler;
import org.junit.Test;

public class ChainOfResponsibilityTest {

    @Test
    public void testGetHandlerChain() throws Exception {
        AbstractSupportHandler handler = RequesterClient.getHandlerChain();
        handler.receiveRequest(AbstractSupportHandler.TECHNICAL, " I'm having problem with my internet connectivity.");
        System.out.println("............................................");
        handler.receiveRequest(AbstractSupportHandler.BILLING, "Please resend my bill of this month.");
        System.out.println("............................................");
        handler.receiveRequest(AbstractSupportHandler.GENERAL, "Please send any other plans for home users.");
    }
}