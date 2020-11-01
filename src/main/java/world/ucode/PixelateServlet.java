package world.ucode;

import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.*;

@WebServlet("/pixelate")
@MultipartConfig
public class PixelateServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        int pixSize = inputStreamToInt(req.getPart("pix_size").getInputStream());
        InputStream in = Pixelizator.Pixelate(req.getPart("file").getInputStream(), pixSize);

        if (in != null) {
            OutputStream out = resp.getOutputStream();
            byte[] buf = new byte[1024];
            int count;

            while ((count = in.read(buf)) >= 0)
                out.write(buf, 0, count);

            in.close();
            out.close();
        } else {
            resp.getWriter().println("Sorry, your image not uploaded");
        }
    }

    private static int inputStreamToInt(InputStream is) {
        BufferedReader br = null;
        StringBuilder sb = new StringBuilder();

        String line;
        try {
            br = new BufferedReader(new InputStreamReader(is));
            while ((line = br.readLine()) != null) {
                sb.append(line);
            }

        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (br != null) {
                try {
                    br.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

        return Integer.parseInt(sb.toString());
    }
}
