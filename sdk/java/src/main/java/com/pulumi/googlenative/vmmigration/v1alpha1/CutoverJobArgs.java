// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.vmmigration.v1alpha1;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class CutoverJobArgs extends com.pulumi.resources.ResourceArgs {

    public static final CutoverJobArgs Empty = new CutoverJobArgs();

    /**
     * Required. The cutover job identifier.
     * 
     */
    @Import(name="cutoverJobId", required=true)
    private Output<String> cutoverJobId;

    /**
     * @return Required. The cutover job identifier.
     * 
     */
    public Output<String> cutoverJobId() {
        return this.cutoverJobId;
    }

    @Import(name="location")
    private @Nullable Output<String> location;

    public Optional<Output<String>> location() {
        return Optional.ofNullable(this.location);
    }

    @Import(name="migratingVmId", required=true)
    private Output<String> migratingVmId;

    public Output<String> migratingVmId() {
        return this.migratingVmId;
    }

    @Import(name="project")
    private @Nullable Output<String> project;

    public Optional<Output<String>> project() {
        return Optional.ofNullable(this.project);
    }

    /**
     * A request ID to identify requests. Specify a unique request ID so that if you must retry your request, the server will know to ignore the request if it has already been completed. The server will guarantee that for at least 60 minutes since the first request. For example, consider a situation where you make an initial request and t he request times out. If you make the request again with the same request ID, the server can check if original operation with the same request ID was received, and if so, will ignore the second request. This prevents clients from accidentally creating duplicate commitments. The request ID must be a valid UUID with the exception that zero UUID is not supported (00000000-0000-0000-0000-000000000000).
     * 
     */
    @Import(name="requestId")
    private @Nullable Output<String> requestId;

    /**
     * @return A request ID to identify requests. Specify a unique request ID so that if you must retry your request, the server will know to ignore the request if it has already been completed. The server will guarantee that for at least 60 minutes since the first request. For example, consider a situation where you make an initial request and t he request times out. If you make the request again with the same request ID, the server can check if original operation with the same request ID was received, and if so, will ignore the second request. This prevents clients from accidentally creating duplicate commitments. The request ID must be a valid UUID with the exception that zero UUID is not supported (00000000-0000-0000-0000-000000000000).
     * 
     */
    public Optional<Output<String>> requestId() {
        return Optional.ofNullable(this.requestId);
    }

    @Import(name="sourceId", required=true)
    private Output<String> sourceId;

    public Output<String> sourceId() {
        return this.sourceId;
    }

    private CutoverJobArgs() {}

    private CutoverJobArgs(CutoverJobArgs $) {
        this.cutoverJobId = $.cutoverJobId;
        this.location = $.location;
        this.migratingVmId = $.migratingVmId;
        this.project = $.project;
        this.requestId = $.requestId;
        this.sourceId = $.sourceId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(CutoverJobArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private CutoverJobArgs $;

        public Builder() {
            $ = new CutoverJobArgs();
        }

        public Builder(CutoverJobArgs defaults) {
            $ = new CutoverJobArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param cutoverJobId Required. The cutover job identifier.
         * 
         * @return builder
         * 
         */
        public Builder cutoverJobId(Output<String> cutoverJobId) {
            $.cutoverJobId = cutoverJobId;
            return this;
        }

        /**
         * @param cutoverJobId Required. The cutover job identifier.
         * 
         * @return builder
         * 
         */
        public Builder cutoverJobId(String cutoverJobId) {
            return cutoverJobId(Output.of(cutoverJobId));
        }

        public Builder location(@Nullable Output<String> location) {
            $.location = location;
            return this;
        }

        public Builder location(String location) {
            return location(Output.of(location));
        }

        public Builder migratingVmId(Output<String> migratingVmId) {
            $.migratingVmId = migratingVmId;
            return this;
        }

        public Builder migratingVmId(String migratingVmId) {
            return migratingVmId(Output.of(migratingVmId));
        }

        public Builder project(@Nullable Output<String> project) {
            $.project = project;
            return this;
        }

        public Builder project(String project) {
            return project(Output.of(project));
        }

        /**
         * @param requestId A request ID to identify requests. Specify a unique request ID so that if you must retry your request, the server will know to ignore the request if it has already been completed. The server will guarantee that for at least 60 minutes since the first request. For example, consider a situation where you make an initial request and t he request times out. If you make the request again with the same request ID, the server can check if original operation with the same request ID was received, and if so, will ignore the second request. This prevents clients from accidentally creating duplicate commitments. The request ID must be a valid UUID with the exception that zero UUID is not supported (00000000-0000-0000-0000-000000000000).
         * 
         * @return builder
         * 
         */
        public Builder requestId(@Nullable Output<String> requestId) {
            $.requestId = requestId;
            return this;
        }

        /**
         * @param requestId A request ID to identify requests. Specify a unique request ID so that if you must retry your request, the server will know to ignore the request if it has already been completed. The server will guarantee that for at least 60 minutes since the first request. For example, consider a situation where you make an initial request and t he request times out. If you make the request again with the same request ID, the server can check if original operation with the same request ID was received, and if so, will ignore the second request. This prevents clients from accidentally creating duplicate commitments. The request ID must be a valid UUID with the exception that zero UUID is not supported (00000000-0000-0000-0000-000000000000).
         * 
         * @return builder
         * 
         */
        public Builder requestId(String requestId) {
            return requestId(Output.of(requestId));
        }

        public Builder sourceId(Output<String> sourceId) {
            $.sourceId = sourceId;
            return this;
        }

        public Builder sourceId(String sourceId) {
            return sourceId(Output.of(sourceId));
        }

        public CutoverJobArgs build() {
            $.cutoverJobId = Objects.requireNonNull($.cutoverJobId, "expected parameter 'cutoverJobId' to be non-null");
            $.migratingVmId = Objects.requireNonNull($.migratingVmId, "expected parameter 'migratingVmId' to be non-null");
            $.sourceId = Objects.requireNonNull($.sourceId, "expected parameter 'sourceId' to be non-null");
            return $;
        }
    }

}