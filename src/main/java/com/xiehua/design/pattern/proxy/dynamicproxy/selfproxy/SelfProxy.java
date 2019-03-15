package com.xiehua.design.pattern.proxy.dynamicproxy.selfproxy;

import javax.tools.JavaCompiler;
import javax.tools.JavaFileObject;
import javax.tools.StandardJavaFileManager;
import javax.tools.ToolProvider;
import java.io.File;
import java.io.FileWriter;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

/**
 * This is Description
 *
 * @author xiehua
 * @date 2019/03/15
 */
public class SelfProxy {
    public static final String ln = "\r\n";

    public static Object newProxyInstance(SelfClassLoader loader, Class<?>[] interfaces, SelfInvocationHandler handler) {
        try {
            // 动态生成源代码
            String src = generateSrc(interfaces);
            // java文件输出到磁盘
            String filePath = SelfProxy.class.getResource("").getPath();
            File file = new File(filePath + "$Proxy0.java");
            FileWriter fw = new FileWriter(file);
            fw.write(src);
            fw.flush();
            fw.close();

            // 把生成的.java文件编译成.class文件
            JavaCompiler compiler = ToolProvider.getSystemJavaCompiler();
            StandardJavaFileManager standardFileManager = compiler.getStandardFileManager(null, null, null);
            Iterable<? extends JavaFileObject> iterable = standardFileManager.getJavaFileObjects(file);
            JavaCompiler.CompilationTask task = compiler.getTask(null, standardFileManager, null, null, null, iterable);
            task.call();
            standardFileManager.close();

            // 使用自定义类加载器将生成的.class文件加载到jvm中
            Class proxyClass = loader.findClass("$Proxy0");
            Constructor constructor = proxyClass.getConstructor(SelfInvocationHandler.class);
            // 返回生成的代理对象
            return constructor.newInstance(handler);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    /**
     * 生成代码串
     *
     * @param interfaces
     * @return
     */
    private static String generateSrc(Class<?>[] interfaces) {
        StringBuffer sb = new StringBuffer();
        sb.append("package com.xiehua.design.pattern.proxy.dynamicproxy.selfproxy;" + ln);
        sb.append("import com.xiehua.design.pattern.proxy.JobSeeker;" + ln);
        sb.append("import java.lang.reflect.*;" + ln);
        sb.append("public class $Proxy0 implements " + interfaces[0].getName() + "{" + ln);

        sb.append("    SelfInvocationHandler h;" + ln);
        sb.append("    public $Proxy0(SelfInvocationHandler h) {" + ln);
        sb.append("        this.h = h;" + ln);
        sb.append("    }" + ln);

        for (Method m : interfaces[0].getMethods()) {
            sb.append("    public " + m.getReturnType().getName() + " " + m.getName() + "() {" + ln);
            sb.append("        try{" + ln);
            sb.append("            Method m = " + interfaces[0].getName() + ".class.getMethod(\"" + m.getName() + "\", new Class[]{});" + ln);
            sb.append("            this.h.invoke(this, m, null);" + ln);
            sb.append("        } catch(Throwable e) {" + ln);
            sb.append("            e.printStackTrace();" + ln);
            sb.append("        }" + ln);
            sb.append("    }" + ln);
        }

        sb.append("}");
        return sb.toString();
    }
}
