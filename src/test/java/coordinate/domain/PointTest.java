package coordinate.domain;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class PointTest {
    @Test
    public void 생성자_테스트() {
        Point point = new Point(new Coordinate(10), new Coordinate(10));
        assertThat(point).isEqualTo(new Point(new Coordinate(10), new Coordinate(10)));
    }

    @Test
    public void 두_점사이의_x거리를_구하는_테스트() {
        Point pointA = new Point(new Coordinate(10), new Coordinate(10));
        Point pointB = new Point(new Coordinate(14), new Coordinate(15));

        assertThat(pointA.getDistanceX(pointB)).isEqualTo(4);
    }

    @Test
    public void 두_점사이의_y거리를_구하는_테스트() {
        Point pointA = new Point(new Coordinate(10), new Coordinate(10));
        Point pointB = new Point(new Coordinate(14), new Coordinate(15));

        assertThat(pointA.getDistanceY(pointB)).isEqualTo(5);
    }
}
