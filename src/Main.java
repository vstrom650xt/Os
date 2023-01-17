import java.io.IOException;
import java.util.Map;

public class Main {
    public static void main(String[] args) {

        Process process;
        SistemaOp op = new SistemaOp();
        String   elSistem = op.conseguirOs();
//        System.out.println( op.conseguirVersion());
//        System.out.println( op.conseguirEnv());

        if (elSistem.equals("Linux")){
            try{
                String cmd = "/bin/sh -c pwd ";
                process = Runtime.getRuntime()
                        .exec("/bin/bash -c  x-terminal-emulator > pwd");
            }catch (IOException e){

            }
        }else{
            try{
                String cmd = "cmd.exe /c dir %s";
                Runtime.getRuntime().exec(cmd);
            }catch (IOException e){

            }
        }




    }

}