package com.viborotto.fruitapispringbootguru.mapper;

import com.viborotto.fruitapispringbootguru.model.Vendor;
import com.viborotto.fruitapispringbootguru.model.dto.VendorDTO;

@Mapper
public interface VendorMapper {

    VendorMapper INSTANCE = Mappers.getMapper(VendorMapper.class);

    VendorDTO vendorToVendorDTO(Vendor vendor);

    Vendor vendorDTOtoVendor(VendorDTO vendorDTO);
}
