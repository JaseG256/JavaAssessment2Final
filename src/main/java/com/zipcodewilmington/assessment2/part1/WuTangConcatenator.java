package com.zipcodewilmington.assessment2.part1;

public class WuTangConcatenator {

    private boolean isWu;
    private boolean isTang;
    private boolean isWuTang;
    private Integer input;

    public WuTangConcatenator(Integer input) {
        this.input = input;
    }


    public boolean isWu() {
        isWu = false;
        isWu = (input % 3 == 0) ? true : false;
        return isWu;
    }

    public boolean isTang() {
        isTang = false;
        isTang = (input % 5 == 0) ? true : false;
        return isTang;
    }

    public boolean isWuTang() {
        isWuTang = false;
        isWuTang = (input % 5 == 0 && input % 3 == 0) ? true : false;
        return isWuTang;
    }
}
