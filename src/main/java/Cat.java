public class Cat {
    private String name;
    private byte age;

    public String getName() {
        return name;
    }

    public Cat(String name, byte age) {
        this.name = name;
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public byte getAge() {
        return age;
    }

    public void setAge(byte age) {
        this.age = age;
    }

    public Cat() {

    }
}
