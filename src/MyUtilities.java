public class MyUtilities {

         public static final int CUTOVER_YEAR = 1582;

         public static boolean isLeapYear1(int year) {
         if (year <= CUTOVER_YEAR && year % 4 == 0) return true;
         if (year % 400 == 0) return true;
         return year % 4 == 0 && year % 100 != 0;
         }

         public static boolean isLeapYear2(int year) {
         return year % 4 == 0 && (year <= CUTOVER_YEAR ||
                 year % 100 != 0 || year % 400 == 0);
         }

         public static boolean isLeapYear3(int year) {
         boolean beforeCutover = year <= CUTOVER_YEAR;
         boolean every4Years = year % 4 == 0;
         boolean every100Years = year % 100 == 0;
         boolean every400Years = year % 400 == 0;
         return every4Years && (beforeCutover || !every100Years || every400Years);
         }
 }