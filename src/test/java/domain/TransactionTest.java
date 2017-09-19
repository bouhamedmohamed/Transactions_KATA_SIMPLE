package domain;

import org.junit.Assert;
import org.junit.Test;

import java.util.List;

public class TransactionTest {
    @Test
    public void should_return_empty_list_when_no_transaction_mad_in_2011() {
        final TransactionManagement transactionManagement = new TransactionManagement ( );
        final List<Transaction> transactions = transactionManagement.findTransactionMadIn (2011);
        Assert.assertEquals (0, transactions.size ( ));
    }
    @Test
    public void should_return_one_transaction_which__mad_in_2011() {
        final TransactionManagement transactionManagement = new TransactionManagement ( );
        transactionManagement.createTransactionList ();
        final List<Transaction> transactions = transactionManagement.findTransactionMadIn (2011);
        Assert.assertEquals (1, transactions.size ( ));
    }
}