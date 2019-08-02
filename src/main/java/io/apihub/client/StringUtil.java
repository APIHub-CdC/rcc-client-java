

package io.apihub.client;
@javax.annotation.Generated(value = "io.apihub.codegen.languages.JavaClientCodegen", date = "2019-08-01T16:44:21.339Z")
public class StringUtil {
  
  public static boolean containsIgnoreCase(String[] array, String value) {
    for (String str : array) {
      if (value == null && str == null) return true;
      if (value != null && value.equalsIgnoreCase(str)) return true;
    }
    return false;
  }
  
  public static String join(String[] array, String separator) {
    int len = array.length;
    if (len == 0) return "";
    StringBuilder out = new StringBuilder();
    out.append(array[0]);
    for (int i = 1; i < len; i++) {
      out.append(separator).append(array[i]);
    }
    return out.toString();
  }
}
