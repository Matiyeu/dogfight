package fr.exia.dogfight.controller;


public class UserOrder implements IUserOrder
{
    private final Order order;
    private final int player;

    public UserOrder(int player, Order order)
    {
        this.player = player;
        this.order = order;
    }

    @Override
    public Order getOrder()
    {
        return order;
    }

    @Override
    public int getPlayer()
    {
        return player;
    }
}
