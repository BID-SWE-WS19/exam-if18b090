package BID.SWE;

import java.io.*;

public class Exercise4Impl implements Exercise4
{

    @Override
    public Object Method1() {
        ByteArrayOutputStream str = new ByteArrayOutputStream();
        DataOutputStream sw = new DataOutputStream(str);

        try {
            sw.writeUTF("Frohe Weihnachten");
            sw.writeInt(42);
            sw.writeBoolean(true);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return new ByteArrayInputStream(str.toByteArray());
    }

    @Override
    public Object Method2(Object o) {
        InputStream str = (InputStream) o;
        DataInputStream sr = new DataInputStream(str);
        try {
            sr.readInt();
            sr.readBoolean();
            return sr.readUTF();
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }

    }
}
