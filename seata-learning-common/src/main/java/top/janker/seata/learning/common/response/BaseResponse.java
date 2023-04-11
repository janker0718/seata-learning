package top.janker.seata.learning.common.response;

import java.io.Serializable;

/**
 * @author janker
 * @date 2023/4/9 18:57
 * <p>
 * Blog: https://www.share-java.com
 * Github: https://github.com/janker0718
 */
public class BaseResponse implements Serializable {

    private static final long serialVersionUID = 5012001659348705457L;
    private int status = 200;

    private String message;

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}