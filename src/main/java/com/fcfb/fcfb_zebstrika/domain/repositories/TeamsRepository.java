package com.fcfb.fcfb_zebstrika.domain.repositories;

import com.fcfb.fcfb_zebstrika.domain.entities.TeamsEntity;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface TeamsRepository extends CrudRepository<TeamsEntity, Integer> {
    @Query(value = "SELECT * FROM teams WHERE name =?", nativeQuery = true)
    Optional<TeamsEntity> findByName(String name);

    @Query(value = "SELECT * FROM teams", nativeQuery = true)
    Optional<TeamsEntity> findAllTeams();
}