package com.example.bebuildingmanagement.service.implement;

import com.example.bebuildingmanagement.repository.ICustomerRepository;
import com.example.bebuildingmanagement.service.interfaces.ICustomerService;
import lombok.AccessLevel;
import lombok.RequiredArgsConstructor;
import lombok.experimental.FieldDefaults;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE, makeFinal = true)
public class CustomerServiceImpl implements ICustomerService {
    ICustomerRepository iCustomerRepository;
}
