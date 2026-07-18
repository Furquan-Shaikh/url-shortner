package com.furquan.urlshortner.entity;

import jakarta.persistence.*;

@Entity
@AttributeOverride(
        name = "createdAt",
        column = @Column(name = "clicked_at")
)
@Table(
        name = "url_clicks",
        indexes = {
                @Index(name = "idx_url_id",
                columnList = "url_id")

        }
)
public class UrlClicks extends BaseEntity{


    private String ipAddress;
    private String userAgent;
    private String shortUrl;
    @ManyToOne
    @JoinColumn(name = "url_id", nullable = false)
    private ShortUrls urlId;
    @ManyToOne
    @JoinColumn(name = "creator_id", nullable = false)
    private Users creatorId;


}
