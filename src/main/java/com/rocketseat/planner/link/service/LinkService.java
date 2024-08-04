package com.rocketseat.planner.link.service;

import com.rocketseat.planner.activity.payload.ActivityData;
import com.rocketseat.planner.link.entity.Link;
import com.rocketseat.planner.link.payload.LinkData;
import com.rocketseat.planner.link.payload.LinkRequestPayload;
import com.rocketseat.planner.link.repository.LinkRepository;
import com.rocketseat.planner.link.response.LinkResponse;
import com.rocketseat.planner.trip.entity.Trip;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Service
public class LinkService {

    @Autowired
    private LinkRepository repository;

    public LinkResponse registerLink(LinkRequestPayload payload, Trip trip) {
        Link newLink = new Link(payload.title(), payload.url(), trip);

        this.repository.save(newLink);

        return new LinkResponse(newLink.getId());
    }

    public List<LinkData> getAllLinksFromTrip(UUID tripId) {
        return this.repository.findByTripId(tripId).stream().map(link ->
                new LinkData(link.getId(), link.getTitle(), link.getUrl())).toList();
    }
}
