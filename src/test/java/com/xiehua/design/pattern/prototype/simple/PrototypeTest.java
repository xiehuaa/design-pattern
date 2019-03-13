package com.xiehua.design.pattern.prototype.simple;

import java.util.ArrayList;
import java.util.List;

/**
 * This is Description
 *
 * @author xiehua
 * @date 2019/03/13
 */
public class PrototypeTest {
    public static void main(String[] args) {
        ConcretePrototypeA concretePrototypeA = new ConcretePrototypeA();
        concretePrototypeA.setAge(16);
        concretePrototypeA.setName("张三");
        List hobbits = new ArrayList<String>();
        hobbits.add("读书");
        hobbits.add("写字");
        concretePrototypeA.setHobbits(hobbits);

        Client client = new Client();
        ConcretePrototypeA copy = (ConcretePrototypeA) client.startClone(concretePrototypeA);

        System.out.println("原对象的爱好是：" + concretePrototypeA.getHobbits());
        System.out.println("新对象的爱好是：" + copy.getHobbits());
        System.out.println("两个对象的爱好地址值相等：：" + (concretePrototypeA.getHobbits() == copy.getHobbits()));

    }
}
