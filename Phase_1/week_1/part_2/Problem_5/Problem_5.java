package Phase_1.week_1.part_2.Problem_5;



public class Problem_5 {
    public static void main(String[] args) {
        Payment p = new NetBanking();
        PaymentProcessor.processing(p);
    }
}

abstract class Payment{
    abstract String pay();
}

class CreditCard extends Payment{
    String pay(){
        return "Checking card number..."+"\n"+"Validating card..." + "\n" + "Done...";

    }
}
class Upi extends Payment{
    String pay(){
        return "validating upi id..." + "\n" + "checking entered pin..." + "\n" + "Done...";
    }

}
class NetBanking extends Payment{
    String pay(){
        return "logging you IN..." + "\n" + "Transfering money..." + "\n" + "Done...";
    }
}
class crypto extends Payment{
    String pay(){
        return "validating wallet address..." + "\n" + "Blockchain confirmation..." + "\n" + "Done...";
    }
}

 class PaymentProcessor{
    static void processing(Payment payment){
        System.out.println(payment.pay());
    }
}
