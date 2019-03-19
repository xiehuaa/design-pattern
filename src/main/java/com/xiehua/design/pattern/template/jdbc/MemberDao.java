package com.xiehua.design.pattern.template.jdbc;


import javax.sql.DataSource;
import java.sql.ResultSet;
import java.util.List;

/**
 * This is Description
 *
 * @author xiehua
 * @date 2019/03/19
 */
public class MemberDao extends JdbcTemplate {
    public MemberDao(DataSource dataSource) {
        super(dataSource);
    }

    public List<?> selectAll() {
        String sql = "select * from pe_user";
        return super.executeQuery(sql, new RowMapper<Member>() {
            @Override
            public Member mapRow(ResultSet rs, int rowNum) throws Exception {
                Member member = new Member();
                member.setUsername(rs.getString("username"));
                member.setPassword(rs.getString("password"));
                member.setAge(rs.getInt("age"));
                member.setAddress(rs.getString("address"));
                return member;
            }
        }, null);
    }
}
