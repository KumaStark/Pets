package com.example.android.pets.data;

import android.provider.BaseColumns;

/**
 * Database contract for the Pets app.
 * Storage the string of constants.
 */

public final class PetContract {

    public static final class PetEntry implements BaseColumns {
        public static final String TABLE_NAME = "pets";
        // 貌似在_ID列名称与接口声明一致时可以省略此行
        // public static final String _ID = BaseColumns._ID;
        public static final String COLUMN_PET_NAME = "name";
        public static final String COLUMN_PET_BREED = "breed";
        public static final String COLUMN_PET_GENDER = "gender";
        public static final String COLUMN_PET_WEIGHT = "weight";
        /**
         * 宠物性别变量（0未知、1雄性、2雌性）
         */
        public static final int GENDER_UNKNOWN = 0;
        public static final int GENDER_MALE = 1;
        public static final int GENDER_FEMALE = 2;
    }
}