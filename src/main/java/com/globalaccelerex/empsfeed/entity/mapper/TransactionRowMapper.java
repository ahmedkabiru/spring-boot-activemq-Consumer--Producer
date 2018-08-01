package com.globalaccelerex.empsfeed.entity.mapper;

import com.globalaccelerex.empsfeed.entity.Transaction;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.lang.Nullable;

import java.sql.ResultSet;
import java.sql.SQLException;


public class TransactionRowMapper  implements RowMapper<Transaction> {

    @Nullable
    @Override
    public Transaction mapRow(ResultSet row, int rowNum) throws SQLException {

        Transaction transaction = new Transaction();
        transaction.setId(row.getInt("id"));
        transaction.setTransId(row.getString("trans_id"));
        transaction.setDe1(row.getString("de1"));
        transaction.setDe11(row.getString("de11"));
        transaction.setDe37(row.getString("de37"));
        transaction.setDe41(row.getString("de41"));
        return transaction;
    }
}
