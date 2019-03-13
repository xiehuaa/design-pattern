package com.xiehua.design.pattern.prototype.deep;

import java.io.*;
import java.util.Date;

/**
 * This is Description
 *
 * @author xiehua
 * @date 2019/03/13
 */
public class QiTianDaSheng extends Monkey implements Serializable, Cloneable {
    public JinGuBang jinGuBang;

    public QiTianDaSheng() {
        this.jinGuBang = new JinGuBang();
        this.birthday = new Date();
    }

    /**
     * 深克隆，通过字节码在内存中创建对象，而不是简单的引用对象地址值
     *
     * @return
     */
    @Override
    public Object clone() {
        return this.deepClone();
    }

    public Object deepClone() {
        try {
            ByteArrayOutputStream bos = new ByteArrayOutputStream();
            ObjectOutputStream oos = new ObjectOutputStream(bos);
            oos.writeObject(this);

            ByteArrayInputStream bis = new ByteArrayInputStream(bos.toByteArray());
            ObjectInputStream ois = new ObjectInputStream(bis);

            QiTianDaSheng copy = (QiTianDaSheng) ois.readObject();
            copy.birthday = new Date();

            ois.close();
            bis.close();
            oos.close();
            bos.close();
            return copy;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}
