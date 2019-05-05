package fr.exia.dogfight.ihm;

import fr.exia.dogfight.controller.IOrderPerformer;
import fr.exia.dogfight.controller.UserOrder;
import fr.exia.gameframe.IEventPerformer;

import java.awt.event.KeyEvent;

public class EventPerformer implements IEventPerformer {

    private IOrderPerformer orderPerformer;

    public EventPerformer(IOrderPerformer orderPerformer) {
        this.orderPerformer = orderPerformer;
    }

    private UserOrder keyCodeToUserOrder(int keyCode) {
        return null;
    }

    @Override
    public void eventPerform(KeyEvent keyCode) {
    }

}
