import lombok.Builder;
import lombok.Getter;

@Getter
@Builder
public class Cube implements Shape{
    private double width;
    public double getVolume() {
        return width*width*width;
    }
}
