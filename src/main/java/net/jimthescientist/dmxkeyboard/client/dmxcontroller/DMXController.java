package net.jimthescientist.dmxkeyboard.client.dmxcontroller;

import net.jimthescientist.dmxkeyboard.client.dmx.Fixture;

import java.util.ArrayList;

public interface DMXController {
    ArrayList<Fixture> fixtures = new ArrayList<>();
    int getUniverse();
    void sendDMX(int address, int value);
    void addFixture(Fixture fixture);
}
