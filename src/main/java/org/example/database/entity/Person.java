package org.example.database.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;

import java.time.Instant;

@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Person {
    private int id;

    private String name;

    private int vosrast;

    private Instant tyme;
}
