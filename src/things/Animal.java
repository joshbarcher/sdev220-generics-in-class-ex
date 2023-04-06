package things;

public class Animal
{
    private String breed;
    private String name;
    private int age;

    public Animal(String breed, String name, int age)
    {
        this.breed = breed;
        this.name = name;
        this.age = age;
    }

    public String getBreed()
    {
        return breed;
    }

    public String getName()
    {
        return name;
    }

    public int getAge()
    {
        return age;
    }

    @Override
    public String toString()
    {
        return name + " (breed: " + breed + ") (" + age + " years old)";
    }
}
