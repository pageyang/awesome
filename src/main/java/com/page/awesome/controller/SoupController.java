package com.page.awesome.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;



/**
 * @ClassName SoupController
 * @Description 传递鸡汤控制器
 * @Author yang
 * @Date 2019/5/5 18:11
 **/
@RestController
@RequestMapping(value = "/soup")
@Slf4j
public class SoupController {
//
//    @GetMapping("/getOneSoup")
//    public Response getOneSoup() {
//        SoupDto.Soup.Builder soupBuilder = SoupDto.Soup.newBuilder();
//        SoupDto.Soup soup = soupBuilder.setChickenSoup("能吃是福").setSoupId("1").setSoupUp(9).setSoupDown(10).build();
//        log.info("===soup:{}", soup);
//        log.info("===byte soup:{}", soup.toByteString());
////        System.out(encodeBase64(soup.toByteArray()));
//        return Response.ok(soup.toString(), MediaType.APPLICATION_OCTET_STREAM).status(200).build();
//    }
}
