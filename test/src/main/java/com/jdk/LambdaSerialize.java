package com.jdk;


import com.jdk.SerializedLambda;
import org.springframework.util.ClassUtils;

import java.io.*;
import java.util.function.Supplier;

public class LambdaSerialize {

    public static byte[] serialize(Object object) {
        if (object == null) {
            return null;
        }
        ByteArrayOutputStream baos = new ByteArrayOutputStream(1024);
        try {
            ObjectOutputStream oos = new ObjectOutputStream(baos);
            oos.writeObject(object);
            oos.flush();
        } catch (IOException ex) {
            throw new IllegalArgumentException("Failed to serialize object of type: " + object.getClass(), ex);
        }
        return baos.toByteArray();
    }


    public static SerializedLambda resolve(SSupplier<?> lambda) {
        if (!lambda.getClass().isSynthetic()) {
            throw new RuntimeException("该方法仅能传入 lambda 表达式产生的合成类");
        }
        try (ObjectInputStream objIn = new ObjectInputStream(new ByteArrayInputStream(serialize(lambda))) {
            @Override
            protected Class<?> resolveClass(ObjectStreamClass objectStreamClass) throws IOException, ClassNotFoundException {
                Class<?> clazz = super.resolveClass(objectStreamClass);
                return clazz == java.lang.invoke.SerializedLambda.class ? SerializedLambda.class : clazz;
            }
        }) {
            return (SerializedLambda) objIn.readObject();
        } catch (ClassNotFoundException | IOException e) {
            throw new RuntimeException("This is impossible to happen", e);
        }
    }
    private interface SSupplier<T> extends Supplier<T> , Serializable {

    }

    public static void main(String[] args) throws Exception{

        SSupplier<Double> doubleSSupplier = ()->0.0;

        SSupplier<Double> doubleSSupplier2 = ()->0.0;

        final SerializedLambda resolve = resolve(doubleSSupplier);

        final String replace = resolve.getImplMethodSignature().replace("()", "[");
        System.out.println(replace);

        final Class<?> x = ClassUtils.forName(replace.replaceAll("/", "."), null);
        System.out.println(x);

        System.out.println(x.getComponentType().equals(Double.class));

        System.out.println(doubleSSupplier.getClass());
        System.out.println(doubleSSupplier2.getClass());


        System.out.println(new Double("0"));

    }


}
