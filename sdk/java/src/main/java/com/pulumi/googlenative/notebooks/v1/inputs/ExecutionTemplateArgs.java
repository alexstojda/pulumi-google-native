// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.notebooks.v1.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.googlenative.notebooks.v1.enums.ExecutionTemplateJobType;
import com.pulumi.googlenative.notebooks.v1.enums.ExecutionTemplateScaleTier;
import com.pulumi.googlenative.notebooks.v1.inputs.DataprocParametersArgs;
import com.pulumi.googlenative.notebooks.v1.inputs.SchedulerAcceleratorConfigArgs;
import com.pulumi.googlenative.notebooks.v1.inputs.VertexAIParametersArgs;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * The description a notebook execution workload.
 * 
 */
public final class ExecutionTemplateArgs extends com.pulumi.resources.ResourceArgs {

    public static final ExecutionTemplateArgs Empty = new ExecutionTemplateArgs();

    /**
     * Configuration (count and accelerator type) for hardware running notebook execution.
     * 
     */
    @Import(name="acceleratorConfig")
    private @Nullable Output<SchedulerAcceleratorConfigArgs> acceleratorConfig;

    /**
     * @return Configuration (count and accelerator type) for hardware running notebook execution.
     * 
     */
    public Optional<Output<SchedulerAcceleratorConfigArgs>> acceleratorConfig() {
        return Optional.ofNullable(this.acceleratorConfig);
    }

    /**
     * Container Image URI to a DLVM Example: &#39;gcr.io/deeplearning-platform-release/base-cu100&#39; More examples can be found at: https://cloud.google.com/ai-platform/deep-learning-containers/docs/choosing-container
     * 
     */
    @Import(name="containerImageUri")
    private @Nullable Output<String> containerImageUri;

    /**
     * @return Container Image URI to a DLVM Example: &#39;gcr.io/deeplearning-platform-release/base-cu100&#39; More examples can be found at: https://cloud.google.com/ai-platform/deep-learning-containers/docs/choosing-container
     * 
     */
    public Optional<Output<String>> containerImageUri() {
        return Optional.ofNullable(this.containerImageUri);
    }

    /**
     * Parameters used in Dataproc JobType executions.
     * 
     */
    @Import(name="dataprocParameters")
    private @Nullable Output<DataprocParametersArgs> dataprocParameters;

    /**
     * @return Parameters used in Dataproc JobType executions.
     * 
     */
    public Optional<Output<DataprocParametersArgs>> dataprocParameters() {
        return Optional.ofNullable(this.dataprocParameters);
    }

    /**
     * Path to the notebook file to execute. Must be in a Google Cloud Storage bucket. Format: `gs://{bucket_name}/{folder}/{notebook_file_name}` Ex: `gs://notebook_user/scheduled_notebooks/sentiment_notebook.ipynb`
     * 
     */
    @Import(name="inputNotebookFile")
    private @Nullable Output<String> inputNotebookFile;

    /**
     * @return Path to the notebook file to execute. Must be in a Google Cloud Storage bucket. Format: `gs://{bucket_name}/{folder}/{notebook_file_name}` Ex: `gs://notebook_user/scheduled_notebooks/sentiment_notebook.ipynb`
     * 
     */
    public Optional<Output<String>> inputNotebookFile() {
        return Optional.ofNullable(this.inputNotebookFile);
    }

    /**
     * The type of Job to be used on this execution.
     * 
     */
    @Import(name="jobType")
    private @Nullable Output<ExecutionTemplateJobType> jobType;

    /**
     * @return The type of Job to be used on this execution.
     * 
     */
    public Optional<Output<ExecutionTemplateJobType>> jobType() {
        return Optional.ofNullable(this.jobType);
    }

    /**
     * Name of the kernel spec to use. This must be specified if the kernel spec name on the execution target does not match the name in the input notebook file.
     * 
     */
    @Import(name="kernelSpec")
    private @Nullable Output<String> kernelSpec;

