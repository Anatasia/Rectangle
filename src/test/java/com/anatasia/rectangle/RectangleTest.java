/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package com.anatasia.rectangle;

import com.anatasia.rectangle.model.Rectangle;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class RectangleTest {

    @Test
    public void getArea() {
        Rectangle rectangle = new Rectangle(4, 5);
        assertEquals(20, rectangle.getArea());
    }

    @Test
    public void getPerimeter() {
        Rectangle rectangle = new Rectangle(4, 5);
        assertEquals(18, rectangle.getPerimeter());
    }
}
