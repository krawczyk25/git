package pl.adrian.gitspring.optional;


import java.util.Optional;

public class OptionalExample {

    public static void main(String[] args) {
        Optional<String> maybeNick = findNick();
        if(maybeNick.isPresent()){
            System.out.println(maybeNick.get());
        }

        maybeNick.ifPresent(
                nick -> System.out.println("Mam nick: "+ nick)
        );
    }

    private static Optional<String> findNick(){
        return Optional.empty();
    }

}
