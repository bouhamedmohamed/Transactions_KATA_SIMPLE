package domain;

import java.time.LocalDate;

public class Transaction {
    private final Trader transactionTrader;
    private final LocalDate transactionDate;
    private final double transactionAmount;


    private Transaction(Trader transactionTrader, LocalDate transactionDate, double transactionAmount) {
        this.transactionTrader = transactionTrader;
        this.transactionDate = transactionDate;
        this.transactionAmount = transactionAmount;
    }

    public static final class TransactionBuilder {
        private Trader transactionTrader;
        private LocalDate transactionDate;
        private double transactionAmount;

        private TransactionBuilder() {
        }

        public static TransactionBuilder aTransaction() {
            return new TransactionBuilder ( );
        }

        public TransactionBuilder withTransactionTrader(Trader transactionTrader) {
            this.transactionTrader = transactionTrader;
            return this;
        }

        public TransactionBuilder withTransactionDate(LocalDate transactionDate) {
            this.transactionDate = transactionDate;
            return this;
        }

        public TransactionBuilder withTransactionAmount(double transactionAmount) {
            this.transactionAmount = transactionAmount;
            return this;
        }

        public Transaction build() {
            Transaction transaction = new Transaction (transactionTrader, transactionDate, transactionAmount);
            return transaction;
        }
    }
}
