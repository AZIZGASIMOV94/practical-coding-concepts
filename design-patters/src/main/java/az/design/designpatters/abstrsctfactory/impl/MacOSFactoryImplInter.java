package az.design.designpatters.abstrsctfactory.impl;

import az.design.designpatters.abstrsctfactory.inter.ButtonInter;
import az.design.designpatters.abstrsctfactory.inter.GUIFactoryInter;

public class MacOSFactoryImplInter implements GUIFactoryInter {
    @Override
    public ButtonInter createButton() {
        return new MacOSButtonImplInter();
    }

}
