package youbingchenyoubing.github.io.service.impl;

import org.springframework.stereotype.Service;
import youbingchenyoubing.github.io.dto.OrderDto;
import youbingchenyoubing.github.io.service.IOrderService;

/**
 * @author Mr_chen
 * @date 2019-12-11
 * @Project strategy-deny-if-else-spring-boot
 **/
@Service
public class OrderServiceImp implements IOrderService {
    @Override
    public String handle(OrderDto dto) {

        String type = dto.getType();
        if ("1".equals(type)) {
            return "处理普通订单";
        } else if ("2".equals(type)) {
            return "处理团购订单";
        } else if ("3".equals(type)) {
            return "处理促销订单";
        }
        return null;
    }
}
