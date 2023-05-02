package com.fyd.demo.model;

import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * @Author: patient.fyd@gmail.com
 * @Description:
 * @DateTime: 2023/5/2 21:45
 */
@Setter
@Getter
@ConfigurationProperties(prefix = "mylist")
@Component
public class MyList {

    private List dbtype;
}
