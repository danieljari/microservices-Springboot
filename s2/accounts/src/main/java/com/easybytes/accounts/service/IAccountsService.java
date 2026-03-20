package com.easybytes.accounts.service;

import com.easybytes.accounts.dto.CustomerDto;
import com.easybytes.accounts.entity.Accounts;

public interface IAccountsService {

    /**
     *
     * @param customerDto - CustomerDto Object
     */
    void createAccount(CustomerDto customerDto);

}
