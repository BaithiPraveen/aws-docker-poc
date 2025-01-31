package pbaithi.aws.docker.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/aws/docker")
public class AwsDockerController {

    @GetMapping("/welcome")
    public String getAwsDocker() {
        return "Welcome to AWS Docker";
    }
}
