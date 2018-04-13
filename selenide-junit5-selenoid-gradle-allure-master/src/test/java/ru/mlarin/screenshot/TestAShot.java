package ru.mlarin.screenshot;


import org.junit.Before;
import org.junit.jupiter.api.Test;
import org.junit.runners.Parameterized;
import ru.yandex.qatools.ashot.comparison.*;
import ru.yandex.qatools.ashot.util.ImageTool;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.util.Collection;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;


public class TestAShot {



    public static final BufferedImage IMAGE_A_SMALL = loadImage("src/test/resources/myscreen.png");
    public static final BufferedImage IMAGE_B_SMALL = loadImage("src/test/resources/secondscreen.png");

    public ImageDiffer imageDiffer;

    public static BufferedImage loadImage(String path) {
        try {
            return ImageIO.read(ClassLoader.getSystemResourceAsStream(path));
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }




    @Test
    public void testSameSizeDiff() throws Exception {
        ImageDiff diff = imageDiffer.makeDiff(IMAGE_A_SMALL, IMAGE_B_SMALL);
     //   assertThat(diff.getMarkedImage(), ImageTool.equalImage(loadImage("img/expected/same_size_diff.png")));
    }




    void Test() {


        ImageDiff diff = imageDiffer
                .makeDiff(loadImage("src/test/resources/myscreen.png"), loadImage("src/test/resources/secondscreen.png"));
        assertFalse(diff.hasDiff());


    }



}



