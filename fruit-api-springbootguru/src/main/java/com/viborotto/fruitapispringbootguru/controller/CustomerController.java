package com.viborotto.fruitapispringbootguru.controller;

import com.viborotto.fruitapispringbootguru.model.dto.CategoryDTO;
import com.viborotto.fruitapispringbootguru.model.dto.CategoryListDTO;
import com.viborotto.fruitapispringbootguru.model.dto.CustomerDTO;
import com.viborotto.fruitapispringbootguru.model.dto.CustomerListDTO;
import com.viborotto.fruitapispringbootguru.service.CustomerService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/api/v1/customers/")
public class CustomerController {

    private final CustomerService customerService;

    public CustomerController(CustomerService customerService) {
        this.customerService = customerService;
    }

    @GetMapping
    public ResponseEntity<CustomerListDTO> getAllCustomers(){
        return new ResponseEntity<>(new CustomerListDTO(customerService.getAllCustomers()), HttpStatus.OK);
    }

    @GetMapping("{id}")
    public ResponseEntity<CustomerDTO> getCustomerByName(@PathVariable Long id){
        return new ResponseEntity<CustomerDTO>(customerService.getCustomerById(id), HttpStatus.OK);
    }
}
