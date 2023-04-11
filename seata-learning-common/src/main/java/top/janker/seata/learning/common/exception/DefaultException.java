package top.janker.seata.learning.common.exception;

import top.janker.seata.learning.common.enums.RspStatusEnum;

/**
 * 自定义异常
 * @author janker
 * @date 2023/4/9 19:06
 * <p>
 * Blog: https://www.share-java.com
 * Github: https://github.com/janker0718
 */
public class DefaultException extends RuntimeException {
    private static final long serialVersionUID = 3568094535221216535L;
    private RspStatusEnum rspStatusEnum;

    public DefaultException(String message, Throwable cause) {
        super(message, cause);
    }

    public DefaultException(RspStatusEnum rspStatusEnum) {
        super(rspStatusEnum.getMessage());
        this.rspStatusEnum = rspStatusEnum;
    }

    public DefaultException(RspStatusEnum rspStatusEnum, Throwable cause) {
        super(rspStatusEnum.getMessage(), cause);
        this.rspStatusEnum = rspStatusEnum;
    }

    public RspStatusEnum getRspStatusEnum() {
        return rspStatusEnum;
    }

    public void setRspStatusEnum(RspStatusEnum rspStatusEnum) {
        this.rspStatusEnum = rspStatusEnum;
    }
}
