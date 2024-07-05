package com.example.soldiers.DTO;

import lombok.*;
import org.springframework.data.annotation.Id;

@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class SoldierDTO {
    @Id
    String id;
    String name;
    String gun;
    String secondgun;
    String thirdgun;
    String id_Squad;

}
