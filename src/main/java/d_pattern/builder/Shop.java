package d_pattern.builder;

public class Shop
{
    public static void main(String[] args)
    {
        Phone phone=new PhoneBuilder().setName("kaushal").setBattery(150).getPhone();
        System.out.println(phone);
    }
}
