// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.datacatalog.v1.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.googlenative.datacatalog.v1.outputs.GoogleCloudDatacatalogV1BigQueryRoutineSpecResponse;
import com.pulumi.googlenative.datacatalog.v1.outputs.GoogleCloudDatacatalogV1RoutineSpecArgumentResponse;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class GoogleCloudDatacatalogV1RoutineSpecResponse {
    /**
     * @return Fields specific for BigQuery routines.
     * 
     */
    private GoogleCloudDatacatalogV1BigQueryRoutineSpecResponse bigqueryRoutineSpec;
    /**
     * @return The body of the routine.
     * 
     */
    private String definitionBody;
    /**
     * @return The language the routine is written in. The exact value depends on the source system. For BigQuery routines, possible values are: * `SQL` * `JAVASCRIPT`
     * 
     */
    private String language;
    /**
     * @return Return type of the argument. The exact value depends on the source system and the language.
     * 
     */
    private String returnType;
    /**
     * @return Arguments of the routine.
     * 
     */
    private List<GoogleCloudDatacatalogV1RoutineSpecArgumentResponse> routineArguments;
    /**
     * @return The type of the routine.
     * 
     */
    private String routineType;

    private GoogleCloudDatacatalogV1RoutineSpecResponse() {}
    /**
     * @return Fields specific for BigQuery routines.
     * 
     */
    public GoogleCloudDatacatalogV1BigQueryRoutineSpecResponse bigqueryRoutineSpec() {
        return this.bigqueryRoutineSpec;
    }
    /**
     * @return The body of the routine.
     * 
     */
    public String definitionBody() {
        return this.definitionBody;
    }
    /**
     * @return The language the routine is written in. The exact value depends on the source system. For BigQuery routines, possible values are: * `SQL` * `JAVASCRIPT`
     * 
     */
    public String language() {
        return this.language;
    }
    /**
     * @return Return type of the argument. The exact value depends on the source system and the language.
     * 
     */
    public String returnType() {
        return this.returnType;
    }
    /**
     * @return Arguments of the routine.
     * 
     */
    public List<GoogleCloudDatacatalogV1RoutineSpecArgumentResponse> routineArguments() {
        return this.routineArguments;
    }
    /**
     * @return The type of the routine.
     * 
     */
    public String routineType() {
        return this.routineType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GoogleCloudDatacatalogV1RoutineSpecResponse defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private GoogleCloudDatacatalogV1BigQueryRoutineSpecResponse bigqueryRoutineSpec;
        private String definitionBody;
        private String language;
        private String returnType;
        private List<GoogleCloudDatacatalogV1RoutineSpecArgumentResponse> routineArguments;
        private String routineType;
        public Builder() {}
        public Builder(GoogleCloudDatacatalogV1RoutineSpecResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.bigqueryRoutineSpec = defaults.bigqueryRoutineSpec;
    	      this.definitionBody = defaults.definitionBody;
    	      this.language = defaults.language;
    	      this.returnType = defaults.returnType;
    	      this.routineArguments = defaults.routineArguments;
    	      this.routineType = defaults.routineType;
        }

        @CustomType.Setter
        public Builder bigqueryRoutineSpec(GoogleCloudDatacatalogV1BigQueryRoutineSpecResponse bigqueryRoutineSpec) {
            this.bigqueryRoutineSpec = Objects.requireNonNull(bigqueryRoutineSpec);
            return this;
        }
        @CustomType.Setter
        public Builder definitionBody(String definitionBody) {
            this.definitionBody = Objects.requireNonNull(definitionBody);
            return this;
        }
        @CustomType.Setter
        public Builder language(String language) {
            this.language = Objects.requireNonNull(language);
            return this;
        }
        @CustomType.Setter
        public Builder returnType(String returnType) {
            this.returnType = Objects.requireNonNull(returnType);
            return this;
        }
        @CustomType.Setter
        public Builder routineArguments(List<GoogleCloudDatacatalogV1RoutineSpecArgumentResponse> routineArguments) {
            this.routineArguments = Objects.requireNonNull(routineArguments);
            return this;
        }
        public Builder routineArguments(GoogleCloudDatacatalogV1RoutineSpecArgumentResponse... routineArguments) {
            return routineArguments(List.of(routineArguments));
        }
        @CustomType.Setter
        public Builder routineType(String routineType) {
            this.routineType = Objects.requireNonNull(routineType);
            return this;
        }
        public GoogleCloudDatacatalogV1RoutineSpecResponse build() {
            final var o = new GoogleCloudDatacatalogV1RoutineSpecResponse();
            o.bigqueryRoutineSpec = bigqueryRoutineSpec;
            o.definitionBody = definitionBody;
            o.language = language;
            o.returnType = returnType;
            o.routineArguments = routineArguments;
            o.routineType = routineType;
            return o;
        }
    }
}