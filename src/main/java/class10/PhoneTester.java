package class10;

public class PhoneTester {
    public static void main(String[] args) {
        Phone iphoneObj=new Phone();
        iphoneObj.make = "Apple";
        iphoneObj.model = "Iphone 14";
        iphoneObj.os = "IOS 17";
        iphoneObj.price = 1099;
        iphoneObj.call();
        iphoneObj.text();

        Phone pixelObj=new Phone();
        pixelObj.make = "Google";
        pixelObj.model = "Pixel 7";
        pixelObj.os = "Android 13";
        pixelObj.price = 899;
        pixelObj.call();
        pixelObj.text();

        Phone samsungObj=new Phone();
        samsungObj.make = "Samsung";
        samsungObj.model = "Galaxy 14";
        samsungObj.os = "Android 13";
        samsungObj.price = 1000;
        samsungObj.call();
        samsungObj.text();
    }
}
