package org.alaczynski.domain;

import org.alaczynski.util.Id;

public interface CustomerRepository {

    Customer getBy(Id id);
}
