import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
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
                        .exec("/bin/bash -c  pwd");
                BufferedReader stdInput = new BufferedReader(new
                        InputStreamReader(process.getInputStream()));

                BufferedReader stdError = new BufferedReader(new
                        InputStreamReader(process.getErrorStream()));
                System.out.println("Here is the standard output of the command:\n");
                String s = null;
                while ((s = stdInput.readLine()) != null) {
                    System.out.println(s);
                }
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