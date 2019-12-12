package youbingchenyoubing.github.io.handler;

import youbingchenyoubing.github.io.util.BeanTool;

import java.util.Map;

/**
 * @author Mr_chen
 * @date 2019-12-11
 * @Project strategy-deny-if-else-spring-boot
 **/
public class HandlerContext {
    private Map<String, Class> handlerMap;

    public HandlerContext(Map<String, Class> handlerMap) {
        this.handlerMap = handlerMap;
    }

    public AbstractHandler getInstance(String type) {
        Class clazz = handlerMap.get(type);
        if (clazz == null) {
            throw new IllegalArgumentException("not found handler for type: " + type);
        }
        return (AbstractHandler) BeanTool.getBean(clazz);
    }
}



