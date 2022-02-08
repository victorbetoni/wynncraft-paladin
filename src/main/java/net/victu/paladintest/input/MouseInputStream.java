package net.victu.paladintest.input;

public class MouseInputStream {
    private String currentStream;

    public MouseInputStream(String currentStream) {
        this.currentStream = currentStream;
    }

    public String getCurrentStream() {
        return currentStream;
    }

    public void append(char key) {
        currentStream += key;
    }
}
