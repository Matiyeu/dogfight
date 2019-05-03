package fr.exia.dogfight.controller;


import fr.exia.dogfight.model.IDogfightModel;
import fr.exia.dogfight.ihm.IViewSystem;

public class DogfightController implements IOrderPerformer
{
    public static int TIME_SLEEP = 30;

    private IDogfightModel iDogfightModel;

    public DogfightController(IDogfightModel iDogfightModel)
    {
        this.iDogfightModel = iDogfightModel;
    }

    @Override
    public void orderPerform(UserOrder userOrder)
    {

    }

    public void play()
    {

    }

    public void setView(IViewSystem iViewSystem)
    {

    }

    public void launchMissile(int player)
    {

    }

    public void gameLoop()
    {

    }
}
