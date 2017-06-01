package com.jalkal.noboot.repo;

import com.jalkal.noboot.model.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<Customer, Integer>
{
}
