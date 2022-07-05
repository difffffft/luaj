import org.junit.Test;
import org.luaj.Globals;
import org.luaj.LuaValue;
import org.luaj.lib.jse.JsePlatform;

import java.io.InputStream;
import java.io.InputStreamReader;


public class Main {
    @Test
    public void main() {
        InputStream inputStream = this.getClass().getClassLoader().getResourceAsStream("main.lua");
        Globals globals = JsePlatform.standardGlobals();
        LuaValue luachuck = globals.load(new InputStreamReader(inputStream), "chunkname").call();
    }
}