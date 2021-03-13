//Your job is to find the gravitational force between two spherical objects (obj1 , obj2).
//
//input
//Two arrays are give :
//
//arr_val (value array), consists of 3 elements
//1st element : mass of obj 1
//2nd element : mass of obj 2
//3rd element : distance between their centers
//arr_unit (unit array), consists of 3 elements
//1st element : unit for mass of obj 1
//2nd element : unit for mass of obj 2
//3rd element : unit for distance between their centers
//mass units are :
//
//kilogram (kg)
//gram (g)
//milligram (mg)
//microgram (μg)
//pound (lb)
//distance units are :
//
//meter (m)
//centimeter (cm)
//millimeter (mm)
//micrometer (μm)
//feet (ft)
//Note
//value of G = 6.67 x 10-11N.kg–2.m2
//
//1ft = 0.3048m
//
//1lb = 0.453592kg
//
//return value must be Newton for force (obviously)
//
//μ copy this from here to use it in your solution

import java.util.*;
public class Solution {
    private final static Double G = 6.67e-11;

    public static double solution(double[] arrVal, String[] arrUnit) {
        Map<String, Double> convertions = new HashMap<>();
        convertions.put("kg", 1.0);
        convertions.put("g", 1e-3);
        convertions.put("mg", 1e-6);
        convertions.put("μg", 1e-9);
        convertions.put("lb", 0.453592);
        convertions.put("m", 1.0);
        convertions.put("cm", 1e-2);
        convertions.put("mm", 1e-3);
        convertions.put("μm", 1e-6);
        convertions.put("ft", 0.3048);

        double m1 = arrVal[0] * convertions.get(arrUnit[0]);
        double m2 = arrVal[1] * convertions.get(arrUnit[1]);
        double r = arrVal[2] * convertions.get(arrUnit[2]);

        return G * m1 * m2 / r / r;
    }

}