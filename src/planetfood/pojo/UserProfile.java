package planetfood.pojo;
public class UserProfile {
    private static String username;
    private static String usertype;
    private static String userId;
    public static String getUsertype() {
        return usertype;
    }

    public static String getUserId() {
        return userId;
    }

    public static void setUserId(String userId) {
        UserProfile.userId = userId;
    }
public static void setUsername(String username) {
        UserProfile.username = username;
    }
    public static void setUsertype(String usertype) {
        UserProfile.usertype = usertype;
    }
   public static String getUSername(){
        return username;
    }
}
