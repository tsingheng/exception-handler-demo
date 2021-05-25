package cn.songxh.demo.advice;

/**
 * @author xiangheng.song
 * @date 2021/5/25 19:45
 */
public class MyResponse {

    private Boolean success = true;

    private Object data;

    public Boolean getSuccess() {
        return success;
    }

    public void setSuccess(Boolean success) {
        this.success = success;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }
}
