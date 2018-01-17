package Classes;

public class Utility {

    //Constant CHAMP table user
    public static final String TABLE_USER="users";
    public static final String USER_ID="id";
    public static final String USER_NAME="name";
    public static final String USER_PHONE="telef";
    public static final String CREATE8_TABLE_USER="" +
            "CREATE TABLE " + TABLE_USER +" ("
            +USER_ID+" " + "INTEGER, "+USER_NAME+" TEXT,"
            +USER_PHONE+" TEXT)";

    //ConstanT CHAMP table PETS/animaux
    public static final String TABLE_PET="pets";
    public static final String PET_ID="PET_ID";
    public static final String PET_BREED="PET_BREED";
    public static final String PET_NAME="PET_NAME";
    public static final String OWNER_ID="owner_id";
    public static final String CREATE_TABLE_PET="" +
            "CREATE TABLE " + ""+TABLE_PET+" ("
            +PET_ID+" INTEGER PRIMARY KEY AUTOINCREMENT, "
            +PET_NAME+" TEXT, "
            +PET_BREED+" TEXT,"
            +OWNER_ID+" INTEGER)";

}