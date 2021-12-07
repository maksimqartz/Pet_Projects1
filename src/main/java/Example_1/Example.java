package Example_1;

public class Example {

    String name;

    public Example() {

    }

    public Example(String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String toString() {
        return "Example_1" + name;
    }

    // equals, hashCode

}
