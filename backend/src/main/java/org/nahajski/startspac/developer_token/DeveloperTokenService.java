package org.nahajski.startspac.developer_token;

import org.nahajski.baseauth.entity.BaseOAuth2User;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
public class DeveloperTokenService {
    @Value("${PERSONAL_DEVELOPER_TOKEN}")
    private String personalDeveloperToken;
    @Value("${PERSONAL_ACCOUNT_UUID}")
    private String accountId;

    public DeveloperTokenEntity getDeveloperToken(BaseOAuth2User baseOAuth2User) {
        if (baseOAuth2User.getUser().getEmail().equals("james.nahajski@gmail.com")) {
            return DeveloperTokenEntity.builder()
                    .issuerSubject(baseOAuth2User.getUser().getOauthId())
                    .developerToken(personalDeveloperToken)
                    .accountId(accountId)
                    .build();
        }
        return null;
    }
}
