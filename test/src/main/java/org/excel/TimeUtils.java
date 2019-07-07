package org.excel;


/**
 * @author ☞ 🏀 huqingfeng
 * @date 2019-05-30
 */
public class TimeUtils {

    private static class Stopwatch{
        private long mills;
        public long watch(){
            return System.currentTimeMillis() - mills;
        }

        public void reset() {
            mills = System.currentTimeMillis();
        }
    }

    private static final ThreadLocal<Stopwatch> stopwatchThreadLocal = ThreadLocal.withInitial(Stopwatch::new);

    public static void reset(){
        Stopwatch stopwatch = stopwatchThreadLocal.get();
        stopwatch.reset();
    }

    public static long elapsed(){
        return stopwatchThreadLocal.get().watch();
    }

    public static long elapsedSecends(){
        return elapsed()/1000;
    }

    public static void clear(){
        stopwatchThreadLocal.remove();
    }

}
