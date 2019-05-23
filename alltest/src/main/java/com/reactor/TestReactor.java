package com.reactor;

import org.apache.ibatis.javassist.tools.reflect.Metaobject;
import org.apache.ibatis.reflection.DefaultReflectorFactory;
import org.apache.ibatis.reflection.MetaObject;
import org.apache.ibatis.reflection.ReflectorFactory;
import org.apache.ibatis.reflection.factory.DefaultObjectFactory;
import org.apache.ibatis.reflection.wrapper.DefaultObjectWrapperFactory;
import reactor.core.publisher.Flux;

import javax.validation.constraints.Null;
import java.time.Duration;
import java.util.Arrays;
import java.util.List;

/**
 * @author ☞ 🏀
 * @date 2019-05-17
 */
public class TestReactor {
    public static void main(String[] args) {
//        Flux.range(1, 100).buffer(20).subscribe(System.out::println);
//        Flux.interval(Duration.ofMillis(100)).buffer(Duration.ofMillis(1001)).take(2).toStream().forEach(System.out::println);
//        Flux.range(1, 10).bufferUntil(i -> i % 2 == 0).subscribe(System.out::println);
//        Flux.range(1, 10).bufferWhile(i -> i % 2 == 0).subscribe(System.out::println);


//        Flux.just("A","B").flatMap(k->Flux.just("D","E")).subscribe(System.out::println);

        A.B.C c = new A.B.C();
        c.setNameC("CCC");

        A.B b = new A.B();
        b.setNameB("BBB");

        A a = new A();
        a.setNameA("AAA");

        a.setB(b);

        b.setC(c);

        String[] aa = new String[0];

        System.out.println(aa instanceof Object[]);


        final MetaObject metaObject = MetaObject.forObject(a, new DefaultObjectFactory(), new DefaultObjectWrapperFactory(), new DefaultReflectorFactory());
        final Object value = metaObject.getValue("a[0]");
        System.out.println(value);

    }


    static class A{
        private String nameA;

        private List<String> a = Arrays.asList("2","2");

        private B b;

        public List<String> getA() {
            return a;
        }

        public void setA(List<String> a) {
            this.a = a;
        }

        public B getB() {
            return b;
        }

        public void setB(B b) {
            this.b = b;
        }

        public String getNameA() {
            return nameA;
        }

        public void setNameA(String nameA) {
            this.nameA = nameA;
        }

        static class B{
            private String nameB;

            private C c;

            public C getC() {
                return c;
            }

            public void setC(C c) {
                this.c = c;
            }

            public String getNameB() {
                return nameB;
            }

            public void setNameB(String nameB) {
                this.nameB = nameB;
            }

            static class C{
                private String nameC;

                public String getNameC() {
                    return nameC;
                }

                public void setNameC(String nameC) {
                    this.nameC = nameC;
                }
            }
        }
    }
}
