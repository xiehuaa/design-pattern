package com.xiehua.design.pattern.proxy.dynamicproxy.selfproxy;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;

/**
 * 自定义类加载器，用于加载动态代理生成的.class文件
 *
 * @author xiehua
 * @date 2019/03/15
 */
public class SelfClassLoader extends ClassLoader {
    private File classPathFile;

    public SelfClassLoader() {
        String classPath = SelfClassLoader.class.getResource("").getPath();
        this.classPathFile = new File(classPath);
    }

    @Override
    protected Class<?> findClass(String name) throws ClassNotFoundException {
        String className = SelfClassLoader.class.getPackage().getName() + "." + name;
        if (classPathFile != null) {
            File classFile = new File(classPathFile, name.replaceAll("\\.", "/") + ".class");
            if (classFile.exists()) {
                FileInputStream in = null;
                ByteArrayOutputStream out = null;
                try {
                    in = new FileInputStream(classFile);
                    out = new ByteArrayOutputStream();
                    byte[] bytes = new byte[1024];
                    int len;
                    while ((len = in.read(bytes)) != -1) {
                        out.write(bytes, 0, len);
                    }
                    return defineClass(className, out.toByteArray(), 0, out.size());
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }
        return null;
    }
}
