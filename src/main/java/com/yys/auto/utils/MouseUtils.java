package com.yys.auto.utils;

import java.awt.*;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;

/**
 * describe: 鼠标工具
 *
 * @author lianying
 * @date 2019/1/5
 */
public class MouseUtils {


    private static Robot robot;

    static {
        try {
            robot = new Robot();
            robot.setAutoDelay(500);
        } catch (AWTException e) {
            e.printStackTrace();
        }
    }

    private MouseUtils() throws AWTException {
    }

    /**
     * 鼠标移动
     *
     * @param x
     * @param y
     */
    public static void move(int x, int y) {

        robot.mouseMove(x, y);
    }

    /**
     * 鼠标移动并单击鼠标左键
     *
     * @param x
     * @param y
     */
    public static void moveAndOnclickLeft(int x, int y) {

        robot.mouseMove(x, y);
        robot.mousePress(KeyEvent.BUTTON1_MASK);
        robot.mouseRelease(KeyEvent.BUTTON1_MASK);
    }

    /**
     * 鼠标移动并单击鼠标右键
     *
     * @param x
     * @param y
     */
    public static void moveAndOnclickRight(int x, int y) {

        robot.mouseMove(x, y);
        robot.mousePress(KeyEvent.BUTTON3_MASK);
        robot.mouseRelease(KeyEvent.BUTTON3_MASK);
    }
}