    /**
     * @return Name of the kernel spec to use. This must be specified if the kernel spec name on the execution target does not match the name in the input notebook file.
     * 
     */
    public Optional<Output<String>> kernelSpec() {
        return Optional.ofNullable(this.kernelSpec);
    }

    /**
     * Labels for execution. If execution is scheduled, a field included will be &#39;nbs-scheduled&#39;. Otherwise, it is an immediate execution, and an included field will be &#39;nbs-immediate&#39;. Use fields to efficiently index between various types of executions.
     * 
     */
    @Import(name="labels")
    private @Nullable Output<Map<String,String>> labels;

    /**
     * @return Labels for execution. If execution is scheduled, a field included will be &#39;nbs-scheduled&#39;. Otherwise, it is an immediate execution, and an included field will be &#39;nbs-immediate&#39;. Use fields to efficiently index between various types of executions.
     * 
     */
    public Optional<Output<Map<String,String>>> labels() {
        return Optional.ofNullable(this.labels);
    }

    /**
     * Specifies the type of virtual machine to use for your training job&#39;s master worker. You must specify this field when `scaleTier` is set to `CUSTOM`. You can use certain Compute Engine machine types directly in this field. The following types are supported: - `n1-standard-4` - `n1-standard-8` - `n1-standard-16` - `n1-standard-32` - `n1-standard-64` - `n1-standard-96` - `n1-highmem-2` - `n1-highmem-4` - `n1-highmem-8` - `n1-highmem-16` - `n1-highmem-32` - `n1-highmem-64` - `n1-highmem-96` - `n1-highcpu-16` - `n1-highcpu-32` - `n1-highcpu-64` - `n1-highcpu-96` Alternatively, you can use the following legacy machine types: - `standard` - `large_model` - `complex_model_s` - `complex_model_m` - `complex_model_l` - `standard_gpu` - `complex_model_m_gpu` - `complex_model_l_gpu` - `standard_p100` - `complex_model_m_p100` - `standard_v100` - `large_model_v100` - `complex_model_m_v100` - `complex_model_l_v100` Finally, if you want to use a TPU for training, specify `cloud_tpu` in this field. Learn more about the [special configuration options for training with TPU](https://cloud.google.com/ai-platform/training/docs/using-tpus#configuring_a_custom_tpu_machine).
     * 
     */
    @Import(name="masterType")
    private @Nullable Output<String> masterType;

    /**
     * @return Specifies the type of virtual machine to use for your training job&#39;s master worker. You must specify this field when `scaleTier` is set to `CUSTOM`. You can use certain Compute Engine machine types directly in this field. The following types are supported: - `n1-standard-4` - `n1-standard-8` - `n1-standard-16` - `n1-standard-32` - `n1-standard-64` - `n1-standard-96` - `n1-highmem-2` - `n1-highmem-4` - `n1-highmem-8` - `n1-highmem-16` - `n1-highmem-32` - `n1-highmem-64` - `n1-highmem-96` - `n1-highcpu-16` - `n1-highcpu-32` - `n1-highcpu-64` - `n1-highcpu-96` Alternatively, you can use the following legacy machine types: - `standard` - `large_model` - `complex_model_s` - `complex_model_m` - `complex_model_l` - `standard_gpu` - `complex_model_m_gpu` - `complex_model_l_gpu` - `standard_p100` - `complex_model_m_p100` - `standard_v100` - `large_model_v100` - `complex_model_m_v100` - `complex_model_l_v100` Finally, if you want to use a TPU for training, specify `cloud_tpu` in this field. Learn more about the [special configuration options for training with TPU](https://cloud.google.com/ai-platform/training/docs/using-tpus#configuring_a_custom_tpu_machine).
     * 
     */
    public Optional<Output<String>> masterType() {
        return Optional.ofNullable(this.masterType);
    }

