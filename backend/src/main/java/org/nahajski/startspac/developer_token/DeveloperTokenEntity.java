package org.nahajski.startspac.developer_token;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Builder;
import lombok.Getter;
import org.nahajski.baseauth.entity.OAuthIssuerSubject;
import org.nahajski.startspac.spending_categories.StarlingAccountAuthenticationDetails;

@Entity
@Builder
@Getter
public class DeveloperTokenEntity implements StarlingAccountAuthenticationDetails {
    @Id
    OAuthIssuerSubject issuerSubject;

    String developerToken;
    String accountId;
    public String getAuthenticationToken() {
        return this.developerToken;
    }
}
