package youbingchenyoubing.github.io.handler;

import youbingchenyoubing.github.io.dto.OrderDto;

/**
 * @author Mr_chen
 * @date 2019-12-11
 * @Project strategy-deny-if-else-spring-boot
 **/
public abstract class AbstractHandler {
    abstract public String handle(OrderDto dto);
}
