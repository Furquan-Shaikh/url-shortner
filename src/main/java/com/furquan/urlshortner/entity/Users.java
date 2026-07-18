package com.furquan.urlshortner.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor

@AttributeOverride(
        name = "id",
        column = @Column(name = "user_id")
)

@Table(
        indexes = {
                @Index(name = "idx_username",
                columnList = "username",
                unique = true),

                @Index(name = "idx_email",
                columnList = "email",
                unique = true)
        }
)
public class Users extends BaseEntity{

    private String username;
    private String password;
    private String role;
    private String email;
    private String status;
    @OneToMany(mappedBy = "creatorId", cascade = CascadeType.ALL)
    private List<UrlClicks> completeAnalysis = new ArrayList<>();
    @OneToMany(mappedBy = "createdBy", cascade = CascadeType.ALL)
    private List<ShortUrls> urlsList = new ArrayList<>();



}
