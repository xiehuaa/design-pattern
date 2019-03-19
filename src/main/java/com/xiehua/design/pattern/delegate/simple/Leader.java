package com.xiehua.design.pattern.delegate.simple;

import java.util.HashMap;
import java.util.Map;

/**
 * This is Description
 *
 * @author xiehua
 * @date 2019/03/18
 */
public class Leader {
    private Map<String, IEmployee> register = new HashMap<>();
    public Leader() {
        register.put("employeeA", new EmployeeA());
        register.put("employeeB", new EmployeeB());
    }

    public void doing(String command) {
        IEmployee employee = register.get(command);
        employee.doing(command);
    }
}
