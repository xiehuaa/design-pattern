package com.xiehua.design.pattern.prototype.simple;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

/**
 * This is Description
 *
 * @author xiehua
 * @date 2019/03/13
 */
@Setter
@Getter
public class ConcretePrototypeA implements Prototype {
    private int age;
    private String name;
    private List hobbits;

    /**
     * 浅克隆   只是将地址值进行复制
     *
     * @return
     */
    @Override
    public Prototype clone() {
        ConcretePrototypeA concretePrototypeA = new ConcretePrototypeA();
        concretePrototypeA.setAge(this.age);
        concretePrototypeA.setName(this.name);
        concretePrototypeA.setHobbits(this.hobbits);
        return concretePrototypeA;
    }
}
