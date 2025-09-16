package structural.adapter.externalapi;

public class RazorPayAPI {

    public void makePayment(String email, String phone)
    {
        System.out.println("Payment made via RazorPay gateway by " + phone + email);
    }

    public RazorPayStatus checkStatus(String paymentId)
    {
        return RazorPayStatus.SUCCESS;
    }
}
