// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.run.v2;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.googlenative.Utilities;
import com.pulumi.googlenative.run.v2.JobArgs;
import com.pulumi.googlenative.run.v2.outputs.GoogleCloudRunV2BinaryAuthorizationResponse;
import com.pulumi.googlenative.run.v2.outputs.GoogleCloudRunV2ConditionResponse;
import com.pulumi.googlenative.run.v2.outputs.GoogleCloudRunV2ExecutionReferenceResponse;
import com.pulumi.googlenative.run.v2.outputs.GoogleCloudRunV2ExecutionTemplateResponse;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Create a Job.
 * 
 */
@ResourceType(type="google-native:run/v2:Job")
public class Job extends com.pulumi.resources.CustomResource {
    /**
     * KRM-style annotations for the resource. Unstructured key value map that may be set by external tools to store and arbitrary metadata. They are not queryable and should be preserved when modifying objects. Cloud Run will populate some annotations using &#39;run.googleapis.com&#39; or &#39;serving.knative.dev&#39; namespaces. This field follows Kubernetes annotations&#39; namespacing, limits, and rules. More info: https://kubernetes.io/docs/user-guide/annotations
     * 
     */
    @Export(name="annotations", type=Map.class, parameters={String.class, String.class})
    private Output<Map<String,String>> annotations;

    /**
     * @return KRM-style annotations for the resource. Unstructured key value map that may be set by external tools to store and arbitrary metadata. They are not queryable and should be preserved when modifying objects. Cloud Run will populate some annotations using &#39;run.googleapis.com&#39; or &#39;serving.knative.dev&#39; namespaces. This field follows Kubernetes annotations&#39; namespacing, limits, and rules. More info: https://kubernetes.io/docs/user-guide/annotations
     * 
     */
    public Output<Map<String,String>> annotations() {
        return this.annotations;
    }
    /**
     * Settings for the Binary Authorization feature.
     * 
     */
    @Export(name="binaryAuthorization", type=GoogleCloudRunV2BinaryAuthorizationResponse.class, parameters={})
    private Output<GoogleCloudRunV2BinaryAuthorizationResponse> binaryAuthorization;

    /**
     * @return Settings for the Binary Authorization feature.
     * 
     */
    public Output<GoogleCloudRunV2BinaryAuthorizationResponse> binaryAuthorization() {
        return this.binaryAuthorization;
    }
    /**
     * Arbitrary identifier for the API client.
     * 
     */
    @Export(name="client", type=String.class, parameters={})
    private Output<String> client;

    /**
     * @return Arbitrary identifier for the API client.
     * 
     */
    public Output<String> client() {
        return this.client;
    }
    /**
     * Arbitrary version identifier for the API client.
     * 
     */
    @Export(name="clientVersion", type=String.class, parameters={})
    private Output<String> clientVersion;

    /**
     * @return Arbitrary version identifier for the API client.
     * 
     */
    public Output<String> clientVersion() {
        return this.clientVersion;
    }
    /**
     * The Conditions of all other associated sub-resources. They contain additional diagnostics information in case the Job does not reach its desired state. See comments in `reconciling` for additional information on reconciliation process in Cloud Run.
     * 
     */
    @Export(name="conditions", type=List.class, parameters={GoogleCloudRunV2ConditionResponse.class})
    private Output<List<GoogleCloudRunV2ConditionResponse>> conditions;

    /**
     * @return The Conditions of all other associated sub-resources. They contain additional diagnostics information in case the Job does not reach its desired state. See comments in `reconciling` for additional information on reconciliation process in Cloud Run.
     * 
     */
    public Output<List<GoogleCloudRunV2ConditionResponse>> conditions() {
        return this.conditions;
    }
    /**
     * The creation time.
     * 
     */
    @Export(name="createTime", type=String.class, parameters={})
    private Output<String> createTime;

    /**
     * @return The creation time.
     * 
     */
    public Output<String> createTime() {
        return this.createTime;
    }
    /**
     * Email address of the authenticated creator.
     * 
     */
    @Export(name="creator", type=String.class, parameters={})
    private Output<String> creator;

    /**
     * @return Email address of the authenticated creator.
     * 
     */
    public Output<String> creator() {
        return this.creator;
    }
    /**
     * The deletion time.
     * 
     */
    @Export(name="deleteTime", type=String.class, parameters={})
    private Output<String> deleteTime;

    /**
     * @return The deletion time.
     * 
     */
    public Output<String> deleteTime() {
        return this.deleteTime;
    }
    /**
     * A system-generated fingerprint for this version of the resource. May be used to detect modification conflict during updates.
     * 
     */
    @Export(name="etag", type=String.class, parameters={})
    private Output<String> etag;

    /**
     * @return A system-generated fingerprint for this version of the resource. May be used to detect modification conflict during updates.
     * 
     */
    public Output<String> etag() {
        return this.etag;
    }
    /**
     * Number of executions created for this job.
     * 
     */
    @Export(name="executionCount", type=Integer.class, parameters={})
    private Output<Integer> executionCount;

