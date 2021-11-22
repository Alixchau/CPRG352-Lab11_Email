package utilities;

import javax.servlet.http.*;

public class CookieUtil {

    public static String getCookieValue(//loop through the cookies and find the one that matches
            Cookie[] cookies, String cookieName) {

        String cookieValue = "";
        if (cookies != null) {
            for (Cookie cookie : cookies) {
                if (cookieName.equals(cookie.getName())) {
                    cookieValue = cookie.getValue();
                }
            }
        }
        return cookieValue;
    }
}