package org.alaczynski.infrastructure.jpa;

import org.alaczynski.domain.Customer;
import org.alaczynski.domain.CustomerRepository;
import org.alaczynski.util.Id;

public class JpaCustomerRepository implements CustomerRepository {
    @Override
    public Customer getBy(Id id) {
        return null;
    }
}
