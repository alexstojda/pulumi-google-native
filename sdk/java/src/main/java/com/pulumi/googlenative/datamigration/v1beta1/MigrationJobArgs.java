// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.datamigration.v1beta1;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.googlenative.datamigration.v1beta1.enums.MigrationJobState;
import com.pulumi.googlenative.datamigration.v1beta1.enums.MigrationJobType;
import com.pulumi.googlenative.datamigration.v1beta1.inputs.DatabaseTypeArgs;
import com.pulumi.googlenative.datamigration.v1beta1.inputs.ReverseSshConnectivityArgs;
import com.pulumi.googlenative.datamigration.v1beta1.inputs.StaticIpConnectivityArgs;
import com.pulumi.googlenative.datamigration.v1beta1.inputs.VpcPeeringConnectivityArgs;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class MigrationJobArgs extends com.pulumi.resources.ResourceArgs {

    public static final MigrationJobArgs Empty = new MigrationJobArgs();

    /**
     * The resource name (URI) of the destination connection profile.
     * 
     */
    @Import(name="destination", required=true)
    private Output<String> destination;

    /**
     * @return The resource name (URI) of the destination connection profile.
     * 
     */
    public Output<String> destination() {
        return this.destination;
    }

    /**
     * The database engine type and provider of the destination.
     * 
     */
    @Import(name="destinationDatabase")
    private @Nullable Output<DatabaseTypeArgs> destinationDatabase;

    /**
     * @return The database engine type and provider of the destination.
     * 
     */
    public Optional<Output<DatabaseTypeArgs>> destinationDatabase() {
        return Optional.ofNullable(this.destinationDatabase);
    }

    /**
     * The migration job display name.
     * 
     */
    @Import(name="displayName")
    private @Nullable Output<String> displayName;

    /**
     * @return The migration job display name.
     * 
     */
    public Optional<Output<String>> displayName() {
        return Optional.ofNullable(this.displayName);
    }

    /**
     * The path to the dump file in Google Cloud Storage, in the format: (gs://[BUCKET_NAME]/[OBJECT_NAME]).
     * 
     */
    @Import(name="dumpPath")
    private @Nullable Output<String> dumpPath;

    /**
     * @return The path to the dump file in Google Cloud Storage, in the format: (gs://[BUCKET_NAME]/[OBJECT_NAME]).
     * 
     */
    public Optional<Output<String>> dumpPath() {
        return Optional.ofNullable(this.dumpPath);
    }

    /**
     * The resource labels for migration job to use to annotate any related underlying resources such as Compute Engine VMs. An object containing a list of &#34;key&#34;: &#34;value&#34; pairs. Example: `{ &#34;name&#34;: &#34;wrench&#34;, &#34;mass&#34;: &#34;1.3kg&#34;, &#34;count&#34;: &#34;3&#34; }`.
     * 
     */
    @Import(name="labels")
    private @Nullable Output<Map<String,String>> labels;

    /**
     * @return The resource labels for migration job to use to annotate any related underlying resources such as Compute Engine VMs. An object containing a list of &#34;key&#34;: &#34;value&#34; pairs. Example: `{ &#34;name&#34;: &#34;wrench&#34;, &#34;mass&#34;: &#34;1.3kg&#34;, &#34;count&#34;: &#34;3&#34; }`.
     * 
     */
    public Optional<Output<Map<String,String>>> labels() {
        return Optional.ofNullable(this.labels);
    }

    @Import(name="location")
    private @Nullable Output<String> location;

    public Optional<Output<String>> location() {
        return Optional.ofNullable(this.location);
    }

    /**
     * Required. The ID of the instance to create.
     * 
     */
    @Import(name="migrationJobId", required=true)
    private Output<String> migrationJobId;

    /**
     * @return Required. The ID of the instance to create.
     * 
     */
    public Output<String> migrationJobId() {
        return this.migrationJobId;
    }

    /**
     * The name (URI) of this migration job resource, in the form of: projects/{project}/locations/{location}/migrationJobs/{migrationJob}.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return The name (URI) of this migration job resource, in the form of: projects/{project}/locations/{location}/migrationJobs/{migrationJob}.
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    @Import(name="project")
    private @Nullable Output<String> project;

    public Optional<Output<String>> project() {
        return Optional.ofNullable(this.project);
    }

    /**
     * A unique id used to identify the request. If the server receives two requests with the same id, then the second request will be ignored. It is recommended to always set this value to a UUID. The id must contain only letters (a-z, A-Z), numbers (0-9), underscores (_), and hyphens (-). The maximum length is 40 characters.
     * 
     */
    @Import(name="requestId")
    private @Nullable Output<String> requestId;

    /**
     * @return A unique id used to identify the request. If the server receives two requests with the same id, then the second request will be ignored. It is recommended to always set this value to a UUID. The id must contain only letters (a-z, A-Z), numbers (0-9), underscores (_), and hyphens (-). The maximum length is 40 characters.
     * 
     */
    public Optional<Output<String>> requestId() {
        return Optional.ofNullable(this.requestId);
    }

    /**
     * The details needed to communicate to the source over Reverse SSH tunnel connectivity.
     * 
     */
    @Import(name="reverseSshConnectivity")
    private @Nullable Output<ReverseSshConnectivityArgs> reverseSshConnectivity;

    /**
     * @return The details needed to communicate to the source over Reverse SSH tunnel connectivity.
     * 
     */
    public Optional<Output<ReverseSshConnectivityArgs>> reverseSshConnectivity() {
        return Optional.ofNullable(this.reverseSshConnectivity);
    }

    /**
     * The resource name (URI) of the source connection profile.
     * 
     */
    @Import(name="source", required=true)
    private Output<String> source;

    /**
     * @return The resource name (URI) of the source connection profile.
     * 
     */
    public Output<String> source() {
        return this.source;
    }

    /**
     * The database engine type and provider of the source.
     * 
     */
    @Import(name="sourceDatabase")
    private @Nullable Output<DatabaseTypeArgs> sourceDatabase;

    /**
     * @return The database engine type and provider of the source.
     * 
     */
    public Optional<Output<DatabaseTypeArgs>> sourceDatabase() {
        return Optional.ofNullable(this.sourceDatabase);
    }

    /**
     * The current migration job state.
     * 
     */
    @Import(name="state")
    private @Nullable Output<MigrationJobState> state;

    /**
     * @return The current migration job state.
     * 
     */
    public Optional<Output<MigrationJobState>> state() {
        return Optional.ofNullable(this.state);
    }

    /**
     * static ip connectivity data (default, no additional details needed).
     * 
     */
    @Import(name="staticIpConnectivity")
    private @Nullable Output<StaticIpConnectivityArgs> staticIpConnectivity;

    /**
     * @return static ip connectivity data (default, no additional details needed).
     * 
     */
    public Optional<Output<StaticIpConnectivityArgs>> staticIpConnectivity() {
        return Optional.ofNullable(this.staticIpConnectivity);
    }

    /**
     * The migration job type.
     * 
     */
    @Import(name="type", required=true)
    private Output<MigrationJobType> type;

    /**
     * @return The migration job type.
     * 
     */
    public Output<MigrationJobType> type() {
        return this.type;
    }

    /**
     * The details of the VPC network that the source database is located in.
     * 
     */
    @Import(name="vpcPeeringConnectivity")
    private @Nullable Output<VpcPeeringConnectivityArgs> vpcPeeringConnectivity;

    /**
     * @return The details of the VPC network that the source database is located in.
     * 
     */
    public Optional<Output<VpcPeeringConnectivityArgs>> vpcPeeringConnectivity() {
        return Optional.ofNullable(this.vpcPeeringConnectivity);
    }

    private MigrationJobArgs() {}

    private MigrationJobArgs(MigrationJobArgs $) {
        this.destination = $.destination;
        this.destinationDatabase = $.destinationDatabase;
        this.displayName = $.displayName;
        this.dumpPath = $.dumpPath;
        this.labels = $.labels;
        this.location = $.location;
        this.migrationJobId = $.migrationJobId;
        this.name = $.name;
        this.project = $.project;
        this.requestId = $.requestId;
        this.reverseSshConnectivity = $.reverseSshConnectivity;
        this.source = $.source;
        this.sourceDatabase = $.sourceDatabase;
        this.state = $.state;
        this.staticIpConnectivity = $.staticIpConnectivity;
        this.type = $.type;
        this.vpcPeeringConnectivity = $.vpcPeeringConnectivity;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(MigrationJobArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private MigrationJobArgs $;

        public Builder() {
            $ = new MigrationJobArgs();
        }

        public Builder(MigrationJobArgs defaults) {
            $ = new MigrationJobArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param destination The resource name (URI) of the destination connection profile.
         * 
         * @return builder
         * 
         */
        public Builder destination(Output<String> destination) {
            $.destination = destination;
            return this;
        }

        /**
         * @param destination The resource name (URI) of the destination connection profile.
         * 
         * @return builder
         * 
         */
        public Builder destination(String destination) {
            return destination(Output.of(destination));
        }

        /**
         * @param destinationDatabase The database engine type and provider of the destination.
         * 
         * @return builder
         * 
         */
        public Builder destinationDatabase(@Nullable Output<DatabaseTypeArgs> destinationDatabase) {
            $.destinationDatabase = destinationDatabase;
            return this;
        }

        /**
         * @param destinationDatabase The database engine type and provider of the destination.
         * 
         * @return builder
         * 
         */
        public Builder destinationDatabase(DatabaseTypeArgs destinationDatabase) {
            return destinationDatabase(Output.of(destinationDatabase));
        }

        /**
         * @param displayName The migration job display name.
         * 
         * @return builder
         * 
         */
        public Builder displayName(@Nullable Output<String> displayName) {
            $.displayName = displayName;
            return this;
        }

        /**
         * @param displayName The migration job display name.
         * 
         * @return builder
         * 
         */
        public Builder displayName(String displayName) {
            return displayName(Output.of(displayName));
        }

        /**
         * @param dumpPath The path to the dump file in Google Cloud Storage, in the format: (gs://[BUCKET_NAME]/[OBJECT_NAME]).
         * 
         * @return builder
         * 
         */
        public Builder dumpPath(@Nullable Output<String> dumpPath) {
            $.dumpPath = dumpPath;
            return this;
        }

        /**
         * @param dumpPath The path to the dump file in Google Cloud Storage, in the format: (gs://[BUCKET_NAME]/[OBJECT_NAME]).
         * 
         * @return builder
         * 
         */
        public Builder dumpPath(String dumpPath) {
            return dumpPath(Output.of(dumpPath));
        }

        /**
         * @param labels The resource labels for migration job to use to annotate any related underlying resources such as Compute Engine VMs. An object containing a list of &#34;key&#34;: &#34;value&#34; pairs. Example: `{ &#34;name&#34;: &#34;wrench&#34;, &#34;mass&#34;: &#34;1.3kg&#34;, &#34;count&#34;: &#34;3&#34; }`.
         * 
         * @return builder
         * 
         */
        public Builder labels(@Nullable Output<Map<String,String>> labels) {
            $.labels = labels;
            return this;
        }

        /**
         * @param labels The resource labels for migration job to use to annotate any related underlying resources such as Compute Engine VMs. An object containing a list of &#34;key&#34;: &#34;value&#34; pairs. Example: `{ &#34;name&#34;: &#34;wrench&#34;, &#34;mass&#34;: &#34;1.3kg&#34;, &#34;count&#34;: &#34;3&#34; }`.
         * 
         * @return builder
         * 
         */
        public Builder labels(Map<String,String> labels) {
            return labels(Output.of(labels));
        }

        public Builder location(@Nullable Output<String> location) {
            $.location = location;
            return this;
        }

        public Builder location(String location) {
            return location(Output.of(location));
        }

        /**
         * @param migrationJobId Required. The ID of the instance to create.
         * 
         * @return builder
         * 
         */
        public Builder migrationJobId(Output<String> migrationJobId) {
            $.migrationJobId = migrationJobId;
            return this;
        }

        /**
         * @param migrationJobId Required. The ID of the instance to create.
         * 
         * @return builder
         * 
         */
        public Builder migrationJobId(String migrationJobId) {
            return migrationJobId(Output.of(migrationJobId));
        }

        /**
         * @param name The name (URI) of this migration job resource, in the form of: projects/{project}/locations/{location}/migrationJobs/{migrationJob}.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name The name (URI) of this migration job resource, in the form of: projects/{project}/locations/{location}/migrationJobs/{migrationJob}.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        public Builder project(@Nullable Output<String> project) {
            $.project = project;
            return this;
        }

        public Builder project(String project) {
            return project(Output.of(project));
        }

        /**
         * @param requestId A unique id used to identify the request. If the server receives two requests with the same id, then the second request will be ignored. It is recommended to always set this value to a UUID. The id must contain only letters (a-z, A-Z), numbers (0-9), underscores (_), and hyphens (-). The maximum length is 40 characters.
         * 
         * @return builder
         * 
         */
        public Builder requestId(@Nullable Output<String> requestId) {
            $.requestId = requestId;
            return this;
        }

        /**
         * @param requestId A unique id used to identify the request. If the server receives two requests with the same id, then the second request will be ignored. It is recommended to always set this value to a UUID. The id must contain only letters (a-z, A-Z), numbers (0-9), underscores (_), and hyphens (-). The maximum length is 40 characters.
         * 
         * @return builder
         * 
         */
        public Builder requestId(String requestId) {
            return requestId(Output.of(requestId));
        }

        /**
         * @param reverseSshConnectivity The details needed to communicate to the source over Reverse SSH tunnel connectivity.
         * 
         * @return builder
         * 
         */
        public Builder reverseSshConnectivity(@Nullable Output<ReverseSshConnectivityArgs> reverseSshConnectivity) {
            $.reverseSshConnectivity = reverseSshConnectivity;
            return this;
        }

        /**
         * @param reverseSshConnectivity The details needed to communicate to the source over Reverse SSH tunnel connectivity.
         * 
         * @return builder
         * 
         */
        public Builder reverseSshConnectivity(ReverseSshConnectivityArgs reverseSshConnectivity) {
            return reverseSshConnectivity(Output.of(reverseSshConnectivity));
        }

        /**
         * @param source The resource name (URI) of the source connection profile.
         * 
         * @return builder
         * 
         */
        public Builder source(Output<String> source) {
            $.source = source;
            return this;
        }

        /**
         * @param source The resource name (URI) of the source connection profile.
         * 
         * @return builder
         * 
         */
        public Builder source(String source) {
            return source(Output.of(source));
        }

        /**
         * @param sourceDatabase The database engine type and provider of the source.
         * 
         * @return builder
         * 
         */
        public Builder sourceDatabase(@Nullable Output<DatabaseTypeArgs> sourceDatabase) {
            $.sourceDatabase = sourceDatabase;
            return this;
        }

        /**
         * @param sourceDatabase The database engine type and provider of the source.
         * 
         * @return builder
         * 
         */
        public Builder sourceDatabase(DatabaseTypeArgs sourceDatabase) {
            return sourceDatabase(Output.of(sourceDatabase));
        }

        /**
         * @param state The current migration job state.
         * 
         * @return builder
         * 
         */
        public Builder state(@Nullable Output<MigrationJobState> state) {
            $.state = state;
            return this;
        }

        /**
         * @param state The current migration job state.
         * 
         * @return builder
         * 
         */
        public Builder state(MigrationJobState state) {
            return state(Output.of(state));
        }

        /**
         * @param staticIpConnectivity static ip connectivity data (default, no additional details needed).
         * 
         * @return builder
         * 
         */
        public Builder staticIpConnectivity(@Nullable Output<StaticIpConnectivityArgs> staticIpConnectivity) {
            $.staticIpConnectivity = staticIpConnectivity;
            return this;
        }

        /**
         * @param staticIpConnectivity static ip connectivity data (default, no additional details needed).
         * 
         * @return builder
         * 
         */
        public Builder staticIpConnectivity(StaticIpConnectivityArgs staticIpConnectivity) {
            return staticIpConnectivity(Output.of(staticIpConnectivity));
        }

        /**
         * @param type The migration job type.
         * 
         * @return builder
         * 
         */
        public Builder type(Output<MigrationJobType> type) {
            $.type = type;
            return this;
        }

        /**
         * @param type The migration job type.
         * 
         * @return builder
         * 
         */
        public Builder type(MigrationJobType type) {
            return type(Output.of(type));
        }

        /**
         * @param vpcPeeringConnectivity The details of the VPC network that the source database is located in.
         * 
         * @return builder
         * 
         */
        public Builder vpcPeeringConnectivity(@Nullable Output<VpcPeeringConnectivityArgs> vpcPeeringConnectivity) {
            $.vpcPeeringConnectivity = vpcPeeringConnectivity;
            return this;
        }

        /**
         * @param vpcPeeringConnectivity The details of the VPC network that the source database is located in.
         * 
         * @return builder
         * 
         */
        public Builder vpcPeeringConnectivity(VpcPeeringConnectivityArgs vpcPeeringConnectivity) {
            return vpcPeeringConnectivity(Output.of(vpcPeeringConnectivity));
        }

        public MigrationJobArgs build() {
            $.destination = Objects.requireNonNull($.destination, "expected parameter 'destination' to be non-null");
            $.migrationJobId = Objects.requireNonNull($.migrationJobId, "expected parameter 'migrationJobId' to be non-null");
            $.source = Objects.requireNonNull($.source, "expected parameter 'source' to be non-null");
            $.type = Objects.requireNonNull($.type, "expected parameter 'type' to be non-null");
            return $;
        }
    }

}