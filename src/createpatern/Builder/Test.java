package createpatern.Builder;

/**
 * @Auther: ymfa
 * @Date: 2019/3/4 15:24
 * @Description: 似乎本质上和直接构建也没什么区别，只是把构建的过程专门封装到方法中。
 */
public class Test {
    public static void main(String[] args) {

        AirShipDirector shipDirector = new FzAirShipDirector(new FzAirShipBuilder());//构建过程

        AirShip airShip = shipDirector.directorAirShip();//组装过程

        System.out.println(airShip.getEngine());
    }
}
