package section15.aula04boa;

public class DomainException extends Exception {
    // RuntimeException não obriga a a tratar
    // Exception compilador obriga a tratar

    public DomainException(String msg) {
        super(msg);
    }

}
