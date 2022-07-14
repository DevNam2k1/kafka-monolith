package com.devnam2k1.springbootprometheus.payload;

import lombok.*;

/**
 * Create by Nam Ga Sky
 * Date: 7/13/2022
 * Time: 10:00 AM
 * Project Name:  app
 */
@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class User {
    private Long id;
    private String firstName;
    private String lastName;
}
