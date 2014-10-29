package org.alaczynski.infrastructure.jdbc;

import org.alaczynski.domain.Customer;
import org.alaczynski.domain.CustomerRepository;
import org.alaczynski.util.Id;

public class JdbcCustomerRepository implements CustomerRepository {
    @Override
    public Customer getBy(Id id) {
        return null;
    }
}
