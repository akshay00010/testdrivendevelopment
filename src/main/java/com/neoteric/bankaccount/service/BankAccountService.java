package com.neoteric.bankaccount.service;

import com.neoteric.bankaccount.model.AccountNo;
import com.neoteric.bankaccount.model.BankForm;

import java.util.UUID;

public class BankAccountService {


    public AccountNo getAccountNo(BankForm customer1){


        AccountNo accountNo = null;
        if (customer1.age>18){


            accountNo = new AccountNo();

            accountNo.accountNo = "1234567890";

            accountNo.accountNo = "acc:"+ UUID.randomUUID().toString();
            accountNo.balance = "500";
            accountNo.branch = "kphb";
            accountNo.ifscCode = "kphb1234";



        }
        return accountNo;
    }



}
