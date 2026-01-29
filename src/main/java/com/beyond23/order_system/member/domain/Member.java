package com.beyond23.order_system.member.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Getter @ToString
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Member {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(nullable = false)
    private String email;
    @Column(nullable = false)
    private String password;
    private String name;
    @Enumerated(EnumType.STRING)
    @Builder.Default
    private Role role = Role.user;
    private CreatedTime createdTime;



}
