// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.ml.v1.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.googlenative.ml.v1.outputs.GoogleCloudMlV1__AcceleratorConfigResponse;
import com.pulumi.googlenative.ml.v1.outputs.GoogleCloudMlV1__AutoScalingResponse;
import com.pulumi.googlenative.ml.v1.outputs.GoogleCloudMlV1__ContainerSpecResponse;
import com.pulumi.googlenative.ml.v1.outputs.GoogleCloudMlV1__ExplanationConfigResponse;
import com.pulumi.googlenative.ml.v1.outputs.GoogleCloudMlV1__ManualScalingResponse;
import com.pulumi.googlenative.ml.v1.outputs.GoogleCloudMlV1__RequestLoggingConfigResponse;
import com.pulumi.googlenative.ml.v1.outputs.GoogleCloudMlV1__RouteMapResponse;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;

@CustomType
public final class GetVersionResult {
    /**
     * @return Optional. Accelerator config for using GPUs for online prediction (beta). Only specify this field if you have specified a Compute Engine (N1) machine type in the `machineType` field. Learn more about [using GPUs for online prediction](/ml-engine/docs/machine-types-online-prediction#gpus).
     * 
     */
    private GoogleCloudMlV1__AcceleratorConfigResponse acceleratorConfig;
    /**
     * @return Automatically scale the number of nodes used to serve the model in response to increases and decreases in traffic. Care should be taken to ramp up traffic according to the model&#39;s ability to scale or you will start seeing increases in latency and 429 response codes.
     * 
     */
    private GoogleCloudMlV1__AutoScalingResponse autoScaling;
    /**
     * @return Optional. Specifies a custom container to use for serving predictions. If you specify this field, then `machineType` is required. If you specify this field, then `deploymentUri` is optional. If you specify this field, then you must not specify `runtimeVersion`, `packageUris`, `framework`, `pythonVersion`, or `predictionClass`.
     * 
     */
    private GoogleCloudMlV1__ContainerSpecResponse container;
    /**
     * @return The time the version was created.
     * 
     */
    private String createTime;
    /**
     * @return The Cloud Storage URI of a directory containing trained model artifacts to be used to create the model version. See the [guide to deploying models](/ai-platform/prediction/docs/deploying-models) for more information. The total number of files under this directory must not exceed 1000. During projects.models.versions.create, AI Platform Prediction copies all files from the specified directory to a location managed by the service. From then on, AI Platform Prediction uses these copies of the model artifacts to serve predictions, not the original files in Cloud Storage, so this location is useful only as a historical record. If you specify container, then this field is optional. Otherwise, it is required. Learn [how to use this field with a custom container](/ai-platform/prediction/docs/custom-container-requirements#artifacts).
     * 
     */
    private String deploymentUri;
    /**
     * @return Optional. The description specified for the version when it was created.
     * 
     */
    private String description;
    /**
     * @return The details of a failure or a cancellation.
     * 
     */
    private String errorMessage;
    /**
     * @return `etag` is used for optimistic concurrency control as a way to help prevent simultaneous updates of a model from overwriting each other. It is strongly suggested that systems make use of the `etag` in the read-modify-write cycle to perform model updates in order to avoid race conditions: An `etag` is returned in the response to `GetVersion`, and systems are expected to put that etag in the request to `UpdateVersion` to ensure that their change will be applied to the model as intended.
     * 
     */
    private String etag;
    /**
     * @return Optional. Configures explainability features on the model&#39;s version. Some explanation features require additional metadata to be loaded as part of the model payload.
     * 
     */
    private GoogleCloudMlV1__ExplanationConfigResponse explanationConfig;
    /**
     * @return Optional. The machine learning framework AI Platform uses to train this version of the model. Valid values are `TENSORFLOW`, `SCIKIT_LEARN`, `XGBOOST`. If you do not specify a framework, AI Platform will analyze files in the deployment_uri to determine a framework. If you choose `SCIKIT_LEARN` or `XGBOOST`, you must also set the runtime version of the model to 1.4 or greater. Do **not** specify a framework if you&#39;re deploying a [custom prediction routine](/ai-platform/prediction/docs/custom-prediction-routines) or if you&#39;re using a [custom container](/ai-platform/prediction/docs/use-custom-container).
     * 
     */
    private String framework;
    /**
     * @return If true, this version will be used to handle prediction requests that do not specify a version. You can change the default version by calling projects.methods.versions.setDefault.
     * 
     */
    private Boolean isDefault;
    /**
     * @return Optional. One or more labels that you can add, to organize your model versions. Each label is a key-value pair, where both the key and the value are arbitrary strings that you supply. For more information, see the documentation on using labels. Note that this field is not updatable for mls1* models.
     * 
     */
    private Map<String,String> labels;
    /**
     * @return The [AI Platform (Unified) `Model`](https://cloud.google.com/ai-platform-unified/docs/reference/rest/v1beta1/projects.locations.models) ID for the last [model migration](https://cloud.google.com/ai-platform-unified/docs/start/migrating-to-ai-platform-unified).
     * 
     */
    private String lastMigrationModelId;
    /**
     * @return The last time this version was successfully [migrated to AI Platform (Unified)](https://cloud.google.com/ai-platform-unified/docs/start/migrating-to-ai-platform-unified).
     * 
     */
    private String lastMigrationTime;
    /**
     * @return The time the version was last used for prediction.
     * 
     */
    private String lastUseTime;
    /**
     * @return Optional. The type of machine on which to serve the model. Currently only applies to online prediction service. To learn about valid values for this field, read [Choosing a machine type for online prediction](/ai-platform/prediction/docs/machine-types-online-prediction). If this field is not specified and you are using a [regional endpoint](/ai-platform/prediction/docs/regional-endpoints), then the machine type defaults to `n1-standard-2`. If this field is not specified and you are using the global endpoint (`ml.googleapis.com`), then the machine type defaults to `mls1-c1-m2`.
     * 
     */
    private String machineType;
    /**
     * @return Manually select the number of nodes to use for serving the model. You should generally use `auto_scaling` with an appropriate `min_nodes` instead, but this option is available if you want more predictable billing. Beware that latency and error rates will increase if the traffic exceeds that capability of the system to serve it based on the selected number of nodes.
     * 
     */
    private GoogleCloudMlV1__ManualScalingResponse manualScaling;
    /**
     * @return The name specified for the version when it was created. The version name must be unique within the model it is created in.
     * 
     */
    private String name;
    /**
     * @return Optional. Cloud Storage paths (`gs://…`) of packages for [custom prediction routines](/ml-engine/docs/tensorflow/custom-prediction-routines) or [scikit-learn pipelines with custom code](/ml-engine/docs/scikit/exporting-for-prediction#custom-pipeline-code). For a custom prediction routine, one of these packages must contain your Predictor class (see [`predictionClass`](#Version.FIELDS.prediction_class)). Additionally, include any dependencies used by your Predictor or scikit-learn pipeline uses that are not already included in your selected [runtime version](/ml-engine/docs/tensorflow/runtime-version-list). If you specify this field, you must also set [`runtimeVersion`](#Version.FIELDS.runtime_version) to 1.4 or greater.
     * 
     */
    private List<String> packageUris;
    /**
     * @return Optional. The fully qualified name (module_name.class_name) of a class that implements the Predictor interface described in this reference field. The module containing this class should be included in a package provided to the [`packageUris` field](#Version.FIELDS.package_uris). Specify this field if and only if you are deploying a [custom prediction routine (beta)](/ml-engine/docs/tensorflow/custom-prediction-routines). If you specify this field, you must set [`runtimeVersion`](#Version.FIELDS.runtime_version) to 1.4 or greater and you must set `machineType` to a [legacy (MLS1) machine type](/ml-engine/docs/machine-types-online-prediction). The following code sample provides the Predictor interface: class Predictor(object): &#34;&#34;&#34;Interface for constructing custom predictors.&#34;&#34;&#34; def predict(self, instances, **kwargs): &#34;&#34;&#34;Performs custom prediction. Instances are the decoded values from the request. They have already been deserialized from JSON. Args: instances: A list of prediction input instances. **kwargs: A dictionary of keyword args provided as additional fields on the predict request body. Returns: A list of outputs containing the prediction results. This list must be JSON serializable. &#34;&#34;&#34; raise NotImplementedError() @classmethod def from_path(cls, model_dir): &#34;&#34;&#34;Creates an instance of Predictor using the given path. Loading of the predictor should be done in this method. Args: model_dir: The local directory that contains the exported model file along with any additional files uploaded when creating the version resource. Returns: An instance implementing this Predictor class. &#34;&#34;&#34; raise NotImplementedError() Learn more about [the Predictor interface and custom prediction routines](/ml-engine/docs/tensorflow/custom-prediction-routines).
     * 
     */
    private String predictionClass;
    /**
     * @return The version of Python used in prediction. The following Python versions are available: * Python &#39;3.7&#39; is available when `runtime_version` is set to &#39;1.15&#39; or later. * Python &#39;3.5&#39; is available when `runtime_version` is set to a version from &#39;1.4&#39; to &#39;1.14&#39;. * Python &#39;2.7&#39; is available when `runtime_version` is set to &#39;1.15&#39; or earlier. Read more about the Python versions available for [each runtime version](/ml-engine/docs/runtime-version-list).
     * 
     */
    private String pythonVersion;
    /**
     * @return Optional. *Only* specify this field in a projects.models.versions.patch request. Specifying it in a projects.models.versions.create request has no effect. Configures the request-response pair logging on predictions from this Version.
     * 
     */
    private GoogleCloudMlV1__RequestLoggingConfigResponse requestLoggingConfig;
    /**
     * @return Optional. Specifies paths on a custom container&#39;s HTTP server where AI Platform Prediction sends certain requests. If you specify this field, then you must also specify the `container` field. If you specify the `container` field and do not specify this field, it defaults to the following: ``` json { &#34;predict&#34;: &#34;/v1/models/MODEL/versions/VERSION:predict&#34;, &#34;health&#34;: &#34;/v1/models/MODEL/versions/VERSION&#34; }  ``` See RouteMap for more details about these default values.
     * 
     */
    private GoogleCloudMlV1__RouteMapResponse routes;
    /**
     * @return The AI Platform runtime version to use for this deployment. For more information, see the [runtime version list](/ml-engine/docs/runtime-version-list) and [how to manage runtime versions](/ml-engine/docs/versioning).
     * 
     */
    private String runtimeVersion;
    /**
     * @return Optional. Specifies the service account for resource access control. If you specify this field, then you must also specify either the `containerSpec` or the `predictionClass` field. Learn more about [using a custom service account](/ai-platform/prediction/docs/custom-service-account).
     * 
     */
    private String serviceAccount;
    /**
     * @return The state of a version.
     * 
     */
    private String state;

