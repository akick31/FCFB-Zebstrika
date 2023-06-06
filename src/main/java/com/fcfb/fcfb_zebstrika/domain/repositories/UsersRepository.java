package com.fcfb.fcfb_zebstrika.domain.repositories;

import com.fcfb.fcfb_zebstrika.domain.entities.UsersEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UsersRepository extends CrudRepository<UsersEntity, String> {

}