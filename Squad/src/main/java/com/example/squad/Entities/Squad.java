package com.example.squad.Entities;

import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;


@Entity
@Table(name="Squad")
@FieldDefaults(level = AccessLevel.PRIVATE )
@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Squad {

    @Id
    String id;

    long rank;

}
