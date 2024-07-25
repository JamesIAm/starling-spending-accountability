package org.nahajski.startspac.spending_categories;

import lombok.Data;

import java.util.List;

@Data
public class SpendingCategoriesSummary {

    private String period;
    private double totalSpent;
    private double totalReceived;
    private double netSpend;
    private double totalSpendNetOut;
    private double totalReceivedNetIn;
    private Currency currency;
    private Direction direction;
    private List<SpendingCategoryBreakdown> breakdown;


}
