package com.page.awesome;

import com.google.protobuf.InvalidProtocolBufferException;
import com.page.awesome.dto.proto.SoupDto;
import com.page.awesome.dto.proto.UserOuterClass;
import org.apache.tomcat.util.codec.binary.Base64;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class AwesomeApplicationTests {

    @Test
    public void contextLoads() throws InvalidProtocolBufferException {

            System.out.println();
            SoupDto.Soup.Builder soupBuilder = SoupDto.Soup.newBuilder();
            SoupDto.Soup soup = soupBuilder.setChickenSoup("睁一只眼闭一只眼").setSoupId("1")
                    .setPoint(6.66f).setSoupUp(9).setSoupDown(10).build();
//        log.info("===soup:{}", soup);
//        log.info("===byte soup:{}", soup.toByteArray());

            System.out.println( "  ---- "+ Base64.encodeBase64String(soup.toByteArray()));


            UserOuterClass.User builder = UserOuterClass.User.parseFrom(Base64.decodeBase64("CgNzZ2YYAaABEA==".getBytes()));
            System.out.println(builder);
            System.out.println(Base64.decodeBase64("CgNzZ2YYAaABEA==".getBytes()));
            System.out.println(SoupDto.Soup.parseFrom(Base64.decodeBase64("CgExEgzog73lkIPmmK/npo8YCSAKLbge1UA=")).toString());

    }

}
