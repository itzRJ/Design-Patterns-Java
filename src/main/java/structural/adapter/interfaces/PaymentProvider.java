package structural.adapter.interfaces;

import structural.adapter.models.PaymentRequest;
import structural.adapter.models.PaymentStatus;

//Step 2: create the adapter interface
public interface PaymentProvider {

    public void createPayment(PaymentRequest paymentRequest);

    public PaymentStatus verifyStatus(String paymentId);
}
