package creational.prototype;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

//Step 2: create concrete classes
@AllArgsConstructor
@Setter
@Getter
public class BackgroundObject implements GraphicalObject{

    //x-coordinate
    private Integer x;

    //y-coordinate
    private Integer y;

    private Integer width;

    private Integer height;

    private BackgroundObjectType type;

//    private List<Integer> pixels = new ArrayList<>();

    //Step 2.1: implement clone method
    @Override
    public BackgroundObject clone() {
        return new BackgroundObject(x, y, width, height, type);
    }
}
