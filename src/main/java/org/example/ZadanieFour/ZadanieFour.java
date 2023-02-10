package org.example.ZadanieFour;
public class ZadanieFour {

        public static void main(String[] args) {
             System.out.println(sumBinaryDigits("10","01"));

        }

        public static String sumBinaryDigits(String a, String b) {
if(a.length()<b.length()){
        return sumBinaryDigits(b, a);
}
String res = "";
int k=0;
int j =b.length()-1;
                for (int i = a.length()-1; i>=0; i--) {

                        if(a.charAt(i)=='1'){
                                k++;
                        }
                        if(j>=0 && b.charAt(i)=='1'){
                                k++;
                        }
                        res = k%2 + res;

                        j--;
                        k/=2;
                }
                if(k>1){
                        res = k+res;
                }
                return res;
        }
}
