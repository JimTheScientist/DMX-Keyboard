package net.jimthescientist.dmxkeyboard.client.dmx;

public class Channel {
    private int channelAddress;
    private int value;
    private int maxValue;
    private int minValue;
    public String name = "Unnamed";

    public Channel(int channelAddress, int maxValue, int minValue) throws SetChannelException {
        // TODO Check and then throw a SetChannelException if channel is already claimed by another fixture.
        this.channelAddress = channelAddress;
        this.maxValue = maxValue;
        this.minValue = minValue;
    }
    public Channel(String name, int channelAddress, int maxValue, int minValue) throws SetChannelException {
        // TODO Check and then throw a SetChannelException if channel is already claimed by another fixture.
        this.name = name;
        this.channelAddress = channelAddress;
        this.maxValue = maxValue;
        this.minValue = minValue;
    }

    public int getChannelAddress() {
        return channelAddress;
    }

    public void setChannelAddress(int channelAddress) throws SetChannelException {
        // TODO Check and then throw a SetChannelException if channel is already claimed by another fixture.
        this.channelAddress = channelAddress;
    }

    public int getMaxValue() {
        return maxValue;
    }

    public int getMinValue() {
        return minValue;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) throws SetValueException {
        if (value <= this.maxValue) {
            this.value = value;
        }
        else {
            throw new SetValueException("The value provided (" + value + ") is greater than the maximum value (" + this.maxValue + ") for this channel!");
        }
    }

    public static class SetChannelException extends Exception {
        public SetChannelException(String errorMessage) {
            super(errorMessage);
        }
    }
    public static class SetValueException extends Exception {
        public SetValueException(String errorMessage) {
            super(errorMessage);
        }
    }
}
