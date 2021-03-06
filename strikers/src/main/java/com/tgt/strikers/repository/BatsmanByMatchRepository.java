package com.tgt.strikers.repository;


import com.tgt.strikers.model.BatsmanByMatch;
import com.tgt.strikers.model.TeamPlayer;
import org.springframework.data.cassandra.repository.CassandraRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.UUID;

@Repository
public interface BatsmanByMatchRepository extends CassandraRepository<BatsmanByMatch, UUID> {

    List<BatsmanByMatch> findByMatchId(UUID matchId);
}