    /**
     * Path to the notebook folder to write to. Must be in a Google Cloud Storage bucket path. Format: `gs://{bucket_name}/{folder}` Ex: `gs://notebook_user/scheduled_notebooks`
     * 
     */
    @Import(name="outputNotebookFolder")
    private @Nullable Output<String> outputNotebookFolder;

    /**
     * @return Path to the notebook folder to write to. Must be in a Google Cloud Storage bucket path. Format: `gs://{bucket_name}/{folder}` Ex: `gs://notebook_user/scheduled_notebooks`
     * 
     */
    public Optional<Output<String>> outputNotebookFolder() {
        return Optional.ofNullable(this.outputNotebookFolder);
    }

    /**
     * Parameters used within the &#39;input_notebook_file&#39; notebook.
     * 
     */
    @Import(name="parameters")
    private @Nullable Output<String> parameters;

    /**
     * @return Parameters used within the &#39;input_notebook_file&#39; notebook.
     * 
     */
    public Optional<Output<String>> parameters() {
        return Optional.ofNullable(this.parameters);
    }

    /**
     * Parameters to be overridden in the notebook during execution. Ref https://papermill.readthedocs.io/en/latest/usage-parameterize.html on how to specifying parameters in the input notebook and pass them here in an YAML file. Ex: `gs://notebook_user/scheduled_notebooks/sentiment_notebook_params.yaml`
     * 
     */
    @Import(name="paramsYamlFile")
    private @Nullable Output<String> paramsYamlFile;

    /**
     * @return Parameters to be overridden in the notebook during execution. Ref https://papermill.readthedocs.io/en/latest/usage-parameterize.html on how to specifying parameters in the input notebook and pass them here in an YAML file. Ex: `gs://notebook_user/scheduled_notebooks/sentiment_notebook_params.yaml`
     * 
     */
    public Optional<Output<String>> paramsYamlFile() {
        return Optional.ofNullable(this.paramsYamlFile);
    }

    /**
     * Scale tier of the hardware used for notebook execution. DEPRECATED Will be discontinued. As right now only CUSTOM is supported.
     * 
     * @deprecated
     * Required. Scale tier of the hardware used for notebook execution. DEPRECATED Will be discontinued. As right now only CUSTOM is supported.
     * 
     */
    @Deprecated /* Required. Scale tier of the hardware used for notebook execution. DEPRECATED Will be discontinued. As right now only CUSTOM is supported. */
    @Import(name="scaleTier", required=true)
    private Output<ExecutionTemplateScaleTier> scaleTier;

    /**
     * @return Scale tier of the hardware used for notebook execution. DEPRECATED Will be discontinued. As right now only CUSTOM is supported.
     * 
     * @deprecated
     * Required. Scale tier of the hardware used for notebook execution. DEPRECATED Will be discontinued. As right now only CUSTOM is supported.
     * 
     */
    @Deprecated /* Required. Scale tier of the hardware used for notebook execution. DEPRECATED Will be discontinued. As right now only CUSTOM is supported. */
    public Output<ExecutionTemplateScaleTier> scaleTier() {
        return this.scaleTier;
    }

    /**
     * The email address of a service account to use when running the execution. You must have the `iam.serviceAccounts.actAs` permission for the specified service account.
     * 
     */
    @Import(name="serviceAccount")
    private @Nullable Output<String> serviceAccount;

    /**
     * @return The email address of a service account to use when running the execution. You must have the `iam.serviceAccounts.actAs` permission for the specified service account.
     * 
     */
    public Optional<Output<String>> serviceAccount() {
        return Optional.ofNullable(this.serviceAccount);
    }

    /**
     * The name of a Vertex AI [Tensorboard] resource to which this execution will upload Tensorboard logs. Format: `projects/{project}/locations/{location}/tensorboards/{tensorboard}`
     * 
     */
    @Import(name="tensorboard")
    private @Nullable Output<String> tensorboard;