    /**
     * @return Number of executions created for this job.
     * 
     */
    public Output<Integer> executionCount() {
        return this.executionCount;
    }
    /**
     * For a deleted resource, the time after which it will be permamently deleted.
     * 
     */
    @Export(name="expireTime", type=String.class, parameters={})
    private Output<String> expireTime;

    /**
     * @return For a deleted resource, the time after which it will be permamently deleted.
     * 
     */
    public Output<String> expireTime() {
        return this.expireTime;
    }
    /**
     * A number that monotonically increases every time the user modifies the desired state.
     * 
     */
    @Export(name="generation", type=String.class, parameters={})
    private Output<String> generation;

    /**
     * @return A number that monotonically increases every time the user modifies the desired state.
     * 
     */
    public Output<String> generation() {
        return this.generation;
    }
    /**
     * Required. The unique identifier for the Job. The name of the job becomes {parent}/jobs/{job_id}.
     * 
     */
    @Export(name="jobId", type=String.class, parameters={})
    private Output<String> jobId;

    /**
     * @return Required. The unique identifier for the Job. The name of the job becomes {parent}/jobs/{job_id}.
     * 
     */
    public Output<String> jobId() {
        return this.jobId;
    }
    /**
     * KRM-style labels for the resource. User-provided labels are shared with Google&#39;s billing system, so they can be used to filter, or break down billing charges by team, component, environment, state, etc. For more information, visit https://cloud.google.com/resource-manager/docs/creating-managing-labels or https://cloud.google.com/run/docs/configuring/labels Cloud Run will populate some labels with &#39;run.googleapis.com&#39; or &#39;serving.knative.dev&#39; namespaces. Those labels are read-only, and user changes will not be preserved.
     * 
     */
    @Export(name="labels", type=Map.class, parameters={String.class, String.class})
    private Output<Map<String,String>> labels;

    /**
     * @return KRM-style labels for the resource. User-provided labels are shared with Google&#39;s billing system, so they can be used to filter, or break down billing charges by team, component, environment, state, etc. For more information, visit https://cloud.google.com/resource-manager/docs/creating-managing-labels or https://cloud.google.com/run/docs/configuring/labels Cloud Run will populate some labels with &#39;run.googleapis.com&#39; or &#39;serving.knative.dev&#39; namespaces. Those labels are read-only, and user changes will not be preserved.
     * 
     */
    public Output<Map<String,String>> labels() {
        return this.labels;
    }
    /**
     * Email address of the last authenticated modifier.
     * 
     */
    @Export(name="lastModifier", type=String.class, parameters={})
    private Output<String> lastModifier;

    /**
     * @return Email address of the last authenticated modifier.
     * 
     */
    public Output<String> lastModifier() {
        return this.lastModifier;
    }
    /**
     * Name of the last created execution.
     * 
     */
    @Export(name="latestCreatedExecution", type=GoogleCloudRunV2ExecutionReferenceResponse.class, parameters={})
    private Output<GoogleCloudRunV2ExecutionReferenceResponse> latestCreatedExecution;

    /**
     * @return Name of the last created execution.
     * 
     */
    public Output<GoogleCloudRunV2ExecutionReferenceResponse> latestCreatedExecution() {
        return this.latestCreatedExecution;
    }
    /**
     * The launch stage as defined by [Google Cloud Platform Launch Stages](https://cloud.google.com/terms/launch-stages). Cloud Run supports `ALPHA`, `BETA`, and `GA`. If no value is specified, GA is assumed.
     * 
     */
    @Export(name="launchStage", type=String.class, parameters={})
    private Output<String> launchStage;

    /**
     * @return The launch stage as defined by [Google Cloud Platform Launch Stages](https://cloud.google.com/terms/launch-stages). Cloud Run supports `ALPHA`, `BETA`, and `GA`. If no value is specified, GA is assumed.
     * 
     */
    public Output<String> launchStage() {
        return this.launchStage;
    }
    @Export(name="location", type=String.class, parameters={})
    private Output<String> location;

    public Output<String> location() {
        return this.location;
    }
    /**
     * The fully qualified name of this Job. Format: projects/{project}/locations/{location}/jobs/{job}
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return The fully qualified name of this Job. Format: projects/{project}/locations/{location}/jobs/{job}
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * The generation of this Job. See comments in `reconciling` for additional information on reconciliation process in Cloud Run.
     * 
     */
    @Export(name="observedGeneration", type=String.class, parameters={})
    private Output<String> observedGeneration;

    /**
     * @return The generation of this Job. See comments in `reconciling` for additional information on reconciliation process in Cloud Run.
     * 
     */
    public Output<String> observedGeneration() {
        return this.observedGeneration;
    }
    @Export(name="project", type=String.class, parameters={})
    private Output<String> project;

