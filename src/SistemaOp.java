import java.util.Map;

public class SistemaOp {

    public String conseguirOs() {
        String os = System.getProperty("os.name");
        return os;
    }


    public String conseguirVersion() {
        String version = System.getProperty("os.version");
        return version;

    }
//no va
    public String conseguirUsu() {

        String usu = System.getenv("homePath");


        return usu;
    }

    public String conseguirEnv() {

        String envi = System.getenv("PATH");


        return envi;
    }

    public String conseguirLogsDir() {

        String log_dir = System.getenv("log_dir");


        return log_dir;
    }


    public Map muchaInf(){

        Map<String, String> map = System.getenv();
        map.entrySet().forEach(System.out::println);
        return map;

    }

}
