package ru.mlarin.screenshot;

import org.junit.jupiter.api.Test;
import ru.yandex.qatools.ashot.comparison.ImageDiff;
import ru.yandex.qatools.ashot.comparison.ImageDiffer;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;

public class TestTEst {

    public static final BufferedImage IMAGE_A_SMALL = loadImage("/home/localuser/testing/selenide-junit5-selenoid-gradle-allure-master/src/test/resources/myscreen.png");
    public static final BufferedImage IMAGE_B_SMALL = loadImage("/home/localuser/testing/selenide-junit5-selenoid-gradle-allure-master/src/test/resources/secondscreen.png");

    public static BufferedImage loadImage(String path) {
        try {
            return ImageIO.read(ClassLoader.getSystemResourceAsStream(path));
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }




    @Test
    void testSameSizeDiff() {
        ImageDiff diff = new ImageDiffer().makeDiff(IMAGE_A_SMALL, IMAGE_B_SMALL);
    }
}
