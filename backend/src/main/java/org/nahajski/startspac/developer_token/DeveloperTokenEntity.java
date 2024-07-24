package org.nahajski.startspac.developer_token;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Builder;
import org.nahajski.baseauth.entity.OAuthIssuerSubject;

@Entity
@Builder
public class DeveloperTokenEntity {
    @Id
    OAuthIssuerSubject issuerSubject;

    String developerToken;
}
