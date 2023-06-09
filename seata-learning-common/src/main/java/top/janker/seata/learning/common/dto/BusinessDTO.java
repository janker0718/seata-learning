package top.janker.seata.learning.common.dto;

import java.io.Serializable;
import java.math.BigDecimal;

/**
 * @author janker
 * @date 2023/4/9 18:50
 * <p>
 * Blog: https://www.share-java.com
 * Github: https://github.com/janker0718
 */
public class BusinessDTO implements Serializable {
    private static final long serialVersionUID = 7838227692942032744L;

    private String userId;

    private String commodityCode;

    private String name;

    private Integer count;

    private BigDecimal amount;

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getCommodityCode() {
        return commodityCode;
    }

    public void setCommodityCode(String commodityCode) {
        this.commodityCode = commodityCode;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }
}
