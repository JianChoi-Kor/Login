package com.project.login.api.entity;

import ch.qos.logback.classic.pattern.ClassNameOnlyAbbreviator;
import com.project.login.api.enums.Authority;
import lombok.*;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;

import javax.persistence.*;

@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
@Entity
public class Users extends BaseTime {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idx;

    @Column
    private String email;

    @Column
    private String password;

    @Column
    @Enumerated(EnumType.STRING)
    private Authority authority;

    @Column
    private String refreshToken;

    @Builder
    public Users(String email, String password, Authority authority) {
        this.email = email;
        this.password = password;
        this.authority = authority;
    }
}
