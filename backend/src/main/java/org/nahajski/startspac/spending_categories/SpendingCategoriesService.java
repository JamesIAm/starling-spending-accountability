package org.nahajski.startspac.spending_categories;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

@Service
public class SpendingCategoriesService {
    public static final String SPENDING_CATEGORY_URI_TEMPLATE = "https://api.starlingbank" +
            ".com/api/v2/accounts/%s/spending-insights/spending-category?year=2024&month=JULY";
    HttpClient httpClient = HttpClient.newHttpClient();
    ObjectMapper objectMapper = new ObjectMapper();

    public void getSpendingCategories(StarlingAccountAuthenticationDetails authenticationDetails) {
        URI uri = URI.create(SPENDING_CATEGORY_URI_TEMPLATE
                .formatted(authenticationDetails.getAccountId()));
        HttpRequest request = HttpRequest.newBuilder(uri).GET()
                .header("accept", "application/json")
                .header("Authorization", "Bearer " + authenticationDetails.getAuthenticationToken())
                .build();
        try {
            HttpResponse<String> response = httpClient.send(request, HttpResponse.BodyHandlers.ofString());
            var spendingCategoriesSummary = objectMapper.readValue(response.body(), SpendingCategoriesSummary.class);
            System.out.println(spendingCategoriesSummary);
        } catch (IOException | InterruptedException e) {
            throw new RuntimeException(e);
        }

    }
}
