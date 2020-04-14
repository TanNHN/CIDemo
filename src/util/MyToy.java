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
        if (n < 0 || n > 15) 
            throw new IllegalArgumentException("n must be between 0 ... 15 ");
        

        if (n == 0) 
            return 1;
        

        long product = 1;
        for (int i = 1; i <= n; i++) {
            product *= i;
        }
        // phan con lai la hop le
        return product;

    }
}
