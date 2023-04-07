package polymorphism;



class Bank1 {
    float getRateOfInterest() {
        return 0;
    }
}

class SBI extends Bank1 {
    @Override
    float getRateOfInterest() {
        return 8.0f;
    }
}

class AXIS extends Bank1 {
    @Override
    float getRateOfInterest() {
        return 9.0f;
    }
}

class ICICI extends Bank1 {
    @Override
    float getRateOfInterest() {
        return 7.0f;
    }
}

public class Bank 
{

public static void main(String[] args) {
    SBI sbi = new SBI();
    ICICI icici = new ICICI();
    AXIS axis = new AXIS();
    System.out.println("SBI Rate of Interest: " + sbi.getRateOfInterest());
    System.out.println("ICICI Rate of Interest: " + icici.getRateOfInterest());
    System.out.println("AXIS Rate of Interest: " + axis.getRateOfInterest());
}
}

