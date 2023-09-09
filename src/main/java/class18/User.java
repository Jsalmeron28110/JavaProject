package class18;
/*
Write program: User that has a constructor that initializes instance variable name and mobile number. Create a subclass/child class  userInfo that will have user address variable
and it also being initialized through constructor call. Print users name, mobile number and address in userDetails method. Test your code.
 */
public class User {
    String name;
    String number;

    public User(String name, String number) {
        this.name = name;
        this.number = number;
    }
}

    class UserInfo extends User {
        String address;

        public UserInfo(String name, String number, String address) {
            super(name, number);
            this.address = address;
        }

        void UserDetails() {
            System.out.println(name +" "+number+" "+ address);
        }
    }
        class UserTester {
            public static void main(String[] args) {
                UserInfo i = new UserInfo("John", "585-978-5544", "5478 cool drive");
                i.UserDetails();
            }
            }


