package org.groovy

class Example {
    static void main(String[] args) {
        testE()
    }

    static testA() {
        def file = new File('/')
        println "File? ${file.isFile()}"
        println "Directory? ${file.isDirectory()}"
    }
    // copy file
    static testB() {
        def base = "/Users/huqingfeng/Documents/projects/jnote/test/src/main/resources/public/"
        def filea = new File(base+"filea.txt")
        def fileb = new File(base+"fileb.txt")
        fileb << filea.text
    }

    static testC(){
        String sample = "Hello world"
        println sample.center(30)
        println(sample[4]) // Print the 5 character in the string

        //Print the 1st character in the string starting from the back
        println(sample[-1])
        println(sample[1..2])//Prints a string starting from Index 1 to 2
        println(sample[4..2])//Prints a string starting from Index 4 back to 2
    }

    static testD(){
        String s = "HelloWorld"
        s.eachMatch(".") {
            ch -> println ch
        }
    }

    static testE(){
        // Example of an Integer using def
        def array = 1..10
        array.collect { x:println()}
        println(array.contains(2))
        println(array.contains(11))

        def map = [ "a":"b" , "dd":"ee" ]
        map.each { k , v -> println "键$k 值$v"}
    }
}