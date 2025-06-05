package com.wtc.staff;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Staff {
    String id;
    String lastName;
    String firstName;
    String mi;
    String address;
    String city;
    String state;
    String telephone;
    String email;
}
