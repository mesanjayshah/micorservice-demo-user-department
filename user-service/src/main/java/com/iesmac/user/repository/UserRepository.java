package com.iesmac.user.repository;

import com.iesmac.user.entity.UserAdmin;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<UserAdmin, Long> {

}

