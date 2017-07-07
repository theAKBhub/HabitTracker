package data;

import android.provider.BaseColumns;

/**
 * Database schema for HabitTracker
 */

public class HabitsContract {

    /**
     * Empty constructor
     */
    private HabitsContract() {}

    /**
     * Inner class that defines constant values for the habits database table.
     * Each entry in the table represents a single habit tracked on a particular day.
     */
    public static class HabitsEntry implements BaseColumns {

        /** Name of database table */
        public static final String TABLE_NAME = "habits";

        /** Unique ID - Type: INTEGER */
        public final static String _ID = BaseColumns._ID;

        /** Habit Name - Type: TEXT */
        public final static String COLUMN_HABIT_NAME ="habit_name";

        /** Date when the habit has taken place - Type: TEXT */
        public final static String COLUMN_HABIT_DATE ="habit_date_logged";

        /** Duration for which the habit lasted - Type: INTEGER */
        public final static String COLUMN_HABIT_DURATION ="habit_duration";

        /** Duration unit - Type: TEXT */
        public final static String COLUMN_HABIT_DURATION_UNIT ="habit_duration_unit";

        /** Comments - Type: TEXT */
        public final static String COLUMN_HABIT_COMMENTS ="habit_comments";

        /** Achievement Badge - Type: INTEGER */
        public final static String COLUMN_HABIT_BADGE ="habit_badge";


        /**
         * Possible values for duration unit
         */
        public static final String DURATION_SECOND = "sec";
        public static final String DURATION_MINUTE = "min";
        public static final String DURATION_HOUR = "hr";

        /**
         * Returns whether or not the given duration unit is valid
         */
        public static boolean isValidDurationUnit(String unit) {
            if (unit.equals(DURATION_SECOND) || unit.equals(DURATION_MINUTE) || unit.equals(DURATION_HOUR)) {
                return true;
            }
            return false;
        }

        /**
         * Possible values for achievement badge
         */
        public static final int BADGE_BELOW_AVERAGE = 0;
        public static final int BADGE_AVERAGE = 1;
        public static final int BADGE_GOOD = 2;
        public static final int BADGE_EXCELLENT = 3;

        /**
         * Returns whether or not the given badge value is valid
         */
        public static boolean isValidBadge(int badge) {
            if (badge == BADGE_BELOW_AVERAGE || badge == BADGE_AVERAGE || badge == BADGE_GOOD || badge == BADGE_EXCELLENT) {
                return true;
            }
            return false;
        }
    }
}
