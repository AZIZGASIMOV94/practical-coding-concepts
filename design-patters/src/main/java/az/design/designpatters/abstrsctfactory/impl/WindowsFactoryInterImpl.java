package az.design.designpatters.abstrsctfactory.impl;

import az.design.designpatters.abstrsctfactory.inter.ButtonInter;
import az.design.designpatters.abstrsctfactory.inter.GUIFactoryInter;

public class WindowsFactoryInterImpl implements GUIFactoryInter {
    @Override
    public ButtonInter createButton() {
        return new WindowsButtonImplInter();
    }

}
