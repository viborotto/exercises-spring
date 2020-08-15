package com.viborotto.spring5webfluxrest.controllers;

import com.viborotto.spring5webfluxrest.model.Vendor;
import com.viborotto.spring5webfluxrest.repositories.VendorRepository;
import org.reactivestreams.Publisher;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
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

    @ResponseStatus(HttpStatus.CREATED)
    @PostMapping("/api/vi/vendors")
    Mono<Void> create(@RequestBody Publisher<Vendor> vendorStream){
        return vendorRepository.saveAll(vendorStream).then();
    }

    @PutMapping("/api/vi/vendors/{id}")
    Mono<Vendor> update(@PathVariable String id,@RequestBody Vendor vendor){
        vendor.setId(id);
        return vendorRepository.save(vendor);
    }

    @PatchMapping("api/v1/vendors/{id}")
    Mono<Vendor> patch(@PathVariable String id, @RequestBody Vendor vendor){

        Vendor foundVendor = vendorRepository.findById(id).block();

        if(!foundVendor.getFirstName().equals(vendor.getFirstName())){
            foundVendor.setFirstName(vendor.getFirstName());

            return vendorRepository.save(foundVendor);
        }
        return Mono.just(foundVendor);
    }
}
