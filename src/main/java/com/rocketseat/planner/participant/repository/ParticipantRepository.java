package com.rocketseat.planner.participant.repository;

import com.rocketseat.planner.participant.entity.Participant;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface ParticipantRepository extends JpaRepository<Participant, UUID> {
}

