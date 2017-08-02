package uk.gov.templates.dropwizard.gradle;

import io.dropwizard.Application;
import io.dropwizard.setup.Bootstrap;
import io.dropwizard.setup.Environment;
import uk.gov.templates.dropwizard.gradle.resources.HelloWorldResource;

public class DropwizardTemplateApplication extends Application<DropwizardTemplateConfiguration> {
    public static void main(String[] args) throws Exception {
        new DropwizardTemplateApplication().run(args);
    }

    @Override
    public String getName() {
        return "dropwizardTemplate";
    }


    @Override
    public void initialize(Bootstrap<DropwizardTemplateConfiguration> bootstrap) {
        // nothing to do yet
    }

    @Override
    public void run(DropwizardTemplateConfiguration configuration, Environment environment) throws Exception {
            environment.jersey().register(new HelloWorldResource());
    }
}
