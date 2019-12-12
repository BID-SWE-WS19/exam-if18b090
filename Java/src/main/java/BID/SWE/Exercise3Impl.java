package BID.SWE;

import java.util.Arrays;
import java.util.Map;

public class Exercise3Impl implements Exercise3
{
    //Die Klasse Map wird nicht gefunden

    public class Springen extends Bewegung{
        String Move(int x){
            return null;
        }
    }
    public class Laufen extends Bewegung{
        String Move(int x){
            return null;
        }
    }

    public class Bewegung{
        public String Position(){
            return null;
        }

    }
    @Override
    public Object Method1() {
        return null;
    }

    @Override
    public Object Method2() {

        return Arrays.asList(new Laufen(), new Springen());
    }
}
