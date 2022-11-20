package com.example.cicdtest

import org.springframework.boot.ApplicationArguments
import org.springframework.boot.ApplicationRunner
import org.springframework.stereotype.Component
import javax.annotation.PostConstruct

@Component
class AppRunner: ApplicationRunner {
    override fun run(args: ApplicationArguments?) {
        println("Hello, world!")
    }
}



class Test(){

    @PostConstruct
    fun test(){
        println("Hello, world!")
    }
}