package structural.adapter;

import structural.adapter.externalapi.StripeAPI;
import structural.adapter.externalapi.StripeStatus;
import structural.adapter.interfaces.PaymentProvider;
import structural.adapter.models.PaymentRequest;
import structural.adapter.models.PaymentStatus;

public class StripeProvider implements PaymentProvider {

    private StripeAPI api = new StripeAPI();

    @Override
    public void createPayment(PaymentRequest paymentRequest) {
        api.pay(paymentRequest.getEmail());
    }

    @Override
    public PaymentStatus verifyStatus(String paymentId) {
        return mapToStatus(api.checkStatus(paymentId));
    }

    //todo: use mapstruct
    private PaymentStatus mapToStatus(StripeStatus status) {
        if(status == StripeStatus.ERR)
            return PaymentStatus.ERROR;

        return PaymentStatus.SUCCESS;
    }
}
