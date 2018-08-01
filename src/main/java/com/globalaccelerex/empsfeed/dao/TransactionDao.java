package com.globalaccelerex.empsfeed.dao;

import com.globalaccelerex.empsfeed.entity.Transaction;
import com.globalaccelerex.empsfeed.entity.mapper.TransactionRowMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Transactional
@Repository
public class TransactionDao  implements  ITransactionDao {


    private JdbcTemplate jdbcTemplate;

    @Autowired
    public TransactionDao(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    @Override
    public List<Transaction> getAllTransaction() {
        String sql = "Select * from tx_notifications";
        return jdbcTemplate.query(sql,new TransactionRowMapper());
    }

    @Override
    public Transaction getTransactionByTID(String de41) {
        try {
            String sql = "SELECT * FROM tx_notifications  WHERE de41 = ?";
            RowMapper<Transaction> rowMapper = new BeanPropertyRowMapper<>(Transaction.class);
            Transaction transaction = jdbcTemplate.queryForObject(sql, rowMapper, de41);
            System.out.println("Transaction" + transaction);
            return transaction;
        }
        catch (EmptyResultDataAccessException e) { // result.size() == 0;
            return null;
        }
    }


    @Override
    public Boolean checkIfTransactionExist(String de41, String trans_id) {
        String sql = "SELECT count(*) FROM tx_notifications  WHERE de41 = ? AND trans_id = ?";
        int count = jdbcTemplate.queryForObject(sql,new Object[]{de41,trans_id},Integer.class);
        return count != 0;
    }

    @Override
    public Transaction getTransactionById(int id) {
        return null;
    }

    @Override
    public void addTransaction(Transaction transaction) {

    }

    @Override
    public void updateTransaction(Transaction transaction) {

    }
}
