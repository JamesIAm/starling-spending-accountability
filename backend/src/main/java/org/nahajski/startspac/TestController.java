package org.nahajski.startspac;

import org.nahajski.baseauth.entity.BaseOAuth2User;
import org.nahajski.startspac.developer_token.DeveloperTokenService;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
    private final DeveloperTokenService developerTokenService;

    public TestController(DeveloperTokenService developerTokenService) {
        this.developerTokenService = developerTokenService;
    }

    @GetMapping("/spending-categories")
    public void getSpendingCategories(@AuthenticationPrincipal BaseOAuth2User oAuth2User) {
        developerTokenService.getDeveloperToken(oAuth2User);
    }
}
