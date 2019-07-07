package com.groovy

import org.apache.commons.lang3.time.DateFormatUtils

class HelloWord {
    static void main(String[] args) {
        println("hello word")
        print(DateFormatUtils.format(new Date(),"yyyy-MM-dd HH:mm:ss"))
    }
}
