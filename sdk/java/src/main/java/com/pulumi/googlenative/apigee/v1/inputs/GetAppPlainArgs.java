// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.apigee.v1.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetAppPlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetAppPlainArgs Empty = new GetAppPlainArgs();

    @Import(name="appId", required=true)
    private String appId;

    public String appId() {
        return this.appId;
    }

    @Import(name="developerId", required=true)
    private String developerId;

    public String developerId() {
        return this.developerId;
    }

    @Import(name="entity")
    private @Nullable String entity;

    public Optional<String> entity() {
        return Optional.ofNullable(this.entity);
    }

    @Import(name="organizationId", required=true)
    private String organizationId;

    public String organizationId() {
        return this.organizationId;
    }

    @Import(name="query")
    private @Nullable String query;

    public Optional<String> query() {
        return Optional.ofNullable(this.query);
    }

    private GetAppPlainArgs() {}

    private GetAppPlainArgs(GetAppPlainArgs $) {
        this.appId = $.appId;
        this.developerId = $.developerId;
        this.entity = $.entity;
        this.organizationId = $.organizationId;
        this.query = $.query;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetAppPlainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetAppPlainArgs $;

        public Builder() {
            $ = new GetAppPlainArgs();
        }

        public Builder(GetAppPlainArgs defaults) {
            $ = new GetAppPlainArgs(Objects.requireNonNull(defaults));
        }

        public Builder appId(String appId) {
            $.appId = appId;
            return this;
        }

        public Builder developerId(String developerId) {
            $.developerId = developerId;
            return this;
        }

        public Builder entity(@Nullable String entity) {
            $.entity = entity;
            return this;
        }

        public Builder organizationId(String organizationId) {
            $.organizationId = organizationId;
            return this;
        }

        public Builder query(@Nullable String query) {
            $.query = query;
            return this;
        }

        public GetAppPlainArgs build() {
            $.appId = Objects.requireNonNull($.appId, "expected parameter 'appId' to be non-null");
            $.developerId = Objects.requireNonNull($.developerId, "expected parameter 'developerId' to be non-null");
            $.organizationId = Objects.requireNonNull($.organizationId, "expected parameter 'organizationId' to be non-null");
            return $;
        }
    }

}