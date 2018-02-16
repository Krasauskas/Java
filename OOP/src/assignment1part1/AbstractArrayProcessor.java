/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment1part1;

import java.util.Arrays;

/**
 *
 * @author childm
 */
public abstract class AbstractArrayProcessor implements ArrayProcessor {

    private final String name;
    private final String description;

    public AbstractArrayProcessor(String name, String description) {
        this.name = name;
        this.description = description;
    }

    public String getName() {
        return this.name;
    }

    public String getDescription() {
        return this.description;
    }

    public String example() {
        double[] a = new double[]{10.0, 20.0, 30.0, 40.0};
        return "The input array " + Arrays.toString(a) + " would return " + Arrays.toString(execute(a));
    }
    
    public String toString() {
        return this.name + ": " + this.description + "\nFor example:\n" + example();
    }
}
