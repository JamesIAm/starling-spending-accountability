package org.nahajski.startspac;

import org.nahajski.baseauth.entity.BaseOAuth2User;
import org.nahajski.startspac.developer_token.DeveloperTokenEntity;
import org.nahajski.startspac.developer_token.DeveloperTokenService;
import org.nahajski.startspac.spending_categories.SpendingCategoriesService;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
    private final DeveloperTokenService developerTokenService;
    private final SpendingCategoriesService spendingCategoriesService;

    public TestController(DeveloperTokenService developerTokenService, SpendingCategoriesService spendingCategoriesService) {
        this.developerTokenService = developerTokenService;
        this.spendingCategoriesService = spendingCategoriesService;
    }

    @GetMapping("/spending-categories")
    public void getSpendingCategories(@AuthenticationPrincipal BaseOAuth2User oAuth2User) {
        DeveloperTokenEntity developerToken = developerTokenService.getDeveloperToken(oAuth2User);
        spendingCategoriesService.getSpendingCategories(developerToken);
    }
}
