package com.ctgu.springdemo02.pojo;

/**
 * @author Alin
 * @packagename com.ctgu.springdemo02.pojo
 * @date 2019/8/4
 * @time 19:41
 */
public class Page {

    private int start = 1;
    private int size = 5;

    public int getStart() {
        return start;
    }

    public void setStart(int start) {
        this.start = start;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }
}
