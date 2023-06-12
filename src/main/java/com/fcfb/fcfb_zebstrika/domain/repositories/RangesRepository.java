package com.fcfb.fcfb_zebstrika.domain.repositories;

import com.fcfb.fcfb_zebstrika.domain.entities.RangesEntity;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface RangesRepository extends CrudRepository<RangesEntity, Integer> {
    @Query(value = "SELECT * FROM ranges WHERE play_type = ? AND offensive_playbook = ? " +
            "AND defensive_playbook = ? AND ? BETWEEN lower_range AND upper_range;", nativeQuery = true)
    RangesEntity findNormalResult(String play_type, String offensive_playbook, String defensive_playbook,
                                            int difference);
}