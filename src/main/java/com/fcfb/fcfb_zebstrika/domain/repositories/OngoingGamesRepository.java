package com.fcfb.fcfb_zebstrika.domain.repositories;

import com.fcfb.fcfb_zebstrika.domain.entities.OngoingGamesEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OngoingGamesRepository extends CrudRepository<OngoingGamesEntity, Integer> {

}