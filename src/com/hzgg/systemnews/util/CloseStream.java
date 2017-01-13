package com.hzgg.systemnews.util;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * Created by lsc on 2017/1/13 11:00.
 */
public class CloseStream {

    public static void close(PreparedStatement preparedStatement) throws SQLException {
        if (preparedStatement!=null){
            preparedStatement.close();
        }
    }

    public static void close(PreparedStatement preparedStatement, ResultSet resultSet) throws SQLException {
        close(preparedStatement);
        if (resultSet!=null){
            resultSet.close();
        }
    }

}
