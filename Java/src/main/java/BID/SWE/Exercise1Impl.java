package BID.SWE;

import java.util.Date;

public class Exercise1Impl implements Exercise1
{
    private class Ue1 implements CellPrinter{

        @Override
        public String PrintState(boolean b, Date date, String s) {
            b = true;
            if(b){
                return "alive";
            }
            date = new Date();
            String str = "Cell " +s+" born on "+date+" is " + b;
        return str;
        }

        @Override
        public String PrintPostion(int i, int i1) {
            String str = "Cell is on Position X:"+i+ " Y:" + i1;
            return str;
        }
    }
    @Override
    public Object Method1() {

        return new Ue1();
    }
}


