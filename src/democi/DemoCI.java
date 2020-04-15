/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package democi;

import util.MyToy;

/**
 *
 * @author Tan
 */
public class DemoCI {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("5!= " + MyToy.cF(5));
        System.out.println("6!= " + MyToy.cF(6));
        System.out.println("0! = " + MyToy.cF(0));//ki vong execption 
        System.out.println("-1! = " + MyToy.cF(-1));//ki vong JVM se giet app
    }

}

//CODE KHÔNG BỊ LỖI CÚ PHÁP, THAM CHIẾU THƯ VIỆN, LUÔN CLEAN AND BUILD ĐƯỢC
//TEST DÙNG MẮT, MÀU, CÂU CHUYỆN LOGIC TRONG CODE, CHỨ KO PHẢI LÀ CÂU CHUYỆN CỦA BUILD JAR
//BUILD HAR, .JAVA -> .CLASS, NÊN .CLASS ->.JAR, .WAR (.RAR)

//NÂNG CAO, NẾU SAI LOGIC, ĐANGĐANG MÀU ĐỎ => ÉO CHA RA .JAR

//JUNIT ĐỀU KẾT HỢP ĐƯỢC VỚI ANT ĐỂ CẤM APP KO DC RA ĐỜI NẾU TESTCASE CÓ MÀY ĐỎ