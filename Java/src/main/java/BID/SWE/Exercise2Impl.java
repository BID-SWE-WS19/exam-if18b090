package BID.SWE;

public class Exercise2Impl implements Exercise2
{
    private class CellChild extends Cell{

    }

    private class CellChild2 extends Cell{
        public int Grow(){
            return 2*_size;
        }
    }

    private class CellChild3 extends Cell{
        public boolean IsAlive(int Neighbours){
           if(Neighbours % 2 == 0)
           {
               return true;
           }else {
               return false;
           }
        }
        }

    @Override
    public Object Method1() {
        return new CellChild();
    }

    @Override
    public int Method2() {
        CellChild2 c = new CellChild2();
        int a = c.Grow();
        return a;
    }

    @Override
    public boolean Method3(int i) {
        CellChild3 c = new CellChild3();
        return c.IsAlive();
    }
}
