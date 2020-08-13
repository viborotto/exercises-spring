package com.viborotto.fruitapispringbootguru.service;

import com.viborotto.fruitapispringbootguru.model.dto.VendorDTO;
import com.viborotto.fruitapispringbootguru.model.dto.VendorListDTO;

public interface VendorService {

    VendorDTO getVendorById(Long id);

    VendorListDTO getAllVendors();

    VendorDTO createNewVendor(VendorDTO vendorDTO);

    VendorDTO saveVendorByDTO(Long id, VendorDTO vendorDTO);

    VendorDTO patchVendor(Long id, VendorDTO vendorDTO);

    void deleteVendorById(Long id);
}

