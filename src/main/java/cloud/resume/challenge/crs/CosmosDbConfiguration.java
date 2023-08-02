package cloud.resume.challenge.crs;

import com.azure.cosmos.CosmosClientBuilder;
import com.azure.identity.DefaultAzureCredential;
import com.azure.identity.DefaultAzureCredentialBuilder;
import com.azure.spring.data.cosmos.config.AbstractCosmosConfiguration;
import com.azure.spring.data.cosmos.repository.config.EnableCosmosRepositories;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableCosmosRepositories
public class CosmosDbConfiguration extends AbstractCosmosConfiguration {

    @Bean
    public CosmosClientBuilder getCosmosClientBuilder() {

        DefaultAzureCredential defaultAzureCredential = new DefaultAzureCredentialBuilder()
                .build();

        return new CosmosClientBuilder()
                .endpoint("https://cosmos-try.documents.azure.com:443/")
                .credential(defaultAzureCredential);
    }

    @Override
    protected String getDatabaseName() {
        return "ToDoList";
    }
}
