package ru.geekbrains;

public class Human implements Host {

    private final String name;
    private final int makeJump;
    private final int makeRun;

    public Human(String name, int makeJump, int makeRun) {
        this.name = name;
        this.makeJump = makeJump;
        this.makeRun = makeRun;
    }

    @Override
    public boolean jump(int height) {
        if  (height <= makeJump) {
            System.out.println(name + " перепрыгнул");
            return true;
        }else {
            System.out.println(name +" не перепрыгнул");
            return false;
        }

    }
    @Override
    public boolean run(int length) {
        if (length <= makeRun) {
            System.out.println(name + " пробежал");
            return true;
        }else {
            System.out.println(name + " не пробежал");
            return false;}
    }

    public String getName() {
        return name;
    }

    public int getMakeJump() {
        return makeJump;
    }

    public int getMakeRun() {
        return makeRun;
    }
}