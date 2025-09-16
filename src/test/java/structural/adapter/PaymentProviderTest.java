package structural.adapter;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import structural.adapter.interfaces.PaymentProvider;
import structural.adapter.models.PaymentRequest;
import structural.adapter.models.PaymentStatus;

public class PaymentProviderTest {

    private PaymentProvider paymentProvider;

    @After
    public void destroy()
    {
        paymentProvider = null;
    }

    @Before
    public void setUp()
    {
        paymentProvider = new RazorPayProvider();
    }

    private PaymentRequest getPaymentRequest()
    {
        return PaymentRequest.builder()
                .email("a@b.c")
                .name("RJ")
                .phoneNumber("1245")
                .build();
    }

    @Test
    public void testRazorPayGateway_Payment()
    {
        Assert.assertTrue(paymentProvider instanceof RazorPayProvider);
        paymentProvider.createPayment(getPaymentRequest());
    }

    @Test
    public void testRazorPayGateway_Status()
    {
        PaymentStatus status = paymentProvider.verifyStatus("ab1");
        Assert.assertEquals(PaymentStatus.SUCCESS, status);
    }
}
