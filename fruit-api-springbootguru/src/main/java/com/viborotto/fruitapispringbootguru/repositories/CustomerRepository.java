package com.viborotto.fruitapispringbootguru.repositories;

import com.viborotto.fruitapispringbootguru.model.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<Customer, Long> {
    Customer findByName(String name);
}
