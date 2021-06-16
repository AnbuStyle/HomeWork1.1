package ru.geekbrains;

class Wall implements Way{

    private final int height;

    public Wall(String s, int height) {

        this.height = height;
    }

    public int getHeight() {
        return height;
    }

    @Override
    public boolean doIt(Host player) {
        return player.jump(height);
    }
}

