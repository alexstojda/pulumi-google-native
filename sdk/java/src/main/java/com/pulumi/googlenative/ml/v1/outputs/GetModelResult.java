// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.ml.v1.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.googlenative.ml.v1.outputs.GoogleCloudMlV1__VersionResponse;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;

@CustomType
public final class GetModelResult {
    /**
     * @return The default version of the model. This version will be used to handle prediction requests that do not specify a version. You can change the default version by calling projects.models.versions.setDefault.
     * 
     */
    private GoogleCloudMlV1__VersionResponse defaultVersion;
    /**
     * @return Optional. The description specified for the model when it was created.
     * 
     */
    private String description;
    /**
     * @return `etag` is used for optimistic concurrency control as a way to help prevent simultaneous updates of a model from overwriting each other. It is strongly suggested that systems make use of the `etag` in the read-modify-write cycle to perform model updates in order to avoid race conditions: An `etag` is returned in the response to `GetModel`, and systems are expected to put that etag in the request to `UpdateModel` to ensure that their change will be applied to the model as intended.
     * 
     */
    private String etag;
    /**
     * @return Optional. One or more labels that you can add, to organize your models. Each label is a key-value pair, where both the key and the value are arbitrary strings that you supply. For more information, see the documentation on using labels. Note that this field is not updatable for mls1* models.
     * 
     */
    private Map<String,String> labels;
    /**
     * @return The name specified for the model when it was created. The model name must be unique within the project it is created in.
     * 
     */
    private String name;
    /**
     * @return Optional. If true, online prediction nodes send `stderr` and `stdout` streams to Cloud Logging. These can be more verbose than the standard access logs (see `onlinePredictionLogging`) and can incur higher cost. However, they are helpful for debugging. Note that [logs may incur a cost](/stackdriver/pricing), especially if your project receives prediction requests at a high QPS. Estimate your costs before enabling this option. Default is false.
     * 
     */
    private Boolean onlinePredictionConsoleLogging;
    /**
     * @return Optional. If true, online prediction access logs are sent to Cloud Logging. These logs are like standard server access logs, containing information like timestamp and latency for each request. Note that [logs may incur a cost](/stackdriver/pricing), especially if your project receives prediction requests at a high queries per second rate (QPS). Estimate your costs before enabling this option. Default is false.
     * 
     */
    private Boolean onlinePredictionLogging;
    /**
     * @return Optional. The list of regions where the model is going to be deployed. Only one region per model is supported. Defaults to &#39;us-central1&#39; if nothing is set. See the available regions for AI Platform services. Note: * No matter where a model is deployed, it can always be accessed by users from anywhere, both for online and batch prediction. * The region for a batch prediction job is set by the region field when submitting the batch prediction job and does not take its value from this field.
     * 
     */
    private List<String> regions;

