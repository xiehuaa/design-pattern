package com.xiehua.design.pattern.adapter.loginadapter;

import lombok.Getter;
import lombok.Setter;

/**
 * This is Description
 *
 * @author xiehua
 * @date 2019/03/20
 */
@Setter
@Getter
public class ResultMsg {
    private Integer code;

    private String msg;

    private Object data;
}
