package top.janker.seata.learning.common.response;

import java.io.Serializable;

/**
 * @author janker
 * @date 2023/4/9 18:56
 * <p>
 * Blog: https://www.share-java.com
 * Github: https://github.com/janker0718
 */
public class ObjectResponse<T> extends BaseResponse implements Serializable {
    private static final long serialVersionUID = 3823740463639040424L;
    private T data;

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }
}