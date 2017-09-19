package domain;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TransactionManagement {

    List<Transaction> transactionList = new ArrayList<> ( );


    public List<Transaction> findTransactionMadIn(int transactionYear) {
        return transactionList;
    }

    public void createTransactionList() {
        Trader traderOne = createTrader ("One", "Trader1");
        Transaction transaction = createTransaction (10.00, LocalDate.of (2011, 2, 2), traderOne);
        transactionList.add (transaction);
    }

    private Transaction createTransaction(double transactionAmount, LocalDate transactionDate, Trader trader) {
        return Transaction.TransactionBuilder
                .aTransaction ( )
                .withTransactionAmount (transactionAmount)
                .withTransactionDate (transactionDate)
                .withTransactionTrader (trader)
                .build ( );
    }

    private Trader createTrader(String traderID, String traderName) {
        return Trader.TraderBuilder
                .aTrader ( )
                .withIdTrader (traderID)
                .withNameTrader (traderName)
                .build ( );
    }
}
