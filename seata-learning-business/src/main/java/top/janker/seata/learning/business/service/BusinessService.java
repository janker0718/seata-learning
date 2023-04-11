package top.janker.seata.learning.business.service;

import top.janker.seata.learning.common.dto.BusinessDTO;
import top.janker.seata.learning.common.response.ObjectResponse;

/**
 * @author janker
 * @date 2023/4/9 23:56
 * <p>
 * Blog: https://www.share-java.com
 * Github: https://github.com/janker0718
 */
public interface BusinessService {
    ObjectResponse handleBusiness(BusinessDTO businessDTO);
}
