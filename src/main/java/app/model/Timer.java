package app.model;

import org.springframework.stereotype.Component;

@Component
public class Timer {

    private static final Long NANO_TIME = System.nanoTime();

    public Long getTime() {
        return NANO_TIME;
    }
}
