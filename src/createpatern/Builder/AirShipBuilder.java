package createpatern.Builder;

/**
 * @Auther: ymfa
 * @Date: 2019/3/4 15:18
 * @Description:
 */
public interface AirShipBuilder {
    Engine builderEngine();//构建发动机
    OrbitalModule builderOrbitalModule();//构建轨道舱
    EscapeTower builderEscapeTower();//构建逃逸塔
}
