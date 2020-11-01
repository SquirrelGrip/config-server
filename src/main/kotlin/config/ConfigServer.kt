package config

import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.cloud.config.server.EnableConfigServer

@SpringBootApplication
@EnableConfigServer
class ConfigServer {
    companion object {
        @JvmStatic
        fun main(args: Array<String>) {
            SpringApplication.run(ConfigServer::class.java, *args)
        }
    }
}