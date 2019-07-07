package org.ms1;

import javax.management.MBeanServer;
import java.lang.management.ManagementFactory;
import java.lang.management.ThreadInfo;
import java.lang.management.ThreadMXBean;
import java.util.concurrent.TimeUnit;

/**
 * @author ☞ 🏀 huqingfeng
 * @date 2019-07-02
 */
public class Test {
    private static String ss = null;

    public static void main(String[] args) throws Exception {
        System.out.println();
        MBeanServer mbs =
                ManagementFactory.getPlatformMBeanServer();
        for (int i = 0; i < args.length; i++) {
            System.out.println(args[i]);
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 100000; i++) {
            sb.append(i + "");
        }
        String s = sb.toString();
        System.out.println(s);
        ss = s;
        // 获取java线程的管理MXBean
        ThreadMXBean tmxb = ManagementFactory.getThreadMXBean();
// 不需要获取同步的Monitor和synchronizer信息，仅获取线程和线程堆栈信息
        ThreadInfo[] threadInfos = tmxb.dumpAllThreads(false, false);
// 遍历线程信息，打印出ID和名称
        for (ThreadInfo info : threadInfos) {
            System.out.println("[" + info.getThreadId() + "] " + info.getThreadName());
        }
        TimeUnit.DAYS.sleep(1L);
    }
}
