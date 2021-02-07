package exam.topic6

import org.springframework.boot.builder.SpringApplicationBuilder
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer

class ServletInitializer : SpringBootServletInitializer() {

    override fun configure(springApplicationBuilder: SpringApplicationBuilder): SpringApplicationBuilder {
        return springApplicationBuilder.sources(App::class.java)
    }
}