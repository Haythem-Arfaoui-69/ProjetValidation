package com.example.soldiers.Entities;

import lombok.*;
import lombok.experimental.FieldDefaults;
import org.springframework.data.annotation.*;
import org.springframework.data.mongodb.core.mapping.Document;


@Document(collection = "soldier")
@FieldDefaults(level = AccessLevel.PRIVATE )
@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Soldier {

    @Id
    String id;
    String name;
    String gun;
    String secondgun;
    String thirdgun;
    String id_Squad;

}
