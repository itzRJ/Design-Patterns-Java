package structural.adapter;

import structural.adapter.externalapi.RazorPayAPI;
import structural.adapter.externalapi.RazorPayStatus;
import structural.adapter.interfaces.PaymentProvider;
import structural.adapter.models.PaymentRequest;
import structural.adapter.models.PaymentStatus;

//Step 3: Concrete adapters
public class RazorPayProvider implements PaymentProvider {

    private RazorPayAPI api = new RazorPayAPI();

    @Override
    public void createPayment(PaymentRequest paymentRequest) {
        //simply delegate the call to external api
        api.makePayment(paymentRequest.getEmail(), paymentRequest.getPhoneNumber());
    }

    @Override
    public PaymentStatus verifyStatus(String paymentId) {
        RazorPayStatus status = api.checkStatus(paymentId);
        return mapToStatus(status);
    }

    //todo: use mapstruct
    private PaymentStatus mapToStatus(RazorPayStatus status) {
        if(status == RazorPayStatus.SUCCESS)
            return PaymentStatus.SUCCESS;

        return PaymentStatus.ERROR;
    }
}