    /**
     * @return The name of a Vertex AI [Tensorboard] resource to which this execution will upload Tensorboard logs. Format: `projects/{project}/locations/{location}/tensorboards/{tensorboard}`
     * 
     */
    public Optional<Output<String>> tensorboard() {
        return Optional.ofNullable(this.tensorboard);
    }

    /**
     * Parameters used in Vertex AI JobType executions.
     * 
     */
    @Import(name="vertexAiParameters")
    private @Nullable Output<VertexAIParametersArgs> vertexAiParameters;

    /**
     * @return Parameters used in Vertex AI JobType executions.
     * 
     */
    public Optional<Output<VertexAIParametersArgs>> vertexAiParameters() {
        return Optional.ofNullable(this.vertexAiParameters);
    }

    private ExecutionTemplateArgs() {}

    private ExecutionTemplateArgs(ExecutionTemplateArgs $) {
        this.acceleratorConfig = $.acceleratorConfig;
        this.containerImageUri = $.containerImageUri;
        this.dataprocParameters = $.dataprocParameters;
        this.inputNotebookFile = $.inputNotebookFile;
        this.jobType = $.jobType;
        this.kernelSpec = $.kernelSpec;
        this.labels = $.labels;
        this.masterType = $.masterType;
        this.outputNotebookFolder = $.outputNotebookFolder;
        this.parameters = $.parameters;
        this.paramsYamlFile = $.paramsYamlFile;
        this.scaleTier = $.scaleTier;
        this.serviceAccount = $.serviceAccount;
        this.tensorboard = $.tensorboard;
        this.vertexAiParameters = $.vertexAiParameters;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ExecutionTemplateArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ExecutionTemplateArgs $;

        public Builder() {
            $ = new ExecutionTemplateArgs();
        }

        public Builder(ExecutionTemplateArgs defaults) {
            $ = new ExecutionTemplateArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param acceleratorConfig Configuration (count and accelerator type) for hardware running notebook execution.
         * 
         * @return builder
         * 
         */
        public Builder acceleratorConfig(@Nullable Output<SchedulerAcceleratorConfigArgs> acceleratorConfig) {
            $.acceleratorConfig = acceleratorConfig;
            return this;
        }

        /**
         * @param acceleratorConfig Configuration (count and accelerator type) for hardware running notebook execution.
         * 
         * @return builder
         * 
         */
        public Builder acceleratorConfig(SchedulerAcceleratorConfigArgs acceleratorConfig) {
            return acceleratorConfig(Output.of(acceleratorConfig));
        }

        /**
         * @param containerImageUri Container Image URI to a DLVM Example: &#39;gcr.io/deeplearning-platform-release/base-cu100&#39; More examples can be found at: https://cloud.google.com/ai-platform/deep-learning-containers/docs/choosing-container
         * 
         * @return builder
         * 
         */
        public Builder containerImageUri(@Nullable Output<String> containerImageUri) {
            $.containerImageUri = containerImageUri;
            return this;
        }

        /**
         * @param containerImageUri Container Image URI to a DLVM Example: &#39;gcr.io/deeplearning-platform-release/base-cu100&#39; More examples can be found at: https://cloud.google.com/ai-platform/deep-learning-containers/docs/choosing-container
         * 
         * @return builder
         * 
         */
        public Builder containerImageUri(String containerImageUri) {
            return containerImageUri(Output.of(containerImageUri));
        }

        /**
         * @param dataprocParameters Parameters used in Dataproc JobType executions.
         * 
         * @return builder
         * 
         */
        public Builder dataprocParameters(@Nullable Output<DataprocParametersArgs> dataprocParameters) {
            $.dataprocParameters = dataprocParameters;
            return this;
        }

        /**
         * @param dataprocParameters Parameters used in Dataproc JobType executions.
         * 
         * @return builder
         * 
         */
        public Builder dataprocParameters(DataprocParametersArgs dataprocParameters) {
            return dataprocParameters(Output.of(dataprocParameters));
        }

        /**
         * @param inputNotebookFile Path to the notebook file to execute. Must be in a Google Cloud Storage bucket. Format: `gs://{bucket_name}/{folder}/{notebook_file_name}` Ex: `gs://notebook_user/scheduled_notebooks/sentiment_notebook.ipynb`
         * 
         * @return builder
         * 
         */
        public Builder inputNotebookFile(@Nullable Output<String> inputNotebookFile) {
            $.inputNotebookFile = inputNotebookFile;
            return this;
        }

        /**
         * @param inputNotebookFile Path to the notebook file to execute. Must be in a Google Cloud Storage bucket. Format: `gs://{bucket_name}/{folder}/{notebook_file_name}` Ex: `gs://notebook_user/scheduled_notebooks/sentiment_notebook.ipynb`
         * 
         * @return builder
         * 
         */
        public Builder inputNotebookFile(String inputNotebookFile) {
            return inputNotebookFile(Output.of(inputNotebookFile));
        }

        /**
         * @param jobType The type of Job to be used on this execution.
         * 
         * @return builder
         * 
         */
        public Builder jobType(@Nullable Output<ExecutionTemplateJobType> jobType) {
            $.jobType = jobType;
            return this;
        }

        /**
         * @param jobType The type of Job to be used on this execution.
         * 
         * @return builder
         * 
         */
        public Builder jobType(ExecutionTemplateJobType jobType) {
            return jobType(Output.of(jobType));
        }

        /**
         * @param kernelSpec Name of the kernel spec to use. This must be specified if the kernel spec name on the execution target does not match the name in the input notebook file.
         * 
         * @return builder
         * 
         */
        public Builder kernelSpec(@Nullable Output<String> kernelSpec) {
            $.kernelSpec = kernelSpec;
            return this;
        }

        /**
         * @param kernelSpec Name of the kernel spec to use. This must be specified if the kernel spec name on the execution target does not match the name in the input notebook file.
         * 
         * @return builder
         * 
         */
        public Builder kernelSpec(String kernelSpec) {
            return kernelSpec(Output.of(kernelSpec));
        }

        /**
         * @param labels Labels for execution. If execution is scheduled, a field included will be &#39;nbs-scheduled&#39;. Otherwise, it is an immediate execution, and an included field will be &#39;nbs-immediate&#39;. Use fields to efficiently index between various types of executions.
         * 
         * @return builder
         * 
         */
        public Builder labels(@Nullable Output<Map<String,String>> labels) {
            $.labels = labels;
            return this;
        }

        /**
         * @param labels Labels for execution. If execution is scheduled, a field included will be &#39;nbs-scheduled&#39;. Otherwise, it is an immediate execution, and an included field will be &#39;nbs-immediate&#39;. Use fields to efficiently index between various types of executions.
         * 
         * @return builder
         * 
         */
        public Builder labels(Map<String,String> labels) {
            return labels(Output.of(labels));
        }

        /**
         * @param masterType Specifies the type of virtual machine to use for your training job&#39;s master worker. You must specify this field when `scaleTier` is set to `CUSTOM`. You can use certain Compute Engine machine types directly in this field. The following types are supported: - `n1-standard-4` - `n1-standard-8` - `n1-standard-16` - `n1-standard-32` - `n1-standard-64` - `n1-standard-96` - `n1-highmem-2` - `n1-highmem-4` - `n1-highmem-8` - `n1-highmem-16` - `n1-highmem-32` - `n1-highmem-64` - `n1-highmem-96` - `n1-highcpu-16` - `n1-highcpu-32` - `n1-highcpu-64` - `n1-highcpu-96` Alternatively, you can use the following legacy machine types: - `standard` - `large_model` - `complex_model_s` - `complex_model_m` - `complex_model_l` - `standard_gpu` - `complex_model_m_gpu` - `complex_model_l_gpu` - `standard_p100` - `complex_model_m_p100` - `standard_v100` - `large_model_v100` - `complex_model_m_v100` - `complex_model_l_v100` Finally, if you want to use a TPU for training, specify `cloud_tpu` in this field. Learn more about the [special configuration options for training with TPU](https://cloud.google.com/ai-platform/training/docs/using-tpus#configuring_a_custom_tpu_machine).
         * 
         * @return builder
         * 
         */
        public Builder masterType(@Nullable Output<String> masterType) {
            $.masterType = masterType;
            return this;
        }

        /**
         * @param masterType Specifies the type of virtual machine to use for your training job&#39;s master worker. You must specify this field when `scaleTier` is set to `CUSTOM`. You can use certain Compute Engine machine types directly in this field. The following types are supported: - `n1-standard-4` - `n1-standard-8` - `n1-standard-16` - `n1-standard-32` - `n1-standard-64` - `n1-standard-96` - `n1-highmem-2` - `n1-highmem-4` - `n1-highmem-8` - `n1-highmem-16` - `n1-highmem-32` - `n1-highmem-64` - `n1-highmem-96` - `n1-highcpu-16` - `n1-highcpu-32` - `n1-highcpu-64` - `n1-highcpu-96` Alternatively, you can use the following legacy machine types: - `standard` - `large_model` - `complex_model_s` - `complex_model_m` - `complex_model_l` - `standard_gpu` - `complex_model_m_gpu` - `complex_model_l_gpu` - `standard_p100` - `complex_model_m_p100` - `standard_v100` - `large_model_v100` - `complex_model_m_v100` - `complex_model_l_v100` Finally, if you want to use a TPU for training, specify `cloud_tpu` in this field. Learn more about the [special configuration options for training with TPU](https://cloud.google.com/ai-platform/training/docs/using-tpus#configuring_a_custom_tpu_machine).
         * 
         * @return builder
         * 
         */
        public Builder masterType(String masterType) {
            return masterType(Output.of(masterType));
        }

        /**
         * @param outputNotebookFolder Path to the notebook folder to write to. Must be in a Google Cloud Storage bucket path. Format: `gs://{bucket_name}/{folder}` Ex: `gs://notebook_user/scheduled_notebooks`
         * 
         * @return builder
         * 
         */
        public Builder outputNotebookFolder(@Nullable Output<String> outputNotebookFolder) {
            $.outputNotebookFolder = outputNotebookFolder;
            return this;
        }

        /**
         * @param outputNotebookFolder Path to the notebook folder to write to. Must be in a Google Cloud Storage bucket path. Format: `gs://{bucket_name}/{folder}` Ex: `gs://notebook_user/scheduled_notebooks`
         * 
         * @return builder
         * 
         */
        public Builder outputNotebookFolder(String outputNotebookFolder) {
            return outputNotebookFolder(Output.of(outputNotebookFolder));
        }

        /**
         * @param parameters Parameters used within the &#39;input_notebook_file&#39; notebook.
         * 
         * @return builder
         * 
         */
        public Builder parameters(@Nullable Output<String> parameters) {
            $.parameters = parameters;
            return this;
        }

        /**
         * @param parameters Parameters used within the &#39;input_notebook_file&#39; notebook.
         * 
         * @return builder
         * 
         */
        public Builder parameters(String parameters) {
            return parameters(Output.of(parameters));
        }

        /**
         * @param paramsYamlFile Parameters to be overridden in the notebook during execution. Ref https://papermill.readthedocs.io/en/latest/usage-parameterize.html on how to specifying parameters in the input notebook and pass them here in an YAML file. Ex: `gs://notebook_user/scheduled_notebooks/sentiment_notebook_params.yaml`
         * 
         * @return builder
         * 
         */
        public Builder paramsYamlFile(@Nullable Output<String> paramsYamlFile) {
            $.paramsYamlFile = paramsYamlFile;
            return this;
        }

        /**
         * @param paramsYamlFile Parameters to be overridden in the notebook during execution. Ref https://papermill.readthedocs.io/en/latest/usage-parameterize.html on how to specifying parameters in the input notebook and pass them here in an YAML file. Ex: `gs://notebook_user/scheduled_notebooks/sentiment_notebook_params.yaml`
         * 
         * @return builder
         * 
         */
        public Builder paramsYamlFile(String paramsYamlFile) {
            return paramsYamlFile(Output.of(paramsYamlFile));
        }

        /**
         * @param scaleTier Scale tier of the hardware used for notebook execution. DEPRECATED Will be discontinued. As right now only CUSTOM is supported.
         * 
         * @return builder
         * 
         * @deprecated
         * Required. Scale tier of the hardware used for notebook execution. DEPRECATED Will be discontinued. As right now only CUSTOM is supported.
         * 
         */
        @Deprecated /* Required. Scale tier of the hardware used for notebook execution. DEPRECATED Will be discontinued. As right now only CUSTOM is supported. */
        public Builder scaleTier(Output<ExecutionTemplateScaleTier> scaleTier) {
            $.scaleTier = scaleTier;
            return this;
        }

        /**
         * @param scaleTier Scale tier of the hardware used for notebook execution. DEPRECATED Will be discontinued. As right now only CUSTOM is supported.
         * 
         * @return builder
         * 
         * @deprecated
         * Required. Scale tier of the hardware used for notebook execution. DEPRECATED Will be discontinued. As right now only CUSTOM is supported.
         * 
         */
        @Deprecated /* Required. Scale tier of the hardware used for notebook execution. DEPRECATED Will be discontinued. As right now only CUSTOM is supported. */
        public Builder scaleTier(ExecutionTemplateScaleTier scaleTier) {
            return scaleTier(Output.of(scaleTier));
        }

        /**
         * @param serviceAccount The email address of a service account to use when running the execution. You must have the `iam.serviceAccounts.actAs` permission for the specified service account.
         * 
         * @return builder
         * 
         */
        public Builder serviceAccount(@Nullable Output<String> serviceAccount) {
            $.serviceAccount = serviceAccount;
            return this;
        }

        /**
         * @param serviceAccount The email address of a service account to use when running the execution. You must have the `iam.serviceAccounts.actAs` permission for the specified service account.
         * 
         * @return builder
         * 
         */
        public Builder serviceAccount(String serviceAccount) {
            return serviceAccount(Output.of(serviceAccount));
        }

        /**
         * @param tensorboard The name of a Vertex AI [Tensorboard] resource to which this execution will upload Tensorboard logs. Format: `projects/{project}/locations/{location}/tensorboards/{tensorboard}`
         * 
         * @return builder
         * 
         */
        public Builder tensorboard(@Nullable Output<String> tensorboard) {
            $.tensorboard = tensorboard;
            return this;
        }

        /**
         * @param tensorboard The name of a Vertex AI [Tensorboard] resource to which this execution will upload Tensorboard logs. Format: `projects/{project}/locations/{location}/tensorboards/{tensorboard}`
         * 
         * @return builder
         * 
         */
        public Builder tensorboard(String tensorboard) {
            return tensorboard(Output.of(tensorboard));
        }

        /**
         * @param vertexAiParameters Parameters used in Vertex AI JobType executions.
         * 
         * @return builder
         * 
         */
        public Builder vertexAiParameters(@Nullable Output<VertexAIParametersArgs> vertexAiParameters) {
            $.vertexAiParameters = vertexAiParameters;
            return this;
        }

        /**
         * @param vertexAiParameters Parameters used in Vertex AI JobType executions.
         * 
         * @return builder
         * 
         */
        public Builder vertexAiParameters(VertexAIParametersArgs vertexAiParameters) {
            return vertexAiParameters(Output.of(vertexAiParameters));
        }

        public ExecutionTemplateArgs build() {
            $.scaleTier = Objects.requireNonNull($.scaleTier, "expected parameter 'scaleTier' to be non-null");
            return $;
        }
    }

}