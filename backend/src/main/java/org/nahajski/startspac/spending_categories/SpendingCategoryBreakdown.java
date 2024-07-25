package org.nahajski.startspac.spending_categories;

import lombok.Data;

@Data
public class SpendingCategoryBreakdown {
    private SpendingCategory spendingCategory;
    private double totalSpent;
    private double totalReceived;
    private double netSpend;
    private Direction netDirection;
    private int percentage;
    private int transactionCount;
    private Currency currency;
}
