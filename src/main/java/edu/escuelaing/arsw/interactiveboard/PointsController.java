package edu.escuelaing.arsw.interactiveboard;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

/**
 *
 * @author M.A.R.S
 */
public class PointsController 
{
    @PostMapping("/points")
    public String processPoints (@RequestBody String points)
    {
        System.out.println("payload: " + points);
        return points;
    }
}
