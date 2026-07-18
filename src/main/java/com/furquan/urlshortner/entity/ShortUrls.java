package com.furquan.urlshortner.entity;

import jakarta.persistence.*;
import lombok.*;

import java.time.Instant;
import java.util.ArrayList;
import java.util.List;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor

@Table(
        indexes = {
                @Index(name = "idx_short_url",
                columnList = "short_url",
                unique = true),

                @Index(name = "idx_original_url",
                columnList = "original_url",
                unique = true),

                @Index(name = "idx_created_by",
                columnList = "created_by")
        }
)
public class ShortUrls {

    @Column(name = "original_url")
    private String originalUrl;
    @Column(name = "short_url")
    private String shortUrl;
    private long clickCount;
    @ManyToOne
    @JoinColumn(name = "created_by", nullable = false)
    private Users createdBy;
    private boolean isActive;
    private Instant expireAt;
    @OneToMany(mappedBy = "urlId", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<UrlClicks> analytics = new ArrayList<>();

}
