package youbingchenyoubing.github.io.dto;

import lombok.Data;

import java.math.BigDecimal;

/**
 * @author Mr_chen
 * @date 2019-12-11
 * @Project strategy-deny-if-else-spring-boot
 **/

@Data
public class OrderDto {
    private String code;

    private BigDecimal price;

    /**
     * 订单类型
     * 1：普通订单；
     * 2：团购订单；
     * 3：促销订单；
     */
    private String type;
}