    public Output<String> project() {
        return this.project;
    }
    /**
     * Returns true if the Job is currently being acted upon by the system to bring it into the desired state. When a new Job is created, or an existing one is updated, Cloud Run will asynchronously perform all necessary steps to bring the Job to the desired state. This process is called reconciliation. While reconciliation is in process, `observed_generation` and `latest_succeeded_execution`, will have transient values that might mismatch the intended state: Once reconciliation is over (and this field is false), there are two possible outcomes: reconciliation succeeded and the state matches the Job, or there was an error, and reconciliation failed. This state can be found in `terminal_condition.state`. If reconciliation succeeded, the following fields will match: `observed_generation` and `generation`, `latest_succeeded_execution` and `latest_created_execution`. If reconciliation failed, `observed_generation` and `latest_succeeded_execution` will have the state of the last succeeded execution or empty for newly created Job. Additional information on the failure can be found in `terminal_condition` and `conditions`.
     * 
     */
    @Export(name="reconciling", type=Boolean.class, parameters={})
    private Output<Boolean> reconciling;

    /**
     * @return Returns true if the Job is currently being acted upon by the system to bring it into the desired state. When a new Job is created, or an existing one is updated, Cloud Run will asynchronously perform all necessary steps to bring the Job to the desired state. This process is called reconciliation. While reconciliation is in process, `observed_generation` and `latest_succeeded_execution`, will have transient values that might mismatch the intended state: Once reconciliation is over (and this field is false), there are two possible outcomes: reconciliation succeeded and the state matches the Job, or there was an error, and reconciliation failed. This state can be found in `terminal_condition.state`. If reconciliation succeeded, the following fields will match: `observed_generation` and `generation`, `latest_succeeded_execution` and `latest_created_execution`. If reconciliation failed, `observed_generation` and `latest_succeeded_execution` will have the state of the last succeeded execution or empty for newly created Job. Additional information on the failure can be found in `terminal_condition` and `conditions`.
     * 
     */
    public Output<Boolean> reconciling() {
        return this.reconciling;
    }
    /**
     * The template used to create executions for this Job.
     * 
     */
    @Export(name="template", type=GoogleCloudRunV2ExecutionTemplateResponse.class, parameters={})
    private Output<GoogleCloudRunV2ExecutionTemplateResponse> template;

    /**
     * @return The template used to create executions for this Job.
     * 
     */
    public Output<GoogleCloudRunV2ExecutionTemplateResponse> template() {
        return this.template;
    }
    /**
     * The Condition of this Job, containing its readiness status, and detailed error information in case it did not reach the desired state.
     * 
     */
    @Export(name="terminalCondition", type=GoogleCloudRunV2ConditionResponse.class, parameters={})
    private Output<GoogleCloudRunV2ConditionResponse> terminalCondition;

    /**
     * @return The Condition of this Job, containing its readiness status, and detailed error information in case it did not reach the desired state.
     * 
     */
    public Output<GoogleCloudRunV2ConditionResponse> terminalCondition() {
        return this.terminalCondition;
    }
    /**
     * Server assigned unique identifier for the Execution. The value is a UUID4 string and guaranteed to remain unchanged until the resource is deleted.
     * 
     */
    @Export(name="uid", type=String.class, parameters={})
    private Output<String> uid;

    /**
     * @return Server assigned unique identifier for the Execution. The value is a UUID4 string and guaranteed to remain unchanged until the resource is deleted.
     * 
     */
    public Output<String> uid() {
        return this.uid;
    }
    /**
     * The last-modified time.
     * 
     */
    @Export(name="updateTime", type=String.class, parameters={})
    private Output<String> updateTime;

    /**
     * @return The last-modified time.
     * 
     */
    public Output<String> updateTime() {
        return this.updateTime;
    }
    /**
     * Indicates that the request should be validated and default values populated, without persisting the request or creating any resources.
     * 
     */
    @Export(name="validateOnly", type=String.class, parameters={})
    private Output</* @Nullable */ String> validateOnly;

    /**
     * @return Indicates that the request should be validated and default values populated, without persisting the request or creating any resources.
     * 
     */
    public Output<Optional<String>> validateOnly() {
        return Codegen.optional(this.validateOnly);
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public Job(String name) {
        this(name, JobArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public Job(String name, JobArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Job(String name, JobArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("google-native:run/v2:Job", name, args == null ? JobArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private Job(String name, Output<String> id, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("google-native:run/v2:Job", name, null, makeResourceOptions(options, id));
    }

    private static com.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable com.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = com.pulumi.resources.CustomResourceOptions.builder()
            .version(Utilities.getVersion())
            .build();
        return com.pulumi.resources.CustomResourceOptions.merge(defaultOptions, options, id);
    }

    /**
     * Get an existing Host resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param options Optional settings to control the behavior of the CustomResource.
     */
    public static Job get(String name, Output<String> id, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new Job(name, id, options);
    }
}