package com.xiehua.design.pattern.template.jdbc;

import java.sql.ResultSet;

/**
 * This is Description
 *
 * @author xiehua
 * @date 2019/03/19
 */
public interface RowMapper<T> {
    T mapRow(ResultSet rs, int rowNum) throws Exception;
}
