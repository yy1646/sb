/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author Y0239881
 */
public enum UserGroup {

    Adult,
    Child;

    public static UserGroup fromInteger(int x) {
        switch (x) {
            case 0:
                return Adult;
            case 1:
                return Child;
        }
        return null;
    }

    public static Integer toInt(UserGroup g) {
        int val = -1;
        
        switch (g) {
            case Adult:
                val = 0;

            case Child:
                val = 1;
        }
        
        return val;
    }
    
}
