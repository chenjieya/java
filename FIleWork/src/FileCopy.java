import java.io.*;

public class FileCopy {
    private File target;
    private File source;
    private boolean isFile = true;

    public FileCopy(File source, File target, boolean isFile) {
        this.source = source;
        this.target = target;
        this.isFile = isFile;
        this.until();
    }

    private void until() {
        if (this.isFile) {
            this.copyFile();
        } else {
            this.copyDir();
        }
    }

    public boolean copyFile() {
        FileInputStream fs = null;
        FileOutputStream fis = null;

        try {
            fs = new FileInputStream(this.source);
            fis = new FileOutputStream(this.target, true);
            byte[] dataCount = new byte[1024];
            int code = fs.read(dataCount);

            while(code != -1) {
//                String value = new String(dataCount, 0, code);
//                System.out.println(value);
                fis.write(dataCount, 0, code);
                code = fs.read(dataCount);
            }

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            try {
                if (fs != null){
                    fs.close();
                }
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
            try{
                if (fis != null) {
                    fis.close();
                }
            }catch (IOException e) {
                e.printStackTrace();
            }
        }


        return true;
    }

    public boolean copyDir() {
        return true;
    }



}
