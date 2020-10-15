package org.wisentwedia.deliveryproject.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.wisentwedia.deliveryproject.entity.User;

@Repository
public interface UserRepository extends CrudRepository<User, Long> {}

