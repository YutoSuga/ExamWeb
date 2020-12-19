package util;

/**
 * Utilityメソッドをまとめたクラス
 */
public class ParamUtil {

    /**
     * 引数に指定した文字列がnull、または空文字かを判定
     */
    public static boolean isNullOrEmpty(String str) {
        if (str == null || str.isEmpty()) {
            return true;
        } else {
            return false;
        }
    }

    /**
     * 引数に指定した文字列が数値に変換できるかを判定
     */
    public static boolean isNumber(String str) {
        try {
            Integer.parseInt(str);
        } catch (NumberFormatException ex) {
            return false;
        }

        return true;
    }

    /**
     * 引数に指定した文字列が数値に変換して返却する。 変換できない場合はnullを返却する。
     */
    public static Integer checkAndParseInt(String str) {
        if (isNumber(str)) {
            return Integer.parseInt(str);
        } else {
            return null;
        }
    }

    /**
     * 引数に指定したセッションオブジェクトから、SessionInfoオブジェクトを取得する。
     * セッションに保存されていない場合は、SessionInfoオブジェクトを新規作成する。
     */
//    public static SessionInfo getSessionInfo(HttpSession session) {
//        SessionInfo sessionInfo = (SessionInfo) session.getAttribute("sessionInfo");
//
//        if (sessionInfo == null) {
//            return new SessionInfo();
//        } else {
//            return sessionInfo;
//        }
//    }

    /**
     * 第1引数に指定したrole_idに対応するrole_nameを第2引数から検索する。
     * 該当するデータがあればrole_nameを変革する。無ければEmptyを返却する。
     */
//    public static String getRoleNameByRoleId(Integer targetRoleId, List<Role> roleList) {
//        // ロール名取得
//        for (Role role : roleList) {
//            if (role.getRoleId() == targetRoleId) {
//                return role.getRoleName();
//            }
//        }
//
//        return "";
//    }

    /**
     * Timestamp型の値をyyyy/MM/DDの形に編集して返却する。
     */
//    public static String timestampToString(Timestamp tmSp) {
//        if (tmSp != null) {
//            SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd");
//            String str = sdf.format(tmSp);
//            return str;
//        } else {
//            return null;
//        }
//    }

    /**
     * String配列型をInteger配列型にして返却する。
     */
//    public static Integer[] stringsToIntegers(String[] strs) {
//        if (strs != null) {
//            // 返却用変数用意
//            Integer[] nums = new Integer[strs.length];
//
//            // 対象の文字列を数値に変換してセットする
//            int count = 0;
//            for (String str : strs) {
//                nums[count] = checkAndParseInt(str);
//                count++;
//            }
//
//            return nums;
//        } else {
//            return null;
//        }
//    }
}
