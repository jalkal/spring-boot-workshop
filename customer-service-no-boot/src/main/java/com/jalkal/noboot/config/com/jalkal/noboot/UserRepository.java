package com.jalkal.noboot.config.com.jalkal.noboot;

import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Integer>
{
}
