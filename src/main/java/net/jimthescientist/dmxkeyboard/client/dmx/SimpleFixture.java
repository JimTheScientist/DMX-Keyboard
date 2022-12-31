package net.jimthescientist.dmxkeyboard.client.dmx;

import net.jimthescientist.dmxkeyboard.client.DMXKeyboardClient;

import java.util.ArrayList;

public class SimpleFixture implements Fixture {
    private ArrayList<Channel> channels;
    public String fixtureName = "Unnamed";

    public SimpleFixture(String fixtureName, int startAddress, int channelAddressLength, int channels) {
        this.fixtureName = fixtureName;
        this.channels = new ArrayList<>();
        for (int i = 0; i < channels; i++) {
            try {
                this.channels.add(new Channel(i*channelAddressLength + startAddress, 255, 0));
            } catch (Channel.SetChannelException e) {
                DMXKeyboardClient.LOGGER.error(e.getMessage());
            }
        }
    }

    public SimpleFixture(int startAddress, int channelAddressLength, int channels) {
        this.channels = new ArrayList<>();
        for (int i = 0; i < channels; i++) {
            try {
                this.channels.add(new Channel(i*channelAddressLength + startAddress, 255, 0));
            } catch (Channel.SetChannelException e) {
                DMXKeyboardClient.LOGGER.error(e.getMessage());
            }
        }
    }

    public SimpleFixture(String fixtureName, ArrayList<Channel> channels) {
        this.fixtureName = fixtureName;
        this.channels = channels;
    }

    public SimpleFixture(ArrayList<Channel> channels) {
        this.channels = channels;
    }

    public Channel getChannelAtAddress(int address) throws NoChannelFoundException {
        for (Channel channel : this.channels) {
            if (channel.getChannelAddress() == address) {
                return channel;
            }
        }
        throw new NoChannelFoundException("Could not find a channel located at address " + address);
    }

    @Override
    public ArrayList<Channel> getChannels() {
        return this.channels;
    }

    public static class NoChannelFoundException extends Exception {
        public NoChannelFoundException(String errorMessage) {
            super(errorMessage);
        }
    }
}