    private GetModelResult() {}
    /**
     * @return The default version of the model. This version will be used to handle prediction requests that do not specify a version. You can change the default version by calling projects.models.versions.setDefault.
     * 
     */
    public GoogleCloudMlV1__VersionResponse defaultVersion() {
        return this.defaultVersion;
    }
    /**
     * @return Optional. The description specified for the model when it was created.
     * 
     */
    public String description() {
        return this.description;
    }
    /**
     * @return `etag` is used for optimistic concurrency control as a way to help prevent simultaneous updates of a model from overwriting each other. It is strongly suggested that systems make use of the `etag` in the read-modify-write cycle to perform model updates in order to avoid race conditions: An `etag` is returned in the response to `GetModel`, and systems are expected to put that etag in the request to `UpdateModel` to ensure that their change will be applied to the model as intended.
     * 
     */
    public String etag() {
        return this.etag;
    }
    /**
     * @return Optional. One or more labels that you can add, to organize your models. Each label is a key-value pair, where both the key and the value are arbitrary strings that you supply. For more information, see the documentation on using labels. Note that this field is not updatable for mls1* models.
     * 
     */
    public Map<String,String> labels() {
        return this.labels;
    }
    /**
     * @return The name specified for the model when it was created. The model name must be unique within the project it is created in.
     * 
     */
    public String name() {
        return this.name;
    }
    /**
     * @return Optional. If true, online prediction nodes send `stderr` and `stdout` streams to Cloud Logging. These can be more verbose than the standard access logs (see `onlinePredictionLogging`) and can incur higher cost. However, they are helpful for debugging. Note that [logs may incur a cost](/stackdriver/pricing), especially if your project receives prediction requests at a high QPS. Estimate your costs before enabling this option. Default is false.
     * 
     */
    public Boolean onlinePredictionConsoleLogging() {
        return this.onlinePredictionConsoleLogging;
    }
    /**
     * @return Optional. If true, online prediction access logs are sent to Cloud Logging. These logs are like standard server access logs, containing information like timestamp and latency for each request. Note that [logs may incur a cost](/stackdriver/pricing), especially if your project receives prediction requests at a high queries per second rate (QPS). Estimate your costs before enabling this option. Default is false.
     * 
     */
    public Boolean onlinePredictionLogging() {
        return this.onlinePredictionLogging;
    }
    /**
     * @return Optional. The list of regions where the model is going to be deployed. Only one region per model is supported. Defaults to &#39;us-central1&#39; if nothing is set. See the available regions for AI Platform services. Note: * No matter where a model is deployed, it can always be accessed by users from anywhere, both for online and batch prediction. * The region for a batch prediction job is set by the region field when submitting the batch prediction job and does not take its value from this field.
     * 
     */
    public List<String> regions() {
        return this.regions;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetModelResult defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private GoogleCloudMlV1__VersionResponse defaultVersion;
        private String description;
        private String etag;
        private Map<String,String> labels;
        private String name;
        private Boolean onlinePredictionConsoleLogging;
        private Boolean onlinePredictionLogging;
        private List<String> regions;
        public Builder() {}
        public Builder(GetModelResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.defaultVersion = defaults.defaultVersion;
    	      this.description = defaults.description;
    	      this.etag = defaults.etag;
    	      this.labels = defaults.labels;
    	      this.name = defaults.name;
    	      this.onlinePredictionConsoleLogging = defaults.onlinePredictionConsoleLogging;
    	      this.onlinePredictionLogging = defaults.onlinePredictionLogging;
    	      this.regions = defaults.regions;
        }

        @CustomType.Setter
        public Builder defaultVersion(GoogleCloudMlV1__VersionResponse defaultVersion) {
            this.defaultVersion = Objects.requireNonNull(defaultVersion);
            return this;
        }
        @CustomType.Setter
        public Builder description(String description) {
            this.description = Objects.requireNonNull(description);
            return this;
        }
        @CustomType.Setter
        public Builder etag(String etag) {
            this.etag = Objects.requireNonNull(etag);
            return this;
        }
        @CustomType.Setter
        public Builder labels(Map<String,String> labels) {
            this.labels = Objects.requireNonNull(labels);
            return this;
        }
        @CustomType.Setter
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        @CustomType.Setter
        public Builder onlinePredictionConsoleLogging(Boolean onlinePredictionConsoleLogging) {
            this.onlinePredictionConsoleLogging = Objects.requireNonNull(onlinePredictionConsoleLogging);
            return this;
        }
        @CustomType.Setter
        public Builder onlinePredictionLogging(Boolean onlinePredictionLogging) {
            this.onlinePredictionLogging = Objects.requireNonNull(onlinePredictionLogging);
            return this;
        }
        @CustomType.Setter
        public Builder regions(List<String> regions) {
            this.regions = Objects.requireNonNull(regions);
            return this;
        }
        public Builder regions(String... regions) {
            return regions(List.of(regions));
        }
        public GetModelResult build() {
            final var o = new GetModelResult();
            o.defaultVersion = defaultVersion;
            o.description = description;
            o.etag = etag;
            o.labels = labels;
            o.name = name;
            o.onlinePredictionConsoleLogging = onlinePredictionConsoleLogging;
            o.onlinePredictionLogging = onlinePredictionLogging;
            o.regions = regions;
            return o;
        }
    }
}