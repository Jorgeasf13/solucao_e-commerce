package com.hatanaka.ecommerce.checkout.resource.checkout;


import lombok.AllArgsConstructor;
import lombok.Data;

import java.io.Serializable;

@Data
@AllArgsConstructor
public class CheckoutRequest implements Serializable {

    private String firstname;
    private String lastName;
    private String email;
    private String address;
    private String complement;
    private String country;
    private String state;
    private String cep;
    private boolean saveAddress;
    private boolean saveInfo;
    private String paymentMethod;
    private String cardName;
    private String cardNumber;
    private String cardDate;
    private String cardCvv;
}
