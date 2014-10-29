package org.alaczynski.application;

import org.alaczynski.domain.Customer;
import org.alaczynski.domain.CustomerRepository;
import org.alaczynski.util.Id;

public class CustomerService {

    private CustomerRepository customerRepository;

    public String getCustomerName(Id id) {
        Customer customer = customerRepository.getBy(id);
        return customer.getName();
    }
}
