package com.nhnacademy.exam090201;

public interface Movable extends Regionable {
    public Motion getMotion();

    public void setMotion(Motion motion);

    public void addEffect(Motion effect);

    public void move();
}