package BackEnd;

public class User {

   //region member vars
    private int userID;
    private String Name;
    private int[] borrowedBookID;
    private boolean subscriptionValid;
    //endregion

    //region constructors
    public User(){

    }

    public User(int userID, String name, int[] borrowedBookID, boolean subscriptionValid) {
        this.userID = userID;
        Name = name;
        this.borrowedBookID = borrowedBookID;
        this.subscriptionValid = subscriptionValid;
    }
    //endregion

    //region getters and setters
    public int getUserID() {
        return userID;
    }

    public void setUserID(int userID) {
        this.userID = userID;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public int[] getBorrowedBookID() {
        return borrowedBookID;
    }

    public void setBorrowedBookID(int[] borrowedBookID) {
        this.borrowedBookID = borrowedBookID;
    }

    public boolean isSubscriptionValid() {
        return subscriptionValid;
    }

    public void setSubscriptionValid(boolean subscriptionValid) {
        this.subscriptionValid = subscriptionValid;
    }
    //endregion



}
