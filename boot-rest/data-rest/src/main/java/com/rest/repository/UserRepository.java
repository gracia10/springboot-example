package com.rest.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.rest.domain.User;
import com.rest.domain.projection.UserOnlyContainName;

@RepositoryRestResource(excerptProjection = UserOnlyContainName.class)
public interface UserRepository extends JpaRepository<User, Long>{
}
