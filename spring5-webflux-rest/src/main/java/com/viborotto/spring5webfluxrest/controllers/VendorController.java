package com.viborotto.spring5webfluxrest.controllers;

import com.viborotto.spring5webfluxrest.model.Vendor;
import com.viborotto.spring5webfluxrest.repositories.VendorRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
public class VendorController {

    private final VendorRepository vendorRepository;

    public VendorController(VendorRepository vendorRepository) {
        this.vendorRepository = vendorRepository;
    }

    //ReactiveTypes: Mono is a zero or one elements, and Flux is zero or many elements
    @GetMapping("/api/vi/vendors")
    public Flux<Vendor> list(){
        return vendorRepository.findAll();
    }

    @GetMapping("/api/vi/vendors/{id}")
    Mono<Vendor> getById(@PathVariable String id){
        return vendorRepository.findById(id);
    }
}
