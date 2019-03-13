package com.xiehua.design.pattern.prototype.deep;

/**
 * This is Description
 *
 * @author xiehua
 * @date 2019/03/13
 */
public class QiTianDaShengTest {
    public static void main(String[] args) {
        QiTianDaSheng qiTianDaSheng = new QiTianDaSheng();
        QiTianDaSheng clone = (QiTianDaSheng) qiTianDaSheng.clone();
        System.out.println("深克隆：" + (clone.jinGuBang == qiTianDaSheng.jinGuBang));
    }
}
