package uk.gov.templates.dropwizard.gradle;

import io.dropwizard.Configuration;
import org.hibernate.validator.constraints.NotEmpty;

public class DropwizardTemplateConfiguration extends Configuration {

    @NotEmpty
    private String defaultName = "bob";
}
