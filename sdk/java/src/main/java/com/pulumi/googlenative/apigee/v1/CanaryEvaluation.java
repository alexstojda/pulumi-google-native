// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.apigee.v1;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.googlenative.Utilities;
import com.pulumi.googlenative.apigee.v1.CanaryEvaluationArgs;
import com.pulumi.googlenative.apigee.v1.outputs.GoogleCloudApigeeV1CanaryEvaluationMetricLabelsResponse;
import java.lang.String;
import javax.annotation.Nullable;

/**
 * Creates a new canary evaluation for an organization.
 * Auto-naming is currently not supported for this resource.
 * Note - this resource&#39;s API doesn&#39;t support deletion. When deleted, the resource will persist
 * on Google Cloud even though it will be deleted from Pulumi state.
 * 
 */
@ResourceType(type="google-native:apigee/v1:CanaryEvaluation")
public class CanaryEvaluation extends com.pulumi.resources.CustomResource {
    /**
     * The stable version that is serving requests.
     * 
     */
    @Export(name="control", type=String.class, parameters={})
    private Output<String> control;

    /**
     * @return The stable version that is serving requests.
     * 
     */
    public Output<String> control() {
        return this.control;
    }
    /**
     * Create time of the canary evaluation.
     * 
     */
    @Export(name="createTime", type=String.class, parameters={})
    private Output<String> createTime;

    /**
     * @return Create time of the canary evaluation.
     * 
     */
    public Output<String> createTime() {
        return this.createTime;
    }
    /**
     * End time for the evaluation&#39;s analysis.
     * 
     */
    @Export(name="endTime", type=String.class, parameters={})
    private Output<String> endTime;

    /**
     * @return End time for the evaluation&#39;s analysis.
     * 
     */
    public Output<String> endTime() {
        return this.endTime;
    }
    @Export(name="instanceId", type=String.class, parameters={})
    private Output<String> instanceId;

    public Output<String> instanceId() {
        return this.instanceId;
    }
    /**
     * Labels used to filter the metrics used for a canary evaluation.
     * 
     */
    @Export(name="metricLabels", type=GoogleCloudApigeeV1CanaryEvaluationMetricLabelsResponse.class, parameters={})
    private Output<GoogleCloudApigeeV1CanaryEvaluationMetricLabelsResponse> metricLabels;

    /**
     * @return Labels used to filter the metrics used for a canary evaluation.
     * 
     */
    public Output<GoogleCloudApigeeV1CanaryEvaluationMetricLabelsResponse> metricLabels() {
        return this.metricLabels;
    }
    /**
     * Name of the canary evalution.
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return Name of the canary evalution.
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    @Export(name="organizationId", type=String.class, parameters={})
    private Output<String> organizationId;

    public Output<String> organizationId() {
        return this.organizationId;
    }
    /**
     * Start time for the canary evaluation&#39;s analysis.
     * 
     */
    @Export(name="startTime", type=String.class, parameters={})
    private Output<String> startTime;

    /**
     * @return Start time for the canary evaluation&#39;s analysis.
     * 
     */
    public Output<String> startTime() {
        return this.startTime;
    }
    /**
     * The current state of the canary evaluation.
     * 
     */
    @Export(name="state", type=String.class, parameters={})
    private Output<String> state;

    /**
     * @return The current state of the canary evaluation.
     * 
     */
    public Output<String> state() {
        return this.state;
    }
    /**
     * The newer version that is serving requests.
     * 
     */
    @Export(name="treatment", type=String.class, parameters={})
    private Output<String> treatment;

    /**
     * @return The newer version that is serving requests.
     * 
     */
    public Output<String> treatment() {
        return this.treatment;
    }
    /**
     * The resulting verdict of the canary evaluations: NONE, PASS, or FAIL.
     * 
     */
    @Export(name="verdict", type=String.class, parameters={})
    private Output<String> verdict;

    /**
     * @return The resulting verdict of the canary evaluations: NONE, PASS, or FAIL.
     * 
     */
    public Output<String> verdict() {
        return this.verdict;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public CanaryEvaluation(String name) {
        this(name, CanaryEvaluationArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public CanaryEvaluation(String name, CanaryEvaluationArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public CanaryEvaluation(String name, CanaryEvaluationArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("google-native:apigee/v1:CanaryEvaluation", name, args == null ? CanaryEvaluationArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private CanaryEvaluation(String name, Output<String> id, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("google-native:apigee/v1:CanaryEvaluation", name, null, makeResourceOptions(options, id));
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
    public static CanaryEvaluation get(String name, Output<String> id, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new CanaryEvaluation(name, id, options);
    }
}