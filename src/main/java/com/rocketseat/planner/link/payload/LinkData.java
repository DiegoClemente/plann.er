package com.rocketseat.planner.link.payload;

import java.util.UUID;

public record LinkData(UUID id, String title, String url) {
}
