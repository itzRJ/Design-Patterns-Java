package structural.adapter.externalapi;

public class StripeAPI {

    public void pay(String email)
    {
        System.out.println("Payment made via Stripe gateway by " + email);
    }

    public StripeStatus checkStatus(String paymentId)
    {
        return StripeStatus.OK;
    }
}
