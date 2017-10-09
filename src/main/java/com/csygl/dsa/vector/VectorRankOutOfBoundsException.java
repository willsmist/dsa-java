package com.csygl.dsa.vector;

public class VectorRankOutOfBoundsException extends RuntimeException {

    public VectorRankOutOfBoundsException() {
        this("vector rank out of bounds");
    }

    public VectorRankOutOfBoundsException(String msg) {
        super(msg);
    }
}
