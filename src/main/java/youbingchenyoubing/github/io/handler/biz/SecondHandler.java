package youbingchenyoubing.github.io.handler.biz;

import org.springframework.stereotype.Component;
import youbingchenyoubing.github.io.dto.OrderDto;
import youbingchenyoubing.github.io.handler.AbstractHandler;
import youbingchenyoubing.github.io.handler.HandlerType;

/**
 * @author Mr_chen
 * @date 2019-12-11
 * @Project strategy-deny-if-else-spring-boot
 **/
@Component
@HandlerType("2")
public class SecondHandler  extends AbstractHandler {
    @Override
    public String handle(OrderDto dto) {
        return "second handle";
    }
}
