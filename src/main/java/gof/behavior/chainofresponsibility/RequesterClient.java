package gof.behavior.chainofresponsibility;

import gof.behavior.chainofresponsibility.handlers.AbstractSupportHandler;
import gof.behavior.chainofresponsibility.handlers.BillingSupportHandler;
import gof.behavior.chainofresponsibility.handlers.GeneralSupportHandler;
import gof.behavior.chainofresponsibility.handlers.TechnicalSupportHandler;

public class RequesterClient {

    public static AbstractSupportHandler getHandlerChain() {
        AbstractSupportHandler technicalSupportHandler =
                new TechnicalSupportHandler(AbstractSupportHandler.TECHNICAL);
        AbstractSupportHandler billingSupportHandler =
                new BillingSupportHandler(AbstractSupportHandler.BILLING);
        AbstractSupportHandler generalSupportHandler =
                new GeneralSupportHandler(AbstractSupportHandler.GENERAL);

        technicalSupportHandler.setNextHandler(billingSupportHandler);
        billingSupportHandler.setNextHandler(generalSupportHandler);

        return technicalSupportHandler;
    }
}
