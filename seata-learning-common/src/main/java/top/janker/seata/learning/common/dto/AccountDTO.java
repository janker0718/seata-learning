package top.janker.seata.learning.common.dto;

import java.io.Serializable;
import java.math.BigDecimal;

/**
 * @author janker
 * @date 2023/4/9 18:46
 * <p>
 * Blog: https://www.share-java.com
 * Github: https://github.com/janker0718
 */
public class AccountDTO implements Serializable {
    private static final long serialVersionUID = -2338714501678291824L;

    private Integer id;

    private String userId;

    private BigDecimal amount;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }
}
