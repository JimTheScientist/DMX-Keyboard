package net.jimthescientist.dmxkeyboard.client.dmxcontroller;

import net.jimthescientist.dmxkeyboard.client.dmx.Fixture;

public class ArtNetController implements DMXController{
    private int universe;
    private int subnet;
    private String ip;

    public ArtNetController(String ip, int universe, int subnet) {
        this.ip = ip;
        this.universe = universe;
        this.subnet = subnet;
    }

    @Override
    public int getUniverse() {
        return this.universe;
    }

    @Override
    public void sendDMX(int address, int value) {

    }

    @Override
    public void addFixture(Fixture fixture) {
        ArtNetController.fixtures.add(fixture);
    }

    public int getSubnet() {
        return subnet;
    }
}
