package io.ingenieux.getmylambdas;

import io.ingenieux.getmylambdas.resources.APIGatewayValidationSub;
import io.ingenieux.getmylambdas.resources.HealthCheckResource;

import io.dropwizard.Application;
import io.dropwizard.setup.Bootstrap;
import io.dropwizard.setup.Environment;

public class Main extends Application<ServiceConfiguration> {

    public static void main(String[] args) throws Exception {
        new Main().run(args);
    }

    @Override
    public String getName() {
        return "get-my-lambdas";
    }

    @Override
    public void initialize(Bootstrap<ServiceConfiguration> bootstrap) {
    }

    @Override
    public void run(ServiceConfiguration cfg,
                    Environment env) throws Exception {
        env.jersey().register(APIGatewayValidationSub.class);
        env.jersey().register(HealthCheckResource.class);
    }
}
