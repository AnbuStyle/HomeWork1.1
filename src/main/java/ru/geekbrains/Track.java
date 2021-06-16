package ru.geekbrains;

class Track implements Way {

    private int length;

    public Track(String s, int length) {

        this.length = length;
    }

    public int getLength() {
        return length;
    }

    @Override
    public boolean doIt(Host player) {
        return player.run(length);
    }
}