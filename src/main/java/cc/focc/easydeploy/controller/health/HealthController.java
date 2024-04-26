package cc.focc.easydeploy.controller.health;


import cc.focc.easydeploy.entity.common.CommonRsp;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v1/health")
@Tag(name = "健康检查")
public class HealthController {

    @Operation(summary = "健康检查")
    @GetMapping
    public CommonRsp<String> health() {
        return CommonRsp.ok("health!");
    }

}
