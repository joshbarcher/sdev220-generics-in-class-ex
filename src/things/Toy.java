package things;

public class Toy
{
    private String type;
    private String material;

    public Toy(String type, String material)
    {
        this.type = type;
        this.material = material;
    }

    public String getType()
    {
        return type;
    }

    public String getMaterial()
    {
        return material;
    }

    @Override
    public String toString()
    {
        return type + " made of " + material;
    }
}
