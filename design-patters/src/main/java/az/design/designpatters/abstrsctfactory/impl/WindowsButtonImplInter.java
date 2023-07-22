package az.design.designpatters.abstrsctfactory.impl;

import az.design.designpatters.abstrsctfactory.inter.ButtonInter;

public class WindowsButtonImplInter implements ButtonInter {
    @Override
    public void render() {
        System.out.println("Rendering Windows ButtonInter");
    }
}
