package com.viborotto.fruitapispringbootguru.repositories;

import com.viborotto.fruitapispringbootguru.model.Vendor;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VendorRepository extends JpaRepository<Vendor, Long> {
}
