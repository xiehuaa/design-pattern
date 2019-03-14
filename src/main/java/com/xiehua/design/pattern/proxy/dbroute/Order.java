package com.xiehua.design.pattern.proxy.dbroute;

import lombok.Getter;
import lombok.Setter;

import java.util.Date;

/**
 * This is Description
 *
 * @author xiehua
 * @date 2019/03/14
 */
@Setter
@Getter
public class Order {
    private Object orderInfo;
    private Date creatTime;
    private Integer id;
}
