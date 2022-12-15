import test.house.CosyHouse;

public class WarmHouse {
    public static void main(String[] args) {
        //создаём экземпляр класса дома
        CosyHouse house = new CosyHouse(375);


        displayArea(house);

    }
         public static void displayArea(CosyHouse house){
            System.out.println("Площадь дома составляет :" + house.getHouseArea());


          }


          }
