/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tdd;
//Test driven management

import org.junit.Test;
import static org.junit.Assert.*;
import static util.MyToy.cF;

;

/**
 *
 * @author Tan
 */
public class MyToyTest {

    public MyToyTest() {
    }
    //trong đây sẽ là những tình huống mình test cần test(test cases)
//        vd ta test tình huống đưa vào ngon lành, nhận về ngon lành
//vd ta test tình huống đưa vàochạy như mong đợi/expected
//lúc đó netbean ném màu xanh khi ổn, màu đỏ khi có vấn đề

    @Test
    public void testSuccessfulCase() {
        assertEquals(1, cF(0));
        assertEquals(6, cF(2));

        assertEquals(6, cF(3));

        assertEquals(24, cF(4));
        assertEquals(120, cF(5));
        assertEquals(720, cF(6));
    }//đỏ xảy ra có 2 tình huống
    //hoặc bạn xử lí sai, hoặc bạn kì vọng sai
//            có đó -> kiểm tra code đi
//ngoại lệ Exception là 1 thứ không phải là value để ước lượng
//vậy ko thể assert được
//xài thêm kĩ thuậ bắt ngoại lệ, coingoại lệ giống tình huống mình kì vọng không

    @Test(expected = IllegalArgumentException.class)
    public void testException() {
        cF(-5);
        cF(100);
    }

}
