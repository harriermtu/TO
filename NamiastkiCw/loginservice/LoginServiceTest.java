package loginservice;

import junit.framework.TestCase;

import static org.easymock.EasyMock.*;

public class LoginServiceTest extends TestCase {

    public void testMockLoginSuccess() throws Exception {
        UserDataBase userDataBase = createMock(UserDataBase.class);
        Encoder encoder = createMock(Encoder.class);

        LoginService loginService = new LoginService(userDataBase,encoder);

        //to akurat mozna testowac wprost
        //powinno byc false, bo userName = null
        assertEquals(false, loginService.login(null, "asd"));
        //powinno byc false, bo password = null
        assertEquals(false,loginService.login("asd",null));
        //powinno byc false, bo password i userName jest null
        assertEquals(false,loginService.login(null,null));

        //baza danych, logujemy udanie, connection na true
        checkOrder(userDataBase,true);
        User user = new User("user1","surUser1");
        expect(userDataBase.isConnected()).andReturn(true);
        expect(encoder.encode("password")).andReturn("hashcode").times(2);
        replay(encoder);
        String hashPass = encoder.encode("password");
        expect(userDataBase.getUserByLoginAndPassword(user.name,hashPass)).andReturn(user);
        replay(userDataBase);
        assertEquals(true,loginService.login(user.name,"password"));

    }

    public void testMockLoginFails() throws Exception {
        UserDataBase userDataBase = createMock(UserDataBase.class);
        Encoder encoder = createMock(Encoder.class);

        LoginService loginService = new LoginService(userDataBase, encoder);

        //baza danych, logujemy nieudanie, connection na true
        checkOrder(userDataBase,true);
        User user = new User("user1","surUser1");
        expect(userDataBase.isConnected()).andReturn(true);
        expect(encoder.encode("password")).andReturn("hashcode").times(2);
        replay(encoder);
        String hashPass = encoder.encode("password");
        expect(userDataBase.getUserByLoginAndPassword(user.name,hashPass)).andReturn(null);
        replay(userDataBase);
        assertEquals(false,loginService.login(user.name,"password"));
    }

    public void testMockLoginRuntimeExept() throws Exception {
        UserDataBase userDataBase = createMock(UserDataBase.class);
        Encoder encoder = createMock(Encoder.class);

        LoginService loginService = new LoginService(userDataBase, encoder);

        expect(userDataBase.isConnected()).andReturn(false);
        expect(encoder.encode("password")).andReturn("hashcode").times(2);
        replay(encoder);
        String hashPass = encoder.encode("password");
        expect(userDataBase.getUserByLoginAndPassword("aaa",hashPass)).andReturn(new User("a","b"));

        userDataBase.connect();
        expectLastCall().andThrow(new RuntimeException());

        replay(userDataBase);

        try {
            loginService.login("aaa", "password");
            fail("Tutaj powinien byc rzucony wyjatek.");
        }
        catch (RuntimeException e){

        }
    }
}