//my code
public class MainCal {
    public static void main(String[] args){
        
        double earnedAmount = 0;
        int bubbleGum = 202;
        int toffee = 118;
        int iceCream = 2250;
        int milk = 1680;
        int doughnut = 1075;
        int panCake = 80;

        earnedAmount = (bubbleGum + toffee + iceCream + milk + doughnut + panCake);
        
        System.out.println("prices");
        System.out.println("==========");
        System.out.println("Bubblegum:$" + bubbleGum );
        System.out.println("Toffee: $" + toffee);
        System.out.println("Ice cream: $" + iceCream);
        System.out.println("Milk :" + milk);
        System.out.println("Doughnut: $" + doughnut);
        System.out.println("Pancake: $" + panCake);

        System.out.println("Earned Amount:" +earnedAmount);
        

    }
}