package com.viborotto.fruitapispringbootguru.mapper;

import com.viborotto.fruitapispringbootguru.model.Customer;
import com.viborotto.fruitapispringbootguru.model.dto.CustomerDTO;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface CustomerMapper {

    CustomerMapper INSTANCE = Mappers.getMapper(CustomerMapper.class);

    CustomerDTO customerToCustomerDTO(Customer customer);

    Customer customerDtoToCustomer(CustomerDTO customerDTO);
}
