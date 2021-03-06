package com.mercadolibre.jesfernandes.javaoop.aula5.exercicio2;

import java.util.Date;

public class Timer {

    private long start;
    private long end;

    public void start() {
        this.start = new Date().getTime();
    }

    public void stop() {
        this.end = new Date().getTime();
    }

    public long getElapsedTime() {
        return this.end - this.start;
/*        return String.format("%d min, %d sec",
                TimeUnit.MILLISECONDS.toMinutes(elapsedMillis),
                TimeUnit.MILLISECONDS.toSeconds(elapsedMillis) -
                        TimeUnit.MINUTES.toSeconds(TimeUnit.MILLISECONDS.toMinutes(elapsedMillis))
        );
*/
    }
}