// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.notebooks.v1;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.googlenative.Utilities;
import com.pulumi.googlenative.notebooks.v1.ExecutionArgs;
import com.pulumi.googlenative.notebooks.v1.outputs.ExecutionTemplateResponse;
import java.lang.String;
import javax.annotation.Nullable;

/**
 * Creates a new Execution in a given project and location.
 * Auto-naming is currently not supported for this resource.
 * 
 */
@ResourceType(type="google-native:notebooks/v1:Execution")
public class Execution extends com.pulumi.resources.CustomResource {
    /**
     * Time the Execution was instantiated.
     * 
     */
    @Export(name="createTime", type=String.class, parameters={})
    private Output<String> createTime;

    /**
     * @return Time the Execution was instantiated.
     * 
     */
    public Output<String> createTime() {
        return this.createTime;
    }
    /**
     * A brief description of this execution.
     * 
     */
    @Export(name="description", type=String.class, parameters={})
    private Output<String> description;

    /**
     * @return A brief description of this execution.
     * 
     */
    public Output<String> description() {
        return this.description;
    }
    /**
     * Name used for UI purposes. Name can only contain alphanumeric characters and underscores &#39;_&#39;.
     * 
     */
    @Export(name="displayName", type=String.class, parameters={})
    private Output<String> displayName;

    /**
     * @return Name used for UI purposes. Name can only contain alphanumeric characters and underscores &#39;_&#39;.
     * 
     */
    public Output<String> displayName() {
        return this.displayName;
    }
    /**
     * Required. User-defined unique ID of this execution.
     * 
     */
    @Export(name="executionId", type=String.class, parameters={})
    private Output<String> executionId;

    /**
     * @return Required. User-defined unique ID of this execution.
     * 
     */
    public Output<String> executionId() {
        return this.executionId;
    }
    /**
     * execute metadata including name, hardware spec, region, labels, etc.
     * 
     */
    @Export(name="executionTemplate", type=ExecutionTemplateResponse.class, parameters={})
    private Output<ExecutionTemplateResponse> executionTemplate;

    /**
     * @return execute metadata including name, hardware spec, region, labels, etc.
     * 
     */
    public Output<ExecutionTemplateResponse> executionTemplate() {
        return this.executionTemplate;
    }
    /**
     * The URI of the external job used to execute the notebook.
     * 
     */
    @Export(name="jobUri", type=String.class, parameters={})
    private Output<String> jobUri;

    /**
     * @return The URI of the external job used to execute the notebook.
     * 
     */
    public Output<String> jobUri() {
        return this.jobUri;
    }
    @Export(name="location", type=String.class, parameters={})
    private Output<String> location;

    public Output<String> location() {
        return this.location;
    }
    /**
     * The resource name of the execute. Format: `projects/{project_id}/locations/{location}/executions/{execution_id}`
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return The resource name of the execute. Format: `projects/{project_id}/locations/{location}/executions/{execution_id}`
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * Output notebook file generated by this execution
     * 
     */
    @Export(name="outputNotebookFile", type=String.class, parameters={})
    private Output<String> outputNotebookFile;

    /**
     * @return Output notebook file generated by this execution
     * 
     */
    public Output<String> outputNotebookFile() {
        return this.outputNotebookFile;
    }
    @Export(name="project", type=String.class, parameters={})
    private Output<String> project;

    public Output<String> project() {
        return this.project;
    }
    /**
     * State of the underlying AI Platform job.
     * 
     */
    @Export(name="state", type=String.class, parameters={})
    private Output<String> state;

    /**
     * @return State of the underlying AI Platform job.
     * 
     */
    public Output<String> state() {
        return this.state;
    }
    /**
     * Time the Execution was last updated.
     * 
     */
    @Export(name="updateTime", type=String.class, parameters={})
    private Output<String> updateTime;

    /**
     * @return Time the Execution was last updated.
     * 
     */
    public Output<String> updateTime() {
        return this.updateTime;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public Execution(String name) {
        this(name, ExecutionArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public Execution(String name, ExecutionArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Execution(String name, ExecutionArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("google-native:notebooks/v1:Execution", name, args == null ? ExecutionArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private Execution(String name, Output<String> id, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("google-native:notebooks/v1:Execution", name, null, makeResourceOptions(options, id));
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
    public static Execution get(String name, Output<String> id, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new Execution(name, id, options);
    }
}