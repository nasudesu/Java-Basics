package Chapter7.Exercises4.dao;

import Chapter7.Exercises4.application.CCcontrol;
import Chapter7.Exercises4.datasource.MariaDbConnection;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class CurrencyConvertDao {


    private CCcontrol cCcontrol;

    public CurrencyConvertDao(CCcontrol cCcontrol) {
        this.cCcontrol = cCcontrol;
        Connection connection = MariaDbConnection.getInstance();
        String sql = "SELECT currency, rate FROM tables";

        try {
            Statement statement = connection.createStatement();
            ResultSet rs = statement.executeQuery(sql);
            while (rs.next()) {
                cCcontrol.addCurrency(rs.getString(1), rs.getDouble(2));
                System.out.println(rs.getString(1) + " " + rs.getDouble(2));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

}
