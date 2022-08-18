package org.example.Homework4;

import java.util.List;

public class Car {
    public Producent producent;

    public boolean isAutomaticGear;

    public Market market;

    public String segment;

    public Dimension dimensions;

    public String getSegment() {
        return segment;
    }

    public Car(Producent producent, boolean isAutomaticGear, Market market, String segment, Dimension dimensions) {
        this.producent = producent;
        this.isAutomaticGear = isAutomaticGear;
        this.market = market;
        this.segment = segment;
        this.dimensions = dimensions;

    }


    public static void main(String[] args) {

        Producent p1 = new Producent("Opel", "Vectra");
        Producent p2 = new Producent("Opel", "Kadett");
        Producent p3 = new Producent("BMW", "M3");
        Producent p4 = new Producent("BMW", "Z4");
        Producent p5 = new Producent("Audi", "100");
        Producent p6 = new Producent("Audi", "A6");
        Producent p7 = new Producent("Volvo", "V60");
        Producent p8 = new Producent("Volvo", "XC60");
        Producent p9 = new Producent("Kia", "Ceed");
        Producent p10 = new Producent("Kia", "Optima");


        Country poland = new Country("Poland", 'P');
        Country germany = new Country("Germany", 'G');
        Country china = new Country("China", 'C');
        Country japan = new Country("Japan", 'J');
        Country usa = new Country("USA", 'U');
        List<Country> europeList = List.of(poland, germany);
        List<Country> asiaList = List.of(china, japan);
        List<Country> americaList = List.of(usa);

        Market market1 = new Market("EU", europeList);
        Market market2 = new Market("AS", asiaList);
        Market market3 = new Market("AM", americaList);
        List<Market> marketList = List.of(market1, market2, market3);


        Dimension dimension1 = new Dimension(20, 100, 250);
        Dimension dimension2 = new Dimension(25, 110, 255);
        Dimension dimension3 = new Dimension(30, 120, 360);
        Dimension dimension4 = new Dimension(35, 130, 265);
        Dimension dimension5 = new Dimension(40, 140, 370);
        Dimension dimension6 = new Dimension(45, 150, 275);
        Dimension dimension7 = new Dimension(50, 160, 380);
        Dimension dimension8 = new Dimension(55, 170, 285);
        Dimension dimension9 = new Dimension(60, 180, 390);
        Dimension dimension10 = new Dimension(65, 190, 195);

        Car car1 = new Car(p1, false, marketList.get(0), "Standard", dimension1);
        Car car2 = new Car(p2, true, marketList.get(0), "Premium", dimension2);
        Car car3 = new Car(p3, true, marketList.get(0), "Medium", dimension3);
        Car car4 = new Car(p4, false, marketList.get(0), "Standard", dimension4);
        Car car5 = new Car(p5, true, marketList.get(2), "Premium", dimension5);
        Car car6 = new Car(p6, true, marketList.get(2), "Medium", dimension6);
        Car car7 = new Car(p7, true, marketList.get(2), "Standard", dimension7);
        Car car8 = new Car(p8, true, marketList.get(2), "Medium", dimension8);
        Car car9 = new Car(p9, false, marketList.get(1), "Premium", dimension9);
        Car car10 = new Car(p10, false, marketList.get(1), "Medium", dimension10);
        List<Car> cars = List.of(car1, car2, car3, car4, car5, car6, car7, car8, car9, car10);

        System.out.println("Lists of BMW cars with automatic gear and capacity tank larger than 300");

        for (Car c : cars) {
            if (c.producent.getModel().equals("BMW") && c.isAutomaticGear && c.dimensions.getTankCapacity() > 300) {
                System.out.println("Market of this car is: " + c.market.getName());
                for (int i = 0; i < marketList.get(i).getCountries().size(); i++) {
                    System.out.println(c.market.getCountries().get(i).getCountryName() + "/" + c.market.getCountries().get(i).getCountrySign());
                }
            }

        }

    }


}




