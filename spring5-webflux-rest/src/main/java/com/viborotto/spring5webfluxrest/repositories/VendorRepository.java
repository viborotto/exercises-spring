package com.viborotto.spring5webfluxrest.repositories;

import com.viborotto.spring5webfluxrest.model.Vendor;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;

public interface VendorRepository extends ReactiveMongoRepository<Vendor, String> {
}
