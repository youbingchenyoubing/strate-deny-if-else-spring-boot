package youbingchenyoubing.github.io.service;

import youbingchenyoubing.github.io.dto.OrderDto;

/**
 * @author Mr_chen
 * @date 2019-12-11
 * @Project strategy-deny-if-else-spring-boot
 **/
public interface IOrderService {

    /**
     * 根据订单的不同类型作出不同的处理
     *
     * @param dto 订单实体
     * @return 为了简单，返回字符串
     */
    String handle(OrderDto dto);

}