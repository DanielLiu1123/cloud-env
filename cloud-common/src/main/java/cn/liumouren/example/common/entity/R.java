package cn.liumouren.example.common.entity;

import cn.hutool.http.HttpStatus;

/**
 * 返回类型
 *
 * @author Daniel Liu
 * @date 2021/1/3 17:05
 */
public class R {

    private Integer code;
    private String message;
    private Object data;

    private R() {
    }

    private R(Integer code, String message, Object data) {
        this.code = code;
        this.message = message;
        this.data = data;
    }

    public static R ok() {
        R r = new R();
        r.setCode(HttpStatus.HTTP_OK);
        return r;
    }

    public static R ok(String message) {
        R r = R.ok();
        r.setMessage(message);
        return r;
    }

    public static R ok(String message, Object data) {
        R r = R.ok(message);
        r.setData(data);
        return r;
    }

    public static R ok(int code, String message, Object data) {
        return new R(code, message, data);
    }

    public static R err() {
        R r = new R();
        r.setCode(HttpStatus.HTTP_INTERNAL_ERROR);
        return r;
    }

    public static R err(int code, String message) {
        R r = new R();
        r.setCode(code);
        r.setMessage(message);
        return r;
    }

    public static R err(String message) {
        R r = R.err();
        r.setMessage(message);
        return r;
    }

    public static R err(String message, Object data) {
        R r = R.err(message);
        r.setData(data);
        return r;
    }

    public static R err(int code, String message, Object data) {
        R r = new R();
        r.setCode(code);
        r.setMessage(message);
        r.setData(data);
        return r;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "R{" +
                "code=" + code +
                ", message='" + message + '\'' +
                ", data=" + data +
                '}';
    }
}
