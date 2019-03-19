package com.xiehua.design.pattern.template.jdbc;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import java.util.ArrayList;

/**
 * This is Description
 *
 * @author xiehua
 * @date 2019/03/19
 */
public abstract class JdbcTemplate {
    private DataSource dataSource;

    public JdbcTemplate(DataSource dataSource) {
        this.dataSource = dataSource;
    }

    public List<?> executeQuery(String sql, RowMapper<?> rowMapper, Object[] values) {
        try {
            // 获取连接
            Connection connection = this.getConnection();
            // 创建语句集
            PreparedStatement preparedStatement = this.createPrepareStatement(connection, sql);
            // 执行语句集
            ResultSet rs = this.executeQuery(preparedStatement, values);
            // 处理结果集
            List<?> result = this.parseResultSet(rs, rowMapper);
            // 关闭结果集
            this.closeResultSet(rs);
            this.cloaseStatement(preparedStatement);
            this.cloaseConnection(connection);
            return result;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    protected void cloaseConnection(Connection connection) throws SQLException {
        connection.close();
    }

    protected void cloaseStatement(PreparedStatement preparedStatement) throws SQLException {
        preparedStatement.close();
    }

    protected void closeResultSet(ResultSet rs) throws SQLException {
        rs.close();
    }

    protected List<?> parseResultSet(ResultSet rs, RowMapper<?> rowMapper) throws Exception {
        List<Object> result = new ArrayList<Object>();
        int rowNum = 1;
        while (rs.next()) {
            result.add(rowMapper.mapRow(rs, rowNum ++));
        }
        return result;
    }

    protected ResultSet executeQuery(PreparedStatement preparedStatement, Object[] values) throws SQLException {
        for (int i = 0; i < values.length; i ++) {
            preparedStatement.setObject(i, values[i]);
        }
        ResultSet resultSet = preparedStatement.executeQuery();
        return resultSet;
    }

    private PreparedStatement createPrepareStatement(Connection connection, String sql) throws SQLException {
        return connection.prepareStatement(sql);
    }

    private Connection getConnection() throws SQLException {
        return this.dataSource.getConnection();
    }
}
