package com.example.demonewloginfpt.repository;

import java.util.Optional;

import com.example.demonewloginfpt.models.ERole;
import com.example.demonewloginfpt.models.Role;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface RoleRepository extends JpaRepository<Role, Long> {


    Role findByName(ERole roleUser);
}
