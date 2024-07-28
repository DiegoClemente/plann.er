package com.rocketseat.planner.participant;

import com.rocketseat.planner.participant.entity.Participant;
import com.rocketseat.planner.participant.repository.ParticipantRepository;
import com.rocketseat.planner.trip.entity.Trip;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class ParticipantService {

    @Autowired
    private ParticipantRepository repository;

    public void registerParticipantsToEvent(List<String> participantsToInvite, Trip trip) {
        List<Participant> participants = participantsToInvite.stream().map(
                email -> new Participant(email, trip)).toList();

        this.repository.saveAll(participants);
        System.out.println(participants.getFirst().getId());
    }

    public void triggerConfirmationEmailToParticipants(UUID tripId) {}
}
