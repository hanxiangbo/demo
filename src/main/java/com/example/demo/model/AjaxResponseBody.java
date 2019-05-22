package com.example.demo.model;

import lombok.Data;

import java.io.Serializable;

/**
 * Created with IDEA
 * author:hxb
 *
 * @Date: 2019/5/22 09:53
 * @Description:
 */
@Data
public class AjaxResponseBody implements Serializable {

    private String status;
    private String msg;
    private Object result;
    private String jwtToken;

}
