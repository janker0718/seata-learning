package top.janker.seata.learning.common.dto;

import java.io.Serializable;

/**
 * 商品信息
 * @author janker
 * @date 2023/4/9 18:50
 * <p>
 * Blog: https://www.share-java.com
 * Github: https://github.com/janker0718
 */
public class CommodityDTO implements Serializable {
    private static final long serialVersionUID = 5440962762016751546L;

    private Integer id;

    private String commodityCode;

    private String name;

    private Integer count;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
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
}
