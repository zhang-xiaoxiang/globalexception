package com.example.globalexception.result;

import lombok.Data;


/**
 * ResultVO:http 请求返回的最外层对象(用spring 使用注解将其转为json传输)
 *
 * @author zhangxiaoxiang
 * @date: 2019/05/23
 */
@Data
public class ResultVO<T>{
    /**
     * 错误码
     */
    private Integer code;
    /**
     * 提示信息
     */
    private String msg;

    /**
     * 返回的具体内容
     * 空值不反回那么用下面的注解
     * @JsonInclude(JsonInclude.Include.NON_NULL)
     */
    private T data;


}
