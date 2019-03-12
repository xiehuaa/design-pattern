package com.xiehua.design.pattern.singleton.register;

/**
 * This is Description
 *
 * @author xiehua
 * @date 2019/03/12
 */
public class ContainerSingletonTest {
    public static void main(String[] args) {
        try {
            ConcurrentExecutor.execute(new ConcurrentExecutor.RunHandler() {
                @Override
                public void handler() {
                    Object obj = ContainerSingleton.getBean("com.xiehua.design.pattern.singleton.register.entity.User");
                    System.out.println(obj);
                }
            }, 10, 5);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
