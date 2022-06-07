package cn.tedu.controller;

public class Result {
    private Code code;
    private Object data;
    private String msg;

    public Result(Code code, Object data) {
        this.code = code;
        this.data = data;
    }

    public Result() {
    }

    public Result(Code code, Object data, String msg) {
        this.code = code;
        this.data = data;
        this.msg = msg;
    }

    public Code getCode() {
        return code;
    }

    public void setCode(Code code) {
        this.code = code;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }
}
