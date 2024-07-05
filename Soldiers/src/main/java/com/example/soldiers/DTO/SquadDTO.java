package com.example.soldiers.DTO;


import lombok.*;
import org.springframework.data.annotation.Id;

@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class SquadDTO {

    @Id
    String id;

    long rank;
}
