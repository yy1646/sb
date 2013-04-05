/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

/**
 *
 * @author Y0239881
 */
public class XpathBuilder {

    /**
     * Combine node names to be the complete path
     *
     * @param nodeNames
     * @return /path/to/node
     */
    public static String BuildPath(String[] nodeNames) {
        StringBuilder sb = new StringBuilder();

        for (String node : nodeNames) {
            sb.append("/" + node);
        }

        return sb.toString();
    }

    /**
     * Generate xpath query to get a node by a specific value of an attribute
     *
     * @param nodeName
     * @param attName
     * @param value
     * @return
     */
    public static String GetElementByAttNameAndValue(String nodeName, String attName, String value) {
        StringBuilder sb = new StringBuilder();
        sb.append("//");
        sb.append(nodeName);
        sb.append("[@" + attName);
        sb.append("='" + value + "']");

        return sb.toString();
    }
}
