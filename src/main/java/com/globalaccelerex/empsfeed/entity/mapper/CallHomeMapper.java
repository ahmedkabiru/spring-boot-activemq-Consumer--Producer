package com.globalaccelerex.empsfeed.entity.mapper;

import com.globalaccelerex.empsfeed.entity.CallHome;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.lang.Nullable;

import java.sql.ResultSet;
import java.sql.SQLException;

public class CallHomeMapper  implements RowMapper<CallHome> {

    @Nullable
    @Override
    public CallHome mapRow(ResultSet row, int rowNum) throws SQLException {
        CallHome callHome = new CallHome();
        callHome.setDe1(row.getString("de1"));
        callHome.setDe11(row.getString("de11"));
        callHome.setDe37(row.getString("de37"));
        callHome.setDe41(row.getString("de41"));
        return  callHome;
    }
}
