package com.dong.springcloud.entity;

import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @Author 董古华
 * @Create 2020/4/5 14:36
 * @see
 */
@Data
public class PaymentResult<T> {
    private Integer code;
    private String message;
    private T      data;
    public PaymentResult(){
    }
    public PaymentResult(Integer code,String message,T data){
        this.code = code;
        this.message=message;
        this.data = data;
    }

    public PaymentResult(Integer code,String message){
        this(code,message,null);
    }
}
