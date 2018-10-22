package lab9.no5;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class VendingMachine {

    final static int READY =0;
    final static int ACCEPTING_COIN =1;
    final static int DONE=2;

    private int currentState = READY;
    private double price = 0 ;

    private int currentStation;
    private int destinationStation;

    private List<Station> stations = new ArrayList<>(Arrays.asList(new Station("Sutthisan",1),
            new Station("Phra Ram 9",4),
            new Station("Sukhumvi",6)));

    public VendingMachine(int currentStation) {
        this.currentStation = currentStation;
    }

    public void chooseStation(int destinationStation){
        if (currentState==READY){
            currentState = ACCEPTING_COIN;
            this.destinationStation =destinationStation;
            int currentStationCost = stations.get(currentState).getPosition();
            int destinationStationCost = stations.get(destinationStation).getPosition();
            this.price += Math.abs(currentStationCost - destinationStationCost) * Station.getPricePerDistance();
            System.out.println("Need "+ price + " bath for go to " + stations.get(destinationStation).getName());
        }else {
            System.out.println("You can't select station for now");
        }
    }

    public void insertCoin(double coin){

        if (currentState==ACCEPTING_COIN){
            if (coin < price){
                System.out.println("You have to insert coin at least "+  price);
            }else if (coin==price){
                currentState=DONE;
                retrieveTicket();
            }else {
                currentState=DONE;
                System.out.println("You have "+ coin + " bath");
                System.out.println("Your change is "+(coin - price)+ " bath");
                retrieveTicket();
            }
        }else{
            System.out.println("Can't insert Coin, please choose station");
        }
    }

    public void retrieveTicket(){
        if (currentState==DONE){
            currentState = READY;
            System.out.println("You get ticket form "+ stations.get(currentStation).getName()+" to "+stations.get(destinationStation).getName());
        }else {
            System.out.println("You can't get ticket for now");
        }
    }

    public static void main(String[] args) {
        VendingMachine vendingMachine = new VendingMachine(0);
        vendingMachine.chooseStation(2);
        vendingMachine.insertCoin(100);
    }
}
