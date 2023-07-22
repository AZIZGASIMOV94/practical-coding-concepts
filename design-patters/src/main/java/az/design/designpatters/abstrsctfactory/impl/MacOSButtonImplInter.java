package az.design.designpatters.abstrsctfactory.impl;

import az.design.designpatters.abstrsctfactory.inter.ButtonInter;

public class MacOSButtonImplInter implements ButtonInter {
    @Override
    public void render() {
        System.out.println("Rendering MacOS button");
    }
}
