package org.asm;

import org.objectweb.asm.ClassWriter;
import org.objectweb.asm.Opcodes;

import java.io.File;
import java.io.FileOutputStream;

import static org.objectweb.asm.ClassWriter.COMPUTE_MAXS;

/**
 * @author ☞ 🏀 huqingfeng
 * @date 2019-06-10
 */
public class DynamicCreateClass {
    public static void create(String className) throws Exception{

        String separator = System.getProperty("file.separator");
        //ClassWriter用于生成类
        ClassWriter writer = new ClassWriter(COMPUTE_MAXS);

        //通过visit生成类的头部信息
        writer.visit(Opcodes.V1_8, Opcodes.ACC_PUBLIC, DynamicCreateClass.class.getPackage().getName().replaceAll("\\.","/")+separator+className, null, "java/lang/Object", null);

        //定义类Employee的属性 no和age
        writer.visitField(Opcodes.ACC_PUBLIC+Opcodes.ACC_FINAL+Opcodes.ACC_STATIC, "no",  "I", null, 1).visitEnd();
        //属性age：private static final age=8
        writer.visitField(Opcodes.ACC_PUBLIC+Opcodes.ACC_FINAL+Opcodes.ACC_STATIC, "age", "I",  null, 8).visitEnd();

        //定义类的方法
        writer.visitMethod(Opcodes.ACC_PUBLIC, "test","(Ljava/lang/String;)V" , null, null).visitEnd();

        //完成
        writer.visitEnd();



        //将writer字节数组写到文件里面去
        byte[] byArr = writer.toByteArray();
        File file = new File(DynamicCreateClass.class.getResource("").getFile()+separator+className+".class");
        FileOutputStream fos = new FileOutputStream(file);
        fos.write(byArr);
        fos.close();
    }

    public static void main(String[] args)  throws Exception{
        String className = "TestCreate";
        create(className);
        Class<?> aClass = Class.forName("com.asm.TestCreate");

        System.out.println(aClass);
    }
}
