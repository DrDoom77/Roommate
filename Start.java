import Login.Login;
import User.Landlord;
import User.Tenant;

public class Start {

    public static void main(String[] args) {

        Landlord[] blankc = new Landlord[1];
        Tenant[] blankd = new Tenant[100];

        new Login(blankd, blankc);
    }
}
