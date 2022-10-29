package com.chenshen.ssm.commen;

/**
 * @apiNote 状态码
 */
public class Code {
    /**
     * 增删改查成功返回状态码
     */
    private static final Integer SAVE_OK = 20010;
    private static final Integer DELE_OK = 20020;
    private static final Integer UPDT_OK = 20030;
    private static final Integer SELE_OK = 20040;

    /**
     * 增删该查失败返回状态码
     */
    private static final Integer SAVE_NO = 20011;
    private static final Integer DELE_NO = 20021;
    private static final Integer UPDT_NO = 20031;
    private static final Integer SELE_NO = 20041;
}
