package com.fcfb.fcfb_zebstrika.domain.repositories;

import com.fcfb.fcfb_zebstrika.domain.entities.GamePlaysEntity;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GamePlaysRepository extends CrudRepository<GamePlaysEntity, Integer> {
    @Query(value = "SELECT MAX(play_number) AS last_play FROM game_plays WHERE game_id =?", nativeQuery = true)
    GamePlaysEntity getPreviousPlay(Integer gameId);

}