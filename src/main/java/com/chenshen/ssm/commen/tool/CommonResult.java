package com.chenshen.ssm.commen.tool;

import com.chenshen.ssm.commen.Code;
import com.chenshen.ssm.commen.Massage;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@AllArgsConstructor
@NoArgsConstructor
/**
 * @apiNote 作为前端查询返回结果的统一格式
 */
public class CommonResult<T> {
    // 返回状态码
    private Code code;
    // 返回信息
    private Massage massage;
    // 返回前端的数据
    private T data;
}
