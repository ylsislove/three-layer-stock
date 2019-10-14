package com.yain.gupiao.utils;

/**
 * layui数据表格返回数据处理类
 * msg:返回的信息
 * data：返回的数据
 * code：状态编码
 * count：总记录数
 *
 * @author Apple_Coco
 * @version V1.0 2019/10/13 13:49
 */
public class LayuiTableResultUtil<T> {

    private  int code;
    private String msg;
    private  Long count;
    private  T data;

    public LayuiTableResultUtil() {
    }

    public LayuiTableResultUtil(int code, String msg, Long count, T data) {
        this.code = code;
        this.msg = msg;
        this.count = count;
        this.data = data;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public Long getCount() {
        return count;
    }

    public void setCount(Long count) {
        this.count = count;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "LayuiTableResultUtil{" +
                "code=" + code +
                ", msg='" + msg + '\'' +
                ", count=" + count +
                ", data=" + data +
                '}';
    }
}
