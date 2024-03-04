
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import org.junit.runner.Description;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;
import org.junit.runner.notification.RunListener;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author TUAN
 */
public class MyRunListener extends RunListener{
    private PrintWriter writer;
    @Override
    public void testRunStarted(Description description) throws Exception {
        try {
            String  filePath = "C:\\Users\\TUAN\\OneDrive - VLG\\Desktop\\results.txt";
            writer = new PrintWriter(new FileWriter(filePath));
            writer.println("Bắt đầu chạy kiểm thử \n");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    @Override
    public void testFailure(Failure failure) throws Exception {
        //writer.println("Kiểm thử thất bại: " + failure.getDescription().getDisplayName());
        writer.println("Kiểm thử thất bại: " + failure.getDescription());
        writer.println("Ngoại lệ: " + failure.getException());
        writer.println("--------------------------------------------------------------------");
    }

    @Override
    public void testRunFinished(Result result) throws Exception {
        writer.println("\nKiểm thử kết thúc: " + result.getRunCount() + " kiểm thử đã chạy. " +
                result.getFailureCount() + " kiểm thử thất bại,và " +
                result.getIgnoreCount() + " kiểm thử bỏ qua.");
        writer.close();
    }
}

