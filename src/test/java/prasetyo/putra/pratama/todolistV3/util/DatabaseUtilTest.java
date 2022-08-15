package prasetyo.putra.pratama.todolistV3.util;

import com.zaxxer.hikari.HikariDataSource;
import org.junit.jupiter.api.Test;
import util.DatabaseUtil;

import java.sql.Connection;
import java.sql.SQLException;

public class DatabaseUtilTest {

    @Test
    void testConecction() throws SQLException {
        HikariDataSource hikariDataSource= DatabaseUtil.getDatSource();

        Connection connection = hikariDataSource.getConnection();

        connection.close();

        hikariDataSource.close();
    }

}
