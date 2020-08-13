package com.viborotto.fruitapispringbootguru.service;

import com.viborotto.fruitapispringbootguru.model.dto.CustomerDTO;

import java.util.List;

public interface CustomerService {

    List<CustomerDTO> getAllCustomers();

    CustomerDTO getCustomerById(Long id);
}
