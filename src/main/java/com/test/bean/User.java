package com.test.bean;

import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * @author sudingkun
 */
@EqualsAndHashCode(callSuper = true)
@Data
public class User extends BaseInfo{

    private String name;

    private int age;

}
