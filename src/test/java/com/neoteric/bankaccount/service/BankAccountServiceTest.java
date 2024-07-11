package com.neoteric.bankaccount.service;

import com.neoteric.bankaccount.model.AccountNo;
import com.neoteric.bankaccount.model.Address;
import com.neoteric.bankaccount.model.BankForm;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BankAccountServiceTest {

    @Test
    void getAccountNo() {
        BankForm customer1 = new BankForm();

        customer1.firstName = "asdfg";
        customer1.lastName = "qwerty";
        customer1.age = 23;
        customer1.aadhar = 1243124566;
        customer1.pancard = "dsghj4567p";

        Address address1 = new Address();
        address1.plotNo = 56;
        address1.streetName ="cvbnm";
        address1.city = "hyd";
        address1.district = "ranga";
        address1.state = "telangana";
        address1.pincode = "500008";


        BankAccountService bankAccountService = new BankAccountService();
       AccountNo accountNo =bankAccountService.getAccountNo(customer1);


        Assertions.assertEquals(23,customer1.age);
        Assertions.assertNotNull(accountNo);





    }
    @Test
    void noAccountNo() {
        BankForm customer1 = new BankForm();

        customer1.firstName = "asdfg";
        customer1.lastName = "qwerty";
        customer1.age = 15;
        customer1.aadhar = 1243124566;
        customer1.pancard = "dsghj4567p";

        Address address1 = new Address();
        address1.plotNo = 56;
        address1.streetName ="cvbnm";
        address1.city = "hyd";
        address1.district = "ranga";
        address1.state = "telangana";
        address1.pincode = "500008";


        BankAccountService bankAccountService = new BankAccountService();
        AccountNo accountNo =bankAccountService.getAccountNo(customer1);


        Assertions.assertNull(accountNo);






    }
}