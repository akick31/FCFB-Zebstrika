package com.fcfb.fcfb_zebstrika.domain.repositories;

import com.fcfb.fcfb_zebstrika.domain.entities.GamePlaysEntity;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GamePlaysRepository extends CrudRepository<GamePlaysEntity, Integer> {

}