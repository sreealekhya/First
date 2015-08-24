package org.alekhya;

import org.alekhya.Rectangle;
import org.junit.Assert;
import org.junit.Test;

public class Rectangle_test {
        @Test
        public void shouldCalculateArea()
        {
            double length = 12;
            double breadth = 10;
            Rectangle rectangle = new Rectangle(length,breadth);
            double area = rectangle.calArea();
            Assert.assertEquals(length*breadth,area,0);
        }

        @Test
        public void shouldCalculatePerimeter()
        {
            double length = 12;
            double breadth = 10;
            Rectangle rectangle = new Rectangle(length,breadth);
            double peri = rectangle.calPerimeter();
            Assert.assertEquals(2*(length+breadth),peri,0);
        }

}
