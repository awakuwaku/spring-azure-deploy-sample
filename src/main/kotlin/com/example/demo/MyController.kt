package com.example.demo

import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController

@RestController
class MyController {

  // URLに対応する処理を書いていく
  @RequestMapping("/")
  fun hello(): String {
    return "Hello"
  }

  // http://localhost:8080?name=hoge
  // みたいにGETパラメータをもらいたいときはこう
  @RequestMapping("/paramTest")
  fun paramTest(@RequestParam(value = "name") name: String): String {
    return name
  }
}