    private GetVersionResult() {}
    /**
     * @return Optional. Accelerator config for using GPUs for online prediction (beta). Only specify this field if you have specified a Compute Engine (N1) machine type in the `machineType` field. Learn more about [using GPUs for online prediction](/ml-engine/docs/machine-types-online-prediction#gpus).
     * 
     */
    public GoogleCloudMlV1__AcceleratorConfigResponse acceleratorConfig() {
        return this.acceleratorConfig;
    }
    /**
     * @return Automatically scale the number of nodes used to serve the model in response to increases and decreases in traffic. Care should be taken to ramp up traffic according to the model&#39;s ability to scale or you will start seeing increases in latency and 429 response codes.
     * 
     */
    public GoogleCloudMlV1__AutoScalingResponse autoScaling() {
        return this.autoScaling;
    }
    /**
     * @return Optional. Specifies a custom container to use for serving predictions. If you specify this field, then `machineType` is required. If you specify this field, then `deploymentUri` is optional. If you specify this field, then you must not specify `runtimeVersion`, `packageUris`, `framework`, `pythonVersion`, or `predictionClass`.
     * 
     */
    public GoogleCloudMlV1__ContainerSpecResponse container() {
        return this.container;
    }
    /**
     * @return The time the version was created.
     * 
     */
    public String createTime() {
        return this.createTime;
    }
    /**
     * @return The Cloud Storage URI of a directory containing trained model artifacts to be used to create the model version. See the [guide to deploying models](/ai-platform/prediction/docs/deploying-models) for more information. The total number of files under this directory must not exceed 1000. During projects.models.versions.create, AI Platform Prediction copies all files from the specified directory to a location managed by the service. From then on, AI Platform Prediction uses these copies of the model artifacts to serve predictions, not the original files in Cloud Storage, so this location is useful only as a historical record. If you specify container, then this field is optional. Otherwise, it is required. Learn [how to use this field with a custom container](/ai-platform/prediction/docs/custom-container-requirements#artifacts).
     * 
     */
    public String deploymentUri() {
        return this.deploymentUri;
    }
    /**
     * @return Optional. The description specified for the version when it was created.
     * 
     */
    public String description() {
        return this.description;
    }
    /**
     * @return The details of a failure or a cancellation.
     * 
     */
    public String errorMessage() {
        return this.errorMessage;
    }
    /**
     * @return `etag` is used for optimistic concurrency control as a way to help prevent simultaneous updates of a model from overwriting each other. It is strongly suggested that systems make use of the `etag` in the read-modify-write cycle to perform model updates in order to avoid race conditions: An `etag` is returned in the response to `GetVersion`, and systems are expected to put that etag in the request to `UpdateVersion` to ensure that their change will be applied to the model as intended.
     * 
     */
    public String etag() {
        return this.etag;
    }
    /**
     * @return Optional. Configures explainability features on the model&#39;s version. Some explanation features require additional metadata to be loaded as part of the model payload.
     * 
     */
    public GoogleCloudMlV1__ExplanationConfigResponse explanationConfig() {
        return this.explanationConfig;
    }
    /**
     * @return Optional. The machine learning framework AI Platform uses to train this version of the model. Valid values are `TENSORFLOW`, `SCIKIT_LEARN`, `XGBOOST`. If you do not specify a framework, AI Platform will analyze files in the deployment_uri to determine a framework. If you choose `SCIKIT_LEARN` or `XGBOOST`, you must also set the runtime version of the model to 1.4 or greater. Do **not** specify a framework if you&#39;re deploying a [custom prediction routine](/ai-platform/prediction/docs/custom-prediction-routines) or if you&#39;re using a [custom container](/ai-platform/prediction/docs/use-custom-container).
     * 
     */
    public String framework() {
        return this.framework;
    }
    /**
     * @return If true, this version will be used to handle prediction requests that do not specify a version. You can change the default version by calling projects.methods.versions.setDefault.
     * 
     */
    public Boolean isDefault() {
        return this.isDefault;
    }
    /**
     * @return Optional. One or more labels that you can add, to organize your model versions. Each label is a key-value pair, where both the key and the value are arbitrary strings that you supply. For more information, see the documentation on using labels. Note that this field is not updatable for mls1* models.
     * 
     */
    public Map<String,String> labels() {
        return this.labels;
    }
    /**
     * @return The [AI Platform (Unified) `Model`](https://cloud.google.com/ai-platform-unified/docs/reference/rest/v1beta1/projects.locations.models) ID for the last [model migration](https://cloud.google.com/ai-platform-unified/docs/start/migrating-to-ai-platform-unified).
     * 
     */
    public String lastMigrationModelId() {
        return this.lastMigrationModelId;
    }
    /**
     * @return The last time this version was successfully [migrated to AI Platform (Unified)](https://cloud.google.com/ai-platform-unified/docs/start/migrating-to-ai-platform-unified).
     * 
     */
    public String lastMigrationTime() {
        return this.lastMigrationTime;
    }
    /**
     * @return The time the version was last used for prediction.
     * 
     */
    public String lastUseTime() {
        return this.lastUseTime;
    }
    /**
     * @return Optional. The type of machine on which to serve the model. Currently only applies to online prediction service. To learn about valid values for this field, read [Choosing a machine type for online prediction](/ai-platform/prediction/docs/machine-types-online-prediction). If this field is not specified and you are using a [regional endpoint](/ai-platform/prediction/docs/regional-endpoints), then the machine type defaults to `n1-standard-2`. If this field is not specified and you are using the global endpoint (`ml.googleapis.com`), then the machine type defaults to `mls1-c1-m2`.
     * 
     */
    public String machineType() {
        return this.machineType;
    }
    /**
     * @return Manually select the number of nodes to use for serving the model. You should generally use `auto_scaling` with an appropriate `min_nodes` instead, but this option is available if you want more predictable billing. Beware that latency and error rates will increase if the traffic exceeds that capability of the system to serve it based on the selected number of nodes.
     * 
     */
    public GoogleCloudMlV1__ManualScalingResponse manualScaling() {
        return this.manualScaling;
    }
    /**
     * @return The name specified for the version when it was created. The version name must be unique within the model it is created in.
     * 
     */
    public String name() {
        return this.name;
    }
    /**
     * @return Optional. Cloud Storage paths (`gs://…`) of packages for [custom prediction routines](/ml-engine/docs/tensorflow/custom-prediction-routines) or [scikit-learn pipelines with custom code](/ml-engine/docs/scikit/exporting-for-prediction#custom-pipeline-code). For a custom prediction routine, one of these packages must contain your Predictor class (see [`predictionClass`](#Version.FIELDS.prediction_class)). Additionally, include any dependencies used by your Predictor or scikit-learn pipeline uses that are not already included in your selected [runtime version](/ml-engine/docs/tensorflow/runtime-version-list). If you specify this field, you must also set [`runtimeVersion`](#Version.FIELDS.runtime_version) to 1.4 or greater.
     * 
     */
    public List<String> packageUris() {
        return this.packageUris;
    }
    /**
     * @return Optional. The fully qualified name (module_name.class_name) of a class that implements the Predictor interface described in this reference field. The module containing this class should be included in a package provided to the [`packageUris` field](#Version.FIELDS.package_uris). Specify this field if and only if you are deploying a [custom prediction routine (beta)](/ml-engine/docs/tensorflow/custom-prediction-routines). If you specify this field, you must set [`runtimeVersion`](#Version.FIELDS.runtime_version) to 1.4 or greater and you must set `machineType` to a [legacy (MLS1) machine type](/ml-engine/docs/machine-types-online-prediction). The following code sample provides the Predictor interface: class Predictor(object): &#34;&#34;&#34;Interface for constructing custom predictors.&#34;&#34;&#34; def predict(self, instances, **kwargs): &#34;&#34;&#34;Performs custom prediction. Instances are the decoded values from the request. They have already been deserialized from JSON. Args: instances: A list of prediction input instances. **kwargs: A dictionary of keyword args provided as additional fields on the predict request body. Returns: A list of outputs containing the prediction results. This list must be JSON serializable. &#34;&#34;&#34; raise NotImplementedError() @classmethod def from_path(cls, model_dir): &#34;&#34;&#34;Creates an instance of Predictor using the given path. Loading of the predictor should be done in this method. Args: model_dir: The local directory that contains the exported model file along with any additional files uploaded when creating the version resource. Returns: An instance implementing this Predictor class. &#34;&#34;&#34; raise NotImplementedError() Learn more about [the Predictor interface and custom prediction routines](/ml-engine/docs/tensorflow/custom-prediction-routines).
     * 
     */
    public String predictionClass() {
        return this.predictionClass;
    }
    /**
     * @return The version of Python used in prediction. The following Python versions are available: * Python &#39;3.7&#39; is available when `runtime_version` is set to &#39;1.15&#39; or later. * Python &#39;3.5&#39; is available when `runtime_version` is set to a version from &#39;1.4&#39; to &#39;1.14&#39;. * Python &#39;2.7&#39; is available when `runtime_version` is set to &#39;1.15&#39; or earlier. Read more about the Python versions available for [each runtime version](/ml-engine/docs/runtime-version-list).
     * 
     */
    public String pythonVersion() {
        return this.pythonVersion;
    }
    /**
     * @return Optional. *Only* specify this field in a projects.models.versions.patch request. Specifying it in a projects.models.versions.create request has no effect. Configures the request-response pair logging on predictions from this Version.
     * 
     */
    public GoogleCloudMlV1__RequestLoggingConfigResponse requestLoggingConfig() {
        return this.requestLoggingConfig;
    }
    /**
     * @return Optional. Specifies paths on a custom container&#39;s HTTP server where AI Platform Prediction sends certain requests. If you specify this field, then you must also specify the `container` field. If you specify the `container` field and do not specify this field, it defaults to the following: ``` json { &#34;predict&#34;: &#34;/v1/models/MODEL/versions/VERSION:predict&#34;, &#34;health&#34;: &#34;/v1/models/MODEL/versions/VERSION&#34; }  ``` See RouteMap for more details about these default values.
     * 
     */
    public GoogleCloudMlV1__RouteMapResponse routes() {
        return this.routes;
    }
    /**
     * @return The AI Platform runtime version to use for this deployment. For more information, see the [runtime version list](/ml-engine/docs/runtime-version-list) and [how to manage runtime versions](/ml-engine/docs/versioning).
     * 
     */
    public String runtimeVersion() {
        return this.runtimeVersion;
    }
    /**
     * @return Optional. Specifies the service account for resource access control. If you specify this field, then you must also specify either the `containerSpec` or the `predictionClass` field. Learn more about [using a custom service account](/ai-platform/prediction/docs/custom-service-account).
     * 
     */
    public String serviceAccount() {
        return this.serviceAccount;
    }
    /**
     * @return The state of a version.
     * 
     */
    public String state() {
        return this.state;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetVersionResult defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private GoogleCloudMlV1__AcceleratorConfigResponse acceleratorConfig;
        private GoogleCloudMlV1__AutoScalingResponse autoScaling;
        private GoogleCloudMlV1__ContainerSpecResponse container;
        private String createTime;
        private String deploymentUri;
        private String description;
        private String errorMessage;
        private String etag;
        private GoogleCloudMlV1__ExplanationConfigResponse explanationConfig;
        private String framework;
        private Boolean isDefault;
        private Map<String,String> labels;
        private String lastMigrationModelId;
        private String lastMigrationTime;
        private String lastUseTime;
        private String machineType;
        private GoogleCloudMlV1__ManualScalingResponse manualScaling;
        private String name;
        private List<String> packageUris;
        private String predictionClass;
        private String pythonVersion;
        private GoogleCloudMlV1__RequestLoggingConfigResponse requestLoggingConfig;
        private GoogleCloudMlV1__RouteMapResponse routes;
        private String runtimeVersion;
        private String serviceAccount;
        private String state;
        public Builder() {}
        public Builder(GetVersionResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.acceleratorConfig = defaults.acceleratorConfig;
    	      this.autoScaling = defaults.autoScaling;
    	      this.container = defaults.container;
    	      this.createTime = defaults.createTime;
    	      this.deploymentUri = defaults.deploymentUri;
    	      this.description = defaults.description;
    	      this.errorMessage = defaults.errorMessage;
    	      this.etag = defaults.etag;
    	      this.explanationConfig = defaults.explanationConfig;
    	      this.framework = defaults.framework;
    	      this.isDefault = defaults.isDefault;
    	      this.labels = defaults.labels;
    	      this.lastMigrationModelId = defaults.lastMigrationModelId;
    	      this.lastMigrationTime = defaults.lastMigrationTime;
    	      this.lastUseTime = defaults.lastUseTime;
    	      this.machineType = defaults.machineType;
    	      this.manualScaling = defaults.manualScaling;
    	      this.name = defaults.name;
    	      this.packageUris = defaults.packageUris;
    	      this.predictionClass = defaults.predictionClass;
    	      this.pythonVersion = defaults.pythonVersion;
    	      this.requestLoggingConfig = defaults.requestLoggingConfig;
    	      this.routes = defaults.routes;
    	      this.runtimeVersion = defaults.runtimeVersion;
    	      this.serviceAccount = defaults.serviceAccount;
    	      this.state = defaults.state;
        }

        @CustomType.Setter
        public Builder acceleratorConfig(GoogleCloudMlV1__AcceleratorConfigResponse acceleratorConfig) {
            this.acceleratorConfig = Objects.requireNonNull(acceleratorConfig);
            return this;
        }
        @CustomType.Setter
        public Builder autoScaling(GoogleCloudMlV1__AutoScalingResponse autoScaling) {
            this.autoScaling = Objects.requireNonNull(autoScaling);
            return this;
        }
        @CustomType.Setter
        public Builder container(GoogleCloudMlV1__ContainerSpecResponse container) {
            this.container = Objects.requireNonNull(container);
            return this;
        }
        @CustomType.Setter
        public Builder createTime(String createTime) {
            this.createTime = Objects.requireNonNull(createTime);
            return this;
        }
        @CustomType.Setter
        public Builder deploymentUri(String deploymentUri) {
            this.deploymentUri = Objects.requireNonNull(deploymentUri);
            return this;
        }
        @CustomType.Setter
        public Builder description(String description) {
            this.description = Objects.requireNonNull(description);
            return this;
        }
        @CustomType.Setter
        public Builder errorMessage(String errorMessage) {
            this.errorMessage = Objects.requireNonNull(errorMessage);
            return this;
        }
        @CustomType.Setter
        public Builder etag(String etag) {
            this.etag = Objects.requireNonNull(etag);
            return this;
        }
        @CustomType.Setter
        public Builder explanationConfig(GoogleCloudMlV1__ExplanationConfigResponse explanationConfig) {
            this.explanationConfig = Objects.requireNonNull(explanationConfig);
            return this;
        }
        @CustomType.Setter
        public Builder framework(String framework) {
            this.framework = Objects.requireNonNull(framework);
            return this;
        }
        @CustomType.Setter
        public Builder isDefault(Boolean isDefault) {
            this.isDefault = Objects.requireNonNull(isDefault);
            return this;
        }
        @CustomType.Setter
        public Builder labels(Map<String,String> labels) {
            this.labels = Objects.requireNonNull(labels);
            return this;
        }
        @CustomType.Setter
        public Builder lastMigrationModelId(String lastMigrationModelId) {
            this.lastMigrationModelId = Objects.requireNonNull(lastMigrationModelId);
            return this;
        }
        @CustomType.Setter
        public Builder lastMigrationTime(String lastMigrationTime) {
            this.lastMigrationTime = Objects.requireNonNull(lastMigrationTime);
            return this;
        }
        @CustomType.Setter
        public Builder lastUseTime(String lastUseTime) {
            this.lastUseTime = Objects.requireNonNull(lastUseTime);
            return this;
        }
        @CustomType.Setter
        public Builder machineType(String machineType) {
            this.machineType = Objects.requireNonNull(machineType);
            return this;
        }
        @CustomType.Setter
        public Builder manualScaling(GoogleCloudMlV1__ManualScalingResponse manualScaling) {
            this.manualScaling = Objects.requireNonNull(manualScaling);
            return this;
        }
        @CustomType.Setter
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        @CustomType.Setter
        public Builder packageUris(List<String> packageUris) {
            this.packageUris = Objects.requireNonNull(packageUris);
            return this;
        }
        public Builder packageUris(String... packageUris) {
            return packageUris(List.of(packageUris));
        }
        @CustomType.Setter
        public Builder predictionClass(String predictionClass) {
            this.predictionClass = Objects.requireNonNull(predictionClass);
            return this;
        }
        @CustomType.Setter
        public Builder pythonVersion(String pythonVersion) {
            this.pythonVersion = Objects.requireNonNull(pythonVersion);
            return this;
        }
        @CustomType.Setter
        public Builder requestLoggingConfig(GoogleCloudMlV1__RequestLoggingConfigResponse requestLoggingConfig) {
            this.requestLoggingConfig = Objects.requireNonNull(requestLoggingConfig);
            return this;
        }
        @CustomType.Setter
        public Builder routes(GoogleCloudMlV1__RouteMapResponse routes) {
            this.routes = Objects.requireNonNull(routes);
            return this;
        }
        @CustomType.Setter
        public Builder runtimeVersion(String runtimeVersion) {
            this.runtimeVersion = Objects.requireNonNull(runtimeVersion);
            return this;
        }
        @CustomType.Setter
        public Builder serviceAccount(String serviceAccount) {
            this.serviceAccount = Objects.requireNonNull(serviceAccount);
            return this;
        }
        @CustomType.Setter
        public Builder state(String state) {
            this.state = Objects.requireNonNull(state);
            return this;
        }
        public GetVersionResult build() {
            final var o = new GetVersionResult();
            o.acceleratorConfig = acceleratorConfig;
            o.autoScaling = autoScaling;
            o.container = container;
            o.createTime = createTime;
            o.deploymentUri = deploymentUri;
            o.description = description;
            o.errorMessage = errorMessage;
            o.etag = etag;
            o.explanationConfig = explanationConfig;
            o.framework = framework;
            o.isDefault = isDefault;
            o.labels = labels;
            o.lastMigrationModelId = lastMigrationModelId;
            o.lastMigrationTime = lastMigrationTime;
            o.lastUseTime = lastUseTime;
            o.machineType = machineType;
            o.manualScaling = manualScaling;
            o.name = name;
            o.packageUris = packageUris;
            o.predictionClass = predictionClass;
            o.pythonVersion = pythonVersion;
            o.requestLoggingConfig = requestLoggingConfig;
            o.routes = routes;
            o.runtimeVersion = runtimeVersion;
            o.serviceAccount = serviceAccount;
            o.state = state;
            return o;
        }
    }
}