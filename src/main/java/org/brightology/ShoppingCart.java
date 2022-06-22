package org.brightology;

import org.springframework.stereotype.Component;

@Component
public class ShoppingCart {
    public void checkout(String status) {
        //Logging
        //Authorization
        //Sanitize the Data
        System.out.println("Checkout Method from ShoppingCart Called");
    }

    public int quantity(){
        return 10;
    }
}
