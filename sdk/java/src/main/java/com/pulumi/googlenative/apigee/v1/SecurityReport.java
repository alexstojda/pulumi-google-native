// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.apigee.v1;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.googlenative.Utilities;
import com.pulumi.googlenative.apigee.v1.SecurityReportArgs;
import com.pulumi.googlenative.apigee.v1.outputs.GoogleCloudApigeeV1SecurityReportMetadataResponse;
import com.pulumi.googlenative.apigee.v1.outputs.GoogleCloudApigeeV1SecurityReportResultMetadataResponse;
import java.lang.String;
import javax.annotation.Nullable;

/**
 * Submit a report request to be processed in the background. If the submission succeeds, the API returns a 200 status and an ID that refer to the report request. In addition to the HTTP status 200, the `state` of &#34;enqueued&#34; means that the request succeeded.
 * Auto-naming is currently not supported for this resource.
 * Note - this resource&#39;s API doesn&#39;t support deletion. When deleted, the resource will persist
 * on Google Cloud even though it will be deleted from Pulumi state.
 * 
 */
@ResourceType(type="google-native:apigee/v1:SecurityReport")
public class SecurityReport extends com.pulumi.resources.CustomResource {
    /**
     * Creation time of the query.
     * 
     */
    @Export(name="created", type=String.class, parameters={})
    private Output<String> created;

    /**
     * @return Creation time of the query.
     * 
     */
    public Output<String> created() {
        return this.created;
    }
    /**
     * Display Name specified by the user.
     * 
     */
    @Export(name="displayName", type=String.class, parameters={})
    private Output<String> displayName;

    /**
     * @return Display Name specified by the user.
     * 
     */
    public Output<String> displayName() {
        return this.displayName;
    }
    /**
     * Hostname is available only when query is executed at host level.
     * 
     */
    @Export(name="envgroupHostname", type=String.class, parameters={})
    private Output<String> envgroupHostname;

    /**
     * @return Hostname is available only when query is executed at host level.
     * 
     */
    public Output<String> envgroupHostname() {
        return this.envgroupHostname;
    }
    @Export(name="environmentId", type=String.class, parameters={})
    private Output<String> environmentId;

    public Output<String> environmentId() {
        return this.environmentId;
    }
    /**
     * Error is set when query fails.
     * 
     */
    @Export(name="error", type=String.class, parameters={})
    private Output<String> error;

    /**
     * @return Error is set when query fails.
     * 
     */
    public Output<String> error() {
        return this.error;
    }
    /**
     * ExecutionTime is available only after the query is completed.
     * 
     */
    @Export(name="executionTime", type=String.class, parameters={})
    private Output<String> executionTime;

    /**
     * @return ExecutionTime is available only after the query is completed.
     * 
     */
    public Output<String> executionTime() {
        return this.executionTime;
    }
    @Export(name="organizationId", type=String.class, parameters={})
    private Output<String> organizationId;

    public Output<String> organizationId() {
        return this.organizationId;
    }
    /**
     * Contains information like metrics, dimenstions etc of the Security Report.
     * 
     */
    @Export(name="queryParams", type=GoogleCloudApigeeV1SecurityReportMetadataResponse.class, parameters={})
    private Output<GoogleCloudApigeeV1SecurityReportMetadataResponse> queryParams;

    /**
     * @return Contains information like metrics, dimenstions etc of the Security Report.
     * 
     */
    public Output<GoogleCloudApigeeV1SecurityReportMetadataResponse> queryParams() {
        return this.queryParams;
    }
    /**
     * Report Definition ID.
     * 
     */
    @Export(name="reportDefinitionId", type=String.class, parameters={})
    private Output<String> reportDefinitionId;

    /**
     * @return Report Definition ID.
     * 
     */
    public Output<String> reportDefinitionId() {
        return this.reportDefinitionId;
    }
    /**
     * Result is available only after the query is completed.
     * 
     */
    @Export(name="result", type=GoogleCloudApigeeV1SecurityReportResultMetadataResponse.class, parameters={})
    private Output<GoogleCloudApigeeV1SecurityReportResultMetadataResponse> result;

    /**
     * @return Result is available only after the query is completed.
     * 
     */
    public Output<GoogleCloudApigeeV1SecurityReportResultMetadataResponse> result() {
        return this.result;
    }
    /**
     * ResultFileSize is available only after the query is completed.
     * 
     */
    @Export(name="resultFileSize", type=String.class, parameters={})
    private Output<String> resultFileSize;

    /**
     * @return ResultFileSize is available only after the query is completed.
     * 
     */
    public Output<String> resultFileSize() {
        return this.resultFileSize;
    }
    /**
     * ResultRows is available only after the query is completed.
     * 
     */
    @Export(name="resultRows", type=String.class, parameters={})
    private Output<String> resultRows;

    /**
     * @return ResultRows is available only after the query is completed.
     * 
     */
    public Output<String> resultRows() {
        return this.resultRows;
    }
    /**
     * Self link of the query. Example: `/organizations/myorg/environments/myenv/securityReports/9cfc0d85-0f30-46d6-ae6f-318d0cb961bd` or following format if query is running at host level: `/organizations/myorg/hostSecurityReports/9cfc0d85-0f30-46d6-ae6f-318d0cb961bd`
     * 
     */
    @Export(name="self", type=String.class, parameters={})
    private Output<String> self;

    /**
     * @return Self link of the query. Example: `/organizations/myorg/environments/myenv/securityReports/9cfc0d85-0f30-46d6-ae6f-318d0cb961bd` or following format if query is running at host level: `/organizations/myorg/hostSecurityReports/9cfc0d85-0f30-46d6-ae6f-318d0cb961bd`
     * 
     */
    public Output<String> self() {
        return this.self;
    }
    /**
     * Query state could be &#34;enqueued&#34;, &#34;running&#34;, &#34;completed&#34;, &#34;failed&#34;.
     * 
     */
    @Export(name="state", type=String.class, parameters={})
    private Output<String> state;

    /**
     * @return Query state could be &#34;enqueued&#34;, &#34;running&#34;, &#34;completed&#34;, &#34;failed&#34;.
     * 
     */
    public Output<String> state() {
        return this.state;
    }
    /**
     * Last updated timestamp for the query.
     * 
     */
    @Export(name="updated", type=String.class, parameters={})
    private Output<String> updated;

    /**
     * @return Last updated timestamp for the query.
     * 
     */
    public Output<String> updated() {
        return this.updated;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public SecurityReport(String name) {
        this(name, SecurityReportArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public SecurityReport(String name, SecurityReportArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public SecurityReport(String name, SecurityReportArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("google-native:apigee/v1:SecurityReport", name, args == null ? SecurityReportArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private SecurityReport(String name, Output<String> id, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("google-native:apigee/v1:SecurityReport", name, null, makeResourceOptions(options, id));
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
    public static SecurityReport get(String name, Output<String> id, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new SecurityReport(name, id, options);
    }
}