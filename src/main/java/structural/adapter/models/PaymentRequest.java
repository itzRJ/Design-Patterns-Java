package structural.adapter.models;

import lombok.Builder;
import lombok.Getter;

@Builder
@Getter
public class PaymentRequest {

    private String phoneNumber;

    private String email;

    private String name;

}
