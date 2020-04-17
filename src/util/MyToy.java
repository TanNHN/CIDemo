/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package util;

/**
 *
 * @author Tan
 */
public class MyToy {
    // bo thu vien xai chung nen se cho no la static

    //cF: compute factorial, tinh n giai thua n!= 1.2.3...n
    public static long cF(int n) {
//        if (n < 0 || n > 15) 
//            throw new IllegalArgumentException("n must be between 0 ... 15 ");
//        

        if (n == 0) 
            return 1;
        return cF(n-1)*n;
//  mình phô diễn kĩ thuật tối ưu code = hồi quy
//  búp bê Nga -> mở con lớn , thấy con nhỏ hơn, mở con nhỏ, ...
//  đệ quy - recursion - gọi lại chính mình ở quy mô nhỏ hơn

//        long product = 1;
//        for (int i = 1; i <= n; i++) {
//            product *= i;
//        }
//        // phan con lai la hop le
//        return product;

    }
}

//mọi đoạn code bạn viết ra phải cố gắng đảm bảo rằng
//nó có chất lượng
//chất lluong75 nghĩa là: hàm trả bề sử lí đúng như mình dự kiến, kì vọng, 
//expected
//vd: tính giai thừa() thì ta đưa vào 5, hy vọng nhận về 120
//vậy ta phải chaun63 bị bộ dữ liệu để test từng hàm, dam03 bảo sử lí đúng
//từng hàm xử lí, lass sử lí dúng
//việc đảm bải cho từng class/module/từng đơn thể/từng hàm chạy như
//dự kiến -> DEV CÓ TRÁCH NHIỆM NÀY, VIỆC NÀY SONG SONG VIÊC CODE
//QUÁ TRÌNH NÀY GỌI LÀ UNIT TESTING
///làm sao test hàm () chạy đúng không
//chuẩn bị data -> đưa data ->gọi hàm -> nhìn kết quả ->so với dự kiến
//nhìn kết quả: mắt(nhìn con số rta3 ra, so với con số mong đợi,
//) nhìn bằng màu, số trả ra màu xong -> OK
//màu đỏ -> không khớp